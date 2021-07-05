package arbolesylistas;

import java.io.Serializable;

/**
 *
 * @author Daniel Castrejon
 */
public class Reunion implements Serializable
{

    private int folioReunion;
    private String motivo;
    private String fecha;

    public Reunion(int folioReunion, String motivo, String fecha)
    {
        this.folioReunion = folioReunion;
        this.motivo = motivo;
        this.fecha = fecha;
    }

    public int getFolioReunion()
    {
        return folioReunion;
    }

    public void setFolioReunion(int folioReunion)
    {
        this.folioReunion = folioReunion;
    }

    public String getMotivo()
    {
        return motivo;
    }

    public void setMotivo(String motivo)
    {
        this.motivo = motivo;
    }

    public String getFecha()
    {
        return fecha;
    }

    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }

    
}
