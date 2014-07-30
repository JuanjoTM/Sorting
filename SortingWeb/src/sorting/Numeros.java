/*Universidad del Valle de Guatemala
  Algoritmos y Estructura de Datos
  Autores:
  Juan Jose Tzun 	Carnet: 13017
  Fecha: 24/07/2014
*/

package sorting;

public class Numeros implements Comparable{
    private int[] lista;
    
    public Numeros(){
        lista = new int[100];
    }
    
    public int[] getLista(){
        return lista;
    }
    
    public void setLista(int[] lista){
        this.lista = lista;
    }
    
    public void guardarNumero(int numero, int i){
        lista[i] = numero;
    }
    
    @Override
    public int compareTo(Object o) {
        int resultado = 0;
        int repeticiones = 0;
        for(int i = 0; i<lista.length; i++){
            if(lista[i]==((Numeros)o).getLista()[i]){
                repeticiones++;
            }
        }
        if(repeticiones==2000){
            resultado = 1;
        }
        return resultado;
    }
    
    public int getSize(){
        return lista.length;
    }
}
