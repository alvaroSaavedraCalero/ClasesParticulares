
package ejercicioTercerTrimestre;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class Controlador {
    public static Almacen crearAlmacenFichero(String rutaFichero) throws IOException {
        Almacen almacen = new Almacen();
        try {
            FileOutputStream fichero = new FileOutputStream(rutaFichero);
            ObjectOutputStream serializador = new ObjectOutputStream(fichero);
            serializador.writeObject(almacen);
            serializador.close();
            fichero.close();
            System.out.println("Se creo el almacen correctamente.");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException en crearAlmacenFichero");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException en crearAlmacenFichero");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception en crearAlmacenFichero");
            System.out.println(e.getMessage());
        }
        return almacen;
    }
    
    public static void escribirObjetoFichero(String rutaFichero, Almacen almacen) {
        try {
            FileOutputStream fichero = new FileOutputStream(rutaFichero);
            ObjectOutputStream serializador = new ObjectOutputStream(fichero);
            serializador.writeObject(almacen);
            serializador.close();
            fichero.close();
            System.out.println("Los cambios fueron guardados.");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException en escribirObjetoFichero");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException en escribirObjetoFichero");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception en escribirObjetoFichero");
            System.out.println(e.getMessage());
        }
    }

    public static Almacen extraerObjetoFichero(String rutaFichero) throws IOException {
        Almacen almacenRetorno = null;
        FileInputStream fichero;
        ObjectInputStream almacen;

        try {
            fichero = new FileInputStream(rutaFichero);
            almacen = new ObjectInputStream(fichero);
            almacenRetorno = (Almacen) almacen.readObject();
            fichero.close();
            almacen.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException en extraerObjetoFichero");
            System.out.println(e.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return almacenRetorno;
    }
}
