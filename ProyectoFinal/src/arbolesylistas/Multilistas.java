package arbolesylistas;

import java.io.Serializable;

/**
 *
 * @author Daniel Castrejon
 */
public class Multilistas implements Serializable
{

    public static Nodo insertar(Nodo raiz, Nodo n, int nivel, String[] etiqueta, Nodo raiz2)
    {
        if (nivel == etiqueta.length - 1)
        {
            ListaSL ls = new ListaSL();
            ls.setRaiz(raiz);//Prestar Raiz
            ls.inserta(n);//Inserta sobre la raiz prestada
            n.setArb(raiz2);
            raiz = ls.getRaiz();
            return raiz;
        } else
        {
            Nodo aux = busca(raiz, etiqueta[nivel]);//Parametros; la raiz de la lista a buscar y la etiqueta en el nivel de la lista
            if (aux == null)
            {
                System.out.println("No encontre el dato: " + etiqueta[nivel] + " del nivel " + nivel);
                return raiz;
            } else
            {
                aux.setAbj(insertar(aux.getAbj(), n, nivel + 1, etiqueta,raiz2));
                return raiz;
            }
        }
    }

    public static Nodo busca(Nodo raiz, String etiqueta)
    {
        Nodo aux = raiz;
        while (aux != null)
        {
            if (aux.getEtiqueta().equalsIgnoreCase(etiqueta))
            {
                return aux;
            } else
            {
                aux = aux.getSig();
            }
        }
        return aux;
    }

    public static Nodo[] elimina(Nodo raiz, int nivel, String[] etiqueta)
    {
        Nodo s[] = new Nodo[2];
        if (nivel == etiqueta.length - 1)
        {
            ListaSL ls = new ListaSL();
            ls.setRaiz(raiz);//Prestar Raiz
            s[1] = ls.elimina(etiqueta[nivel]);//eliminar sobre la raiz prestada
            s[1].setArb(null);
            s[0] = ls.getRaiz();
            //raiz = ls.getRaiz();
            return s;
        } else
        {
            Nodo aux = busca(raiz, etiqueta[nivel]);//Parametros; la raiz de la lista a buscar y la etiqueta en el nivel de la lista
            if (aux == null)
            {
                System.out.println("No encontre el dato: " + etiqueta[nivel] + " del nivel " + nivel);
                s[0] = raiz;
                s[1] = null;
                return s;
            } else
            {
                s = elimina(aux.getAbj(), nivel + 1, etiqueta);
                if (s[0] != null)
                {
                    if (!(aux.getAbj().getEtiqueta().equals(s[0].getEtiqueta())) && nivel + 1 == etiqueta.length - 1)
                    {
                        aux.setAbj(s[0]);
                    }
                } else
                {
                    aux.setAbj(null);
                }
                s[0] = raiz;
                return s;
            }
        }
    }

    public static String desp(Nodo raiz, int nivel)
    {
        String s = "";

        while (raiz != null)
        {
            String ss = "";
            for (int i = 0; i < nivel; i++)
            {
                ss += "\t";
            }
            s += ss + "Nivel: " + String.valueOf(nivel) + "\n";
            s += ss + raiz.getEtiqueta() + "\n";
            s += desp(raiz.getAbj(), nivel + 1);
            raiz = raiz.getSig();
        }
        return s;
    }
}
