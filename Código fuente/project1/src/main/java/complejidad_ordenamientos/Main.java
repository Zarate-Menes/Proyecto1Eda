package complejidad_ordenamientos;

//import java.util.Scanner;
//import java.util.LinkedList;
//import java.util.List;
import java.util.Random;

public class Main{
	
	public static void main(String[] args){

        int[] elementos = new int[20];
        Random num = new Random();

        for (int i = 0; i < elementos.length; i++) {
                elementos[i] = num.nextInt(50)+1;
        }

            System.out.println("Los elementos del arreglo son: ");
            for(int i = 0; i < elementos.length; i++){
                System.out.print(elementos[i] + " ");
            }

            InsertionSort.insertionSort(elementos);
            System.out.println("Lista ordenada:");
            InsertionSort.imprimirArreglo(elementos);
            System.out.println("*****************************");
        
	}
}