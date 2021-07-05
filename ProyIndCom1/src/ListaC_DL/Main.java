package ListaC_DL;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     

        String[] s = new String[1];
        s[0] = null;
        NodoD n1 = new NodoD(null,"C");
        NodoD rg = null;
        rg = Multilista.insertar(rg, n1, 0,s);
        
        NodoD n2 = new NodoD(null,"O");
        rg = Multilista.insertar(rg, n2, 0,s);
        NodoD n3 = new NodoD(null,"M");

        rg = Multilista.insertar(rg, n3, 0,s);
        NodoD n4 = new NodoD(null,"E");
        rg = Multilista.insertar(rg, n4, 0,s);
    
        String [] s2= new String[2];
        s2[0]="C";
        s2[1]=null;
        NodoD n5 = new NodoD(null,"P");
        rg=Multilista.insertar(rg, n5, 0,s2);
        
        s2[0]="C";
        s2[1]=null;
        NodoD n6 = new NodoD(null,"E");
        rg=Multilista.insertar(rg, n6, 0,s2);
        
        s2[0]="C";
        s2[1]=null;
        NodoD n7 = new NodoD(null,"N");
        rg=Multilista.insertar(rg, n7, 0,s2);

         String [] s3= new String[3];
        s3[0]="C";
        s3[1]="P";
        s3[2]=null;
        NodoD n8 = new NodoD(null,"X");
        rg=Multilista.insertar(rg, n8, 0,s3);
        NodoD n9 = new NodoD (null, "Y");
        rg=Multilista.insertar(rg, n9, 0,s3);
  
        System.out.println("");

    }
}
