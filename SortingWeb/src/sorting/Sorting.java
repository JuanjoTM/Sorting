/*Universidad del Valle de Guatemala
  Algoritmos y Estructura de Datos
  Autores:
  Juan Jose Tzun 	Carnet: 13017
  Carlos Cordero        Carnet: 13152
  Luis Tello            Carnet: 13161
  Tomas Garcia          Carnet: 13019
  Sergio Mendez         Carnet: 13452
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
    public static void insertionSort (Comparable x){
      
      for (int index = 1; index < ((Numeros)x).getSize()-1; index++)
      {
         Comparable key = ((Numeros)x).getLista()[index];
         int position = index;

         //  Shift larger values to the right
         while (position > 0 && key.compareTo(((Numeros)x).getLista()[position-1]) < 0)
         {
            ((Numeros)x).getLista()[position] = ((Numeros)x).getLista()[position-1];
            position--;
         }
            
         ((Numeros)x).getLista()[position] = (int) key;
      }
   }
   
   public static void mergeSort(Comparable x){
       int[] lista = ((Numeros)x).getLista();
       int[] temp = lista;
       int low = 0;
       int middle = (int)(lista.length/2);
       int high = lista.length;
       
       int ri = low;
       int ti = low;
       int di = middle;
       while(ti<middle && di<=high){
           if(lista[di]<temp[ti]){
               lista[ri++] = lista[di++];
           }
           else{
               lista[ri++] = temp[ti++];
           }
       }
       while(ti<middle){
           lista[ri++] = temp[ti++];
       }
       ((Numeros)x).setLista(lista);
   }
}
