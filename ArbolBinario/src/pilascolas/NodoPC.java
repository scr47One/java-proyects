package pilascolas;

import java.io.Serializable;

/**
 *
 * @author Daniel Castrejon
 */
//Clase contenedora-----La estructura estan en las clases de extructuras dinamicas
public class NodoPC implements Serializable
{

    private NodoPC sig = null;
    private Object obj;

    public NodoPC(Object obj)
    {
        this.obj = obj;
    }

    public NodoPC getSig()
    {
        return sig;
    }

    public void setSig(NodoPC sig)
    {
        this.sig = sig;
    }

    public Object getObj()
    {
        return obj;
    }

    public void setObj(Object obj)
    {
        this.obj = obj;
    }

}
