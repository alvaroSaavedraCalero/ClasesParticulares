
package examenOrdinaria.ejercicio1;

import examenOrdinaria.ejercicio1.ArrayMult;
import java.util.Scanner;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char[][][] array = new char[3][3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.println("Introduzca una letra: ");
                    array[i][j][k] = entrada.next().charAt(0);
                }
            }
        }
        System.out.println(ArrayMult.buscaLetra(array));
    }
    
    
}
