/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaC_DL;

/**
 *
 * @author DELL LATITUDE E7440
 */
public class Multilista {
    public static NodoD insertar(NodoD r, NodoD n, NodoD arriba, int nivel, String []s)
    {
        if(nivel == s.length-1)
        {

            Lista_CD ls = new Lista_CD();
            ls.setR(r);
            ls.inserta(n,arriba);
            r=ls.getR();

            return r;

        }else
        {
            NodoD aux = busca(r, s[nivel]);
            arriba=aux;
            if (aux == null)
            {
                
                System.out.println("no encontere el dato " + s[nivel] + "del nivel  " + nivel);
                return r;
                
            }else
            {
                aux.setAbj(insertar(aux.getAbj(), n, arriba, nivel+1, s));
               
                return r;
                
            }
        }
    }
    
    public static NodoD busca(NodoD r,String s)
    {
        NodoD aux = r;
        while (aux != null)
        {
            if(aux.getS().equals(s))
            {
                return aux;
            }else
            {
                aux=aux.getSig();
            }
        }
        return aux;
    }
    
    public static String desp(NodoD raiz, int nivel)
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
            s += ss + raiz.getS() + "\n";
            s += desp(raiz.getAbj(), nivel + 1);
            raiz = raiz.getSig();
        }
        return s;
    }
}
