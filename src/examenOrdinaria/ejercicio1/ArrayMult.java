
package examenOrdinaria.ejercicio1;

/**
 * Diseña la clase "ArrayMult" el cual tiene un metodo llamado "buscaletra", se le pasa 
 * por parametro un array de tamaño NxMxK (3 dimensiones) de tipo char y devuelve la primera letra mayuscula encontrada.
 * Se debe probar el metodo para asegurarse su funcionamiento desde una clase main 
 * y el metodo no necesita instanciarse para que se pueda utilizar.
 * 
 * @author Álvaro Saavedra Calero
 */
public class ArrayMult {
    public static char buscaLetra(char[][][] array) {
        char retorno = 0;
        int i = 0, j = 0, k = 0;
        boolean continuar = true;
        
        while (continuar && i < array.length) {            
            while (continuar && j < array[i].length) {                
                while (continuar && k < array[i][j].length) {                    
                    if (Character.isUpperCase(array[i][j][k])) {
                        retorno = array[i][j][k];
                        continuar = false;
                    }
                }
            }
        }
        return retorno;
    }
}
