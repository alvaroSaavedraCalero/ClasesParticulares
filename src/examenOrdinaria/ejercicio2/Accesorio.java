
package examenOrdinaria.ejercicio2;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class Accesorio implements Comparable<Object>, Comparator<Object>{
    private static String marca;
    private String nombre;

    public Accesorio(String nombre, String marca) {
        this.nombre = nombre;
        Accesorio.marca = marca;
    }

    public Accesorio() {
    }

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash * Objects.hashCode(Accesorio.marca);
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
        final Accesorio other = (Accesorio) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
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
        return "Accesorio{" + "nombre=" + nombre + ", marca=" + Accesorio.marca + '}';
    }
    
    
}
