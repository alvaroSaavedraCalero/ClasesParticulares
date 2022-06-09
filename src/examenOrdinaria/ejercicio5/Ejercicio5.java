
package examenOrdinaria.ejercicio5;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class Ejercicio5 {
    public static int decimalAOctal(int decimal) {
        String octal = "";
        String caracteresOctal = "01234567";
        
        while (decimal > 0) {            
            int resto = decimal % 8;
            octal = caracteresOctal.charAt(resto) + octal;
            decimal /= 8;
        }
        return Integer.parseInt(octal);
    }
}
