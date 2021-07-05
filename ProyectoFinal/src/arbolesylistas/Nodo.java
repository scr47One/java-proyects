package arbolesylistas;

import java.io.Serializable;

/**
 *
 * @author Daniel Castrejon
 */
//Clase contenedora de nodos;
public class Nodo implements Serializable
{
    public static final long serialVersionUID = 1L;
    private Object obj;
    private Nodo sig = null;
    private Nodo ant = null;
    private Nodo abj = null;
    private Nodo arb = null;
    private String etiqueta = "";

    public Nodo(Object obj)
    {
        this.obj = obj;
    }

    public Nodo(Object obj, String etiqueta)
    {
        this.obj = obj;
        this.etiqueta = etiqueta;
    }

    public Object getObj()
    {
        return obj;
    }

    public void setObj(Object obj)
    {
        this.obj = obj;
    }

    public Nodo getSig()
    {
        return sig;
    }

    public void setSig(Nodo sig)
    {
        this.sig = sig;
    }

    public Nodo getAnt()
    {
        return ant;
    }

    public void setAnt(Nodo ant)
    {
        this.ant = ant;
    }

    public Nodo getAbj()
    {
        return abj;
    }

    public void setAbj(Nodo abj)
    {
        this.abj = abj;
    }

    public Nodo getArb()
    {
        return arb;
    }

    public void setArb(Nodo arb)
    {
        this.arb = arb;
    }
    

    public String getEtiqueta()
    {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta)
    {
        this.etiqueta = etiqueta;
    }

}
