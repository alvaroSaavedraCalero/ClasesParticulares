
package ejerciciosFinales.ejercicioInicio;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class EjercicioInicio {
    
    /*
    Crea varias clases con sus respectivos parametros:
        -Documento: String titulo, Integer id (clase abstracta para que Articulo y Revista hereden de ella).
        -Autor: String nombre, Integer edad, Coleccion de Articulos (meda igual la coleccion que useis).
        -Articulo: String tituloArticulo, StringBuilder texto, Integer idArticulo, Autor autorEscrito.
        -Revista: String tituloRevista, Integer idRevista, Coleccion de Articulos (meda igual la coleccion que useis).
        -Almacen: Coleccion de Revistas, Coleccion de autores (meda igual la coleccion que useis).
    
    Cada una de las clases con todo lo posible (composicion, equals, hashcode, compare, compareTo, toString).
    Para poder implementar el compare y el compareTo tendreis que implementar las interfaces Comparable<> y Comparator<>.
    */
    
    /*
    Crea una funcion que reciba como parametro un ArrayList de tipo generico y un dato de tipo generico.
    La funcion tiene que retornar la posicion en la que se encuentra el dato, usando un iterador.
    */
    
    public static <T> int retornaPosicionObjeto(ArrayList<T> arrayList, T dato) {
        int pos = 0;
        Iterator<T> it = arrayList.iterator();
        boolean continuar = true;
        
        while (it.hasNext() && continuar) {
            T next = it.next();
            if (next.equals(dato)) {
                continuar = false;
            } else {
                pos++;
            }
        }
        
        return pos;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);
        arrayList.add(11);
        
        System.out.println(retornaPosicionObjeto(arrayList, 9));
    }
}
