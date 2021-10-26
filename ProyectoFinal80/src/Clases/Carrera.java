package Clases;
import java.io.Serializable;
public class Carrera implements Serializable  {
    //serialVersionUID este es el nombre y el L es la version y se le agrega un numero antes tipo 999L
    public static final long serialVersionUID = 1L;

    private long matricula;
    private String nombre;
    private String jefe;

    public Carrera(long matricula, String nombre, String jefe) {
        this.matricula = matricula;
        this.nombre = nombre.toUpperCase();
        this.jefe = jefe.toUpperCase();
        
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }
    
}
