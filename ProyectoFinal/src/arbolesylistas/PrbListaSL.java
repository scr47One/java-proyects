package arbolesylistas;

/**
 *
 * @author Daniel Castrejon
 */
public class PrbListaSL
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ListaSL obj = new ListaSL();
        Nodo n1 = new Nodo(null, "B");
        Nodo n2 = new Nodo(null, "A");
        Nodo n3 = new Nodo(null, "D");
        Nodo n4 = new Nodo(null, "C");
        Nodo n5 = new Nodo(null, "W");
        Nodo n6 = new Nodo(null, "P");
        obj.inserta(n1);
        obj.inserta(n2);
        obj.inserta(n3);
        obj.inserta(n4);
        obj.inserta(n5);
        obj.inserta(n6);
        System.out.println(obj.desp());
        obj.elimina("Z");
        System.out.println(obj.desp());
    }

}
