
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




public class MySQL {
    
    Conexion con;
    String Query ="";
   
    Statement s;
    ResultSet rs; 
    
    private String horaasistencia;
    private String fechaasistencia;
    
    private ArrayList<String> FoliosRecibos = new ArrayList<String>();
    
    private ArrayList<String> idusuario = new ArrayList<String>();
    private ArrayList<String> matricula = new ArrayList<String>();
    private ArrayList<String> nombre = new ArrayList<String>();
    private ArrayList<String> hoja = new ArrayList<String>();
    private ArrayList<String> precio = new ArrayList<String>();
    private ArrayList<String> fecha = new ArrayList<String>();
    private ArrayList<String> registro = new ArrayList<String>();
    ArrayList<String> software = new ArrayList<String>();
     ArrayList<String> grupoclase = new ArrayList<String>();
    ArrayList<String> profesor = new ArrayList<String>();
    ArrayList<String> carrera = new ArrayList<String>();




    
    VistaLibre ViewFreeAll = new VistaLibre();
    VistaLibre ViewFreeAllClass = new VistaLibre();
                    
    
    
    public MySQL()
    {
        con = new Conexion();
        con.MySQLConnect();
    }
    
  
    
    public void CreateViewAll(){
    
       
          try{
            s = con.conexion.createStatement();
            s.execute("CREATE  OR REPLACE VIEW AsistenciaAlDia AS SELECT `Alumno`.`Matricula`, `Alumno`.`Nombre`, `HorarioLibre`.`Hora_Entrada`, `HorarioLibre`.`Hora_Salida`, `Sala`.`Sala` FROM `horariolibre` INNER JOIN `Alumno` ON   `HorarioLibre`.`ID_Usuario` = `Alumno`.`ID_Usuario` INNER JOIN `Sala` ON `horariolibre`.`ID_Sala` = `Sala`.`ID_Sala`  WHERE `HorarioLibre`.`Fecha` = CURDATE()");
            
              }catch(SQLException ex){
    
        Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
    
    }
          
    }
    public void CreateViewAllNotExit(){
    
       
          try{
            s = con.conexion.createStatement();
            s.execute("CREATE  OR REPLACE VIEW AsistenciaAlDia AS SELECT `Alumno`.`Matricula`, `Alumno`.`Nombre`, `HorarioLibre`.`Hora_Entrada`, `HorarioLibre`.`Hora_Salida`, `Sala`.`Sala` FROM `horariolibre` INNER JOIN `Alumno` ON   `HorarioLibre`.`ID_Usuario` = `Alumno`.`ID_Usuario` INNER JOIN `Sala` ON `horariolibre`.`ID_Sala` = `Sala`.`ID_Sala`  WHERE `HorarioLibre`.`Fecha` = CURDATE() and `HorarioLibre`.`Hora_Salida` = '00:00:00'");
            
              }catch(SQLException ex){
    
        Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
    
    }
    
    
    }
    
    
    public void CreateViewAllClassNotExit(){
    
       
          try{
            s = con.conexion.createStatement();
            s.execute("CREATE  OR REPLACE VIEW AsistenciaAlDiaClase AS SELECT `Alumno`.`Matricula`, `Alumno`.`Nombre`, `HorarioClase`.`Hora_Entrada`, `HorarioClase`.`Hora_Salida`, `Sala`.`Sala` FROM `horarioclase` INNER JOIN `Alumno` ON   `HorarioClase`.`ID_Usuario` = `Alumno`.`ID_Usuario` INNER JOIN `Sala` ON `horarioClase`.`ID_Sala` = `Sala`.`ID_Sala`  WHERE `HorarioClase`.`Fecha` = CURDATE() and `HorarioClase`.`Hora_Salida` = '00:00:00'");
            
              }catch(SQLException ex){
    
        Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
    
    }
    
    
    }
    
    public void AddViewAll(){
           
          try{
            s = con.conexion.createStatement();
            rs = s.executeQuery("Select *From AsistenciaAlDia");
      
                while(rs.next())
                {
                    
                   this.ViewFreeAll.setMa(rs.getString(1));
                   this.ViewFreeAll.setUs(rs.getString(2));
                   this.ViewFreeAll.setEn(rs.getString(3));
                   this.ViewFreeAll.setSa(rs.getString(4));
                 //System.out.print(resultado);
                }
        
                  s.close();
                  
                  
                 // for (int i = 0; i < this.ViewFreeAll.getUsuario().size(); i++) {
                   
                  //     System.out.println("Estos son los valores de las vistas " + this.ViewFreeAll.getEntrada().get(i));
                       
                      
                  //       }
                  
            
          
        
              }catch(SQLException ex){
    
        Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
    
    }
    
    
    
    }
    
