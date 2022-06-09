package ejerciciosExamen2Trimestre;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase Analizador, ejercicio 1 Examen Segundo Trimestre:
 *
 * @author Álvaro Saavedra Calero
 */
public class Analizador {

    // Caracteres alfanumericos, minimo 1 letra Mayuscula, puede haber o no '+' al final maximo 1 vez
    // ? --> 0-1
    // * --> 0-n
    // + --> 1-n
    public static boolean analizadorCadena(String cadena) {
        Pattern patron = Pattern.compile("[a-z0-9]*[A-Z]+[+]?$");

        Matcher comprobacion = patron.matcher(cadena);
        System.out.println("El resultado del patron es: " + comprobacion.matches());

        return comprobacion.matches();

    }
}
