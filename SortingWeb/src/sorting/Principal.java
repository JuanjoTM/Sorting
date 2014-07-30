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

import java.util.Random;

public class Principal{
    public static void main(String[] args){
        //Iniciando el archivo, la lista de numeros y el random
        Archivo miArchivo = new Archivo("numeros");
        Comparable listaNumeros = new Numeros();
        Random random = new Random();
        
        //Generando los numeros aleatorios y guardandolos en numeros.txt
        for(int i = 0; i<100; i++){
            int numero = random.nextInt(100);
            miArchivo.escribirArchivo(numero+"");
        }
        
        //Guardando los numeros en un el arreglo
        ((Numeros)listaNumeros).setLista(miArchivo.leerArchivo());
        
        //Ordenando los numeros
        Sorting.bubbleSort(listaNumeros);
        
        miArchivo = new Archivo("ordenados");
        //Guardando los numeros ordenados
        for(int i = 0; i<100; i++){
            int numero = ((Numeros)listaNumeros).getLista()[i];
            miArchivo.escribirArchivo(numero+"");
        }
    }
}
