package Clases;

import java.io.Serializable;

public class NodoArbol implements Serializable {
  String etq;
  private NodoArbol izq = null;
  private NodoArbol der = null;
  private Nodo hilo = null;
  
  
  public NodoArbol (String etq)
  {
      this.etq = etq;
  }

    public Nodo getHilo()
    {
        return hilo;
    }

    public void setHilo(Nodo hilo)
    {
        this.hilo = hilo;
    }
          
    public String getEtq() {
        return etq;
    }

    public void setEtq(String eqt) {
        this.etq = eqt;
    }

    public NodoArbol getIzq() {
        return izq;
    }

    public void setIzq(NodoArbol izq) {
        this.izq = izq;
    }

    public NodoArbol getDer() {
        return der;
    }

    public void setDer(NodoArbol der) {
        this.der = der;
    }
}
