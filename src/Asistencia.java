
import java.awt.List;
import java.awt.event.KeyEvent;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Asistencia extends javax.swing.JFrame {

     ButtonGroup salas;
     Date date;
     Conexion con;
     int idsala=1;
     String sala;
     String idusuario ="";
     MySQL hey = new MySQL();
     boolean banderaboton = true;
    private ArrayList<RegistroLibre> registroslibres = new ArrayList<RegistroLibre>();
        ArrayList<Integer> indice = new ArrayList<Integer>();
   
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelomatricula = new DefaultTableModel();
  
    
    public Asistencia() {
    
         salas = new ButtonGroup();
         date = new Date();
         con = new Conexion();
         initComponents();
          salas.add(this.rsala7);  
          salas.add(this.rsala8);
          rsala7.setSelected(true);
        
   
          
                
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jMenu1 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jusuario = new javax.swing.JTextField();
        rsala7 = new javax.swing.JRadioButton();
        rsala8 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lusuario = new javax.swing.JLabel();
        lnombre = new javax.swing.JLabel();
        lhojas = new javax.swing.JLabel();
        lhora = new javax.swing.JLabel();
        lfecha = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Seleccionar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLibre = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        matriculasalida = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        label1.setText("label1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registro Entrada"));

        jusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusuarioActionPerformed(evt);
            }
        });
        jusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jusuarioKeyTyped(evt);
            }
        });

        rsala7.setText("Sala A007");
        rsala7.setName("rsala7"); // NOI18N
        rsala7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsala7ActionPerformed(evt);
            }
        });

        rsala8.setText("Sala A008");
        rsala8.setName("rsala8"); // NOI18N
        rsala8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsala8ActionPerformed(evt);
            }
        });

        jLabel1.setText("Sala");

        jLabel2.setText("Matricula");

        jLabel3.setText("Ultimo Usuario");

        jLabel4.setText("Nombre");

        jLabel5.setText("Hojas");

        jLabel6.setText("Hora de Registro:");

        jLabel7.setText("Fecha:");

        lusuario.setText("--------------------------------");

        lnombre.setText("-------------------------------------------------------------------------------");

        lhojas.setText("----------");

        lhora.setText("-------");

        lfecha.setText("-----------");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lhojas)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lhora))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rsala7)
                                .addGap(18, 18, 18)
                                .addComponent(rsala8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lfecha)
                        .addContainerGap(99, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rsala7)
                    .addComponent(rsala8)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lusuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lnombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(lhojas)
                    .addComponent(lhora)
                    .addComponent(lfecha))
                .addGap(58, 58, 58))
        );

        Seleccionar.setText("Selecionar Todos");
        Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Marcar Salida");

        jButton4.setText("Ver Comentarios");

        jTableLibre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableLibre.setToolTipText("");
        jTableLibre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableLibre.setRowHeight(30);
        jTableLibre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLibreMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLibre);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 422, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Seleccionar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registro de Salida"));

        jLabel8.setText("Matricula");

        matriculasalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculasalidaActionPerformed(evt);
            }
        });

        jButton1.setText("Salida Para Todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matriculasalida, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(matriculasalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu2.setText("Menu");

        jMenu3.setText("Usuario");

        jMenuItem1.setText("Agregar");
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Eliminar");
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Modificar");
        jMenu3.add(jMenuItem3);

        jMenu2.add(jMenu3);

        jMenu4.setText("Hoja");

        jMenu5.setText("Registrar Pago");
        jMenu4.add(jMenu5);

        jMenu6.setText("Modificar Pago");
        jMenu4.add(jMenu6);

        jMenu7.setText("Eliminar Pago");
        jMenu4.add(jMenu7);

        jMenu2.add(jMenu4);

        jMenu8.setText("Reportes");
        jMenu2.add(jMenu8);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusuarioActionPerformed
       //Cuanto le da enter a la caja de text

        this.LimpiarCampos();
            
                    if(this.jusuario.getText().isEmpty())
                {

                 JOptionPane.showMessageDialog(null, "Ingresa Matricula");


                }
                else
                {            
                            this.idusuario = hey.Get_IDUsuario(jusuario.getText());
                           if ( (this.idusuario != null) && (!this.idusuario.equals("")) ) {
                               // cadena no está vacía
                               //System.out.println("Este es el usuario " + this.idusuario);
                               
                               if(hey.SearchOnViewUser(jusuario.getText()) == 0 )
                                       {
                                        //Cargar los datos en el panel
                                        this.hey.Guardar_HorarioLibre(Integer.parseInt(this.idusuario), this.idsala);
                                        lusuario.setText(jusuario.getText());
                                        lnombre.setText(this.hey.Get_Nombre(jusuario.getText()));
                                        lhora.setText(this.hey.getHoraasistencia());
                                        lfecha.setText(this.hey.getFechaasistencia());
                                        //int e = this.BalanceHojas(2);
                                      //  lhojas.setText(String.valueOf(this.BalanceHojas(Integer.parseInt(this.idusuario))));
                                        
                                        //Cargar los datos en la tabla
                                        this.hey.CreateViewAllNotExit();
                                        this.hey.AddViewAllNotExit();
                                        this.CargarMatrizRegistroL();
                                        jusuario.setText("");
                                                                             
                                       
                                       }else
                                        {
                                             JOptionPane.showMessageDialog(null, "Este Usuario ya esta registrado");
                                        
                                        
                                        }
                                               
                               
                                       


                           }else
                           {
                               JOptionPane.showMessageDialog(null, "No existe esta matricula en la base de Datos.");

                           }

                 
                      
            }
               
              this.idusuario="";
        
        
  
      
      
     
        
        
    }//GEN-LAST:event_jusuarioActionPerformed

    

    public void CargarMatrizRegistroL()
    {
        this.Clear_Jtablelibre();
        
        this.modelo.setColumnCount(0);
        this.modelo.setRowCount(0);
        //this.modelo.addColumn("Seleccionar",  this.hey.ViewFreeAll.getUsuario().toArray());
        this.modelo.addColumn("Matricula", this.hey.ViewFreeAll.Matricula.toArray());
        this.modelomatricula.addColumn("Matricula", this.hey.ViewFreeAll.Matricula.toArray());
        this.modelo.addColumn("Usuario", this.hey.ViewFreeAll.getUsuario().toArray());
        //this.modelo.addColumn("Hojas",  this.hey.ViewFreeAll.getUsuario().toArray());
        this.modelo.addColumn("Entrada", this.hey.ViewFreeAll.getEntrada().toArray());
        this.modelo.addColumn("Sala", this.hey.ViewFreeAll.getSala().toArray());
     //   this.modelo.addColumn("Seleccionar", this.hey.ViewFreeAll.valor.toArray());
      
       /*     for (int i = 0; i <=this.hey.ViewFreeAll.valor.size()-1 ; i++) {
                System.out.println("El valor boleano es " + this.hey.ViewFreeAll.valor.get(i) );
                }
         */
        
        this.jTableLibre.setModel(this.modelo);
      
      //  this.jTableLibre.getColumnModel().getColumn(3).setPreferredWidth(20);
        //this.jTableLibre.getColumnModel().getColumn(3).setCellEditor(new Clase_CellEditor());
       // this.jTableLibre.getColumnModel().getColumn(3).setCellRenderer(new Clase_CellRender() );
        //this.jTableLibre.updateUI();
    }
    
    
    private void Clear_Jtablelibre(){
       while (this.modelo.getRowCount() > 0)
            {
                this.modelo.removeRow(0);
            }
            this.jTableLibre.setModel(this.modelo);
        }
    
    public void LimpiarCampos(){
        lusuario.setText("");
        lhojas.setText("");
        lhora.setText("");
        lfecha.setText("");
    }
    public int BalanceHojas(int idmatricula)
    {
        int saldo =0;
       // System.out.println("La matricula para buscar recibos e impresion es " + idmatricula );
       // System.out.println("Impresiones "+ hey.Get_HojasImpresiones(idmatricula)+ " " + "Recibos "+ hey.Get_HojasRecibos(idmatricula) + "Saldo " + saldo);
        saldo = hey.Get_HojasRecibos(idmatricula) - hey.Get_HojasImpresiones(idmatricula);
      //System.out.println("Saldo " + saldo);
     
        return saldo;
    }
    
    
    
    private void rsala7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsala7ActionPerformed
      //sala A007
        this.idsala =1;
        this.sala ="A007";
        //System.out.print(idsala);
        
        
    }//GEN-LAST:event_rsala7ActionPerformed

    private void rsala8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsala8ActionPerformed
        //Sala A008
        this.idsala =2;
        sala ="A008";
       // System.out.print(idsala);
    }//GEN-LAST:event_rsala8ActionPerformed

    private void jusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jusuarioKeyTyped
        char caracter = evt.getKeyChar();

      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') ||
         (caracter > '9')) &&
         (caracter != '\b' /*corresponde a BACK_SPACE*/))
      {
         evt.consume();  // ignorar el evento de teclado
      }
  
     
      
    }//GEN-LAST:event_jusuarioKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        boolean chk = false;
        
        for (int i = 0; i < this.jTableLibre.getModel().getRowCount(); i++) {
             System.out.println("R1 "+ this.jTableLibre.getModel().getValueAt(i, 0) + " R2 " +  this.jTableLibre.getModel().getValueAt(i, 1) +
                     " R3 " +  this.jTableLibre.getModel().getValueAt(i, 2) +" R4  "+  this.jTableLibre.getModel().getValueAt(i, 3) );
            chk = (boolean) this.jTableLibre.getModel().getValueAt(i, 3);
             if(chk)
             {
              //System.out.println("R1 "+ this.jTableLibre.getModel().getValueAt(i, 0));
             }
          //  this.jTableLibre.getModel().setValueAt("OOO", i, 1); 
        }
       
   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarActionPerformed
     


    }//GEN-LAST:event_SeleccionarActionPerformed

    private void jTableLibreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLibreMouseClicked

        //probar click
   
        
    }//GEN-LAST:event_jTableLibreMouseClicked

    private void matriculasalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculasalidaActionPerformed
        for (int i = 0; i < this.hey.ViewFreeAll.Matricula.size(); i++) {
            if(this.hey.ViewFreeAll.Matricula.get(i).equals(this.matriculasalida.getText()))
            {
                int e = Integer.parseInt(this.matriculasalida.getText());
                //System.out.println("aqui viene la matricula " + e);
                e = this.hey.Get_IDUsuario(e);
                //  System.out.println("aqui viene la idusuario " + e);
                this.hey.Modificar_Salida_Asistencia(e);
                
                                        this.hey.CreateViewAllNotExit();
                                        this.hey.AddViewAllNotExit();
                                        this.CargarMatrizRegistroL();
                                        this.matriculasalida.setText("");
            }
        }
    }//GEN-LAST:event_matriculasalidaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Salida para todos
        
        int resp=JOptionPane.showConfirmDialog(null,"¿Deseas registrar la salida para todos?");
              if (JOptionPane.OK_OPTION == resp){
                 System.out.println("Selecciona opción Afirmativa");
                 for (int i = 0; i < this.hey.ViewFreeAll.Matricula.size(); i++) {
            
                int e = Integer.parseInt(this.hey.ViewFreeAll.Matricula.get(i));
                //System.out.println("aqui viene la matricula " + e);
                e = this.hey.Get_IDUsuario(e);
                //  System.out.println("aqui viene la idusuario " + e);
                this.hey.Modificar_Salida_Asistencia(e);
                
                                      
                                        
            
                     }
                 
                                        this.hey.CreateViewAllNotExit();
                                        this.hey.AddViewAllNotExit();
                                        this.CargarMatrizRegistroL();
            }
               else{
                 System.out.println("No selecciona una opción afirmativa");
   }
        
               
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void leerIDsInvitados(){
    //List<Integer> invitados = new ArrayList<>();
    //TableModel model = table.getModel();

    for(int i = 0; i < this.jTableLibre.getModel().getRowCount(); i++){
        //Si la columna 4 está true añadimos el ID
        if((Boolean)this.jTableLibre.getModel().getValueAt(i, 3) == true)
            System.out.print("Funciona " + this.jTableLibre.getModel().getValueAt(i, 3).toString());
//invitados.add((Integer)model.getValueAt(i, 0));
    
            }

    //Esta fila es sólo para que veas que funciona
    //System.out.println(invitados);

    //return invitados;
}

    
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Asistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Seleccionar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLibre;
    private javax.swing.JTextField jusuario;
    private java.awt.Label label1;
    private javax.swing.JLabel lfecha;
    private javax.swing.JLabel lhojas;
    private javax.swing.JLabel lhora;
    private javax.swing.JLabel lnombre;
    private javax.swing.JLabel lusuario;
    private javax.swing.JTextField matriculasalida;
    private javax.swing.JRadioButton rsala7;
    private javax.swing.JRadioButton rsala8;
    // End of variables declaration//GEN-END:variables
}
