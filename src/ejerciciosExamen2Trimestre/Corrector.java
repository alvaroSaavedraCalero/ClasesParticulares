
package ejerciciosExamen2Trimestre;

/**
 * @author Álvaro Saavedra Calero
 */
public class Corrector {
    // Despues del punto, mayuscula
    public static StringBuilder correctorMayus(StringBuilder cadena){
        for (int i = 0; i < cadena.length()-1; i++) {
            if (cadena.charAt(i) == '.' && cadena.charAt(i+1) >= 97 && cadena.charAt(i+1) <= 122){
                cadena.setCharAt(i+1, (char) ((char)cadena.charAt(i+1)-32));
            }
        }
        return cadena;
    }
}
