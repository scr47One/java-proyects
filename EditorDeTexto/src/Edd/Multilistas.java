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
public class Multilistas {

    static Listas ldlc = new Listas();

    public static Nodo insertar2(Nodo r, Nodo n, int nivel, String[] etq,Nodo aux2) {
        if (nivel == etq.length - 1) {
            Listas ldlc = new Listas();
            ldlc.setR(r);
            ldlc.inserta(n,aux2);
            r = ldlc.getR();
            return r;
        } else {
            Nodo aux = busca(r, etq[nivel]);
            System.out.println(aux.getDatos());
            if (aux == null) {
                System.out.println("No encontre el dato: " + etq[nivel] + " del nivel: " + nivel);
                return r;
            } else {
                aux.setAbj(insertar2(aux.getAbj(), n, nivel + 1, etq,aux));
                return r;
            }
        }
    }

    public static  Nodo[] elimina(Nodo raiz, int nivel, String[] etiqueta,Nodo ref) {
         Nodo s[] = new Nodo[2];       
        try{

        if (nivel == etiqueta.length - 1) {
            Listas ldlc = new Listas();
            ldlc.setR(raiz);
//Prestar Raiz 
            s[1] = ldlc.elimina(ref);
//eliminar sobre la raiz prestada 
            s[0] = ldlc.getR(); 
//raiz = ldlc.getR();
            return s;
        } else {
            Nodo aux = buscar(raiz,etiqueta[nivel]);
//Parametros; la raiz de la lista a buscar y la etiqueta en el nivel de la lista 
            if (aux == null) {
                System.out.println("No encontre el dato: " + etiqueta[nivel] + " del nivel " + nivel);
                s[0] = raiz;
                s[1] = null;
                return s;
            } else {
                s = elimina(aux.getAbj(), nivel + 1, etiqueta,ref);
                if (!(aux.getAbj().getDatos().equals(s[0].getDatos())) && nivel + 1 == etiqueta.length - 1) {
                    aux.setAbj(s[0]);
                }
                s[0] = raiz;
                return s;
            }
        }
        
        }catch(Exception e){
            System.out.println("a error");
        }
       return s; 
    }
    public static Nodo busca(Nodo r, String etq) {
        Nodo aux = r;
        while (aux != null) {
            if (aux.getDatos().equals(etq)) {
                return aux;
            } else {
                aux = aux.getSig();
            }
        }
        return aux;

    }
    public static Nodo buscar(Nodo r, String etq) {
        Nodo aux = r;
        while (aux != null) {
            if (aux.getDatos().equals(etq)) {
                return aux;
            } else {
                aux = aux.getSig();
            }
        }
        return aux;

    }

}
