package pilascolas;

import java.io.Serializable;

/**
 *
 * @author Daniel Castrejon
 */
public class ColasDinamicas implements Serializable
{

    private NodoPC frente = null;
    private NodoPC atras = null;

    public ColasDinamicas()
    {
    }

    public NodoPC getFrente()
    {
        return frente;
    }

    public void setFrente(NodoPC frente)
    {
        this.frente = frente;
    }

    public NodoPC getAtras()
    {
        return atras;
    }

    public void setAtras(NodoPC atras)
    {
        this.atras = atras;
    }

    public boolean vacia()
    {
        if (frente == null && atras == null)
        {
            return true;
        } else
        {

            return false;
        }

    }

    public boolean inserta(NodoPC n)
    {
        if (n == null)
        {
            return false;
        } else if (vacia())
        {
            frente = atras = n;
            return true;
        } else
        {
            atras.setSig(n);
            atras = n;
            return true;
        }
    }

    public NodoPC elimina()
    {
        if (frente == null && atras == null)
        {
            return null;
        } else
        {
            NodoPC aux = frente;
            if (frente == atras)
            {
                frente = atras = null;
                return aux;
            } else
            {
                frente = aux.getSig();
                aux.setSig(null);
                return aux;
            }
        }
    }
}
