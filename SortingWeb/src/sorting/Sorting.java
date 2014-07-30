/*Universidad del Valle de Guatemala
  Algoritmos y Estructura de Datos
  Autores:
  Juan Jose Tzun 	Carnet: 13017
  Fecha: 24/07/2014
*/

package sorting;

public class Sorting {
    public static void bubbleSort(Comparable x) {
    int n = ((Numeros)x).getSize();
    for (int pass=1; pass < n; pass++) {  // count how many times
        // This next loop becomes shorter and shorter
        for (int i=0; i < n-pass; i++) {
            if (((Numeros)x).getLista()[i] > ((Numeros)x).getLista()[i+1]) {
                // exchange elements
                int temp = ((Numeros)x).getLista()[i];
                ((Numeros)x).getLista()[i] = ((Numeros)x).getLista()[i+1];
                ((Numeros)x).getLista()[i+1] = temp;
            }
        }
    }
}
}
