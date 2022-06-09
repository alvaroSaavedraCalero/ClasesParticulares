
package ejercicio4ComposicionExamen2Trimestre;

import java.util.Objects;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class Juguete extends Plantilla{
    private String nombreJuguete;

    // Constructores
    public Juguete(String nombreJuguete, Accesorio[] arrayAccesorios, String genero, String nombre, double precio) {
        super(arrayAccesorios, genero, nombre, precio);
        this.nombreJuguete = nombreJuguete;
    }

    public Juguete(String nombreJuguete, Accesorio[] arrayAccesorios, String genero) {
        super(arrayAccesorios, genero);
        this.nombreJuguete = nombreJuguete;
    }

    public Juguete(String nombreJuguete) {
        this.nombreJuguete = nombreJuguete;
    }

    public Juguete() {
    }

    // getter y setter
    public String getNombreJuguete() {
        return nombreJuguete;
    }

    public void setNombreJuguete(String nombreJuguete) {
        this.nombreJuguete = nombreJuguete;
    }
    
    // metodo equals
    @Override
    public boolean equals(Object obj){
        Plantilla plantilla = (Plantilla) obj;
        Juguete juguete = (Juguete) obj;
        return super.equals(plantilla) &&
                this.nombreJuguete.equals(juguete.getNombreJuguete());
    }

    // metodo toString
    @Override
    public String toString() {
        return "Juguete{" + "nombreJuguete=" + nombreJuguete + '}';
    }
    
    public class Pilas{
        private String tipoPilas;

        // Constructores
        public Pilas(String tipoPilas) {
            this.tipoPilas = tipoPilas;
        }

        public Pilas() {
        }

        // getter y setter
        public String getTipoPilas() {
            return tipoPilas;
        }

        public void setTipoPilas(String tipoPilas) {
            this.tipoPilas = tipoPilas;
        }
        
        // metodo equals
        @Override
        public boolean equals(Object obj){
            Pilas pilas = (Pilas) obj;
            return this.tipoPilas.equals(pilas.getTipoPilas());
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 67 * hash + Objects.hashCode(this.tipoPilas);
            return hash;
        }

        // metodo toString
        @Override
        public String toString() {
            return "Pilas{" + "tipoPilas=" + tipoPilas + '}';
        }
        
        
    }
    
    
}
