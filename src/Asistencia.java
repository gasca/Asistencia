
import java.awt.Color;
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
import javax.swing.UIManager;
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
     boolean chkaclase = false;
     boolean primeravez = true;
      boolean primeravez2 = true;
     
    private ArrayList<RegistroLibre> registroslibres = new ArrayList<RegistroLibre>();
        ArrayList<Integer> indice = new ArrayList<Integer>();
   
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modeloclass = new DefaultTableModel();
    DefaultTableModel modelomatricula = new DefaultTableModel();
  
    Color colordefault = UIManager.getColor ( "Panel.background" );
    
    public Asistencia() {
    
         salas = new ButtonGroup();
         date = new Date();
         con = new Conexion();
         initComponents();
          salas.add(this.rsala7);  
          salas.add(this.rsala8);
          rsala7.setSelected(true);
        this.AgregarComboSoft();
        this.AgregarComboProf();
        this.AgregarComboCarr();
        this.jcgrupoclase.setEnabled(false);
        
   
        
        
       //
          
                
    }

    public void AgregarComboSoft(){
        this.hey.ObtenerSoftware();
        for (int i = 0; i <this.hey.software.size(); i++) {
            this.jcsoftware.addItem(this.hey.software.get(i));
            
        }
    
    }
    
    public void AgregarComboCarr(){
        this.hey.ObtenerCarrera();
        for (int i = 0; i <this.hey.carrera.size(); i++) {
            this.jccarrera.addItem(this.hey.carrera.get(i));
            
        }
    
    }
    
    
       public void AgregarComboProf(){
        this.hey.ObtenerDocente();
        for (int i = 0; i <this.hey.profesor.size(); i++) {
            this.jcprofesor.addItem(this.hey.profesor.get(i));
            
        }
    
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jMenu1 = new javax.swing.JMenu();
        jpregistro = new javax.swing.JPanel();
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
        alerta = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLibre = new javax.swing.JTable();
        jpanelsalida = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        matriculasalida = new javax.swing.JTextField();
        jbsalida = new javax.swing.JButton();
        jcheksalida = new javax.swing.JCheckBox();
        jcgrupoclase = new javax.swing.JComboBox();
        jlalertasalida = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jtgrupo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jccarrera = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jcprofesor = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jcsoftware = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jtmateria = new javax.swing.JTextField();
        jcheckClase = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableclase = new javax.swing.JTable();
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

        jpregistro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registro Entrada"));

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

        alerta.setText("---------------------------------");

        javax.swing.GroupLayout jpregistroLayout = new javax.swing.GroupLayout(jpregistro);
        jpregistro.setLayout(jpregistroLayout);
        jpregistroLayout.setHorizontalGroup(
            jpregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpregistroLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jpregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpregistroLayout.createSequentialGroup()
                        .addGroup(jpregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpregistroLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpregistroLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lhojas)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpregistroLayout.createSequentialGroup()
                        .addGroup(jpregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jpregistroLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpregistroLayout.createSequentialGroup()
                                .addGroup(jpregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpregistroLayout.createSequentialGroup()
                                        .addGroup(jpregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jpregistroLayout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lhora)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lfecha))
                                    .addGroup(jpregistroLayout.createSequentialGroup()
                                        .addComponent(rsala7)
                                        .addGap(18, 18, 18)
                                        .addComponent(rsala8)))))
                        .addContainerGap(14, Short.MAX_VALUE))))
            .addGroup(jpregistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(alerta, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpregistroLayout.setVerticalGroup(
            jpregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpregistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rsala7)
                    .addComponent(rsala8)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lusuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lnombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(lhojas)
                    .addComponent(lhora)
                    .addComponent(lfecha))
                .addGap(18, 18, 18)
                .addComponent(alerta)
                .addGap(22, 22, 22))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tiempo Libre"));

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpanelsalida.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registro de Salida"));

        jLabel8.setText("Matricula");

        matriculasalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculasalidaActionPerformed(evt);
            }
        });

        jbsalida.setText("Salida para todos Libre");
        jbsalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalidaActionPerformed(evt);
            }
        });

        jcheksalida.setText("Clase");
        jcheksalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheksalidaActionPerformed(evt);
            }
        });

        jlalertasalida.setText("---------------------------------------------------------");

        javax.swing.GroupLayout jpanelsalidaLayout = new javax.swing.GroupLayout(jpanelsalida);
        jpanelsalida.setLayout(jpanelsalidaLayout);
        jpanelsalidaLayout.setHorizontalGroup(
            jpanelsalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelsalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelsalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlalertasalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelsalidaLayout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(jcheksalida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcgrupoclase, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbsalida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpanelsalidaLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matriculasalida, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpanelsalidaLayout.setVerticalGroup(
            jpanelsalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelsalidaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpanelsalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(matriculasalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbsalida, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlalertasalida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanelsalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcgrupoclase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcheksalida))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Clase"));

        jLabel9.setText("Grupo");

        jLabel10.setText("Carrera");

        jLabel11.setText("Profesor");

        jLabel12.setText("Software");

        jLabel13.setText("Materia");

        jcheckClase.setText("Clase");
        jcheckClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckClaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcprofesor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jccarrera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcsoftware, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jtgrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcheckClase)
                                .addGap(0, 4, Short.MAX_VALUE))
                            .addComponent(jtmateria))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtgrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jcheckClase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtmateria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jccarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jcprofesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jcsoftware, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tiempo Clase"));

        jtableclase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtableclase.setRowHeight(30);
        jScrollPane2.setViewportView(jtableclase);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
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
                        .addComponent(jpregistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpanelsalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelsalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusuarioActionPerformed
       //Cuanto le da enter a la caja de text

        this.LimpiarCampos();
            
                    if(this.jusuario.getText().isEmpty() || this.jtgrupo.getText().isEmpty() || this.jtmateria.getText().isEmpty())
                {
                    
                 JOptionPane.showMessageDialog(null, "Complete todos los campos para poder capturar");


                }
                else
                {            
                           this.idusuario = hey.Get_IDUsuario(jusuario.getText());
                           if ( (this.idusuario != null) && (!this.idusuario.equals("")) ) {
                               // cadena no está vacía
                               //System.out.println("Este es el usuario " + this.idusuario);
                               if(!this.chkaclase)
                               {
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
                                   //agregar con clase
                                     //Cargar los datos en el panel
                                        this.hey.Guardar_HorarioClase(Integer.parseInt(this.idusuario), this.idsala,String.valueOf(this.jcprofesor.getSelectedItem()),String.valueOf(this.jcsoftware.getSelectedItem()),this.jtgrupo.getText(), String.valueOf(this.jccarrera.getSelectedItem()) ,this.jtmateria.getText());
                                        lusuario.setText(jusuario.getText());
                                        lnombre.setText(this.hey.Get_Nombre(jusuario.getText()));
                                        lhora.setText(this.hey.getHoraasistencia());
                                        lfecha.setText(this.hey.getFechaasistencia());
                                        
                                        
                                            //Cargar los datos en la tabla
                                        this.hey.CreateViewAllClassNotExit();
                                        this.hey.AddViewAllClass();
                                        this.CargarMatrizRegistroClass();
                                        this.CargarComboClase();
                                        this.jcgrupoclase.setEnabled(true);
                                        
                                        jusuario.setText("");
                               
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
        //this.modelomatricula.addColumn("Matricula", this.hey.ViewFreeAll.Matricula.toArray());
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
        
      if(this.primeravez2){
              int[] anchos = {40, 200, 50,30};
            for(int i = 0; i < this.jTableLibre.getColumnCount(); i++) {

            //Sacamos el modelo de columnas de nuestra tabla

            //luego obtenemos la columna en la posicion "i"

            //invocamos el metodo setPreferrefWidth para ajustar el ancho

            //y le damos el valor del entero que esta en el arreglo en la posicion "i"

            this.jTableLibre.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
           

       
        
        }
             this.primeravez2 = false;
      }
        
        
        
    }
    
     public void CargarMatrizRegistroClass()
    {
        this.Clear_JTableClass();
        
        this.modeloclass.setColumnCount(0);
       this.modeloclass.setRowCount(0);
        //this.modelo.addColumn("Seleccionar",  this.hey.ViewFreeAll.getUsuario().toArray());
        this.modeloclass.addColumn("Matricula", this.hey.ViewFreeAllClass.Matricula.toArray());
        this.modeloclass.addColumn("Usuario", this.hey.ViewFreeAllClass.getUsuario().toArray());
        //this.modelo.addColumn("Hojas",  this.hey.ViewFreeAll.getUsuario().toArray());
        this.modeloclass.addColumn("Entrada", this.hey.ViewFreeAllClass.getEntrada().toArray());
        this.modeloclass.addColumn("Sala", this.hey.ViewFreeAllClass.getSala().toArray());
     //   this.modelo.addColumn("Seleccionar", this.hey.ViewFreeAll.valor.toArray());
      
       /*     for (int i = 0; i <=this.hey.ViewFreeAll.valor.size()-1 ; i++) {
                System.out.println("El valor boleano es " + this.hey.ViewFreeAll.valor.get(i) );
                }
         */
        
        
        this.jtableclase.setModel(this.modeloclass);
      
      
      //  this.jTableLibre.getColumnModel().getColumn(3).setPreferredWidth(20);
        //this.jTableLibre.getColumnModel().getColumn(3).setCellEditor(new Clase_CellEditor());
       // this.jTableLibre.getColumnModel().getColumn(3).setCellRenderer(new Clase_CellRender() );
        //this.jTableLibre.updateUI();
        
        if(this.primeravez){
      
                     int[] anchos = {40, 200, 50,30};
                for(int i = 0; i < this.jtableclase.getColumnCount(); i++) {

                    //Sacamos el modelo de columnas de nuestra tabla

                    //luego obtenemos la columna en la posicion "i"

                    //invocamos el metodo setPreferrefWidth para ajustar el ancho

                    //y le damos el valor del entero que esta en el arreglo en la posicion "i"

                    this.jtableclase.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
                

                }
                this.primeravez = false;
        }
        
       
        

    }
    
     
         public void CargarComboClase()
    {
        this.hey.ObtenerGrupos();
        for (int i = 0; i < this.hey.grupoclase.size(); i++) {
            this.jcgrupoclase.addItem(this.hey.grupoclase.get(i));
        }

    }
    
    private void Clear_Jtablelibre(){
       while (this.modelo.getRowCount() > 0)
            {
                this.modelo.removeRow(0);
            }
            this.jTableLibre.setModel(this.modelo);
        }
    
    
        private void Clear_JTableClass(){
            this.jtableclase.removeAll();
          
       while (this.modeloclass.getRowCount() > 0)
            {
                this.modeloclass.removeRow(0);
            }
            this.jtableclase.setModel(this.modeloclass);
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

    private void jbsalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalidaActionPerformed
        //Salida para todos

        if(this.jcheksalida.isSelected())
        {
            int resp=JOptionPane.showConfirmDialog(null,"¿Deseas marcar salida para todos en clase" + String.valueOf(this.jcgrupoclase.getSelectedItem()));
              if (JOptionPane.OK_OPTION == resp){
               
               this.hey.Modificar_SalidaClase(String.valueOf(this.jcgrupoclase.getSelectedItem()));
                 
                                        this.hey.CreateViewAllClassNotExit();
                                        this.hey.AddViewAllClass();
                                        this.CargarMatrizRegistroClass();
                                        this.hey.ObtenerGrupos();
                                        this.CargarComboClase();
                                      
            }
               else{
                 System.out.println("No selecciona una opción afirmativa");
        
        
        }
        
        }
        else{
            
        int resp=JOptionPane.showConfirmDialog(null,"¿Deseas marcar salida para todos en tiempo libre?");
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
        
   }
        
               
        
    }//GEN-LAST:event_jbsalidaActionPerformed

    private void jcheckClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckClaseActionPerformed
        
        if(this.jcheckClase.isSelected())
        {
            this.jpregistro.setBackground(Color.BLUE);
            this.alerta.setForeground(Color.YELLOW);
            this.alerta.setText("Registrando Clase");
            this.chkaclase = true;
        
        }else
        {
                 this.jpregistro.setBackground(this.colordefault);
                 this.chkaclase = false;
                 this.alerta.setText("");
        }
        
        
    }//GEN-LAST:event_jcheckClaseActionPerformed

    private void jcheksalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheksalidaActionPerformed
          if(this.jcheksalida.isSelected())
        {
              this.matriculasalida.setEnabled(false);
            this.jpanelsalida.setBackground(Color.BLUE);
               this.jlalertasalida.setForeground(Color.YELLOW);
              this.jlalertasalida.setText("Registrando Salida De Clase");
              this.jbsalida.setText("Salida para grupos ");
         //   this.chkaclase = true;
        
        }else
        {        this.matriculasalida.setEnabled(true);
                 this.jpanelsalida.setBackground(this.colordefault);
        //         this.chkaclase = false;
                 this.jlalertasalida.setText("");
                 this.jbsalida.setText("Salida para todos Libre");
        }
    }//GEN-LAST:event_jcheksalidaActionPerformed

    
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
    private javax.swing.JLabel alerta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableLibre;
    private javax.swing.JButton jbsalida;
    private javax.swing.JComboBox jccarrera;
    private javax.swing.JComboBox jcgrupoclase;
    private javax.swing.JCheckBox jcheckClase;
    private javax.swing.JCheckBox jcheksalida;
    private javax.swing.JComboBox jcprofesor;
    private javax.swing.JComboBox jcsoftware;
    private javax.swing.JLabel jlalertasalida;
    private javax.swing.JPanel jpanelsalida;
    private javax.swing.JPanel jpregistro;
    private javax.swing.JTable jtableclase;
    private javax.swing.JTextField jtgrupo;
    private javax.swing.JTextField jtmateria;
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
