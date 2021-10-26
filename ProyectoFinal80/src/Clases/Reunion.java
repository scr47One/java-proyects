package Clases;
import java.io.Serializable;
public class Reunion implements Serializable{
    //serialVersionUID este es el nombre y el L es la version y se le agrega un numero antes tipo 999L
    public static final long serialVersionUID = 1L;
    private long folio;
    private String motivo;
    private String fecha;

    public Reunion(long folio, String motivo, String fecha) {
        this.folio = folio;
        this.motivo = motivo.toUpperCase();
        this.fecha = fecha;
    }

    public long getFolio() {
        return folio;
    }

    public void setFolio(long folio) {
        this.folio = folio;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}

