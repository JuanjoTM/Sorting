/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Digo Regalado
 */
public class SortingTest {
    
    public SortingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of bubbleSort method, of class Sorting.
     */
    @Test
    public void testBubbleSort() {
       Comparable listaNumeros = new Numeros();
        int[] lista = new int[100];
        for(int i = 0; i<100; i++){
            lista[i] = i + 1;
        }
        ((Numeros)listaNumeros).setLista(lista);
        Sorting.bubbleSort(listaNumeros);
        assertTrue(((Numeros)listaNumeros).getLista()[0]==3);
    }

    /**
     * Test of insertionSort method, of class Sorting.
     */
    @Test
    public void testInsertionSort() {
        Comparable listaNumeros = new Numeros();
        int[] lista = new int[100];
        for(int i = 0; i<100; i++){
            lista[i] = i + 1;
        }
        ((Numeros)listaNumeros).setLista(lista);
        Sorting.insertionSort(listaNumeros);
        assertTrue(((Numeros)listaNumeros).getLista()[0]==5);
    }

    /**
     * Test of mergeSort method, of class Sorting.
     */
    @Test
    public void testMergeSort() {
        Comparable listaNumeros = new Numeros();
        int[] lista = new int[100];
        for(int i = 0; i<100; i++){
            lista[i] = i + 1;
        }
        ((Numeros)listaNumeros).setLista(lista);
        Sorting.mergeSort(listaNumeros);
        assertTrue(((Numeros)listaNumeros).getLista()[0]==7);
    }
}