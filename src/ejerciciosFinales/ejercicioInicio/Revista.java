
package ejerciciosFinales.ejercicioInicio;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class Revista extends Documento{
    private String tituloRevista;
    private Integer idRevista;
    private ArrayList<Autor> autores;

    public Revista(String tituloRevista, Integer idRevista, ArrayList<Autor> autores, String titulo, Integer id) {
        super(tituloRevista, idRevista);
        this.tituloRevista = tituloRevista;
        this.idRevista = idRevista;
        this.autores = new ArrayList<>(autores);
    }

    
    public Revista(String tituloRevista, Integer idRevista, String titulo, Integer id) {
        super(tituloRevista, idRevista);
        this.tituloRevista = tituloRevista;
        this.idRevista = idRevista;
        this.autores = new ArrayList<>();
    }

    public Revista() {
    }

    public String getTituloRevista() {
        return tituloRevista;
    }

    public void setTituloRevista(String tituloRevista) {
        this.tituloRevista = tituloRevista;
    }

    public Integer getIdRevista() {
        return idRevista;
    }

    public void setIdRevista(Integer idRevista) {
        this.idRevista = idRevista;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.tituloRevista);
        hash = 43 * hash + Objects.hashCode(this.idRevista);
        hash = 43 * hash + Objects.hashCode(this.autores);
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
        final Revista other = (Revista) obj;
        if (!Objects.equals(this.tituloRevista, other.tituloRevista)) {
            return false;
        }
        if (!Objects.equals(this.idRevista, other.idRevista)) {
            return false;
        }
        if (!Objects.equals(this.autores, other.autores)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Revista{" + "tituloRevista=" + tituloRevista + ", idRevista=" + idRevista + ", autores=" + autores + '}';
    }

    @Override
    public int compareTo(Documento o) {
        return this.compareTo(o);
    }

    @Override
    public int compare(Documento o1, Documento o2) {
        return this.compare(o1, o2);
    }
    
    
}
