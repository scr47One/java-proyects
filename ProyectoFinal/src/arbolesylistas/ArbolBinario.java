package arbolesylistas;

import java.io.Serializable;


/**
 *
 * @author Daniel Castrejon
 */
public class ArbolBinario implements Serializable
{

    public static final long serialVersionUID = 1L;
    NodoArbol raiz = null;

    public NodoArbol getRaiz()
    {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz)
    {
        this.raiz = raiz;
    }

    //Metodo inserta en arbol binario
    /**
     *
     * @param raiz RAIZ DEL ARBOL AL CUAL SE LE VAN A INSERTAR LOS NODOS
     * @param n NODOARBOL EL CUAL VA A SER INSERTADO
     * @return
     */
    public NodoArbol inserta(NodoArbol raiz, NodoArbol n)
    {
        if (raiz == null)
        {
            return n;
        } else
        {
            if (raiz.getEtiqueta().compareTo(n.getEtiqueta()) > 0)
            {
                raiz.setIzq(inserta(raiz.getIzq(), n));
            } else
            {
                raiz.setDer(inserta(raiz.getDer(), n));
            }
        }
        return raiz;
    }

    public String enOrden(NodoArbol raiz)
    {
        String s = "";
        if (raiz != null)
        {
            s += enOrden(raiz.getIzq());
            s += raiz.getEtiqueta();
            s += enOrden(raiz.getDer());
        }
        return s;
    }

    public String preOrden(NodoArbol raiz)
    {
        String s = "";
        if (raiz != null)
        {
            s += raiz.getEtiqueta();
            s += preOrden(raiz.getIzq());
            s += preOrden(raiz.getDer());
        }
        return s;
    }

    public String posOrden(NodoArbol raiz)
    {
        String s = "";
        if (raiz != null)
        {
            s += posOrden(raiz.getIzq());
            s += posOrden(raiz.getDer());
            s += raiz.getEtiqueta();
        }
        return s;
    }

//    public ListaSL insertar(NodoArbol raiz, ListaSL ls, String etq)
//    {
//        if (raiz == null)
//        {
//            return ls;
//        } else
//        {
//            if (raiz.getHilo().getEtiqueta().equals(etq))
//            {
//                Nodo aux = raiz.getHilo();
//                if (aux.getSig() != null && !aux.getSig().getEtiqueta().equals(etq))
//                {
//                    aux.setSig(null);
//                    ls.inserta(aux);
//                } else
//                {
//                    ls.inserta(aux);
//                }
//                ls = insertar(raiz.getIzq(), ls, etq);
//                ls = insertar(raiz.getDer(), ls, etq);
//            }
//            return ls;
//        }
//    }

    /**
     * METODO DE BUSQUEDA DE NODO REPETIDOS EN UN ARBOL BINARIO
     *
     * @param raiz RAIZ DEL ARBOL A BUSCAR NODOS REPETIDOS
     * @param n ETIQUETA CON LA CUAL SE BUSCARAN LOS NODOS
     * @param a ALMACENA LOS NODOS REPETIDOS EN UN ARBOL BINARIO
     * @return
     */
    public ArbolBinario buscar(NodoArbol raiz, String n, ArbolBinario a)
    {

        if (raiz == null)
        {
            return a;
        } else
        {
            if (raiz.getEtiqueta().equals(n))
            {
                if (a == null)
                {
                    NodoArbol aux = new NodoArbol(raiz.getEtiqueta());
                    aux.setHilo(raiz.getHilo());
                    ArbolBinario ab = new ArbolBinario();
                    ab.setRaiz(ab.inserta(ab.getRaiz(), aux));
                    ab.balancear(ab.getRaiz());
                    a = ab;
                } else
                {
                    NodoArbol aux = new NodoArbol(raiz.getEtiqueta());
                    aux.setHilo(raiz.getHilo());
                    a.setRaiz(a.inserta(a.getRaiz(), aux));
                    a.setRaiz(a.balancear(a.getRaiz()));
                }
                a = buscar(raiz.getIzq(), n, a);
                a = buscar(raiz.getDer(), n, a);
            } else
            {
                if (raiz.getEtiqueta().compareTo(n) > 0)
                {
                    return buscar(raiz.getIzq(), n, a);
                } else
                {
                    return buscar(raiz.getDer(), n, a);
                }
            }
        }
        return a;
    }

