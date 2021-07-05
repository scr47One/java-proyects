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
public class ListaDLC
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
            if (raiz == null)
            {
                raiz = n;
                raiz.setSig(raiz);
                raiz.setAnt(raiz);
                return true;
            } else
            {
                if (n.getEtiqueta().compareTo(raiz.getSig().getEtiqueta()) < 0 || n.getEtiqueta().compareTo(raiz.getEtiqueta()) > 0)
                {
                    n.setSig(raiz.getSig());
                    n.setAnt(raiz);
                    raiz.getSig().setAnt(n);
                    raiz.setSig(n);
                    if (n.getEtiqueta().compareTo(raiz.getEtiqueta()) > 0)
                    {
                        raiz = n;
                    }
                } else
                {
                    Nodo aux = raiz;
                    boolean bandera = true;
                    while (aux.getSig() != null && bandera)
                    {
                        if (n.getEtiqueta().compareTo(aux.getSig().getEtiqueta()) < 0)
                        {
                            n.setSig(aux.getSig());
                            n.setAnt(aux);
                            aux.setSig(n);
                            n.getSig().setAnt(n);
                            bandera = false;
                        } else
                        {
                            aux = aux.getSig();
                        }
                    }
                }
                return true;
            }
        }
    }

    public String desp()
    {
        String s = "";
        Nodo aux = raiz.getSig();
        do
        {
            s += aux.getEtiqueta() + "\n";
            aux = aux.getSig();
        } while (aux != raiz.getSig());
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
            if (etiqueta.compareTo(raiz.getSig().getEtiqueta()) >= 0 && etiqueta.compareTo(raiz.getEtiqueta()) <= 0)
            {
                if (raiz.getSig().getEtiqueta().equals(etiqueta))
                {
                    aux = raiz.getSig();
                    raiz.setSig(aux.getSig());
                    raiz.getSig().setAnt(raiz);
                    aux.setAnt(null);
                    aux.setSig(null);
                } else
                {
                    Nodo aux2 = raiz.getSig();
                    Boolean bandera = true;
                    while (bandera)
                    {
                        if (etiqueta.compareTo(aux2.getSig().getEtiqueta()) >= 0 && etiqueta.compareTo(raiz.getEtiqueta()) <= 0)
                        {
                            if (aux2.getSig().getEtiqueta().equals(etiqueta))
                            {
                                aux = aux2.getSig();
                                aux2.setSig(aux.getSig());
                                aux.getSig().setAnt(aux2);
                                aux.setSig(null);
                                aux.setAnt(null);
                                if (aux == raiz)
                                {
                                    raiz = aux2;
                                }
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
