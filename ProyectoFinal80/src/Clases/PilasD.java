
package Clases;

import java.io.Serializable;

public class PilasD implements Serializable{

    private Nodo tope = null;

    public Nodo getTope() {
        return tope;
    }

    public void setTope(Nodo tope) {
        this.tope = tope;
    }

    public void inserta(Nodo n) {
        if (n == null) {
                System.out.println("\n");
            System.out.println("no se puede insertar");
                System.out.println("\n");
        } else {

            n.setSig(tope);

            tope = n;

        }

    }

    public Nodo elimina() {

        if (tope == null) {

            return null;

        } else {

            Nodo aux = tope;

            tope = tope.getSig();

            aux.setSig(null);

            return aux;

        }

    }

}

