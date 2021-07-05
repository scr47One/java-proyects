package arbolesylistas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class GuardaArchivos
{

    public static void guardar(Object o, String s)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(s);
            ObjectOutputStream arch = new ObjectOutputStream(fos);
            arch.writeObject(o);
            arch.close();
        } catch (Exception ex)
        {
            System.out.println("Error.. NO SE PUEDE GUARDAR");
        }
    }

    public static Object carga(String s)
    {
        Object o =null;
        try
        {
            FileInputStream fos = new FileInputStream(s);
            ObjectInputStream arch = new ObjectInputStream(fos);
            o=arch.readObject();
            arch.close();
        } catch (Exception ex)
        {
            System.out.println("Error... NO HAY DATOS EN EL ARCHIVO");
        }
        return o;
    }
}
