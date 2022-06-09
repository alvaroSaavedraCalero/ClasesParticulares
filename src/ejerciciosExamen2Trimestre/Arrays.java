package ejerciciosExamen2Trimestre;

import java.util.Scanner;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class Arrays {

    private static final Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        inicializador();
    }

    public static int retornaNumero(String numero) {
        int numeroRetorno = 0;
        boolean continuar = true;
        while (continuar) {
            try {
                numeroRetorno = Integer.parseInt(numero);
                continuar = false;
            } catch (NumberFormatException error) {
                System.out.println("No ha escrito un numero, vuelva a intentarlo.");
            } catch (Exception error) {
                System.out.println("Ha ocurrido un error inesperado. El tipo de error es:");
                System.out.println(error.getMessage());
            }
        }
        return numeroRetorno;
    }

    public static void principal() {
    }

    /**
     * Metodo para asignar valores a un array de carcateres.
     *
     * @return El array de caracteres con valores asignados.
     */
    public static char[] inicializador() {
        System.out.println("¿Cuantas posiciones tendra el array?");
        int posiciones = retornaNumero(entrada.nextLine());
        char[] retornoCharacters = new char[posiciones];
        for (int i = 0; i < retornoCharacters.length; i++) {
            System.out.println("Escriba un caracter para la posicion " + i + " de su array.");
            System.out.println("Si escribe mas de un craacter, solo se seleccionara el primero");
            retornoCharacters[i] = entrada.next().charAt(0);
        }
        return retornoCharacters;
    }

    public static boolean equalizador(char[] array1, char[] array2) {
        int i = 0;
        boolean continuar = true, retorno = false;
        if (array1.length != array2.length) {
            return false;
        }
        while (continuar && array1.length < i) {
            if (array1[i] == array2[i]) {
                retorno = true;
                i++;
            } else if (array1[i] != array2[i]) {
                retorno = false;
            } else {
                continuar = false;
            }
        }
        return retorno;
    }

    public static void finalizador(char[] array1, char[] array2) throws notMatchException {
        if (equalizador(array1, array2)){
            for (int i = 0; i < array1.length; i++) {
                System.out.println("Estamos en la posicion " + i);
                System.out.println("En esta posicion, los caracteres de los arrays son: ");
                System.out.println("Array1: " + array1[i]);
                System.out.println("Array2: " + array2[i]);
            }
        }else {
            throw new notMatchException("Los dos array no son iguales.");
        }
    }

    public static class notMatchException extends Exception{

        public notMatchException() {
        }

        public notMatchException(String message) {
            super(message);
        }

        public notMatchException(String message, Throwable cause) {
            super(message, cause);
        }

        public notMatchException(Throwable cause) {
            super(cause);
        }

        public notMatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }

        
    }
}
