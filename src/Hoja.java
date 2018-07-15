
import java.awt.event.ItemEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;


public class Hoja extends javax.swing.JFrame {

    ButtonGroup acciones;
    ArrayList<String> FoliosRecibos = new ArrayList<String>();
    MySQL hey;
    
    private int hojas;
    private double precio;
    
    boolean bandera = false;
    Date hoy= new Date();
    SimpleDateFormat sdf= new SimpleDateFormat("yyy/MM/dd");
    String fecha = sdf.format(hoy); 
    
    private String folioseleccionado;
    
    public Hoja() {
        
        initComponents();
        acciones = new ButtonGroup();//organizador de radion buttons
        this.hey = new MySQL();    //objeto de la clase MYSQL
        
        //AGREGANDO RADIO BUTTONS AL ORDEN
        acciones.add(jragregar);
        acciones.add(jrmodificar);
        acciones.add(jreliminar);
        
        //MANTENERLO INICIA EL AGREGAR
        jragregar.setSelected(true);
        jcfolio.setEnabled(false);
        
        jtfecha.setText(fecha);
       
        this.CargarBDRecibos();
        
       
      
  
        
            
            
            
            

           
    }
    
    
    public void CargarBDRecibos()
    {
         this.FoliosRecibos.clear();
         this.jcfolio.removeAllItems();
       
         this.hey.Datos_Recibos();
         this.FoliosRecibos = this.hey.getFoliosRecibos();
         this.setPrecio(this.hey.ObtenerPrecio());
         this.jttotal.setText(String.valueOf(this.getPrecio()));
            
        
            for(int i=0; i<=this.FoliosRecibos.size()-1; i++)
            {
                this.jcfolio.addItem(this.FoliosRecibos.get(i));
                System.out.println("Cargando  Folios " + this.FoliosRecibos.get(i));
            }
        
           this.setFolioseleccionado(this.FoliosRecibos.get(0));
           this.jcfolio.setSelectedIndex(0);
    
    
    
    }
    
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jragregar = new javax.swing.JRadioButton();
        jrmodificar = new javax.swing.JRadioButton();
        jreliminar = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jcfolio = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtusuario = new javax.swing.JTextField();
        jthojas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jttotal = new javax.swing.JFormattedTextField();
        jtfolio = new javax.swing.JTextField();
        jfmatricula = new javax.swing.JTextField();
        jtfecha = new javax.swing.JTextField();
        jbboton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        jragregar.setText("Agregar");
        jragregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jragregarActionPerformed(evt);
            }
        });

        jrmodificar.setText("Modificar");
        jrmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrmodificarActionPerformed(evt);
            }
        });

        jreliminar.setText("Eliminar");
        jreliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jreliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jragregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrmodificar)
                .addGap(10, 10, 10)
                .addComponent(jreliminar)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jragregar)
                    .addComponent(jrmodificar)
                    .addComponent(jreliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Follio"));

        jcfolio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcfolioItemStateChanged(evt);
            }
        });
        jcfolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcfolioActionPerformed(evt);
            }
        });

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcfolio, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcfolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Folio:");

        jLabel2.setText("Matricula:");

        jLabel3.setText("Usuario:");

        jLabel4.setText("Hojas:");

        jLabel5.setText("Fecha:");

        jthojas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jthojasActionPerformed(evt);
            }
        });
        jthojas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jthojasKeyTyped(evt);
            }
        });

        jLabel6.setText("Importe Total");

        jttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jttotalActionPerformed(evt);
            }
        });
        jttotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jttotalKeyTyped(evt);
            }
        });

        jtfolio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfolioKeyTyped(evt);
            }
        });

        jfmatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfmatriculaActionPerformed(evt);
            }
        });
        jfmatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jfmatriculaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34)
                        .addComponent(jthojas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtusuario)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jfmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jttotal)
                                            .addComponent(jtfecha, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                                        .addGap(66, 66, 66))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jtfolio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jfmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jthojas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jbboton.setText("Guardar");
        jbboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbotonActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");

        jMenuItem1.setText("Modificar Precio");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Buscar Usuario");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jbboton)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbboton)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfolioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfolioKeyTyped
  
          char caracter = evt.getKeyChar();

      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') ||
         (caracter > '9')) &&
         (caracter != '\b' /*corresponde a BACK_SPACE*/))
      {
         evt.consume();  // ignorar el evento de teclado
      }
  
        
        
    }//GEN-LAST:event_jtfolioKeyTyped

    private void jfmatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jfmatriculaKeyTyped
         char caracter = evt.getKeyChar();

      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') ||
         (caracter > '9')) &&
         (caracter != '\b' /*corresponde a BACK_SPACE*/))
      {
         evt.consume();  // ignorar el evento de teclado
      }
  
    }//GEN-LAST:event_jfmatriculaKeyTyped

    private void jttotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jttotalKeyTyped
         char caracter = evt.getKeyChar();

      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') ||
         (caracter > '9')) &&
         (caracter != '\b' /*corresponde a BACK_SPACE*/))
      {
         evt.consume();  // ignorar el evento de teclado
      }
  
    }//GEN-LAST:event_jttotalKeyTyped

    private void jthojasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jthojasKeyTyped
          char caracter = evt.getKeyChar();

      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') ||
         (caracter > '9')) &&
         (caracter != '\b' /*corresponde a BACK_SPACE*/))
      {
         evt.consume();  // ignorar el evento de teclado
      }
  
    }//GEN-LAST:event_jthojasKeyTyped

    private void jbbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbotonActionPerformed
      
      if(jbboton.getText().equals("Guardar"))
      {
      System.out.println("Boton Guardar");
       
        if(!this.NoVacio_VerFecha())
        {
            JOptionPane.showMessageDialog(null, "Tienes campos vacios o llenaste mal la fecha");
        
        }
        else
        {
            
              
           this.hey.Guardar_Recibo(hey.Get_IDUsuario(Integer.parseInt(jfmatricula.getText())), Integer.parseInt(jtfolio.getText()),Integer.parseInt(jthojas.getText()),
                    Integer.parseInt(jttotal.getText()), jtfecha.getText());
                    this.CargarBDRecibos();
        }
                
      
       
      }
      else
      {
         if(jbboton.getText().equals("Modificar"))
         {
             
         System.out.println("Boton Modificar --- " + Integer.parseInt(this.FoliosRecibos.get(this.jcfolio.getSelectedIndex())));
         this.hey.Modificar_Recibo(hey.Get_IDRecibo(Integer.parseInt(this.getFolioseleccionado())), Integer.parseInt(this.jtfolio.getText()), 
                 hey.Get_IDUsuario(Integer.parseInt(this.jfmatricula.getText())), Integer.parseInt(this.jthojas.getText()), Double.parseDouble(this.jttotal.getText()), this.jtfecha.getText());
            
                 this.CargarBDRecibos();
                 this.setFolioseleccionado(String.valueOf(this.jcfolio.getSelectedItem()));
              // this.bandera = false;
         
         }  
         else   
         {
            if(jbboton.getText().equals("Eliminar"))
            {
                System.out.println("Boton Eliminar");
                hey.EliminarRecibo(hey.Get_IDRecibo(Integer.parseInt(String.valueOf(this.jcfolio.getSelectedItem()))));
                this.CargarBDRecibos();
            
            }
         
         
         
         }

      }
       

    }//GEN-LAST:event_jbbotonActionPerformed

    private void jragregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jragregarActionPerformed
       this.jcfolio.setEnabled(false);
       this.jbboton.setText("Guardar");
    }//GEN-LAST:event_jragregarActionPerformed

    private void jrmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrmodificarActionPerformed
        this.jcfolio.setEnabled(true);
       this.jbboton.setText("Modificar");
       this.bandera= true;
     
    }//GEN-LAST:event_jrmodificarActionPerformed

    private void jreliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jreliminarActionPerformed
        this.jcfolio.setEnabled(true);
       this.jbboton.setText("Eliminar");
    }//GEN-LAST:event_jreliminarActionPerformed

    private void jfmatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfmatriculaActionPerformed
       

        jtusuario.setText(this.hey.Get_Nombre(jfmatricula.getText()));
        
    }//GEN-LAST:event_jfmatriculaActionPerformed

    private void jthojasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jthojasActionPerformed
      //hojas
      //  MySQL hey = new MySQL();
       // this.setPrecio(hey.ObtenerPrecio());
       // this.setHojas(Integer.getInteger(this.jthojas.getText())/Integer.parseInt(String.valueOf(this.getPrecio())));
       // this.jttotal.setText(String.valueOf(this.getPrecio()));
        
    }//GEN-LAST:event_jthojasActionPerformed

    private void jttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jttotalActionPerformed
        
    }//GEN-LAST:event_jttotalActionPerformed

    private void jcfolioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcfolioItemStateChanged
     
   
        if(evt.getStateChange() == ItemEvent.DESELECTED)
        {System.out.println("Solo durante el cambio  -- " + String.valueOf(this.jcfolio.getSelectedItem()));
          this.setFolioseleccionado(String.valueOf(this.jcfolio.getSelectedItem()));
        }      
        
    }//GEN-LAST:event_jcfolioItemStateChanged

    private void jcfolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcfolioActionPerformed
        
    
       
        
        
        
    }//GEN-LAST:event_jcfolioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
           /*  this.jtfolio.setText("");
             this.jtusuario.setText("");
             this.jfmatricula.setText("");
             this.jthojas.setText("");
             this.jttotal.setText("");
             this.jtfecha.setText("");
        */
        hey.CreateViewAllNotExit();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            
             this.jtfolio.setText(String.valueOf(this.jcfolio.getItemAt(this.jcfolio.getSelectedIndex())));
             this.jtusuario.setText(hey.getNombre(jcfolio.getSelectedIndex()));
             this.jfmatricula.setText(hey.getMatricula(jcfolio.getSelectedIndex()));
             this.jthojas.setText(hey.getHojaRecibo(jcfolio.getSelectedIndex()));
             this.jttotal.setText(hey.getPrecio(jcfolio.getSelectedIndex()));
             this.jtfecha.setText(hey.getFecha(jcfolio.getSelectedIndex()));
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public boolean NoVacio_VerFecha()
    {
     boolean ens = false;
     
     if(jtfolio.getText().isEmpty() && jtusuario.getText().isEmpty() && jfmatricula.getText().isEmpty() && jthojas.getText().isEmpty() &&  jttotal.getText().isEmpty() )
     {//si todo es vacio es falso
         System.out.println("Algún campo esta vacio");
         ens  = false;
     }else
     {
         if(!this.Verifica_Fecha(this.jtfecha.getText()))
                 {
                     //si la fecha esta mal es falso
                 ens = false;
                 
                 }
         else
         {// de lo contrario es verdadero
             ens = true;
         }
         
     }
    return ens;
    }
    
    public boolean Verifica_Fecha(String stringFecha)
    {
        boolean ens = false;
        java.text.DateFormat df = java.text.DateFormat.getInstance();
        try {
                java.text.DateFormat formatter = sdf;
                formatter.setLenient(false);
                java.util.Date date = formatter.parse(stringFecha);
                System.out.println("El formato de fecha es correcto");
                ens = true;
            } catch (ParseException ex) {
                javax.swing.JOptionPane mensaje = new javax.swing.JOptionPane();
                ens = false;
                 System.out.println("El formato de fecha es incorrecto");
                //mensaje.showMessageDialog(null, "La fecha ingresada no es valida", " Año/Mes/Dia!!!", mensaje.ERROR_MESSAGE);
        } 
    return ens;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Hoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hoja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbboton;
    private javax.swing.JComboBox jcfolio;
    private javax.swing.JTextField jfmatricula;
    private javax.swing.JRadioButton jragregar;
    private javax.swing.JRadioButton jreliminar;
    private javax.swing.JRadioButton jrmodificar;
    private javax.swing.JTextField jtfecha;
    private javax.swing.JTextField jtfolio;
    private javax.swing.JTextField jthojas;
    private javax.swing.JFormattedTextField jttotal;
    private javax.swing.JTextField jtusuario;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the hojas
     */
    public int getHojas() {
        return hojas;
    }

    /**
     * @param hojas the hojas to set
     */
    public void setHojas(int hojas) {
        this.hojas = hojas;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the folioseleccionado
     */
    public String getFolioseleccionado() {
        return folioseleccionado;
    }

    /**
     * @param folioseleccionado the folioseleccionado to set
     */
    public void setFolioseleccionado(String folioseleccionado) {
        this.folioseleccionado = folioseleccionado;
    }
}
