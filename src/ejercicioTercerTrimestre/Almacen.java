
package ejercicioTercerTrimestre;

import java.io.Serializable;
import java.util.Objects;
import java.util.TreeSet;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class Almacen implements Serializable{
    private TreeSet<Persona> personas;

    public Almacen() {
        this.personas = new TreeSet<>();
        
    }

    public TreeSet<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(TreeSet<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.personas);
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
        final Almacen other = (Almacen) obj;
        if (!Objects.equals(this.personas, other.personas)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Almacen{" + "personas=" + personas + '}';
    }
    
    
}
