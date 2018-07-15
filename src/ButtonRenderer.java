
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;



class ButtonRenderer extends JButton implements  TableCellRenderer
{

    int ID_Usuario;

    public int getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }
  //CONSTRUCTOR
  public ButtonRenderer() {
    //SET BUTTON PROPERTIES
    setOpaque(true);
  }

    public ButtonRenderer(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
        setOpaque(true);
    }

  public Component getTableCellRendererComponent(JTable table, Object obj,
      boolean selected, boolean focused, int row, int col) {

    //SET PASSED OBJECT AS BUTTON TEXT
      setText((obj==null) ? "Comentarios":obj.toString());

    return this;
  }

}

//BUTTON EDITOR CLASS
class ButtonEditor extends DefaultCellEditor
{
  protected JButton btn;
   private String lbl;
   private Boolean clicked;
   
   
   

   public ButtonEditor(JTextField txt) {
    super(txt);

    btn=new JButton();
    btn.setOpaque(true);

    //WHEN BUTTON IS CLICKED
    btn.addActionListener(new ActionListener() {


      public void actionPerformed(ActionEvent e) {

        fireEditingStopped();
      }
    });
  }

   //OVERRIDE A COUPLE OF METHODS
   @Override
  public Component getTableCellEditorComponent(JTable table, Object obj,
      boolean selected, int row, int col) {

      //SET TEXT TO BUTTON,SET CLICKED TO TRUE,THEN RETURN THE BTN OBJECT
     lbl=(obj==null) ? "Comentarios":obj.toString();
     btn.setText(lbl);
     clicked=true;
    return btn;
  }

  //IF BUTTON CELL VALUE CHNAGES,IF CLICKED THAT IS
  
  public Object getCellEditorValue() {

     if(clicked)
      {
      //SHOW US SOME MESSAGE
     //   JOptionPane.showMessageDialog(btn, lbl+" Hola");
        String [] botonString = { " Guardar", " Borrar", "Salir" };
        Object [] botonObjeto = { " Guardar", " Borrar", "Salir" };
        String text = "Probando";
        JTextArea textArea = new JTextArea(text);
        textArea.setColumns(30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.append(text);
        textArea.setSize(textArea.getPreferredSize().width, 1);
      int variable = JOptionPane.showOptionDialog(null, new JScrollPane( textArea), "Comentarios de CECO", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null/*icono*/, botonString, botonObjeto[0]);
        
       
    
     //   int variable = JOptionPane.showOptionDialog (null, " Quieres bailar esta noche?", "Cita", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null/*icono*/, botones, botones[0]);
        
        
      }
    //SET IT TO FALSE NOW THAT ITS CLICKED
    clicked=false;
    return new String(lbl);
  }


  public boolean stopCellEditing() {

         //SET CLICKED TO FALSE FIRST
      clicked=false;
    return super.stopCellEditing();
  }


  protected void fireEditingStopped() {
    // TODO Auto-generated method stub
    super.fireEditingStopped();
  }
}