
package ejerciciosExamen2Trimestre;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class Main {
    public static void main(String[] args) {
        // System.out.println(Analizador.analizadorCadena("kjdbrYvkhb+"));
        StringBuilder cadena = new StringBuilder("Hola.adios.ey@eye");
        System.out.println(Corrector.correctorMayus(cadena));
    }
}