    public void AddViewAllClass(){
                    this.ViewFreeAllClass.Salida.clear();
                   this.ViewFreeAllClass.Usuario.clear();
                   this.ViewFreeAllClass.Entrada.clear();
                   this.ViewFreeAllClass.Matricula.clear();
                    this.ViewFreeAllClass.Sala.clear();
                   this.ViewFreeAllClass.valor.clear();   
        
          try{
            s = con.conexion.createStatement();
            rs = s.executeQuery("Select *From AsistenciaAlDiaClase");
      
                while(rs.next())
                {
                    
                   this.ViewFreeAllClass.setMa(rs.getString(1));
                   this.ViewFreeAllClass.setUs(rs.getString(2));
                   this.ViewFreeAllClass.setEn(rs.getString(3));
                   this.ViewFreeAllClass.setSa(rs.getString(4));
                   this.ViewFreeAllClass.setSal(rs.getString(5));
                 //System.out.print(resultado);
                }
        
                  s.close();
                  
                  
                 // for (int i = 0; i < this.ViewFreeAll.getUsuario().size(); i++) {
                   
                  //     System.out.println("Estos son los valores de las vistas " + this.ViewFreeAll.getEntrada().get(i));
                       
                      
                  //       }
                  
            
          
        
              }catch(SQLException ex){
    
        Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
    
    }
    
    
    
    }
           
    public int SearchOnViewUser(String Matricula)
      {
        int i=0;
        
            try{
                    s = con.conexion.createStatement();
                    rs = s.executeQuery("select Nombre from  AsistenciaAlDia Where Matricula = " + Matricula);
                    
                    while(rs.next())
                    {
                    i++;
                    //  System.out.println("Encontrado " + i);
                    }
                    
                  

                    s.close();
            }catch(SQLException ex){
                  
                Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);

            }
            
