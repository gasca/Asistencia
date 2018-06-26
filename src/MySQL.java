
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    
    
    
    public MySQL()
    {
        con = new Conexion();
        con.MySQLConnect();
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
    
    
    
    public void Guardar_HorarioLibre(int matricula, int sala,  int Alumno)
    {
   
     
        
    try{
         this.Query = "INSERT INTO `ceco`.`horariolbre` (`ID_Horario`,`ID_Sala`,`ID_Alumno`,`Hora_Entrada`, `Hora_Salida`,`Fecha`,`Comentarios`) VALUES "
                + "(NULL , '"+ sala + "', '"+  matricula + "', '"+ this.Get_Hora()  +"', '00:00','"+ this.Get_Fecha()  +"', 'funciona' )";
        
              con.comando = con.conexion.createStatement();
              /*con.registro = con.comando.executeQuery(Query);*/
            con.comando.executeUpdate(Query);
    
    
    }catch(SQLException ex){
    
        Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
    
    }
    
   
    
    }
    
    
    
    
    
    
       public int Get_IDMatricula(int Matricula){
    
         String resultado="";
         int idm = 0;
        try{
            s = con.conexion.createStatement();
            rs = s.executeQuery("select ID_Usuario from Alumno where Matricula="+ Matricula);
            
            while(rs.next())
                {
                 resultado = rs.getString(1);
                 //System.out.print(resultado);
                }
           
            
        }catch(SQLException ex1)
        {
            JOptionPane.showMessageDialog(null, "Error en consulta de base de datos Hoja" + ex1);
             Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex1);
             resultado ="0";
        }
        return Integer.parseInt(resultado);
    
    }
    
    
    
    
    public int Get_Hoja(int IDMatricula){
    
         String resultado="";
         int hojas = -1;
        try{
            s = con.conexion.createStatement();
            rs = s.executeQuery("select hoja from hoja where ID_Usuario="+ IDMatricula);
            
            while(rs.next())
                {
                 resultado = rs.getString(1);
                 //System.out.print(resultado);
                }
           
            s.close(); 
        }catch(SQLException ex1)
        {
            JOptionPane.showMessageDialog(null, "Error en consulta de base de datos Hoja" + ex1);
             Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex1);
             resultado ="-1";
        }
       
        return hojas = Integer.parseInt(resultado);
        
    }
    
    
    
    
        public String Get_Alumno(){
    
         String resultado="";
        try{
            s = con.conexion.createStatement();
            rs = s.executeQuery("select Nombre from Alumno");
            
            while(rs.next())
                {
                 resultado = rs.getString(1);
                 //System.out.print(resultado);
                }
           
            
        }catch(SQLException ex1)
        {
            JOptionPane.showMessageDialog(null, "Error en consulta de base de datos Alumno" + ex1);
             Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex1);
             resultado ="00/00/00";
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
    
}
