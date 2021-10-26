package Clases;

import java.io.Serializable;

public class Instituto implements Serializable
{

    //serialVersionUID este es el nombre y el L es la version y se le agrega un numero antes tipo 999L
    public static final long serialVersionUID = 1L;

    private String nombre;
    private long clave;
    private String direccion;
    private long telefono;

    public Instituto(String nombreE, long clave, String director, long tel)
    {
        this.nombre = nombreE.toUpperCase();
        this.clave = clave;
        this.direccion = director.toUpperCase();
        this.telefono = tel;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombreE)
    {
        this.nombre = nombreE;
    }

    public long getClave()
    {
        return clave;
    }

    public void setClave(long clave)
    {
        this.clave = clave;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String director)
    {
        this.direccion = director;
    }

    public long getTelefono()
    {
        return telefono;
    }

    public void setTelefono(long tel)
    {
        this.telefono = tel;
    }

}
