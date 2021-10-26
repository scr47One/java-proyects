package Clases;

import java.io.Serializable;

public class Arbol implements Serializable {

    NodoArbol r = null;

    public NodoArbol getR() {
        return r;
    }

    public void setR(NodoArbol r) {
        this.r = r;
    }

    public NodoArbol insertar(NodoArbol r, NodoArbol n) {
        if (r == null) {
            return n;
        } else {
            if (r.getEtq().compareTo(n.getEtq()) >= 0) {
                r.setIzq(insertar(r.getIzq(), n));
            } else {
                r.setDer(insertar(r.getDer(), n));
            }
        }
        return r;
    }

    public String enOrden(NodoArbol r) {
        String s = "";
        if (r != null) {
            s += enOrden(r.getIzq());
            s += r.getEtq() + " ";
            s += enOrden(r.getDer());
        }
        return s;
    }

    public String preOrden(NodoArbol r) {
        String s = "";
        if (r != null) {
            s += r.getEtq();
            s += preOrden(r.getIzq());
            s += preOrden(r.getDer());
        }
        return s;
    }

    public String posOrden(NodoArbol r) {
        String s = "";
        if (r != null) {
            s += posOrden(r.getIzq());
            s += posOrden(r.getDer());
            s += r.getEtq();
        }
        return s;
    }

    public NodoArbol balancear(NodoArbol r) {
        if (r != null) {
            if (altura(r.getIzq(), 0) - altura(r.getDer(), 0) == 2) {
                /* desequilibrio hacia la izquierda! */
                if (altura(r.getIzq().getIzq(), 0) >= altura(r.getIzq().getDer(), 0)) /* desequilibrio simple hacia la izquierda */ {
                    r = rotar_s(r, true);
                } else /* desequilibrio doble hacia la izquierda */ {
                    r = rotar_d(r, true);
                }
            } else if (altura(r.getDer(), 0) - altura(r.getIzq(), 0) == 2) {
                /* desequilibrio hacia la derecha! */
                if (altura(r.getDer().getDer(), 0) >= altura(r.getDer().getIzq(), 0)) /* desequilibrio simple hacia la derecha */ {
                    r = rotar_s(r, false);
                } else /* desequilibrio doble hacia la derecha */ {
                    r = rotar_d(r, false);
                }
            }
        }
        return r;
    }

    public NodoArbol rotar_d(NodoArbol r, boolean izq) {
        if (izq) /* rotación izquierda */ {
            r.setIzq(rotar_s(r.getIzq(), false));
            r = rotar_s(r, true);
        } else /* rotación derecha */ {
            r.setDer(rotar_s(r.getDer(), true));
            r = rotar_s(r, false);
        }

        return r;
    }

    public NodoArbol rotar_s(NodoArbol r, boolean izq) {
        NodoArbol tmp;
        if (izq) /* rotación izquierda */ {
            tmp = r.getIzq();
            r.setIzq(tmp.getDer());
            tmp.setDer(r);
        } else /* rotación derecha */ {
            tmp = r.getDer();
            r.setDer(tmp.getIzq());
            tmp.setIzq(r);
        }
        return tmp;
    }

