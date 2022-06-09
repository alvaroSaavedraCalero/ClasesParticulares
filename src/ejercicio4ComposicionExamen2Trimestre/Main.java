
package ejercicio4ComposicionExamen2Trimestre;

import ejercicio4ComposicionExamen2Trimestre.Juguete.Pilas;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class Main {
    public static void main(String[] args) {
//        Accesorio[] accesorios = new Accesorio[5];
//        accesorios[0] = new Accesorio("accesorio0");
//        accesorios[1] = new Accesorio("accesorio1");
//        accesorios[2] = new Accesorio("accesorio2");
//        Plantilla plantilla = new Plantilla(accesorios, "genero", "nombrePlantilla", 0);
//        System.out.println(plantilla.toString());


        // Referencia
        String nombre = "Juan";
        String nombre2 = "Ana";
        
        // Que guarde el objeto
//        String nombreNuevo = new String("Juan");
//        String nombreNuevo2 = new String("Juan");
        
        System.out.println(nombre.equals(nombre2));
        
        Juguete j1 = new Juguete();
        Pilas p1 = j1.new Pilas();
        
    }
}
