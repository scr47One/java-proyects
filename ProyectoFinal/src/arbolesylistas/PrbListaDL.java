/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesylistas;

/**
 *
 * @author Daniel Castrejon
 */
public class PrbListaDL
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ListaDL ldl = new ListaDL();
        Nodo n1 = new Nodo(null, "5");
        Nodo n2 = new Nodo(null, "3");
        Nodo n3 = new Nodo(null, "4");
        Nodo n4 = new Nodo(null, "6");
        
        ldl.inserta(n1);
        ldl.inserta(n2);
        ldl.inserta(n3);
        ldl.inserta(n4);
       
        System.out.println(ldl.desp());
        ldl.elimina("7");
        System.out.println(ldl.desp());
    }

}
