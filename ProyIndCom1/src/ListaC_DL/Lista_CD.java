package ListaC_DL;

public class Lista_CD
{

    private NodoD r = null;

    public void inserta(NodoD n, NodoD arriba)
    {
        if (n == null)
        {
            System.out.println("No se puede insertar");
        } else
        {
            if (r == null)
            {

                setR(n);
                getR().setAnt(getR());
                getR().setSig(getR());
                getR().setArr(arriba);
            } else
            {

                boolean b = true;
                NodoD aux = getR();
                while (b)
                {
                    if (aux.getSig() == getR()) // Compara si el ultimo dato tiene la raiz como siguiente
                    {
                        n.setSig(getR()); // Conecta con la raiz al nodo 
                        n.setAnt(aux); // Conecta al aux o al dato anterior con el nodo
                        aux.getSig().setAnt(n); // Raiz de "n" es el anterior de n
                        aux.setSig(n); // El sig del aux es n
                        System.out.println("Dato" + n.getS());
                        b = false;
                    } else
                    {
                        aux = aux.getSig(); // Si no se cumple la condición el aux va a ser el sig dato
                    }
                }
            }
        }
    }

    public String muestra()
    {
        String s = "";
        if (getR() != null)
        {
            NodoD aux = getR().getSig();
            do
            {
                s += (String) aux.getObj() + "\n";
                aux = aux.getSig();
            } while (aux != getR().getSig());
        } else
        {
            s = "No hay datos";
        }
        return s;
    }

    public NodoD elimina(String s)
    {
        NodoD aux = getR();
        if (getR() == null)
        {
            System.out.println("Lista vacia");
        } else
        {
            aux = getR().getSig();
            String c1 = (String) aux.getObj();
            if (c1.equals(s))
            {
                getR().setSig(aux.getSig());
                aux.getSig().setAnt(getR());
                aux.setSig(null);
                aux.setAnt(null);
            } else
            {
                while (true)
                {
                    if (aux.getSig() == getR().getSig())
                    {
                        System.out.println("Dato no encontrado");
                        break;
                    } else
                    {
                        String c3 = (String) aux.getSig().getObj();
                        if (c3.equals(s))
                        {
                            if (aux.getSig() == getR())
                            {
                                NodoD aux2 = getR().getSig();
                                getR().setSig(null);
                                setR(aux);
                                getR().getSig().setAnt(null);
                                getR().setSig(aux2);
                                aux2.setAnt(null);
                                aux2.setAnt(getR());
                                getR().setSig(aux2);
                                break;
                            } else
                            {
                                NodoD aux2 = aux;
                                aux = aux.getSig().getSig();
                                aux2.getSig().setSig(null);
                                aux2.setSig(aux);
                                aux.getAnt().setAnt(null);
                                aux.setAnt(aux2);
                                break;
                            }
                        } else
                        {
                            aux = aux.getSig();
                        }
                    }
                }
            }
        }
        return aux;
    }

    /**
     * @return the r
     */
    public NodoD getR()
    {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(NodoD r)
    {
        this.r = r;
    }
}
