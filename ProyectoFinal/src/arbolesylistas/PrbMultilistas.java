package arbolesylistas;

import java.util.Scanner;

/**
 *
 * @author Daniel Castrejon
 */
public class PrbMultilistas
{

    public static void main(String[] args)
    {
        Nodo raiz = null;//
        /*raiz=cargar();
        menu(raiz);*/
        Nodo p = new Nodo(null, "Italia");
        Nodo p2 = new Nodo(null, "Alemania");
        Nodo p3 = new Nodo(null, "Mexico");
        Nodo p4 = new Nodo(null, "Ucrania");

        Nodo e1 = new Nodo(null, "Jalisco");
        Nodo e2 = new Nodo(null, "Guanajuato");
        Nodo e3 = new Nodo(null, "Veracruz");

        Nodo mp1 = new Nodo(null, "Guadalajara");
        Nodo mp2 = new Nodo(null, "Tonala");
        Nodo mp3 = new Nodo(null, "Zapopan");

        //Inserta en el nivel 0
        String etiqueta[] = new String[1];
        etiqueta[0] = "Italia";
        raiz = Multilistas.insertar(raiz, p, 0, etiqueta,null);
        etiqueta[0] = "Alemania";
        raiz = Multilistas.insertar(raiz, p2, 0, etiqueta,raiz);
        etiqueta[0] = "Mexico";
        raiz = Multilistas.insertar(raiz, p3, 0, etiqueta,raiz);
        etiqueta[0] = "Ucrania";
        raiz = Multilistas.insertar(raiz, p4, 0, etiqueta,raiz);

        //Inserta en el nivel 1
        etiqueta = new String[2];
        etiqueta[0] = "Mexico";
        etiqueta[1] = "Jalisco";
        Nodo aux = Multilistas.busca(raiz, etiqueta[0]);
        raiz = Multilistas.insertar(raiz, e1, 0, etiqueta,aux);
        etiqueta[1] = "Guanajuato";
        raiz = Multilistas.insertar(raiz, e2, 0, etiqueta,aux);
        etiqueta[1] = "Veracruz";
        raiz = Multilistas.insertar(raiz, e3, 0, etiqueta,aux);

        //Inserta en el nivel 2
        etiqueta = new String[3];
        etiqueta[0] = "Mexico";
        etiqueta[1] = "Jalisco";
        etiqueta[2] = "Tonala";
        Nodo aux1 = Multilistas.busca(raiz, etiqueta[1]);
        raiz = Multilistas.insertar(raiz, mp1, 0, etiqueta,aux);
       /* etiqueta[2] = "Guadalajara";
        raiz = Multilistas.insertar(raiz, mp2, 0, etiqueta);
        etiqueta[2] = "Zapopan";
        raiz = Multilistas.insertar(raiz, mp3, 0, etiqueta);*/
        System.out.println(Multilistas.desp(raiz, 0));

        String[] etiqueta1 = new String[3];
        etiqueta1[0] = "Mexico";
        etiqueta1[1] = "Jalisco";
        etiqueta1[2] = "Guadalajara";

        Nodo[] s = Multilistas.elimina(raiz, 0, etiqueta1);
        raiz = s[0];
        System.out.println("Dato Eliminado: " + s[1].getEtiqueta());
        System.out.println();
        System.out.println(Multilistas.desp(raiz, 0));

    }

//    public static void guardar(Nodo raiz)
//    {
//        GuardaArchivos.guardar(raiz, "Multilista.dat");
//
//    }
//
//    public static Nodo cargar()
//    {
//        Nodo raiz = (Nodo) GuardaArchivos.carga("Multilista.dat");
//        return raiz;
//    }
//
//    public static void menu(Nodo raiz)
//    {
//        boolean bandera = true;
//        Nodo s[];
//
//        do
//        {
//            System.out.println("Opciones: \n 1: Ingresar Pais \n 2: Ingresar Estado \n 3: Ingresar Municipio \n 4: Baja Pais"
//                    + "\n 5: Baja Estado \n 6: Baja Municiopio \n 7: Mostrar todo \n 8: Salir y guardar");
//            Scanner sc = new Scanner(System.in);
//            int opc = sc.nextInt();
//            switch (opc)
//            {
//                case 1:
//                    System.out.println("Ingresa pais");
//                    String pais = sc.next();
//                    Nodo p = new Nodo(null, pais);
//                    String etiqueta[] = new String[1];
//                    etiqueta[0] = pais;
//                    raiz = Multilistas.insertar(raiz, p, 0, etiqueta);
//                    break;
//                case 2:
//                    System.out.println("Ingresa pais para ingresar estado");
//                    pais = sc.next();
//                    System.out.println("Ingresa estado");
//                    String estado = sc.next();
//                    Nodo e = new Nodo(null, estado);
//                    etiqueta = new String[2];
//                    etiqueta[0] = pais;
//                    etiqueta[1] = estado;
//                    raiz = Multilistas.insertar(raiz, e, 0, etiqueta);
//                    break;
//                case 3:
//                    System.out.println("Ingresa pais para ingresar estado");
//                    pais = sc.next();
//                    System.out.println("Ingresa estado para ingresa municipio");
//                    estado = sc.next();
//                    System.out.println("Ingresa municipio");
//                    String municipio = sc.next();
//                    Nodo m = new Nodo(null, municipio);
//                    etiqueta = new String[3];
//                    etiqueta[0] = pais;
//                    etiqueta[1] = estado;
//                    etiqueta[2] = municipio;
//                    raiz = Multilistas.insertar(raiz, m, 0, etiqueta);
//                    break;
//                case 4:
//                    System.out.println("Ingresa pais a dar de baja");
//                    String paisb = sc.next();
//                    String etiqueta1[] = new String[1];
//                    etiqueta1[0] = paisb;
//                    s = Multilistas.elimina(raiz, 0, etiqueta1);
//                    raiz = s[0];
//                    break;
//                case 5:
//                    System.out.println("Ingresa pais donde se encuentra el estado a dar de baja");
//                    paisb = sc.next();
//                    System.out.println("Ingresa estado a dar de baja");
//                    String est = sc.next();
//                    etiqueta1 = new String[2];
//                    etiqueta1[0] = paisb;
//                    etiqueta1[1] = est;
//                    s = Multilistas.elimina(raiz, 0, etiqueta1);
//                    raiz = s[0];
//                    break;
//                case 6:
//                    System.out.println("Ingresa pais donde se encuentra el estado");
//                    paisb = sc.next();
//                    System.out.println("Ingresa estado donde se encuentra el municipio a dar de baja");
//                    est = sc.next();
//                    System.out.println("Ingresa el municio a dar de baja");
//                    String muni = sc.next();
//                    etiqueta1 = new String[3];
//                    etiqueta1[0] = paisb;
//                    etiqueta1[1] = est;
//                    etiqueta1[2] = muni;
//                    s = Multilistas.elimina(raiz, 0, etiqueta1);
//                    raiz = s[0];
//                    break;
//                case 7:
//                    System.out.println(Multilistas.desp(raiz, 0));
//                    break;
//                case 8:
//                    guardar(raiz);
//                    System.exit(0);
//                    break;
//                default:
//                    bandera = false;
//                    throw new AssertionError();
//            }
//
//        } while (bandera);
//
//    }
}
