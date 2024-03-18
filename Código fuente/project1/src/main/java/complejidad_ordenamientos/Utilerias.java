package complejidad_ordenamientos;

import java.util.Random;
import java.util.Scanner;
public class Utilerias {
    // Menu Principal
    public static void menu(){
        // Introducción
        System.out.println("------- Proyecto 1------\n");  
        //Menu Principal
        System.out.println("------ Menu Principal-------\n"); 
        System.out.println(" 1.- INSERTIONSORT \n"); 
        System.out.println(" 2.- SELECTIONSORT\n"); 
        System.out.println(" 3.- BUBLESORT \n"); 
        System.out.println(" 4.- HEAPSORT \n"); 
        System.out.println(" 5.- COUNTINGSORT\n"); 
        System.out.println(" 6.- MERGESORT \n"); 
        System.out.println(" 7.- SHELLSORT \n"); 
        System.out.println(" 8.- COUNTINGSORT\n"); 
        System.out.println(" 9.- RADIXSORT \n"); 
        System.out.println(" 10.- Salir \n"); 
    }
    // Submenu
    public static void submenu(){
        //Submenu
        System.out.println("------ Menu -------\n"); 
        System.out.println(" 1.- Llenar Arreglo \n"); 
        System.out.println(" 2.- Mostrar Arreglo (Original y Ordenado)\n"); 
        System.out.println(" 3.- Ordenar \n"); 
        System.out.println(" 4.- Salir \n"); 
    }
    // Imprimir arreglo de enteros
    public static void printArray(int arr[]) { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
    // Imprimir Resultados
    public static void printResult(int iteraciones , int cambios, int[]arr){
        System.out.println(" ----- Resultados -----");
        System.out.print("Arreglo ordenado: ");
        printArray(arr);
        System.out.print(" ");
        System.out.println(" * Iteraciones realizadas: "+ iteraciones);
        System.out.println(" * Cambios de elementos realizados: "+ cambios);
    }
    //Enteros Random 
    public static int randomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    //LLenando random arreglo int
    public static int[] arrInt(int n){
        int arr [];
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=randomInt(1,30);
        }
        return arr;
    }
    // LLenado de arreglo por usuario
    public static int[] arrUsInt(int k){
        int L[] = new int [k]; 
        Scanner numero=new Scanner(System.in);
        int e;
        for(int i=0; i<k; i++){
            System.out.print("Dame el número en posición "+i+" :");
            e=numero.nextInt();
            L[i]=e;
        }
        printArray(L);
        numero.close();
        return L;
    }
}
