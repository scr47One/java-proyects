package arbolesylistas;

import java.io.Serializable;

/**
 *
 * @author Daniel Castrejon
 */
public class Institucion implements Serializable
{

    private String dir;
    private int cveIntitucion;
    private String nombre;
    private Long tel;

    public Institucion(String dir, int cveIntitucion, String nombre, Long tel)
    {
        this.dir = dir;
        this.cveIntitucion = cveIntitucion;
        this.nombre = nombre;
        this.tel = tel;
    }

    public String getDir()
    {
        return dir;
    }

    public void setDir(String dir)
    {
        this.dir = dir;
    }

    public int getCveIntitucion()
    {
        return cveIntitucion;
    }

    public void setCveIntitucion(int cveIntitucion)
    {
        this.cveIntitucion = cveIntitucion;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public Long getTel()
    {
        return tel;
    }

    public void setTel(Long tel)
    {
        this.tel = tel;
    }


}