    /**
     * METODO DE BUSQUEDA DE UN NODOLISTA DETRO DEL ARBOL BINARIO
     *
     * @param raiz RAIZ DEL ARBOL EN DONDE SE BUSCARA EL NODO
     * @param n ETIQUETA CON LA CUAL SE BUSCA EL NODO
     * @param i CONTADOR QUE ACUMULA LA CANTIDAD DE NODOS REPETIDOS
     * @param nlista NODOLISTA CON EL CUAL SE COMPARA LA ETIQUETA DE SU
     * APUNTADOR ARRIBA
     * @return
     */
    public NodoArbol buscar(NodoArbol raiz, String n, int i, Nodo nlista, NodoArbol aux)
    {

        if (raiz == null)
        {
            return aux;
        } else
        {
            if (raiz.getEtiqueta().equals(n))
            {
                if (raiz.getHilo().getArb().getEtiqueta().equals(nlista.getArb().getEtiqueta()))
                {
                    aux = raiz;
                    return aux;
                } else
                {
                    aux = buscar(raiz.getIzq(), n, i + 1, nlista, aux);
                    aux = buscar(raiz.getDer(), n, i + 1, nlista, aux);
                }
            } else
            {
                if (raiz.getEtiqueta().compareTo(n) > 0)
                {
                    return buscar(raiz.getIzq(), n, i, nlista, aux);
                } else
                {
                    return buscar(raiz.getDer(), n, i, nlista, aux);
                }
            }
        }
        return aux;
    }

    /**
     * METODO DE BUSQUEDA DE UN NODO CUALQUIERA EN EL ARBOL
     *
     * @param raiz RAIZ DEL ARBOL DONDE SE BUSCARA EL NODOARBOL
     * @param n NODOARBOL EL CUAL SE BUSCARA MEDIANTE SU ETIQUETA
     * @return
     */
    public NodoArbol buscar(NodoArbol raiz, NodoArbol n)
    {
        NodoArbol aux[] = new NodoArbol[2];
        if (raiz == null)
        {
            return null;
        } else
        {
            if (raiz.getEtiqueta().equals(n.getEtiqueta()))
            {
                System.out.println("LO ENCONTRE:\t" + n.getEtiqueta());
                if (n.getIzq() != null && n.getDer() != null)
                {
                    System.out.println("HIJO IZQ: " + n.getIzq().getEtiqueta());
                    System.out.println("HIJO DER: " + n.getDer().getEtiqueta());
                } else if (n.getIzq() != null)
                {
                    System.out.println("HIJO IZQ: " + n.getIzq().getEtiqueta());

                } else if (n.getDer() != null)
                {
                    System.out.println("HIJO DER: " + n.getDer().getEtiqueta());

                } else
                {
                    System.out.println("NO TIENE HIJOS");
                }
                return n;
            } else
            {
                if (raiz.getEtiqueta().compareTo(n.getEtiqueta()) > 0)
                {
                    return buscar(raiz.getIzq(), n);
                } else
                {
                    return buscar(raiz.getDer(), n);
                }
            }
        }
    }
//METODO DE BALANCEAR ARBOL BINARIO

