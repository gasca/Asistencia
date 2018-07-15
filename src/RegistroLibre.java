

/*
Registro Libre sirve para crear una clase de los elementos que se hacen por parte de la asistencia.



*/

public class RegistroLibre {

    
    String usuario, matricula, hojas, entrada, comentarios;
    
    
    public RegistroLibre(String usuario, String matricula, String hojas, String entrada) {
        this.usuario = usuario;
        this.matricula = matricula;
        this.hojas = hojas;
        this.entrada = entrada;
        //this.comentarios = comentarios;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getHojas() {
        return hojas;
    }

    public void setHojas(String hojas) {
        this.hojas = hojas;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
    
    
   
    
    
    
    
}
