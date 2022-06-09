
package ejerciciosFinales.ejercicioInicio;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class Autor {
    private String nombre;
    private Integer edad;
    private ArrayList<Articulo> articulos;

    public Autor(String nombre, Integer edad, ArrayList<Articulo> articulos) {
        this.nombre = nombre;
        this.edad = edad;
        this.articulos = new ArrayList<>(articulos);
    }

    public Autor(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.articulos = new ArrayList<>();
    }

    public Autor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.edad);
        hash = 79 * hash + Objects.hashCode(this.articulos);
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
        final Autor other = (Autor) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        if (!Objects.equals(this.articulos, other.articulos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", edad=" + edad + ", articulos=" + articulos + '}';
    }
    
    
}
