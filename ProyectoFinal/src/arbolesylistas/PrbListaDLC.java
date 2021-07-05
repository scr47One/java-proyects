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
public class PrbListaDLC
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ListaDLC ldlc = new ListaDLC();
        Nodo n1 = new Nodo(null, "C");
        Nodo n2 = new Nodo(null, "D");
        Nodo n3 = new Nodo(null, "B");
        Nodo n4 = new Nodo(null, "E");
        
        ldlc.inserta(n1);
        ldlc.inserta(n2);
        ldlc.inserta(n3);
        ldlc.inserta(n4);
       
        System.out.println(ldlc.desp());
        ldlc.elimina("E");
        System.out.println(ldlc.desp());
    }

}