    public NodoArbol balancear(NodoArbol raiz)
    {
        if (raiz != null)
        {
            if (altura(raiz.getIzq(), 0) - altura(raiz.getDer(), 0) == 2)
            {
                /* desequilibrio hacia la izquierda! */
                if (altura(raiz.getIzq().getIzq(), 0) >= altura(raiz.getIzq().getDer(), 0))
                /* desequilibrio simple hacia la izquierda */
                {
                    raiz = rotar_s(raiz, true);
                } else
                /* desequilibrio doble hacia la izquierda */
                {
                    raiz = rotar_d(raiz, true);
                }
            } else if (altura(raiz.getDer(), 0) - altura(raiz.getIzq(), 0) == 2)
            {
                /* desequilibrio hacia la derecha! */
                if (altura(raiz.getDer().getDer(), 0) >= altura(raiz.getDer().getIzq(), 0))
                /* desequilibrio simple hacia la derecha */
                {
                    raiz = rotar_s(raiz, false);
                } else
                /* desequilibrio doble hacia la derecha */
                {
                    raiz = rotar_d(raiz, false);
                }
            }
        }
        return raiz;
    }

//    public NodoArbol rotar_d(NodoArbol raiz, boolean izq)
//    {
//        if (izq)
//        /* rotación izquierda */
//        {
//            raiz = rotar_s(raiz.getIzq(), false);
//            raiz = rotar_s(raiz, true);
//        } else
//        /* rotación derecha */
//        {
//            raiz = rotar_s(raiz.getDer(), true);
//            raiz = rotar_s(raiz, false);
//        }
//
//        return raiz;
//    }
    public NodoArbol rotar_d(NodoArbol r, boolean izq)
    {
        if (izq)
        /* rotación izquierda */
        {
            r.setIzq(rotar_s(r.getIzq(), false));
            r = rotar_s(r, true);
        } else
        /* rotación derecha */
        {
            r.setDer(rotar_s(r.getDer(), true));
            r = rotar_s(r, false);
        }

        return r;
    }

    public NodoArbol rotar_s(NodoArbol raiz, boolean izq)
    {
        NodoArbol tmp;
        if (izq)
        /* rotación izquierda */
        {
            tmp = raiz.getIzq();
            raiz.setIzq(tmp.getDer());
            tmp.setDer(raiz);
        } else
        /* rotación derecha */
        {
            tmp = raiz.getDer();
            raiz.setDer(tmp.getIzq());
            tmp.setIzq(raiz);
        }
        return tmp;
    }

    public int altura(NodoArbol raiz, int a)
    {
        if (raiz == null)
        {
            return a;
        } else
        {
            return max(altura(raiz.getIzq(), a + 1), altura(raiz.getDer(), a + 1));
        }

    }

    public int max(int a, int b)
    {
        return a > b ? a : b;
    }

    /**
     * Metodo elimina en arbol binario CASOS Y CONSIDERACIONES DE LA ELIMINACION
     * 1. CUANDO EL NODO A ELIMINAR NO TIENE NODOS ABAJOS 2.CUANDO EL NODO A
     * ELIMINAR TIENE UN NODO HACIA ABAJO YA SEA, IZQ O DER,ESTE NODO ABAJO
     * SUSTITUYE AL NODO ELIMINADO 3. CUANDO EL NODO A ELIMINAR TIENE 2 NODOS
     * HACIA ABJO Y ESTOS PUEDEN TENER O NO NODOS SUCESORES
     *
     * @param etiqueta es una cadena que se busca en los nodos para ser
     * eliminada
     * @param raiz es la raiz del arbol y va cambiando en la recursion
     * @param arr es un arreglo, es de longitud 2 y que en la posicion[0]= Dato
     * Eliminado y en la [1]= Nueva Raiz
     */
    public void elimina(String etiqueta, NodoArbol raiz, NodoArbol[] arr)
    {
        if (raiz != null)
        {
            if (etiqueta.equals(raiz.getEtiqueta()))
            {
                // ya localize el dato a eliminar
                arr[0] = raiz;
                //No tiene hijos
                if (raiz.getDer() == null && raiz.getIzq() == null)
                {
                    arr[1] = null;
                } else
                {
                    if (!(raiz.getDer() != null && raiz.getIzq() != null))
                    {
                        //Cuando tiene un hijo
                        if (raiz.getDer() != null)
                        {
                            arr[1] = raiz.getDer();
                            raiz.setDer(null);
                        } else
                        {
                            arr[1] = raiz.getIzq();
                            raiz.setIzq(null);
                        }
                    } else
                    {
                        //Cuando tiene 2 hijos
                        NodoArbol sucesorOrden = null;
                        if (raiz.getDer().getIzq() == null)
                        {
                            sucesorOrden = raiz.getDer();
                        } else
                        {
                            NodoArbol aux = sucesorEnOrden(raiz.getDer());
                            sucesorOrden = aux.getIzq();
                            aux.setIzq(sucesorOrden.getDer());
                            sucesorOrden.setDer(raiz.getDer());
                        }
                        sucesorOrden.setIzq(raiz.getIzq());
                        arr[1] = sucesorOrden;
                        raiz.setDer(null);
                        raiz.setIzq(null);
                    }
                }
            } else
            {
                //Seguir buscando a la izquierda si el dato es menor
                // a la derecha si el dato es mayor
                if (etiqueta.compareTo(raiz.getEtiqueta()) < 0)
                {
                    elimina(etiqueta, raiz.getIzq(), arr);
                    raiz.setIzq(arr[1]);

                } else
                {
                    elimina(etiqueta, raiz.getDer(), arr);
                    raiz.setDer(arr[1]);
                }
                arr[1] = raiz;
            }
        } else
        {
            arr[1] = raiz;
        }
    }

