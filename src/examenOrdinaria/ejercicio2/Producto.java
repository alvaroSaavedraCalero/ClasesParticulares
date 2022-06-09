
package examenOrdinaria.ejercicio2;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class Producto implements Comparable<Object>, Comparator<Object>{
    private String nombre;
    private double precio;
    private String marca;

    public Producto(String nombre, double precio, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
    }

    public Producto() {
    }

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.nombre);
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 73 * hash + Objects.hashCode(this.marca);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        if (this.hashCode() > o.hashCode()) {
            return 1;
        } else if (this.hashCode() < o.hashCode()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int compare(Object o1, Object o2) {
        if (o1.hashCode() > o2.hashCode()) {
            return 1;
        } else if (o1.hashCode() < o2.hashCode()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", marca=" + marca + '}';
    }
    
    
    
    
}   
