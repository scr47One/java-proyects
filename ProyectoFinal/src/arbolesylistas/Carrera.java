package arbolesylistas;

import java.io.Serializable;

/**
 *
 * @author Daniel Castrejon
 */
public class Carrera implements Serializable
{

    private int cve;
    private String nombre;
    private String jefe;

    public Carrera(int cve, String nombre, String jefe)
    {
        this.cve = cve;
        this.nombre = nombre;
        this.jefe = jefe;
    }

    public int getCve()
    {
        return cve;
    }

    public void setCve(int cve)
    {
        this.cve = cve;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getJefe()
    {
        return jefe;
    }

    public void setJefe(String jefe)
    {
        this.jefe = jefe;
    }

    

}
