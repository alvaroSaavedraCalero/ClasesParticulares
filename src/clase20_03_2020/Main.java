/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase20_03_2020;

import java.util.Arrays;
import java.util.Scanner;



/**
 *
 * @author Álvaro Saavedra Calero
 */
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arrayNumeros = new int[10];

        for (int i = 0; i < arrayNumeros.length; i++) {
            boolean continuar = true;
            while (continuar) {
                try {
                    System.out.println("Introduzca un numero para la posicion " + i);
                    arrayNumeros[i] = Integer.parseInt(entrada.nextLine());
                    continuar = false;
                } catch (NumberFormatException error) {
                    System.out.println("Eso no es un numero");
                }
            }
        }
        System.out.println("Array sin ordenar: " + Arrays.toString(arrayNumeros));

        System.out.println("Array ordenado: " + Arrays.toString(CosasConArrays.ordenarArray(arrayNumeros)));
        
//        StringBuilder cadena = new StringBuilder("Hola,Adios,Ey@eye");
//        EjercicioStringBuilderExamenSegundoTrimestre.correctorMinus(cadena);
//        System.out.println(cadena);

        


    }
}
