
package ejerciciosFinales.ejercicioInicio;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public abstract class Documento implements Comparable<Documento>, Comparator<Documento>{
    private String titulo;
    private Integer id;

    public Documento(String titulo, Integer id) {
        this.titulo = titulo;
        this.id = id;
    }

    public Documento() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.titulo);
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final Documento other = (Documento) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    @Override
    public int compareTo(Documento o) {
        if (this.id < o.getId()) {
            return 1;
        } else if (this.id > o.getId()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int compare(Documento o1, Documento o2) {
        if (o1.compareTo(o2) > 0) {
            return 1;
        } else if (o1.compareTo(o2) < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", id=" + id + '}';
    }
    
    
}
