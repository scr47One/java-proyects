/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edd;

import Ventanas.Editor;

/**
 *
 * @author emanu
 */
public class Listas {

    Nodo r = null;
    public static Nodo arreglo[];
    int cont = 1;

    public Nodo getR() {
        return r;
    }

    public void setR(Nodo r) {
        this.r = r;
    }

    public void inserta(Nodo n, Nodo aux2) {
        if (n == null) {
            System.out.println("no se puede insertar en la lista");
        } else {
            if (r == null) {
                r = n;
                n.setSig(n);
                n.setAnt(n);
                n.setArr(aux2);
                System.out.println("raiz:  " + n.getDatos());
            } else {
                boolean b = true;
                Nodo aux = r;
                while (b) {
                    if (aux.getSig() == r) {
                        n.setSig(r);
                        n.setAnt(aux);
                        aux.getSig().setAnt(n);
                        aux.setSig(n);
                        System.out.println("insertó:--------------- " + n.getDatos());
                        b = false;
                    } else {
                        aux = aux.getSig();
                    }
                }
            }
        }
    }

    public Nodo elimina(Nodo ref) {
        Nodo aux2 = null;
        if (r == null) {
            System.out.println("no hay datos en la lista");
        } else {
            if (ref==r) {
                aux2 = r;
                r = aux2.getSig();
                if (r == aux2) {
                    r = null;
                } else {

                    r.setAnt(aux2.getAnt());
                    aux2.getAnt().setSig(r);
                    r.setArr(aux2.getArr());
                    r.setAbj(aux2.getAbj());
                }
                aux2.setSig(null);
                aux2.setAnt(null);
                aux2.setArr(null);
                aux2.setAbj(null);
            } else {
                if (r.getAnt() == ref) {
                    ref.getAnt().setSig(ref.getSig());
                    r.setAnt(ref.getAnt());
                    ref.setAnt(null);
                    ref.setSig(null);
                    aux2 = ref;
                } else {
                    boolean b = true;
                    Nodo aux = r.getSig();
                    while (aux.getSig() != r && b) {
                        if (aux == ref) {
                            aux2=aux.getAnt();
                            aux2.setSig(aux.getSig());
                            aux.getSig().setAnt(aux.getAnt());
                            aux.setSig(null);
                            aux.setAnt(null);
                            aux2=aux;

//                            aux2 = aux.getSig();
//                            aux2.getSig().setAnt(aux);
//                            aux.setSig(aux2.getSig());
//                            aux2.setAnt(null);
//                            aux2.setSig(null);
                            b = false;
                        } else {

                            aux = aux.getSig();
                        }
                    }
                    if (b) {
                        System.out.println("Dato no encontrado");
                    }
                }

            }
        }
        return aux2;
    }

    public void mostrar(Nodo r) {
        Nodo actual = new Nodo();
        actual = r;
        do {
            System.out.print(actual.getDatos());
            actual = actual.getSig();
        } while (actual != r);
        System.out.println("");
    }

}
