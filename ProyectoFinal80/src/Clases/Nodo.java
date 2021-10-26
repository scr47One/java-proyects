package Clases;

import java.io.Serializable;

public class Nodo implements Serializable
{
  private Object obj;
  private String etq;

   
  private Nodo sig=null;
  private Nodo ant=null;
  private Nodo abj=null;
  private Nodo arriba=null;

    public Nodo(Object obj)
    {
        this.obj = obj;
    }

    public Nodo getArriba() {
        return arriba;
    }

    public void setArriba(Nodo arriba) {
        this.arriba = arriba;
    }

    public Nodo(Object obj, String etq)
    {
        this.obj = obj;
        this.etq = etq;
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

    public String getEtq()
    {
        return etq;
    }
  
    public void setEtq(String etq)
    {
        this.etq = etq;
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
    
    

   
  
  
}