    public NodoArbol sucesorEnOrden(NodoArbol raiz)
    {
        if (raiz.getIzq().getIzq() != null)
        {
            return sucesorEnOrden(raiz.getIzq());
        } else
        {
            return raiz;
        }
    }

    //METODO PARA ELIMINAR UN NODOARBOL CON SU HILO NODOLISTA BUSCADO
    /**
     *
     * @param nlista NODOLISTA CON EL CUAL SE VA A COMPARAR LA ETIQUETA DE SU
     * APUNTADOR ARRIBA
     * @param ab ARBOL GENERAL EN EL CUAL SE VA BUSCAR EL NODOARBOL MEDIANTE LA
     * ELIMINACION
     * @param etq ETIQUETA CON LA CUAL SE BUSCARA EL NODOARBOL A ELIMINAR
     * @param arr ARREGLO QUE EN SU POSICION [0]= DATO ELIMINADO Y EN SU
     * POSICION [1]=NUEVA RAIZ
     * @param aux NODOARBOL QUE CONTIENE EL NODO ELIMINADO DEL ARBOLBINARIO CON
     * SU APUNATDOR HILO IGUAL QUE EL NODOLISTA
     * @param ab1 ARBOLBINARIO EN EL CUAL SE ALMACENARAN LOS NODOSARBOLES QUE NO
     * CONTENGAN EL APUNATDOR HILO IGUAL QUE EL NODOLISTA
     * @return
     */
    public NodoArbol eliminaNodoLista(Nodo nlista, ArbolBinario ab, String etq, NodoArbol[] arr, NodoArbol aux, ArbolBinario ab1)
    {

        arr[0] = null;
        arr[1] = ab.getRaiz();
        ab.elimina(etq, ab.getRaiz(), arr);
        if (arr[0] == null)
        {
            return null;
        } else
        {
            if (arr[0].getHilo().getArb().getEtiqueta().equals(nlista.getArb().getEtiqueta()))
            {
                aux = arr[0];
                ab.setRaiz(arr[1]);
                return aux;
            } else
            {
                ab1.setRaiz(ab1.inserta(ab1.getRaiz(), arr[0]));
                ab1.setRaiz(ab1.balancear(ab1.getRaiz()));
                ab.setRaiz(arr[1]);
                ab.setRaiz(ab.balancear(ab.getRaiz()));
                return eliminaNodoLista(nlista, ab, etq, arr, aux, ab1);
            }
        }
    }

    //METODO DE INSERCION DE NODOS REPETIDOS DE UN ARBOL BINARIO AL ARBOL GENERAL
    /**
     * REGRESA UN ARBOL BINARIO
     *
     * @param ab ARBOLBINARIO EL CUAL CONTIENE LOS NODOS REPETIDOS QUE NO SE
     * OCUPARON PARA OBTENER EL HILO DEL NODOLISTA BUSCADO
     * @param etq ETIQUETA CON LA CUAL SE ELIMINARAN LOS NODOS
     * @param arr ARREGLO QUE EN SU POSICION [0]= DATO ELIMINADO Y EN SU
     * POSICION [1]=NUEVA RAIZ
     * @param ab1 ARBOLBINARIO GENRAL EN DONDE SE INSERTARAN LOS NODOS REPETIDOS
     * @return
     */
    public ArbolBinario insertaNodoLista(ArbolBinario ab, String etq, NodoArbol[] arr, ArbolBinario ab1)
    {
        if (ab.getRaiz() == null)
        {
            return ab1;
        } else
        {
            arr[0] = null;
            arr[1] = ab.getRaiz();
            ab.elimina(etq, ab.getRaiz(), arr);
            if (arr[0] == null)
            {
                return ab1;
            } else
            {
                ab1.setRaiz(ab1.inserta(ab1.getRaiz(), arr[0]));
                ab1.setRaiz(ab1.balancear(ab1.getRaiz()));
                ab.setRaiz(arr[1]);
                return insertaNodoLista(ab, etq, arr, ab1);
            }
        }
    }

