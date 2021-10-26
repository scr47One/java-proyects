package arbolesylistas;





/**
 *
 * @author Daniel Castrejon
 */
public class PrbArbolBinario
{

    public static void main(String[] args)
    {

        Nodo a1 = new Nodo(null, "Arriba1");
        Nodo a2 = new Nodo(null, "Arriba2");
        Nodo a3 = new Nodo(null, "Arriba3");
        Nodo a4 = new Nodo(null, "Arriba4");
        Nodo a5 = new Nodo(null, "Arriba5");
        Nodo a6 = new Nodo(null, "Arriba6");
        Nodo a7 = new Nodo(null, "Arriba7");
        Nodo a8 = new Nodo(null, "Arriba8");
        Nodo a9 = new Nodo(null, "Arriba9");
        Nodo a10 = new Nodo(null, "Arriba10");

        Nodo b1 = new Nodo(null, "A");
        b1.setArb(a1);

        Nodo b2 = new Nodo(null, "A");
        b2.setArb(a2);

        Nodo b3 = new Nodo(null, "A");
        b3.setArb(a3);

        Nodo b4 = new Nodo(null, "A");
        b4.setArb(a4);

        Nodo b5 = new Nodo(null, "A");
        b5.setArb(a5);

        Nodo b6 = new Nodo(null, "A");
        b6.setArb(a6);

        Nodo b7 = new Nodo(null, "A");
        b7.setArb(a7);

        Nodo b8 = new Nodo(null, "A");
        b8.setArb(a8);

        Nodo b9 = new Nodo(null, "A");
        b9.setArb(a9);

        Nodo b10 = new Nodo(null, "A");
        b10.setArb(a10);

        ArbolBinario ab = new ArbolBinario();

        NodoArbol n1 = new NodoArbol("A");
        n1.setHilo(b1);

        NodoArbol n2 = new NodoArbol("A");
        n2.setHilo(b2);

        NodoArbol n3 = new NodoArbol("A");
        n3.setHilo(b3);

        NodoArbol n4 = new NodoArbol("A");
        n4.setHilo(b4);

        NodoArbol n5 = new NodoArbol("A");
        n5.setHilo(b5);

        NodoArbol n6 = new NodoArbol("A");
        n6.setHilo(b6);

        NodoArbol n7 = new NodoArbol("A");
        n7.setHilo(b7);

        NodoArbol n8 = new NodoArbol("A");
        n8.setHilo(b8);

        NodoArbol n9 = new NodoArbol("C");
        n9.setHilo(b9);

        NodoArbol n10 = new NodoArbol("B");
        n10.setHilo(b10);

        ab.setRaiz(ab.inserta(ab.getRaiz(), n1));
        ab.setRaiz(ab.balancear(ab.getRaiz()));
        ab.setRaiz(ab.inserta(ab.getRaiz(), n2));
        ab.setRaiz(ab.balancear(ab.getRaiz()));
        ab.setRaiz(ab.inserta(ab.getRaiz(), n3));
        ab.setRaiz(ab.balancear(ab.getRaiz()));
        ab.setRaiz(ab.inserta(ab.getRaiz(), n4));
        ab.setRaiz(ab.balancear(ab.getRaiz()));
        ab.setRaiz(ab.inserta(ab.getRaiz(), n5));
        ab.setRaiz(ab.balancear(ab.getRaiz()));
        ab.setRaiz(ab.inserta(ab.getRaiz(), n6));
        ab.setRaiz(ab.balancear(ab.getRaiz()));
        ab.setRaiz(ab.inserta(ab.getRaiz(), n7));
        ab.setRaiz(ab.balancear(ab.getRaiz()));
        ab.setRaiz(ab.inserta(ab.getRaiz(), n8));
        ab.setRaiz(ab.balancear(ab.getRaiz()));
        ab.setRaiz(ab.inserta(ab.getRaiz(), n9));
        ab.setRaiz(ab.balancear(ab.getRaiz()));
        ab.setRaiz(ab.inserta(ab.getRaiz(), n10));
        ab.setRaiz(ab.balancear(ab.getRaiz()));
        System.out.println("EN ORDEN ");
        System.out.println(ab.enOrden(ab.getRaiz()));

        //PRUEBA DEL METODO DE BUSQUEDA DE NODOSARBOLES REPETIDOS
        ArbolBinario ab1 = new ArbolBinario();
        ab1 = ab.buscarRepetidos(ab.getRaiz(), "A", ab1);
        System.out.println(ab1.enOrden(ab1.getRaiz()));
        System.out.println("-------------------------------------");

        //PRUEBA DEL METODO DE BUSQUEDA DE UN NODOARBOL CON UN NODOLISTA EN ESPECIFICO
        NodoArbol aux = null;
        aux = ab.buscar(ab.getRaiz(), "A", 0, b8, aux);
        System.out.println("NODO ENCONTRADO CON SU PRIMER HILO CON EL MISMO ARRIBA");
        System.out.println(aux.getHilo().getArb().getEtiqueta());
        Nodo a11 = new Nodo(null, "Arriba11");
        b8.setArb(a11);
        //PRUEBA DE CAMBIO DE APUNTADOR HILO EN EL NODOARBOL ENCONTRADO CON EL NODOLISTA ESPECIFICADO
        aux.setHilo(null);
        aux.setHilo(b8);
        System.out.println("CAMBIO DEL HILO EN SU ARRIBA DEL NODO ENCONTRADO ANTERIORMENTE");
        System.out.println(aux.getHilo().getArb().getEtiqueta());
        System.out.println("************************************");

        //PRUEBA DEL METODO DE ELIMINACION DE UN NODOARBOL CON UN NODOLISTA EN ESPECIFICO
        NodoArbol de = null;
        NodoArbol[] arr3 = new NodoArbol[2];
        ArbolBinario ab3 = new ArbolBinario();
        de = ab.eliminaNodoLista(b9, ab, "A", arr3, de, ab3);
        if (de != null)
        {
            System.out.println(de.getEtiqueta());
            System.out.println(de.getHilo().getArb().getEtiqueta());
        } else
        {
            System.out.println("No se encontro ese nodo con el arriba indicado");
        }
        NodoArbol[] arr4 = new NodoArbol[2];
        //PRUEBA DEL METODO INSERTANODOLISTA EL CUAL VUELVE A PONER LOS NODOS REPETIDOS EN EL ARBOLBINARIO GENERAL
        ab = ab.insertaNodoLista(ab3, "A", arr4, ab);
        System.out.println("*****ARBOLBINARIO SIN EL NODO ELIMINADO QUE CONTIENE EL NODOLISTA BUSCADO.. O PUEDE QUE NO HAYA ELIMINADO NADA Y SE QUEDE EL MISMO ARBOL***");
        System.out.println(ab.enOrden(ab.getRaiz()));
        System.out.println("*****************************************************************************");
        //PRUEBA DEL METODO DE ELIMINACION DE NODOS REPETIDOS, SE ALMACENAN EN UN NUEVO ARBOL PARA FACILITAR SU
        //MANIPULACION DE LOS NODOS
        NodoArbol[] arr = new NodoArbol[2];
        ArbolBinario ab2 = new ArbolBinario();
        ab2 = ab.eliminaNodoR(ab, "A", arr, ab2);
        System.out.println("NODOS REPETIDOS DENTRO DEL ARBOLBINARIO GENERAL");
        System.out.println(ab2.enOrden(ab2.getRaiz()));
        System.out.println("*********ARBOLBINARIO GENERAL QUE NO CONTIENE LOS NODOS REPETIDOS");
        System.out.println(ab.enOrden(ab.getRaiz()));

        //PRUEBA DEL METODO CARGA DE NODOS REPETIDOS SOBRE EL ARBOLGENERAL, SE OCUPA EL ARBOL CREADO CON EL METODO ANTERIOR
//        ColasDinamicas cd = new ColasDinamicas();
//        System.out.println("IMPRESION DE LOS HILOS EN SU ARRIBA DE LOS NODOS REPETIDOS DENTRO DEL ARBOL");
        while (ab2.getRaiz() != null)
        {
            NodoArbol[] arr2 = new NodoArbol[2];
            NodoArbol nodoAB = ab2.carga(ab2, "A", arr2, ab);
//            System.out.println(nodoAB.getHilo().getArb().getEtiqueta());
//            //CREACION DEL NODOPILACOLA PARA ALMACENAR EL NODO ARBOL
//            NodoPC nodoPc = new NodoPC(nodoAB);
//            //INSERCION DEL NODOPILACOLA EN UNA C.DINAMICA
//            cd.inserta(nodoPc);
//            System.out.println(nodoAB.getEtiqueta());
//            System.out.println(nodoAB.getHilo().getArb().getEtiqueta());
        }
        System.out.println("ARBOL GENERAL CON TODOS LOS NODOS INCLUYENDO LOS REPETIDOS");
        System.out.println(ab.enOrden(ab.getRaiz()));
        ab2 = ab.buscarRepetidos(ab.getRaiz(), "A", ab2);
        System.out.println("NODOS REPETIDOS DENTRO DEL ARBOLBINARIO GENERAL");
        System.out.println(ab2.enOrden(ab2.getRaiz()));
        System.out.println(ab.enOrden(ab.getRaiz()));
        while (ab2.getRaiz() != null)
        {
            NodoArbol[] arr2 = new NodoArbol[2];
            arr2[0] = null;
            arr2[1] = ab2.getRaiz();
            ab2.elimina("A", ab2.getRaiz(), arr2);
            if (arr2[0] != null)
            {
                System.out.println("DE NODOARBOL: " + arr2[0].getEtiqueta());
                System.out.println("DE: NODOLISTA SEGUNDO NIVEL\t" + arr2[0].getHilo().getEtiqueta());
                System.out.println("DE: NODOLISTA CONECTOR ARRIBA\t" + arr2[0].getHilo().getArb().getEtiqueta());

            }
            ab2.setRaiz(arr2[1]);
        }
        // COMPROBACION DE QUE SE INSERTARON CORRECTAMENTE LOS NODOS QUE CONTIENEN UN NODOARBOL
//        NodoPC n = cd.elimina();
//        while (n != null)
//        {
//            System.out.println("DE:" + ((NodoArbol) n.getObj()).getHilo().getArb().getEtiqueta());
//            n = cd.elimina();
//        }
        //IMPRESION DE QUE EL METODO CARGA IMPRIME LOS NODOS REPETIDOS POR SEPARADO Y LOS CARGA DE NUEVO AL ARBOL GENERAL
        System.out.println("ARBOL GENERAL CON TODOS LOS NODOS INCLUYENDO LOS REPETIDOS");
        System.out.println(ab.enOrden(ab.getRaiz()));

//        //ab.elimina("A", ab.getRaiz(), arr);
//        if (arr[0] != null)
//        {
//            System.out.println("DE NODOARBOL: " + de.getEtiqueta());
//            System.out.println("DE: NODOLISTA SEGUNDO NIVEL\t" + de.getHilo().getEtiqueta());
//            System.out.println("DE: NODOLISTA CONECTOR ARRIBA\t" + de.getHilo().getArb().getEtiqueta());
//        } else
//        {
//
//            System.out.println("NO HAY DE NODOARBOL: ");
//            System.out.println("NO HAY DE: NODOLISTA SEGUNDO NIVEL\t");
//            System.out.println("NO HAY DE: NODOLISTA CONECTOR ARRIBA\t");
//        }
//        
//        ab.setRaiz(arr[1]);
//        NodoArbol[] arr1 = new NodoArbol[2];
//        ab=ab.insertaNodoL(ab2, "A", arr1, ab);
//        System.out.println(ab.enOrden(ab.getRaiz()));
//        System.out.println("PRE ORDEN");
//        System.out.println(ab.preOrden(ab.getRaiz()));
//        System.out.println("POS ORDEN");
//        System.out.println(ab.posOrden(ab.getRaiz()));
        System.out.println("*************************************");
        //System.out.println(a.getHilo().getArb().getEtiqueta());
//        NodoArbol[] arr = new NodoArbol[2];
//        arr[0] = null;
//        arr[1] = ab.getRaiz();
//        ab.elimina("A", ab.getRaiz(), arr);
//        System.out.println("Dato eliminado: " + arr[0]);
//        ab.setRaiz(arr[1]);
//        System.out.println("EN ORDEN ");
//        System.out.println(ab.enOrden(ab.getRaiz()));
//        arr[0] = null;
//        arr[1] = ab.getRaiz();
//        ab.elimina("B", ab.getRaiz(), arr);
//        System.out.println("Dato eliminado: " + arr[0]);
//        ab.setRaiz(arr[1]);
//        System.out.println("EN ORDEN ");
//        System.out.println(ab.enOrden(ab.getRaiz()));
//        arr[0] = null;
//        arr[1] = ab.getRaiz();
//        ab.elimina("D", ab.getRaiz(), arr);
//        System.out.println("Dato eliminado: " + arr[0]);
//        ab.setRaiz(arr[1]);
//        System.out.println("EN ORDEN ");
//        System.out.println(ab.enOrden(ab.getRaiz()));

    }
}
