
package examenOrdinaria.ejercicio2;

import java.util.Objects;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class Juguete extends Plantilla{
    private String nombreJuguete;

    public Juguete(String nombreJuguete, String genero, String nombre, double precio, String marca) {
        super(genero, nombre, precio, marca);
        this.nombreJuguete = nombreJuguete;
    }

    public Juguete(String nombreJuguete, String genero) {
        super(genero);
        this.nombreJuguete = nombreJuguete;
    }

    public String getNombreJuguete() {
        return nombreJuguete;
    }

    public void setNombreJuguete(String nombreJuguete) {
        this.nombreJuguete = nombreJuguete;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.nombreJuguete);
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
        final Juguete other = (Juguete) obj;
        if (!Objects.equals(this.nombreJuguete, other.nombreJuguete)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Juguete{" + "nombreJuguete=" + nombreJuguete + '}';
    }

    
    public class Pilas {
        private String tipoPilas;

        public Pilas(String tipoPilas) {
            this.tipoPilas = tipoPilas;
        }

        public Pilas() {
        }

        public String getTipoPilas() {
            return tipoPilas;
        }

        public void setTipoPilas(String tipoPilas) {
            this.tipoPilas = tipoPilas;
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 59 * hash + Objects.hashCode(this.tipoPilas);
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
            final Pilas other = (Pilas) obj;
            if (!Objects.equals(this.tipoPilas, other.tipoPilas)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "Pilas{" + "tipoPilas=" + tipoPilas + '}';
        }
        
        
    }
}
