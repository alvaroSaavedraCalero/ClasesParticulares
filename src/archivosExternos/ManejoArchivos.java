
package archivosExternos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/**
 *
 * @author Álvaro Saavedra Calero
 */
public class ManejoArchivos {
    
    /*
    implements Serializable
    
    FileInputStream y ObjectInputStream --> Para obtener datos del fichero hacia el codigo (.readObject())
    Si se guardan los objetos en cierto orden, hay que sacarlo en ese mismo orden
    
    FileOutputStream y ObjectOutputStream --> Para introducir datos en un fichero, si no existe, lo crea (.writeObjetc())
    
    */
    
    public static void main(String[] args) throws IOException{
        
        
        introducirObjetoIntegerFichero();
        
        
        
        
    }
    
    public static void introducirObjetoIntegerFichero()  throws FileNotFoundException, IOException {
        Integer numero = 6;
        
        File fichero = new File("fichero.txt");
        try (FileOutputStream ficheroStream = new FileOutputStream(fichero); 
                ObjectOutputStream serializador = new ObjectOutputStream(ficheroStream)) {
            serializador.writeObject(numero);
            serializador.close();
            ficheroStream.close();
        } catch (FileNotFoundException f) {
            f.getMessage();
        } catch (IOException io) {
            io.getMessage();
        } catch (Exception e) {
            
        }
    }

}
