package clase20_03_2020;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class EjercicioStringBuilderExamenSegundoTrimestre {

    /*Debe cambiar a minusculas cualquier letra que este seguido de una coma y sea mayusculas
    Hola, Adios, Ey@eye --> Hola, adios, ey@eye*/
    public static StringBuilder correctorMinus(StringBuilder cadena) {
        // Recorremos la cadena hasta la penultima posicion
        for (int i = 0; i < cadena.length() - 1; i++) {
            // Si encontramso una coma y la siguiente posicion a ella es un
            // caracter en mayucula
            if (cadena.charAt(i) == ','
                    && (int) cadena.charAt(i + 1) >= 65
                    && (int) cadena.charAt(i + 1) <= 90) {
                // Guardamos el caracter en una variable
                Character caracterParaCambiar = cadena.charAt(i + 1);
                // Intercambiamos el caracter (i+1) por la minuscula
                cadena.replace(i + 1, i + 2, caracterParaCambiar.toString().toLowerCase());
                // La funcion replace tiene los siguientes parametros:
                    // 1 --> desde donde quieres intercambiar
                    // 2 --> Hasta donde quieres intercambiar +1
                    // 3 --> Lo que quieres introducir en ese espacio
            }
        }
        return cadena;
    }
}
