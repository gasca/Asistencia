
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Gasca
 */
public class VistaLibre {
    
    
    ArrayList<String> Matricula = new ArrayList<String>(); 
    ArrayList<String> Usuario = new ArrayList<String>();
    ArrayList<String> Entrada = new ArrayList<String>();
    ArrayList<String> Salida = new ArrayList<String>();
    ArrayList<String> Fecha = new ArrayList<String>();
    ArrayList<String> Sala = new ArrayList<String>();
    ArrayList<Boolean> valor = new ArrayList<Boolean>();

    public ArrayList<String> getSala() {
        return Sala;
    }

    public void setSal(String Sala) {
        this.Sala.add(Sala);
    }

    public ArrayList<Boolean> getValor() {
        return valor;
    }

    public void setValor(ArrayList<Boolean> valor) {
        this.valor = valor;
    }

       public void setVa(Boolean va) {
        this.valor.add(va);
    }
    
    public ArrayList<String> getMatricula() {
        return Matricula;
    }

      public void setMa(String Ma) {
        this.Matricula.add(Ma);
    }
    
    public void setMatricula(ArrayList<String> Matricula) {
        this.Matricula = Matricula;
    }
   

    public ArrayList<String> getUsuario() {
        return Usuario;
    }

    
    public void setUs(String Us) {
        this.Usuario.add(Us);
    }
    public void setUsuario(ArrayList<String> Usuario) {
        this.Usuario = Usuario;
    }

    public ArrayList<String> getEntrada() {
        return Entrada;
    }
    
    
    
    public void setEn(String En) {
        this.Entrada.add(En);
    }

    public void setEntrada(ArrayList<String> Entrada) {
        this.Entrada = Entrada;
    }

    public ArrayList<String> getSalida() {
        return Salida;
    }
    
    
    
    public void setSa(String Sa) {
        this.Salida.add(Sa);
    }

    public void setSalida(ArrayList<String> Salida) {
        this.Salida = Salida;
    }

    public ArrayList<String> getFecha() {
        return Fecha;
    }
    
    
    
    public void setFe(String Fe) {
        this.Fecha.add(Fe);
    }

    public void setFecha(ArrayList<String> Fecha) {
        this.Fecha = Fecha;
    }
                 
    
    
    
    
}
