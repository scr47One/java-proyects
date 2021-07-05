package arbolesylistas;

/**
 *
 * @author Daniel Castrejon
 */
//Caracteristicas de las listas: los datos son ordenados
//Condiciones para insertar en las listas: 
//1. No hay nada que insertar
//2. Es el primer elemento para ser insertado
//3. El elemento que llega es menor al primer elemento que hay en la lista
//4. El dato que llega, van en medio de la lista
//5. El dato que llega va al final de la lista
public class ListaSL
{

    private Nodo raiz = null;

    public Nodo getRaiz()
    {
        return raiz;
    }

    public void setRaiz(Nodo raiz)
    {
        this.raiz = raiz;
    }

    public boolean inserta(Nodo n)
    {
        if (n == null)
        {
            System.out.println("No se puede insertar");
            return false;
        } else
        {
            //El primero de la lista
            if (raiz == null)
            {
                raiz = n;
                return true;
            } else
            {
                //Antes del primero de la lista
                if (n.getEtiqueta().compareTo(raiz.getEtiqueta()) < 0)
                {
                    n.setSig(raiz);
                    raiz = n;
                } else
                {
                    // en medio de la lista
                    Nodo aux = raiz;
                    boolean bandera = true;
                    while (aux.getSig() != null && bandera)
                    {
                        if (n.getEtiqueta().compareTo(aux.getSig().getEtiqueta()) < 0)
                        {
                            n.setSig(aux.getSig());
                            aux.setSig(n);
                            bandera = false;
                        } else
                        {
                            aux = aux.getSig();
                        }
                    }
                    //El elemento va al final de la lista
                    if (bandera)
                    {
                        aux.setSig(n);
                    }
                }
                return true;
            }
        }
    }

    public String desp()
    {
        String s = "";
        Nodo aux = raiz;
        while (aux != null)
        {
            s += aux.getEtiqueta() + "\n";
            aux = aux.getSig();
        }
        return s;
    }

    //Condiciones para hacer la eliminacion en una lista
    //1.No hay nada para eliminar, raiz esta en nulo
    //2.Cuando el dato que voy a eliminar es el primero de la lista
    //3.Cuando estamos eliminando en medio de la lista 
    //4.Cuando estoy eliminando el ultimo de la lista
    //5.El dato que quiero a eliminar no existe en la lista
    public Nodo elimina(String etiqueta)
    {
        if (raiz == null)
        {
            return null;
        } else
        {
            Nodo aux = null;
            if (etiqueta.compareTo(raiz.getEtiqueta()) >= 0)
            {
                if (raiz.getEtiqueta().equals(etiqueta))
                {
                    aux = raiz;
                    raiz = aux.getSig();
                    aux.setSig(null);
                } else
                {
                    Nodo aux2 = raiz;
                    Boolean bandera = true;
                    while (aux2.getSig() != null && bandera)
                    {
                        if (etiqueta.compareTo(aux2.getSig().getEtiqueta()) >= 0)
                        {
                            if (aux2.getSig().getEtiqueta().equals(etiqueta))
                            {
                                aux = aux2.getSig();
                                aux2.setSig(aux.getSig());
                                aux.setSig(null);
                                bandera = false;
                            } else
                            {
                                aux2 = aux2.getSig();
                            }
                        } else
                        {
                            break;
                        }
                    }
                }
                return aux;
            } else
            {
                return null;
            }

        }
    }
}