            return i;
    
      }
          
    public int SearchOnViewUserClass(String Matricula)
      {
        int i=0;
        
            try{
                    s = con.conexion.createStatement();
                    rs = s.executeQuery("select Nombre from  AsistenciaAlDiaClase Where Matricula = " + Matricula);
                    
                    while(rs.next())
                    {
                    i++;
                    //  System.out.println("Encontrado " + i);
                    }
                    
                  

                    s.close();
            }catch(SQLException ex){
                  
                Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);

            }
            
            return i;
    
      }
         
    
     public void AddViewAllNotExit(){
           
                   this.ViewFreeAll.Salida.clear();
                   this.ViewFreeAll.Usuario.clear();
                   this.ViewFreeAll.Entrada.clear();
                   this.ViewFreeAll.Matricula.clear();
                    this.ViewFreeAll.Sala.clear();
                   this.ViewFreeAll.valor.clear();
          
          try{
            s = con.conexion.createStatement();
            rs = s.executeQuery("Select *From AsistenciaAlDia");
      
                while(rs.next())
                {
                    
                   this.ViewFreeAll.setMa(rs.getString(1));
                   this.ViewFreeAll.setUs(rs.getString(2));
                   this.ViewFreeAll.setEn(rs.getString(3));
                   this.ViewFreeAll.setSa(rs.getString(4));
                   this.ViewFreeAll.setSal(rs.getString(5));
                   this.ViewFreeAll.setVa(false);
                 //System.out.print(resultado);
                }
        
                  s.close();
                  
                  
             /*     for (int i = 0; i < this.ViewFreeAll.getUsuario().size(); i++) {
                   
                       System.out.println("Estos son los valores de las vistas " + this.ViewFreeAll.getEntrada().get(i));
                       
                      
                         }
                  */
            
          
        
              }catch(SQLException ex){
    
        Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
    
    }
    
    
    
    }
     
     
     
    
       public void Guardar_Usuario(int matricula, int id_grupo,  String nombre)
    {
   
     
        
    try{
         this.Query = "INSERT INTO `ceco`.`Alumno` (`ID_Usuario`,`ID_Grupo`,`ID_Matricula`,`Nombre`) VALUES "
                + "(NULL , '"+ id_grupo + "', '"+ matricula   + "', '"+ nombre  + "' )";
        
              con.comando = con.conexion.createStatement();
              /*con.registro = con.comando.executeQuery(Query);*/
            con.comando.executeUpdate(Query);
    
    
    }catch(SQLException ex){
    
        Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
    
    }
    
   
    
    }
    
    
    
    
       
       //Cargar profesores
             public void ObtenerSoftware()
      {
    

            try{
                    s = con.conexion.createStatement();
                    rs = s.executeQuery("select Software From Software");

                    while(rs.next())
                        {
                          this.software.add(rs.getString(1));
                        }

                    s.close();
            }catch(SQLException ex){
                    
                
                System.out.println("Error al obtener software");
                Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);

            }
    
      }
      
         //cargar grupos clase
                   //Cargar profesores
             public void ObtenerGrupos()
      {
    

            try{
                    s = con.conexion.createStatement();
                    rs = s.executeQuery("SELECT DISTINCT grupo FROM horarioclase");

                    while(rs.next())
                        {
                          this.grupoclase.add(rs.getString(1));
                        }

                    s.close();
            }catch(SQLException ex){
                    
                
                System.out.println("Error al obtener Grupos clase");
                Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);

            }
    
      }
      
             
       //Cargar Docente
             public void ObtenerDocente()
      {
    

            try{
                    s = con.conexion.createStatement();
                    rs = s.executeQuery("select Profesor From Profesor");

                    while(rs.next())
                        {
                          this.profesor.add(rs.getString(1));
                        }

                    s.close();
            }catch(SQLException ex){
                    
                
                System.out.println("Error al obtener profesor");
                Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);

            }
    
      }
      
       
          //Cargar software
             public void ObtenerCarrera()
      {
    

            try{
                    s = con.conexion.createStatement();
                    rs = s.executeQuery("select Carrera From Carrera");

                    while(rs.next())
                        {
                          this.carrera.add(rs.getString(1));
                        }

                    s.close();
            }catch(SQLException ex){
                    
                
                System.out.println("Error al obtener carrera");
                Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);

            }
    
      }
      
       
       
    
    //-------------Consultas de recibos------------------------------------------------------
      public void ObtenerFolios()
      {
    
        
    try{
            s = con.conexion.createStatement();
            rs = s.executeQuery("select Folio from Recibo");
            
            while(rs.next())
                {
                   this.setFoliosRecibos(rs.getString(1));
                 //System.out.print(resultado);
                }
        
            s.close();
    }catch(SQLException ex){
    
        Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
    
    }
    
      }
      
      
            public void Datos_Recibos()
      {
    
          this.FoliosRecibos.clear();
          this.hoja.clear();
          this.precio.clear();
          this.fecha.clear();
          this.registro.clear();
          this.nombre.clear();
          this.matricula.clear();
        
        try{
                s = con.conexion.createStatement();
                rs = s.executeQuery("SELECT `Recibo`.`Folio`,`Recibo`.`hoja`,`Recibo`.`Precio`,`Recibo`.`Fecha`,`Recibo`.`Registro`, `Alumno`.`Nombre`,`Alumno`.`Matricula` FROM `recibo` INNER JOIN  `Alumno` ON `Recibo`.`ID_Usuario` = `Alumno`.`ID_Usuario`");

                while(rs.next())
                    {
                      
                        this.setFoliosRecibos(rs.getString(1));
                        this.setHoja(rs.getString(2));
                        this.setPrecio(rs.getString(3));
                        this.setFecha(rs.getString(4));
                        //System.out.println(rs.getString(5));
                        this.setRegistro(rs.getString(5));
                        this.setNombre(rs.getString(6));
                        this.setMatricula(rs.getString(7));

                    }

                s.close();
        }catch(SQLException ex){

            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);

        }
    
      }
      
      
       
    //-------------Consultas de recibos------------------------------------------------------
      public double ObtenerPrecio(){
            double precio = 0.0;
        
         try{
            s = con.conexion.createStatement();
            rs = s.executeQuery("select Precio from Precio");
            
            while(rs.next())
                {
                  precio = Double.parseDouble(rs.getString(1));
                 //System.out.print(resultado);
                }
           

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al capturar el precio SQL");
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);

        }
    
   
        return precio;
    }
   
    
    
    
      
      public void Guardar_Recibo(int idusuario, int folio, int hoja, int precio, String fecha ){
      
             
      try{
         this.Query = "INSERT INTO `ceco`.`Recibo` (`ID_Recibo`,`ID_Usuario`,`Folio`,`Hoja`, `Precio`,`Fecha`) VALUES "
                + "(NULL , '"+ idusuario + "', '"+  folio + "', '"+ hoja +"', '"+ precio +"', '"+fecha +"', '"+ this.Get_FechaCompleta() +"')";
        
             s =  con.comando = con.conexion.createStatement();
              /*con.registro = con.comando.executeQuery(Query);*/
            con.comando.executeUpdate(Query);
    
    
    }catch(SQLException ex){
        System.out.println("Error faltal");
        Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);

    }
      
      }
      
      
      
      
      
    //---------------------------------------------------------------------------------------------------
    
    public void Guardar_HorarioLibre(int idusuario, int sala)
    {
   
     
        
    try{
         this.Query = "INSERT INTO `ceco`.`horariolibre` (`ID_Horario`,`ID_Sala`,`ID_Usuario`,`Hora_Entrada`, `Hora_Salida`,`Fecha`,`Comentarios`) VALUES "
                + "(NULL , '"+ sala + "', '"+  idusuario + "', '"+ this.Get_Hora()  +"', '00:00','"+ this.Get_Fecha()  +"', 'funciona' )";
        
             s =  con.comando = con.conexion.createStatement();
              /*con.registro = con.comando.executeQuery(Query);*/
            con.comando.executeUpdate(Query);
    
    
    }catch(SQLException ex){
    
        Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error al capturar el hora libre");
    }
    
   
    
    }
    
    
      public void Guardar_HorarioClase(int idusuario, int sala, String maestro, String software, String Grupo, String carrera, String materia)
    {
          
    try{
         this.Query = "INSERT INTO `ceco`.`horarioclase` (`ID_Horario`,`ID_Sala`,`ID_Usuario`, `Profesor`,`Hora_Entrada`, `Hora_Salida`,`Fecha`,`Grupo`,`Carrera`,`Software`,`Materia`,`Comentarios`) VALUES "
                + "(NULL , '"+ sala + "', '"+  idusuario + "', '"+  maestro +  "', '"+ this.Get_Hora()  +"', '00:00','"+ this.Get_Fecha()  +"','" + Grupo + "','"+ carrera +"','"+ software +"','"+materia+"','funcona')";
        
             s =  con.comando = con.conexion.createStatement();
              /*con.registro = con.comando.executeQuery(Query);*/
            con.comando.executeUpdate(Query);
    
    
    }catch(SQLException ex){
    
        Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error al capturar el hora clase");
    }
    
   
    
    }
    
    public void Modificar_Salida_Asistencia(int idsu)
    {
   
        System.out.println("idsuaurio en modificar " + idsu);
    try{
         this.Query = "UPDATE `HorarioLibre` SET `Hora_Salida`= '" + this.Get_Hora() +"' WHERE `ID_Usuario`=" + idsu; 
              
             s =  con.comando = con.conexion.createStatement();
             con.comando.executeUpdate(this.Query);
               
             
    
    
    }catch(SQLException ex){
    
        Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error al actualizar horalibre salida");
    }
    
   
    
    }
    
    
      public void Modificar_SalidaClase(String grupo)
    {
   
       // System.out.println("idsuaurio en modificar " + idsu);
    try{
         this.Query = "UPDATE `HorarioClase` SET `Hora_Salida`= '" + this.Get_Hora() +"' WHERE Grupo='" + grupo+"'"; 
              
             s =  con.comando = con.conexion.createStatement();
             con.comando.executeUpdate(this.Query);
               
             
    
    
    }catch(SQLException ex){
    
        Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error al actualizar horaclase salida");
    }
    
   
    
    }
    
    
        public void Modificar_Recibo(int idrecibo,int folio, int idusuario, int hojas, double importe, String fecha)
    {
    System.out.println("IDRecibo " + idrecibo + "   " + folio +"   " + idusuario + "   " + hojas +"  "+ importe + "    " + fecha  );
        
    try{
         this.Query = "UPDATE `recibo` SET `ID_Usuario`=" + idrecibo +",`Folio`= "+folio+",`hoja`="+hojas+",`Precio`="+importe+",`Fecha`='"+fecha+"',`Registro`= '"+this.Get_FechaCompleta()+"' WHERE `ID_Recibo`=" + 4; 
              
             s =  con.comando = con.conexion.createStatement();
             con.comando.executeUpdate(this.Query);
               
             
    
    
    }catch(SQLException ex){
    
        Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error al actualizar datos del recibo");
    }
    
   
    
    }
    
      public void EliminarRecibo(int idrecibo)
    {
    
        
    try{
         this.Query = "DELETE FROM `ceco`.`recibo` WHERE `recibo`.`ID_Recibo` =" + idrecibo;
              
             s =  con.comando = con.conexion.createStatement();
             con.comando.executeUpdate(this.Query);
               
             
    
    
    }catch(SQLException ex){
    
        Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error al eliminar datos del recibo");
    }
    
   
    
    }
    
    
    
    
       public int Get_IDUsuario(int Matricula){
   
         String resultado="";
         System.out.println("matricula en get usuario " +  Matricula);
        
        try{
            s = con.conexion.createStatement();
           rs = s.executeQuery("select ID_Usuario from Alumno where Matricula="+ Matricula);
            
          
                while(rs.next())
                {
                 resultado = rs.getString(1);
                 System.out.println("Que es get idusuario get "+ resultado);
                }
            
         
        }catch(SQLException ex1)
        {
            System.out.println("Error al obtener id");
            //JOptionPane.showMessageDialog(null, "Error en consulta de base de datos usuario" + ex1);
             Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex1);
             //resultado ="0";
        }
     
     
           return Integer.parseInt(resultado);
    
    }
       
       public int Get_IDRecibo(int folio){
   
           System.out.println("Este es el folio que se pasa IDRecibo "+ folio);
           
         String resultado="";
        
        try{
            s = con.conexion.createStatement();
            rs = s.executeQuery("select ID_Recibo from Recibo where Folio="+ folio);
                     
                while(rs.next())
                {
                 resultado = rs.getString(1);
                 System.out.print("De la consulta de ID SE OBTUBO  "+ resultado);
                }
            
          
            
        }catch(SQLException ex1)
        {
            System.out.println("Error al obtener id");
            //JOptionPane.showMessageDialog(null, "Error en consulta de base de datos usuario" + ex1);
             Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex1);
             resultado ="0";
        }
     
     
           return Integer.parseInt(resultado);
    
    }
    
    
    
    
    public int Get_HojasRecibos(int IDMatricula){
    
         String resultado="0";
         int hojas;
        try{
            s = con.conexion.createStatement();
            rs = s.executeQuery("SELECT ifnull( SUM( `Recibo`.`hoja` ) , 0 ) AS HojasRecibo FROM `Recibo` WHERE `Recibo`.`ID_Usuario` ="+ IDMatricula);
            
            while(rs.next())
                {
                 resultado = rs.getString(1);
                 //System.out.print(resultado);
                }
           
            s.close(); 
        }catch(SQLException ex1)
        {
            JOptionPane.showMessageDialog(null, "Error en consulta de base de datos Recibos**  " + ex1);
             Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex1);
             resultado ="-99";
        }
       
        if((resultado!=null))
        {
         resultado ="0";
         System.out.println("La consulta no arrojo valores");
        }
        
        return hojas = Integer.parseInt(resultado);
        
    }
    
    
    
    public int Get_HojasImpresiones(int IDMatricula){
    
         String resultado="0";
         int hojas;
        try{
            s = con.conexion.createStatement();
            rs = s.executeQuery("SELECT ifnull( SUM( `Impresion`.`hoja` ) , 0 ) AS HojasImpresion FROM `Impresion` WHERE `Impresion`.`ID_Usuario` = "+ IDMatricula);
          while(rs.next())
                {
                 resultado = rs.getString(1);
                 System.out.print("Que es  "+ resultado);
                }
            
          
            
           
            s.close(); 
        }catch(SQLException ex1)
        {
            JOptionPane.showMessageDialog(null, "Error en consulta de base de datos Impresion Hoja  " + ex1);
             Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex1);
             resultado ="0";
        }
     
        
        return hojas = Integer.parseInt(resultado);
        
    }
    
        public String Get_Nombre(String usuario){
        System.out.println("usuario " + usuario);
         String resultado="";
        try{
            s = con.conexion.createStatement();
            rs = s.executeQuery("select Nombre from Alumno where Matricula = " + usuario);
            
            while(rs.next())
                {
                 resultado = rs.getString(1);
                 System.out.print(resultado);
                }
           
            
        }catch(SQLException ex1)
        {
            JOptionPane.showMessageDialog(null, "Error en consulta de base de datos Alumno" + ex1);
             Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex1);
             resultado ="Alumno perfecto";
        }
        return resultado;
    
    }
       
          public String Get_IDUsuario(String idusuario){
       
         String resultado="";
        try{
            s = con.conexion.createStatement();
            rs = s.executeQuery("select ID_Usuario from Alumno where Matricula = " + Integer.parseInt(idusuario));
            
            while(rs.next())
                {
                 resultado = rs.getString(1);
                // System.out.print("imprime" + resultado);
                }
           
            
        }catch(SQLException ex1)
        {
            JOptionPane.showMessageDialog(null, "Error en consulta de base de datos ID_Usuario" + ex1);
             Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex1);
             resultado ="Alumno perfecto";
        }
        return resultado;
    
    }
       
        public String Get_Fecha(){
    
         String resultado="";
        try{
            s = con.conexion.createStatement();
            rs = s.executeQuery("select CurDate()");
            
            while(rs.next())
                {
                 resultado = rs.getString(1);
                 this.setFechaasistencia(resultado);
                 //System.out.print(resultado);
                }
           
             s.close();
        }catch(SQLException ex1)
        {
            JOptionPane.showMessageDialog(null, "Error en obtener fecha" + ex1);
             Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex1);
             resultado ="00/00/00";
        }
        return resultado;
    
    }
    
    public String Get_FechaCompleta(){
    
         String resultado="";
        try{
            s = con.conexion.createStatement();
            rs = s.executeQuery("select Now()");
            
            while(rs.next())
                {
                 resultado = rs.getString(1);
                 this.setFechaasistencia(resultado);
                 //System.out.print(resultado);
                }
           
             s.close();
        }catch(SQLException ex1)
        {
            JOptionPane.showMessageDialog(null, "Error en obtener fecha" + ex1);
             Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex1);
             resultado ="00/00/00";
        }
        return resultado;
    
    }
    
     public String Get_Hora(){
    
         String resultado="";
        try{
            s = con.conexion.createStatement();
            rs = s.executeQuery("select CurTime()");
            
            while(rs.next())
                {
                 resultado = rs.getString(1);
                 this.setHoraasistencia(resultado);
                 //System.out.print(resultado);
                }
           s.close();
            
        }catch(SQLException ex1)
        {
            JOptionPane.showMessageDialog(null, "Error en obtener fecha" + ex1);
             Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex1);
             resultado ="00/00/00";
        }
        return resultado;
    
    }

    /**
     * @return the horaasistencia
     */
    public String getHoraasistencia() {
        return horaasistencia;
    }

    /**
     * @param horaasistencia the horaasistencia to set
     */
    public void setHoraasistencia(String horaasistencia) {
        this.horaasistencia = horaasistencia;
    }

    /**
     * @return the fechaasistencia
     */
    public String getFechaasistencia() {
        return fechaasistencia;
    }

    /**
     * @param fechaasistencia the fechaasistencia to set
     */
    public void setFechaasistencia(String fechaasistencia) {
        this.fechaasistencia = fechaasistencia;
    }

    /**
     * @return the FoliosRecibos
     */
    public ArrayList<String> getFoliosRecibos() {
        return FoliosRecibos;
    }

    /**
     * @param FoliosRecibos the FoliosRecibos to set
     */
    public void setFoliosRecibos(String FoliosRecibos) {
        this.FoliosRecibos.add(FoliosRecibos);
    }

    /**
     * @return the idusuario
     */
    public ArrayList<String> getIdusuario() {
        return idusuario;
    }

    /**
     * @param idusuario the idusuario to set
     */
    public void setIdusuario(ArrayList<String> idusuario) {
        this.idusuario = idusuario;
    }

    /**
     * @return the matricula
     */
    public  String getMatricula(int i) {
        return matricula.get(i);
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula.add(matricula);
    }

    /**
     * @return the nombre
     */
    public String getNombre(int i) {
        return nombre.get(i);
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre.add(nombre);
    }

    /**
     * @return the hoja
     */
    public String getHojaRecibo(int i) {
        return hoja.get(i);
    }

    /**
     * @param hoja the hoja to set
     */
    public void setHoja(String hoja) {
        this.hoja.add(hoja);
    }

    /**
     * @return the precio
     */
    public String getPrecio(int i) {
        return precio.get(i);
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio.add(precio);
    }

    /**
     * @return the fecha
     */
    public String getFecha(int i) {
        return fecha.get(i);
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha.add(fecha);
    }

    /**
     * @return the registro
     */
    public ArrayList<String> getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(String registro) {
        this.registro.add(registro);
    }
    
}
