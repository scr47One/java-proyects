/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edd;

/**
 *
 * @author emanu
 */
public class Nodo {
 private String datos;
 private Nodo sig=null;
 private Nodo ant=null;
 private Nodo arr=null;
 private Nodo abj=null;
 
    public Nodo(){
        
    }
 
     public Nodo(String datos) {
        this.datos=datos;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    public Nodo getArr() {
        return arr;
    }

    public void setArr(Nodo arr) {
        this.arr = arr;
    }

    public Nodo getAbj() {
        return abj;
    }

    public void setAbj(Nodo abj) {
        this.abj = abj;
    }
 
 
}
