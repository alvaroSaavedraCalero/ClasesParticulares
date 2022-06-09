
package examenOrdinaria.ejercicio2;

import java.util.Objects;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class Plantilla extends Producto implements Arrays{
    private static Accesorio[] accesorios;
    private String genero;

    public Plantilla(String genero, String nombre, double precio, String marca) {
        super(nombre, precio, marca);
        this.genero = genero;
        accesorios = new Accesorio[10];
    }

    public Plantilla(String genero) {
        this.genero = genero;
        accesorios = new Accesorio[10];
    }

    public static Accesorio[] getAccesorios() {
        return accesorios;
    }

    public static void setAccesorios(Accesorio[] accesorios) {
        Plantilla.accesorios = accesorios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.genero);
        hash = 23 * hash + Objects.hashCode(accesorios);
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
        final Plantilla other = (Plantilla) obj;
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        return true;
    }

    @Override
    public boolean aniadir(Accesorio a) {
       boolean continuar = true, retorno = false;
       int i = 0;
        while (continuar && i < accesorios.length) {            
            if (accesorios[i] == null) {
                accesorios[i] = a;
                retorno = true;
                continuar = false;
            }
            i++;
        }
        return retorno;
    }

    @Override
    public boolean quitar(Accesorio a) {
        boolean continuar = true, retorno = false;
       int i = 0;
        while (continuar && i < accesorios.length) {            
            if (accesorios[i] == a) {
                accesorios[i] = null;
                retorno = true;
                continuar = false;
            }
            i++;
        }
        return retorno;
    }

    @Override
    public String toString() {
        return "Plantilla{" + "genero=" + genero + '}';
    }
    
    
}
