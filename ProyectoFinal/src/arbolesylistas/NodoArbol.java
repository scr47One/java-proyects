package arbolesylistas;

import java.io.Serializable;


/**
 *
 * @author Daniel Castrejon
 * 
 * CLASE CONTENEDORA DE APUNTADORES Y ETIQUETAS DE TIPO:
 * NODOARBOL PARA ARBOLES BINARIOS
 */
public class NodoArbol implements Serializable
{

    public static final long serialVersionUID = 1L;
    private String etiqueta;
    private NodoArbol izq = null;
    private NodoArbol der = null;
    private Nodo hilo = null;

    public NodoArbol(String etiqueta)
    {
        this.etiqueta = etiqueta;
    }
    
    public NodoArbol(String etiqueta, Nodo n)
    {
        this.etiqueta = etiqueta;
        this.hilo=n;
    }
    
    public String getEtiqueta()
    {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta)
    {
        this.etiqueta = etiqueta;
    }

    public NodoArbol getIzq()
    {
        return izq;
    }

    public void setIzq(NodoArbol izq)
    {
        this.izq = izq;
    }

    public NodoArbol getDer()
    {
        return der;
    }

    public void setDer(NodoArbol der)
    {
        this.der = der;
    }

    public Nodo getHilo()
    {
        return hilo;
    }

    public void setHilo(Nodo hilo)
    {
        this.hilo = hilo;
    }
}
