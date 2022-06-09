
package ejerciciosFinales.ejercicioInicio;

import java.util.Objects;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class Articulo extends Documento{
    private String tituloArticulo;
    private StringBuilder texto;
    private Integer idArticulo;
    private Autor autorEscrito;

    public Articulo(String tituloArticulo, StringBuilder texto, Integer idArticulo, Autor autorEscrito) {
        super(tituloArticulo, idArticulo);
        this.texto = texto;
        this.autorEscrito = autorEscrito;
        this.tituloArticulo = tituloArticulo;
        this.idArticulo = idArticulo;
    }

    public Articulo() {
    }

    public String getTituloArticulo() {
        return tituloArticulo;
    }

    public void setTituloArticulo(String tituloArticulo) {
        this.tituloArticulo = tituloArticulo;
    }

    public StringBuilder getTexto() {
        return texto;
    }

    public void setTexto(StringBuilder texto) {
        this.texto = texto;
    }

    public Integer getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

    public Autor getAutorEscrito() {
        return autorEscrito;
    }

    public void setAutorEscrito(Autor autorEscrito) {
        this.autorEscrito = autorEscrito;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.tituloArticulo);
        hash = 71 * hash + Objects.hashCode(this.texto);
        hash = 71 * hash + Objects.hashCode(this.idArticulo);
        hash = 71 * hash + Objects.hashCode(this.autorEscrito);
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
        final Articulo other = (Articulo) obj;
        if (!Objects.equals(this.tituloArticulo, other.tituloArticulo)) {
            return false;
        }
        if (!Objects.equals(this.texto, other.texto)) {
            return false;
        }
        if (!Objects.equals(this.idArticulo, other.idArticulo)) {
            return false;
        }
        if (!Objects.equals(this.autorEscrito, other.autorEscrito)) {
            return false;
        }
        return true;
    }
    
    @Override
    public int compareTo(Documento o) {
        return this.compareTo(o);
    }

    @Override
    public int compare(Documento o1, Documento o2) {
        return this.compare(o1, o2);
    }

    @Override
    public String toString() {
        return "Articulo{" + "tituloArticulo=" + tituloArticulo + ", texto=" + texto + ", idArticulo=" + idArticulo + ", autorEscrito=" + autorEscrito + '}';
    }

    

    
    
    
}
