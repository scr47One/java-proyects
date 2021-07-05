package arbolesylistas;

import java.io.Serializable;


/**
 *
 * @author Daniel Castrejon
 */
public class TablasHash implements Serializable
{

    public static final long SerialVersionUID = (long) 1;
    public static ArbolBinario arr[] = new ArbolBinario[27];

    public TablasHash()
    {
        for (int i = 0; i < 27; i++)
        {
            arr[i] = null;
        }
    }

    public ArbolBinario[] getArr()
    {
        return arr;
    }

    public void setArr(ArbolBinario[] arr)
    {
        this.arr = arr;
    }

    public static ArbolBinario[] inserta(ArbolBinario[] raiz, NodoArbol n, Nodo n1)
    {
        if (raiz == null)
        {
            return null;
        } else
        {
            char a = n.getEtiqueta().toUpperCase().charAt(0);
            if (a == 'Ñ')
            {
                if (raiz[26] == null)
                {
                    ArbolBinario ab = new ArbolBinario();
                    ab.setRaiz(ab.inserta(ab.getRaiz(), n));
                    ab.setRaiz(ab.balancear(ab.getRaiz()));
                    raiz[26] = ab;
                } else
                {
                    raiz[26].setRaiz(raiz[26].inserta(raiz[26].getRaiz(), n));
                    raiz[26].setRaiz(raiz[26].balancear(raiz[26].getRaiz()));
                }
                return raiz;
            } else
            {
                int i = a - 65;
                if (raiz[i] == null)
                {
                    ArbolBinario ab = new ArbolBinario();
                    ab.setRaiz(ab.inserta(ab.getRaiz(), n));
                    ab.setRaiz(ab.balancear(ab.getRaiz()));
                    raiz[i] = ab;
                } else
                {
                    raiz[i].setRaiz(raiz[i].inserta(raiz[i].getRaiz(), n));
                    raiz[i].setRaiz(raiz[i].balancear(raiz[i].getRaiz()));
                }
                return raiz;
            }
        }
    }

    public static ArbolBinario[] elimina(ArbolBinario[] raiz, String s, Nodo nlista)
    {
        if (raiz == null)
        {
            return null;
        } else
        {
            char a = s.toUpperCase().charAt(0);
            if (a == 'Ñ')
            {
                if (raiz[26] != null)
                {
                    NodoArbol arr1[] = new NodoArbol[2];
                    NodoArbol de = null;
                    ArbolBinario ab2 = new ArbolBinario();
                    de = raiz[26].eliminaNodoLista(nlista, raiz[26], s, arr1, de, ab2);
                    raiz[26].setRaiz(arr1[1]);
                    NodoArbol[] arr = new NodoArbol[2];
                    raiz[26] = raiz[26].insertaNodoLista(ab2, s, arr, raiz[26]);
                }
                return raiz;
            } else
            {
                int i = a - 65;
                if (raiz[i] != null)
                {
                    NodoArbol arr1[] = new NodoArbol[2];
                    NodoArbol de = null;
                    ArbolBinario ab2 = new ArbolBinario();
                    de = raiz[i].eliminaNodoLista(nlista, raiz[i], s, arr1, de, ab2);
                    raiz[i].setRaiz(arr1[1]);
                    NodoArbol[] arr = new NodoArbol[2];
                    raiz[i] = raiz[i].insertaNodoLista(ab2, s, arr, raiz[i]);
                }
                return raiz;
            }
        }
    }

    public static ArbolBinario buscar(ArbolBinario raiz[], String s, Nodo nlista)
    {
        char a = s.toUpperCase().charAt(0);
        int i = a - 65;
        if (a == 'Ñ')
        {
            if (raiz[26] != null)
            {
                ArbolBinario ab = new ArbolBinario();
                ab.setRaiz(raiz[26].getRaiz());
                return ab;
            } else
            {
                return null;
            }
        } else
        {
            if (i >= 0 && i <= 25)
            {
                for (int j = 0; j < 26; j++)
                {
                    if (i == j)
                    {
                        if (raiz[i] != null)
                        {
                            ArbolBinario ab = new ArbolBinario();
                            ab.setRaiz(raiz[i].getRaiz());
                            return ab;
                        }
                    }
                }
            }
            return null;
        }
    }
}
