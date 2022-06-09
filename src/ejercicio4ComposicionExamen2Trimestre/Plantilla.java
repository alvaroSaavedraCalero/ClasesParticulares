package ejercicio4ComposicionExamen2Trimestre;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class Plantilla extends Producto implements Arrays {

    private Accesorio[] arrayAccesorios;
    private String genero;

    // Constructores
    public Plantilla(Accesorio[] arrayAccesorios, String genero, String nombre, double precio) {
        super(nombre, precio);
        int i = 0;
        boolean continuar = true;
        while (i < arrayAccesorios.length && continuar) {            
            if (arrayAccesorios[i] != null){
                this.arrayAccesorios[i] = new Accesorio(arrayAccesorios[i].getNombre());
            }
        }
        
        
        this.genero = genero;
    }

    public Plantilla(Accesorio[] arrayAccesorios, String genero) {
        for (int i = 0; i < this.arrayAccesorios.length; i++) {
            this.arrayAccesorios[i] = new Accesorio(arrayAccesorios[i].getNombre());
        }
        this.genero = genero;
    }

    public Plantilla() {
    }

    // getter y setter
    public Accesorio[] getArrayAccesorios() {
        Accesorio[] nuevo = new Accesorio[this.arrayAccesorios.length];
        for (int i = 0; i < nuevo.length; i++) {
            nuevo[i] = new Accesorio(arrayAccesorios[i].getNombre());
        }
        return nuevo;
    }

    public void setArrayAccesorios(Accesorio[] arrayAccesorios) {
        Accesorio[] nuevo = new Accesorio[this.arrayAccesorios.length];
        for (int i = 0; i < nuevo.length; i++) {
            nuevo[i] = new Accesorio(arrayAccesorios[i].getNombre());
        }
        this.arrayAccesorios = nuevo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object obj) {
        Producto producto = (Producto) obj;
        Plantilla plantilla = (Plantilla) obj;
        return super.equals(producto)
                && java.util.Arrays.equals(this.arrayAccesorios, plantilla.getArrayAccesorios())
                && this.genero.equals(plantilla.getGenero());
    }

    // metodo para añadir un accesorio
    @Override
    public void aniadir(Accesorio accesorio) {
        for (int i = 0; i < this.arrayAccesorios.length; i++) {
            if (this.arrayAccesorios[i] == null) {
                this.arrayAccesorios[i] = accesorio;
                System.out.println("El accesorio se añadio correctamente");
            } else if (i == this.arrayAccesorios.length) {
                System.out.println("No se ha podido añadir el accesorio por que no hay mas posiciones");
            }

        }
    }

    // metodo para quitar un accesorio
    @Override
    public void quitar(Accesorio accesorio) {
        for (int i = 0; i < this.arrayAccesorios.length; i++) {
            if (this.arrayAccesorios[i].equals(accesorio)) {
                this.arrayAccesorios[i] = null;
                System.out.println("El accesorio se elimino correctamente");
            } else if (i == this.arrayAccesorios.length) {
                System.out.println("No se ha podido quitar el accesorio o no existe");
            }
        }
    }

    @Override
    public String toString() {
        return "Plantilla{" + "arrayAccesorios=" + java.util.Arrays.toString(arrayAccesorios) + ", genero=" + genero + '}';
    }

}
