
package ejercicio4ComposicionExamen2Trimestre;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class Accesorio {
    private static String marca;
    private String nombre;

    // Constructores
    public Accesorio() {
    }

    public Accesorio(String nombre) {
        this.nombre = nombre;
    }

    // getter y setter
    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Accesorio.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // metodo equals
    @Override
    public boolean equals(Object obj){
        Accesorio accesorio = (Accesorio) obj;
        return Accesorio.marca.equals(Accesorio.getMarca()) &&
             this.nombre.equals(accesorio.getNombre());
    }

    // metodo toString
    @Override
    public String toString() {
        return "Accesorio{" + "nombre=" + nombre + "marca=" + Accesorio.marca +  '}';
    }
    
    
}