    /**
     * METODO PARA ELIMINAR NODOS REPETIDOS DENTRO DEL ARBOL
     *
     * @param ab ARBOLBINARIO GENERAL DEL CUAL SE ELIMINARON LOS NODOS REPETIDOS
     * @param etq ETIQUETA CON LA CUAL SE BUSCARAN LOS NODOS REPETIDOS
     * @param arr ARREGLO QUE EN SU POSICION [0]= DATO ELIMINADO Y EN SU
     * POSICION [1]=NUEVA RAIZ
     * @param ab1 ARBOLBINARIO EN EL CUAL SE ALMACENARAN LOS NODOS REPETIDOS
     * @return
     */
    public ArbolBinario eliminaNodoR(ArbolBinario ab, String etq, NodoArbol[] arr, ArbolBinario ab1)
    {
        if (ab.getRaiz() == null)
        {
            return ab1;
        } else
        {
            arr[0] = null;
            arr[1] = ab.getRaiz();
            ab.elimina(etq, ab.getRaiz(), arr);
            if (arr[0] == null)
            {
                return ab1;
            } else
            {
                ab1.setRaiz(ab1.inserta(ab1.getRaiz(), arr[0]));
                ab1.setRaiz(ab1.balancear(ab1.getRaiz()));
                ab.setRaiz(arr[1]);
                ab.setRaiz(ab.balancear(ab.getRaiz()));
                return eliminaNodoR(ab, etq, arr, ab1);
            }
        }
    }

    /**
     * METODO QUE REGRESA UN NODOARBOL
     *
     * @param ab ARBOLBINARIO QUE CONTIENE NODOS REPETIDOS
     * @param etq ETIQUETA CON LA CUAL SE BUSCARAN LOS NODOS
     * @param arr ARREGLO QUE EN SU POSICION [0]= DATO ELIMINADO Y EN SU
     * POSICION [1]=NUEVA RAIZ
     * @param ab1 ARBOLBINARIO GENERAL DONDE SE VOLVERAN A INSERTAR LOS NODOS
     * REPETIDOS
     * @return
     */
    public NodoArbol carga(ArbolBinario ab, String etq, NodoArbol[] arr, ArbolBinario ab1)
    {
        if (ab.getRaiz() == null)
        {
            return null;
        } else
        {
            arr[0] = null;
            arr[1] = ab.getRaiz();
            ab.elimina(etq, ab.getRaiz(), arr);
            ab.setRaiz(arr[1]);
            if (arr[0] != null)
            {
                ab1.setRaiz(ab1.inserta(ab1.getRaiz(), arr[0]));
                ab1.setRaiz(ab1.balancear(ab1.getRaiz()));
                return arr[0];
            }
            return arr[0];
        }
    }
//    public NodoArbol insertaHilo(NodoArbol raiz, String etq, Nodo n)
//    {
//        if (raiz == null)
//        {
//            return null;
//        } else
//        {
//            if (raiz.getEtiqueta().equals(etq))
//            {
//                raiz.setHilo(n);
//                return raiz;
//            } else
//            {
//                if (raiz.getEtiqueta().compareTo(etq) > 0)
//                {
//                    return insertaHilo(raiz.getIzq(), etq, n);
//                } else
//                {
//                    return insertaHilo(raiz.getDer(), etq, n);
//                }
//            }
//        }
//    }
}
