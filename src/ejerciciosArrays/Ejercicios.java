package ejerciciosArrays;

import java.util.Scanner;
import java.util.Arrays;

/*
 * @author Álvaro Saavedra Calero
 */
public class Ejercicios {

    public static void main(String[] args) {
//        int [] array = new int[10];
        int[] array2 = {5, 7, 3, 8, 9, 7, 1};
//        rellenarValores(array);
//        mostrarValores(array);
        System.out.println(Arrays.toString(array2));
        System.out.println(retornaDuplicado(array2));
    }

    /*
    Crea un array de 10 posiciones de números con valores pedidos por teclado.
    Muestra por consola el indice y el valor al que corresponde. 
    Haz dos métodos, uno para rellenar valores y otro para mostrar.
     */
    public static void rellenarValores(int[] array) {
        Scanner entrada = new Scanner(System.in);
        // ucle para rellenar todos los valores
        for (int i = 0; i < array.length; i++) {
            boolean continuar = true;
            while (continuar) {
                try {
                    // Pedimos un dato(String) e INTENTAMOS transformarlo a numero
                    System.out.println("Escriba un valor numerico para la posicion " + i + " del array");
                    array[i] = Integer.parseInt(entrada.nextLine());
                    // Si es un numero, salimos del bucle y pasamos a la siguiente iteracion
                    continuar = false;
                } catch (NumberFormatException e) {
                    System.out.println("Eso no es un numero, intentelo de nuevo");
                }
            }
        }
    }

    public static void mostrarValores(int[] array) {
        // Otra forma seria: sout(Arrays.toString(array))
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        // System.out.println(Arrays.toString(array));
    }

    /*
    Realizar una funcion que elimine y otra que añada, elementos de un array
    En arrays de tipo int, no hay posiciones null, se quedan en 0.
    Es importante saberlo ya que si estamos pidiendo datos al usuario, si este quiere
    que no haya ningun dato, se quedara como 0
     */
    public static void eliminarDato(int[] array, int dato) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == dato) {
                array[i] = 0;
            }
        }
        System.out.println("El nuevo array es: " + Arrays.toString(array));
    }

    public static void añadirDato(int[] array, int dato) {
        boolean continuar = true;
        int i = 0;
        while (continuar && i < array.length) {
            if (array[i] == 0) {
                array[i] = dato;
                continuar = false;
            }
        }
        System.out.println("El nuevo array es: " + Arrays.toString(array));
    }

    /*
    Realiza una funcion que retorne el valor que hay duplicado en el array y si 
    no hay ningun valor duplicado que retorne -1
     */
    public static int retornaDuplicado(int[] array) {
        int valor = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    valor = array[j];
                }
            }
        }
        return valor;
    }
}
