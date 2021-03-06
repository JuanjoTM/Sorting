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

import java.io.*;

public class Archivo {
    //ATRIBUTOS
    private File archivo;
    private BufferedReader br;
    private FileReader fr;
    private FileWriter fw;
    private PrintWriter pw;

    //Constructor
    public Archivo(String nombre){
        archivo = new File(nombre+".txt");
        if(!archivo.exists()){
            System.out.print("No existe el archivo");
        }
        else{
            try{
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }

    //Metodo que permite leer el contenido del archivo de texto
    public int[] leerArchivo(){
        int[] contenido = new int[100];
        try{
            String Slinea;
            int i = 0;
            while((Slinea=br.readLine())!=null){
                contenido[i] = Integer.parseInt(Slinea);
                i++;
            }
            fr.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return contenido;
    }
    
    //Metodo que permite escribir en un archivo
    public void escribirArchivo(String linea){
        try{
            fw = new FileWriter(archivo, true);
            pw = new PrintWriter(fw);
            
            pw.println(linea);
            
            fw.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
