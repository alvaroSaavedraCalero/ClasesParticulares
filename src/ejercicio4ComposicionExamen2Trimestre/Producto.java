
package ejercicio4ComposicionExamen2Trimestre;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class Producto {
    private String nombre;
    private double precio;
    private static String marca;

    // Constructores
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {
    }

    // getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Producto.marca = marca;
    }
    
    // metodo equals
    @Override
    public boolean equals(Object obj){
        Producto producto = (Producto) obj;
        return this.nombre.equals(producto.getNombre()) &&
                this.precio == producto.getPrecio() &&
                Producto.marca.equals(Producto.getMarca());
    }
    
    // metodo union
    public String union(){
        StringBuilder union = new StringBuilder();
        union.append(nombre).append(", ").append(marca);
        return union.toString();
    }

    // metodo toString
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio +'}';
    }
    
    
}
