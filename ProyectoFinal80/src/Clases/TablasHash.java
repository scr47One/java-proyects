package Clases;

import Clases.Interfaces.VentanaPrincipal;
import java.io.Serializable;

public class TablasHash implements Serializable {

    static Arbol[] AHash = new Arbol[26];
    Archivos arch = new Archivos();

    public Arbol[] getAHash() {
        return AHash;
    }

    public void setAHash(Arbol[] AHash) {
        TablasHash.AHash = AHash;
    }

    public TablasHash() {

        for (int i = 0; i < AHash.length; i++) {
            AHash[i] = new Arbol();
        }

    }

    public void Insertar(String nombre, Nodo nodo) {

        //creacion de nodo arbol
        NodoArbol carreraA = new NodoArbol(nombre);
        //conexion de hilo
        carreraA.setHilo(nodo);

        int pos = CalcularValor(nombre);
        AHash[pos].setR(AHash[pos].insertar(AHash[pos].getR(), carreraA)); // Insertamos en el arbol
        AHash[pos].setR(AHash[pos].balancear(AHash[pos].getR())); //Balanceo del arbol despues de insertar

        System.out.println("Insertar en tabla hash | Insertado en Arbol:");
        Mostrar(nombre);
    }

    public NodoArbol[] Eliminar(String carrera, String institucion) {
        
        int pos = CalcularValor(carrera);
        
        NodoArbol[] arr = new NodoArbol[2];
        arr[0] = null;
        arr[1] = AHash[pos].getR();

        AHash[pos].eliminaI(carrera, AHash[pos].getR(), arr, institucion);

        System.out.println("Carrera Eliminada: " + arr[0].getEtq());
        AHash[pos].setR(arr[1]);

        System.out.println("Eliminar de tabla hash | Eliminado");
        Mostrar(carrera);

        return arr;
    }

    public Nodo Buscar(String nombre) {
        int pos = CalcularValor(nombre);
        Nodo Aux1 = AHash[pos].Busca(nombre, AHash[pos].getR());
        return Aux1;
    }

    public void MostrarTodo() {
        for (int i = 0; i < 26; i++) {
            System.out.println("Arbol [" + ((char) (i + 65)) + "] " + AHash[i].enOrden(AHash[i].getR()));
        }
    }

    public void Mostrar(String nombre) {
        int pos = CalcularValor(nombre);
        System.out.println("Arbol [" + ((char) (pos + 65)) + "] " + AHash[pos].enOrden(AHash[pos].getR()));

    }

    public static int CalcularValor(String Etiqueta) {
        int aux = (int) Etiqueta.charAt(0);
        aux = aux - 65;
        return aux;
    }

    public void CargarTablaHash() {
        Arbol[] auxA = new Arbol[26];
        auxA = (Arbol[]) arch.LeerArchivo("TablaHash.txt");
        if (auxA != null) {
            AHash = auxA;
            System.out.println("Tabla Hash Cargada de Archivo: ");
            MostrarTodo();
        }
    }
        
    public void eliminarTC(Nodo raiz, String Instituto) {
        
        NodoArbol arr[] = new NodoArbol[2];

        while (raiz != null) {

            int pos = CalcularValor(raiz.getEtq());

            arr[0] = null;
            arr[1] = AHash[pos].getR();

            AHash[pos].eliminaI(raiz.getEtq(), AHash[pos].getR(), arr, Instituto);

            System.out.println("Carrera Eliminada:" + arr[0] + " de Instituto "+Instituto);
            AHash[pos].setR(arr[1]);

            System.out.println("Eliminacion de Instituto | Elemento eliminado de arbol: ");
            Mostrar(raiz.getEtq());
            
            raiz = raiz.getSig();

        }

    }
    }

