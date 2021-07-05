package arbolesylistas;

/**
 *
 * @author Daniel Castrejon
 */
public class PrbListaSLC
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ListaSLC ls = new ListaSLC();
        Nodo n1 = new Nodo(null, "5");
        Nodo n2 = new Nodo(null, "1");
        Nodo n3 = new Nodo(null, "3");
        Nodo n4 = new Nodo(null, "6");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        ls.inserta(n1);
        System.out.println(ls.desp());
        ls.inserta(n2);
        System.out.println(ls.desp());
        ls.inserta(n3);
        System.out.println(ls.desp());
        ls.inserta(n4);
        System.out.println(ls.desp());
        System.out.println(ls.elimina("3"));
        System.out.println(ls.desp());
        System.out.println(ls.elimina("5"));
        System.out.println(ls.desp());
        System.out.println(ls.elimina("6"));
        System.out.println(ls.desp());
        System.out.println(ls.elimina("2"));
        System.out.println(ls.desp());
        System.out.println(ls.elimina("1"));
        System.out.println(ls.getRaiz());
    }

}
