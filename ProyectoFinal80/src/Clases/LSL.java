/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author Mauro    
 */
public class LSL implements Serializable {

    private Nodo r = null;

    /**
     * @return the r
     */
    public Nodo getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(Nodo r) {
        this.r = r;
    }

    public boolean inserta(Nodo n) {
        if (n == null) {
            return false;
        } else {
            //cuando es el primer elemento en la listas
            if (r == null) {
                r = n;
            } else {
                //cuando el elemento es menor que el primero de la lista
                if (n.getEtq().compareTo(r.getEtq()) < 0) {
                    n.setSig(r);
                    r = n;
                } else {
                    //cuando el elemento va en medio de la lista
                    Nodo aux = r;
                    boolean b = true;
                    while (aux.getSig() != null && b) {
                        if (n.getEtq().compareTo(aux.getSig().getEtq()) < 0) {
                            n.setSig(aux.getSig());
                            aux.setSig(n);
                            b = false;
                        } else {
                            aux = aux.getSig();
                        }
                    }
                    //cuando el elemento va al final de lista
                    if (b) {
                        aux.setSig(n);
                    }
                }
            }

            return true;
        }
    }

    public Nodo elimina(String etq) {
        if (r == null) {
            return null;
        } else {
            Nodo aux = null;
            if (etq.compareTo(r.getEtq()) >= 0) {
                if (etq.equals(r.getEtq())) {
                    aux = r;
                    r = aux.getSig();
                    aux.setSig(null);
                } else {
                    Nodo aux2 = r;
                    boolean b = true;
                    while (aux2.getSig() != null && b) {
                        if (etq.compareTo(aux2.getSig().getEtq()) >= 0) {
                            if (etq.equals(aux2.getSig().getEtq())) {
                                aux = aux2.getSig();
                                aux2.setSig(aux.getSig());
                                aux.setSig(null);
                                b = false;
                            } else {
                                aux2 = aux2.getSig();
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            return aux;
        }

    }

    public String desp(Nodo aux) {
        String s = "";
        Nodo aux2 = null;
        while (aux != null) {
            s += aux.getEtq();
            aux2 = aux;
            aux = aux.getSig();
        }
//        s+="\ninversa de la lista\n";
//        while (aux2 != null)
//        {
//            s+=aux2.getEtq();
//            aux2=aux2.getAnt();
//        }
        return s;
    }
}
