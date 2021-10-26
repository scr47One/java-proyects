package Clases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Archivos implements Serializable // Al ser archivos binarios la clase debe ser serializable
{

    FileOutputStream archivo = null;
    FileInputStream ArchivoEntrada = null;

    public void GuardarEnArchivo(Object objetoaguardar, String Archivo)
    {

        try
        {

            archivo = new FileOutputStream(Archivo);
            ObjectOutputStream tuberia = new ObjectOutputStream(archivo);
            tuberia.writeObject(objetoaguardar);
        } catch (FileNotFoundException ex)
        {
            System.out.println("Error encontrado: " + ex.toString());
            
        } catch (IOException ex)
        {
            System.out.println("Error encontrado: " + ex.toString());
        } finally
        {
            try
            {
                archivo.close();
            } catch (IOException ex)
            {
                System.out.println("Error encontrado: " + ex.toString());
            }
        }
    }

    public Object LeerArchivo(String Archivo)
    {
        Object p = null;
        try
        {
            ArchivoEntrada = new FileInputStream(Archivo);
            ObjectInputStream tuberiaentrada = new ObjectInputStream(ArchivoEntrada);

            p =  tuberiaentrada.readObject();
            
        } catch (FileNotFoundException ex)
        {
            System.out.println("Error encontrado: " + ex.toString());
        } catch (IOException ex)
        {
            System.out.println("Error encontrado: " + ex.toString());
        } catch (ClassNotFoundException ex)
        {
            System.out.println("Error encontrado: " + ex.toString());
        }
        return p;
    }

}
