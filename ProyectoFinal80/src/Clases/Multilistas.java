package Clases;

import java.io.Serializable;

public class Multilistas implements Serializable {

    public static Nodo insertar(Nodo r, Nodo n, int nivel, String[] etq) {
        
        if (nivel == etq.length - 1) {
            LSL ls = new LSL();
            ls.setR(r);
            ls.inserta(n);
            r = ls.getR();
            return r;
        } else {
            Nodo aux = busca(r, etq[nivel]);
            if (aux == null) {
                System.out.println("no encontere el dato " + etq[nivel] + "del nivel  " + nivel);
                return r;
            } else {
                aux.setAbj(insertar(aux.getAbj(), n, nivel + 1, etq));
                return r;
            }
        }
    }
 public static Nodo[] eliminar(Nodo raiz, int nivel, String[] etq)
    {
        
        Nodo[] raizAuxiliar = new Nodo[2];

        raizAuxiliar[0] = raiz;

        if (nivel == etq.length - 1)
        {
            LSL ls = new LSL();
            ls.setR(raizAuxiliar[0]);
            raizAuxiliar[1] = ls.elimina(etq[nivel]); //Eliminamos en base a la etiqueta del nodo y guardamos el elemento eliminado en raizAuxiliar[1]
            raizAuxiliar[1].setArriba(null);
            System.out.println("EliminaMultilista | Nodo eliminado: "+ raizAuxiliar[1].getEtq());
            raizAuxiliar[0] = ls.getR(); // Le damos el valor de la raiz despues de eliminar
            return raizAuxiliar;
        } else
        {
            Nodo aux = busca(raizAuxiliar[0], etq[nivel]);
            if (aux == null)
            {
                System.out.println("No encontre el dato " + etq[nivel] + " del nivel " + nivel);
                raizAuxiliar[0] = raiz;
                raizAuxiliar[1] = null;
                return raizAuxiliar;

 

            } else
            {
                Nodo aux2[] = new Nodo[2];
                aux2 = eliminar(aux.getAbj(), nivel + 1, etq);

 

                aux.setAbj(aux2[0]);
                raizAuxiliar[1] = aux2[1];

 

                return raizAuxiliar;
            }
        }
    }


    public static Nodo busca(Nodo r, String etq) {
        Nodo aux = r;
        while (aux != null) {
            if (aux.getEtq().equals(etq)) {
                return aux;
            } else {
                aux = aux.getSig();
            }
        }
        return aux;
    }


    public static String desp(Nodo r, int nivel) {
        String s = "";
        while (r != null) {
            String ss = "";
            for (int i = 0; i < nivel; i++) {
                ss += "\t";
            }
            s += ss + "Nivel = " + String.valueOf(nivel) + "\n";
            s += ss + r.getEtq() + "\n";
            s += desp(r.getAbj(), nivel + 1);
            r = r.getSig();
        }
        return s;
    }
    

public static String desplegarI(Nodo raiz, int nivel)
    {
        Instituto aux;
        String s = "";
        while (raiz != null)
        {
            aux = (Instituto) raiz.getObj();
            String ss = "";
            for (int i = 0; i < nivel; i++)
            {
                ss += "\t";
            }
            s += ss + "\n";
            s += ss + "Nombre: " + aux.getNombre() + "\n";
            s += ss + "Clave: " + aux.getClave() + "\n";
            s += ss + "Telefono: " + aux.getTelefono() + "\n";
            s += ss + "Direccion: " + aux.getDireccion() + "\n";
            s += ss + "\n";
            raiz = raiz.getSig();

        }
        return s;
    }

    public static String desplegarC(Nodo raiz, int nivel)
    {
        Carrera aux;
        String s = "";
        System.out.println("Desplegar Carreras | Instituto: " + raiz.getArriba().getEtq());
        while (raiz != null)
        {
            aux = (Carrera) raiz.getObj();

            s += "\n";
            s += "Nombre: " + aux.getNombre() + "\n";
            s += "Matricula: " + aux.getMatricula() + "\n";
            s += "Jefe de carrera: " + aux.getJefe() + "\n";
            raiz = raiz.getSig();

        }
        return s;
    }

    public static String desplegarR(Nodo raiz, int nivel)
    {
        Reunion aux;
        String s = "";
        while (raiz != null)
        {
            aux = (Reunion) raiz.getObj();
            String ss = "";
            for (int i = 0; i < nivel; i++)
            {
                ss += "\t";
            }
            s += ss + "\n";
            s += ss + "Folio: " + aux.getFolio() + "\n";
            s += ss + "Motivo: " + aux.getMotivo() + "\n";
            s += ss + "Fecha: " + aux.getFecha() + "\n";
            s += ss + "\n";

            raiz = raiz.getSig();

        }
        return s;
    }
}
