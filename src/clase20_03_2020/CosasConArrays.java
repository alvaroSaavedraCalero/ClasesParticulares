package clase20_03_2020;

import java.util.Arrays;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class CosasConArrays {

    public static int[] ordenarArray(int[] arrayNumeros) {
        // Necesitaremos un bucle exterior que realice el intercambio de variable 
        // tantas veces como posiciones halla
        for (int j = 0; j < arrayNumeros.length; j++) {
            // Recorremos el array hasta la penultima posicion para poder 
            // acceder a la posicion "i + 1"
            for (int i = 0; i < arrayNumeros.length - 1; i++) {
                //Si la posicion actual es mayor que la siguiente
                if (arrayNumeros[i] > arrayNumeros[i + 1]) {
                    // Realizamos un cambio de variable
                    int aux = arrayNumeros[i];
                    arrayNumeros[i] = arrayNumeros[i + 1];
                    arrayNumeros[i + 1] = aux;
                }
            }
            System.out.println(Arrays.toString(arrayNumeros));
        }
        return arrayNumeros;
    }

}