    public int altura(NodoArbol r, int a) {
        if (r == null) {
            return a;
        } else {
            return max(altura(r.getIzq(), a + 1), altura(r.getDer(), a + 1));
        }
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    /**
     * Metodo elimina de arbol binario
     *
     * @param etqes una cadena que se busca en los nodos para ser eliminada
     * @param res la raiz del arból y va cambiando en la recurción
     * @param arr es un arreiglo es de longitus 2 y que en la posición cero va
     * el dato eliminado y en la posición uno va la nueva r
     */
    public void elimina(String etq, NodoArbol r, NodoArbol[] arr) {
        //Arreiglo es de longitud dos y en la posición cero va el dato eliminado
        // y en la posisión uno va la nueva r
        if (r != null) {
            if (etq.equals(r.getEtq())) {
                //ya localice el dato a eliminar
                arr[0] = r;
                arr[0].setHilo(null);
                //no tiene hijos
                if (r.getDer() == null && r.getIzq() == null) {
                    arr[1] = null;
                } else {
                    if (!(r.getDer() != null && r.getIzq() != null)) {
                        //cuando tiene un hijo
                        if (r.getDer() != null) {
                            arr[1] = r.getDer();
                            r.setDer(null);
                        } else {
                            arr[1] = r.getIzq();
                            r.setIzq(null);
                        }
                    } else {
                        //cuando tiene dos hijos
                        NodoArbol se = null;
                        if (r.getDer().getIzq() == null) {
                            se = r.getDer();
                        } else {
                            NodoArbol aux = sucesorOrden(r.getDer());
                            se = aux.getIzq();
                            aux.setIzq(se.getDer());
                            se.setDer(r.getDer());
                        }
                        se.setIzq(r.getIzq());
                        arr[1] = se;
                        r.setDer(null);
                        r.setIzq(null);
                    }
                }
            } else {
                //seguir buscando a la izquierda es el dato que busco es menor
                // a la derecha si el dato que busco es mayor
                if (etq.compareTo(r.getEtq()) < 0) {
                    elimina(etq, r.getIzq(), arr);
                    r.setIzq(arr[1]);
                } else {
                    elimina(etq, r.getDer(), arr);
                    r.setDer(arr[1]);
                }
                arr[1] = r;
            }
        } else {
            arr[1] = r;
        }
    }

    public void eliminaI(String etq, NodoArbol r, NodoArbol[] arr, String Instituto) {
        //Arreiglo es de longitud dos y en la posición cero va el dato eliminado
        // y en la posisión uno va la nueva r

        if (r != null) {
            if (etq.equals(r.getEtq()) && ((r.getHilo()).getArriba().getEtq().equals(Instituto))) {
//ya localice el dato a eliminar
                arr[0] = r;
                arr[0].setHilo(null);
                //no tiene hijos
                if (r.getDer() == null && r.getIzq() == null) {
                    arr[1] = null;
                } else {
                    if (!(r.getDer() != null && r.getIzq() != null)) {
                        //cuando tiene un hijo
                        if (r.getDer() != null) {
                            arr[1] = r.getDer();
                            r.setDer(null);
                        } else {
                            arr[1] = r.getIzq();
                            r.setIzq(null);
                        }
                    } else {
                        //cuando tiene dos hijos
                        NodoArbol se = null;
                        if (r.getDer().getIzq() == null) {
                            se = r.getDer();
                        } else {
                            NodoArbol aux = sucesorOrden(r.getDer());
                            se = aux.getIzq();
                            aux.setIzq(se.getDer());
                            se.setDer(r.getDer());
                        }
                        se.setIzq(r.getIzq());
                        arr[1] = se;
                        r.setDer(null);
                        r.setIzq(null);
                    }
                }

            } else {
                //seguir buscando a la izquierda es el dato que busco es menor
                // a la derecha si el dato que busco es mayor
                if (etq.compareTo(r.getEtq()) <=0) {
                    System.out.println("No se encontro, buscando a la izquierda");
                    elimina(etq, r.getIzq(), arr);
                    
                    r.setIzq(arr[1]);
                } else {
                    System.out.println("No se encontro, buscando a la derecha");
                    elimina(etq, r.getDer(), arr);
                    r.setDer(arr[1]);
                }
                arr[1] = r;
            }
        } else {
            System.out.println("La raiz esta vacia");
            arr[1] = r;
        }
    }

    public Nodo Busca(String etq, NodoArbol r) {
        NodoArbol aux = r;
        PilasD paux = new PilasD();
        if (aux != null) {
            if (etq.equals(aux.getEtq())) { //Si el dato ya se encontro se retorna
                PilasD ls = new PilasD();
                paux = BuscaM(etq, aux);
                if (paux != null) {
                    ls = paux;
                }
                ls.inserta(aux.getHilo());
                return ls.getTope();
            } else {
                //Si el dato no se encuentra, y el dato es menor a la raiz, buscamos a la izquierda
                if (etq.compareTo(aux.getEtq()) <= 0) {
                    Nodo aux1 = Busca(etq, aux.getIzq());
                    return aux1;
                } else { // Si el dato no se encuentra y el dato es mayor a la raiz buscamos a la derecha
                    Nodo aux1 = Busca(etq, aux.getDer());
                    return aux1;
                }
            }
        } else {
            return null;
        }
    }

    public PilasD BuscaM(String etq, NodoArbol r) {
        NodoArbol aux = r;
        PilasD ls = new PilasD();
        PilasD lsAux = new PilasD();

        if (aux.getIzq() != null && (etq.compareTo(aux.getIzq().getEtq()) <= 0)) { // Si hay algo a la izquierda y el dato es menor o igual
            if (etq.equals(aux.getIzq().getEtq())) {
                ls.inserta(aux.getIzq().getHilo()); //Insertamos la carrera encontrada en la pila
                lsAux = BuscaM(etq, r.getIzq());
                if (lsAux != null) {
                    ls.inserta(lsAux.getTope());
                }
                if (aux.getDer() != null && (etq.compareTo(aux.getDer().getEtq()) >= 0)) {
                    if (etq.equals(aux.getDer().getEtq())) {

                        ls.inserta(aux.getDer().getHilo()); //Insertamos la carrera encontrada en la pila

                        lsAux = BuscaM(etq, r.getDer());
                        if (lsAux != null) {
                            ls.inserta(lsAux.getTope());
                        }
                        return ls;
                    } else {

                        return null;
                    }
                } else {

                    return ls;
                }

            } else {

                if (aux.getDer() != null && (etq.compareTo(aux.getDer().getEtq()) >= 0)) {
                    if (etq.equals(aux.getDer().getEtq())) {

                        ls.inserta(aux.getDer().getHilo()); //Insertamos la carrera encontrada en la pila

                        lsAux = BuscaM(etq, r.getDer());
                        if (lsAux != null) {
                            ls.inserta(lsAux.getTope());
                        }

                        return ls;
                    } else {

                        return null;
                    }
                } else {

                    return null;
                }
            }
        } else {
            if (aux.getDer() != null && (etq.compareTo(aux.getDer().getEtq()) >= 0)) {
                if (etq.equals(aux.getDer().getEtq())) {
                    ls.inserta(aux.getDer().getHilo()); //Insertamos la carrera encontrada en la pila
                    lsAux = BuscaM(etq, r.getDer());
                    if (lsAux != null) {
                        ls.inserta(lsAux.getTope());
                    }
                    return ls;
                } else {

                    return null;
                }
            } else {
                return null;
            }
        }

    }

    public NodoArbol sucesorOrden(NodoArbol r) {
        if (r.getIzq().getIzq() != null) {
            return sucesorOrden(r.getIzq());
        } else {
            return r;
        }

    }
    
        public static boolean ComparacionPalabras(String Palabra, NodoArbol aux)
    {
        if (Palabra.isEmpty() || Palabra.length() > aux.getEtq().length())
        {
            return false;
        }
        for (int i = 0; i < Palabra.length(); i++)
        {
            if (Palabra.charAt(i) != aux.getEtq().charAt(i))
            {
                return false;
            }

        }
        return true;
    }

}
