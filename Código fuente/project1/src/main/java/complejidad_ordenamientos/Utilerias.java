//Autor: Zarate Menes Quetzalli
//Fecha de última modificación: 19/03/2024
//Propósito del archivo: 
//

package complejidad_ordenamientos;

import java.util.Random;
import java.util.Scanner;

public class Utilerias {
    ///////////////////////////////
    /// UTILIDADES PARA MENU////////
    ///////////////////////////////
    // Menu Principal
    public static void menu() {

        Scanner scanner = new Scanner(System.in);

        boolean condicional = true;
        int opcion;

        while (condicional == true) {
            System.out.println(
                    "\nLos tamaños de arreglo sugerido son los siguientes: \n\t\t50\n\t\t100\n\t\t500\n\t\t800\n\t\t1,000\n\t\t2,000\n\t\t5,000\n\t\t10,000"
                            + "\n¿Que tamaño de arreglo te gustaría probar?\t");
            int size = scanner.nextInt();

            int[] ArregloDesordenado = Utilerias.llenarArregloConAleatorios(size);

            int[] ArregloAOrdenar = new int[ArregloDesordenado.length];
            System.out.println("\nEl arreglo original es:");
            Utilerias.printArray(ArregloDesordenado);

            do {
                // Introducción
                System.out.println("\n------- Proyecto 1------");
                // Menu Principal
                System.out.println("------ Menu Principal-------");
                System.out.println(" 1.- INSERTIONSORT ");
                System.out.println(" 2.- SELECTIONSORT");
                System.out.println(" 3.- HEAPSORT");
                System.out.println(" 4.- BUBLESORT ");
                System.out.println(" 5.- QUICKSORT");
                System.out.println(" 6.- MERGESORT ");
                System.out.println(" 7.- COUNTINGSORT");
                int key = scanner.nextInt();

                switch (key) {
                    case 1:
                        // Prueba 1er algoritmo
                        System.arraycopy(ArregloDesordenado, 0, ArregloAOrdenar, 0, ArregloDesordenado.length);
                        System.out.println("\n***ORDENAMIENTO CON InsertionSort***");
                        InsertionSort.insertionSort(ArregloAOrdenar);
                        System.out.println("Lista ordenada:");
                        Utilerias.printArray(ArregloAOrdenar);
                        break;

                    case 2:
                        // Prueba 2do algoritmo
                        System.arraycopy(ArregloDesordenado, 0, ArregloAOrdenar, 0, ArregloDesordenado.length);
                        System.out.println("\n***ORDENAMIENTO CON SelectionSort***");

                        System.out.println("Lista ordenada:");
                        Utilerias.printArray(ArregloAOrdenar);
                        break;

                    case 3:
                        // Prueba 3er algoritmo
                        System.arraycopy(ArregloDesordenado, 0, ArregloAOrdenar, 0, ArregloDesordenado.length);
                        System.out.println("\n***ORDENAMIENTO CON Heapsort***");
                        HeapSort.heapSortASC(ArregloAOrdenar);
                        System.out.println("\nLista ordenada:");
                        Utilerias.printArray(ArregloAOrdenar);
                        break;

                    case 4:
                        // Prueba 4to algoritmo
                        System.arraycopy(ArregloDesordenado, 0, ArregloAOrdenar, 0, ArregloDesordenado.length);
                        System.out.println("\n***ORDENAMIENTO CON BubbleSort***");

                        System.out.println("Lista ordenada:");
                        Utilerias.printArray(ArregloAOrdenar);
                        break;

                    case 5:
                        // Prueba 5to algoritmo
                        System.arraycopy(ArregloDesordenado, 0, ArregloAOrdenar, 0, ArregloDesordenado.length);
                        System.out.println("\n***ORDENAMIENTO CON Quicksort***");

                        System.out.println("Lista ordenada:");
                        Utilerias.printArray(ArregloAOrdenar);
                        break;

                    case 6:
                        // Prueba 6to algoritmo
                        System.arraycopy(ArregloDesordenado, 0, ArregloAOrdenar, 0, ArregloDesordenado.length);
                        System.out.println("\n***ORDENAMIENTO CON MergeSort***");
                        MergeSort.mergeSort(ArregloAOrdenar, 0, size - 1);
                        System.out.println("Lista ordenada:");
                        Utilerias.printArray(ArregloAOrdenar);
                        break;

                    case 7:
                        // Prueba 7mo algoritmo OPCIONAL
                        System.arraycopy(ArregloDesordenado, 0, ArregloAOrdenar, 0, ArregloDesordenado.length);
                        System.out.println("\n***ORDENAMIENTO CON CountingSort***");
                        CountingSort.countingSort(ArregloAOrdenar, size);
                        System.out.println("Lista ordenada:");
                        Utilerias.printArray(ArregloAOrdenar);
                        break;

                    default:
                        System.out.println("Opcion no reconocida, inserta una opción valida");
                        break;
                }

                System.out.println("\n¿Quieres volver a repetir con otro método? \n\t1)SI \t2)NO");
                opcion = scanner.nextInt();
            } while (opcion == 1);

            System.out.println("\n¿Quieres volver a repetir con otro tamaño de arreglo? \n\t1)SI \t2)NO");
            int decision = scanner.nextInt();
            if (decision == 2) {
                condicional = false;
                System.out.println("Hasta luego");
            }
        }
        scanner.close();
    }

    // Submenu
    public static void submenu() {
        // Submenu
        System.out.println("------ Menu -------\n");
        System.out.println(" 1.- Llenar Arreglo \n");
        System.out.println(" 2.- Mostrar Arreglo (Original y Ordenado)\n");
        System.out.println(" 3.- Ordenar \n");
        System.out.println(" 4.- Salir \n");
    }

    ///////////////////////////////
    /// UTILIDADES PARA ARREGLOS////
    ///////////////////////////////

    // Imprimir arreglo de enteros
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Imprimir sub-arreglo
    public static void printSubArray(int[] arr, int low, int high) {
        System.out.print("Sub array : ");
        for (int i = low; i <= high; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Intercambio
    public static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    /////////////////////////////////////
    /// UTILIDADES PARA LLENAR ARREGLO////
    /////////////////////////////////////

    // LLenado Random
    public static int[] llenarArregloConAleatorios(int n) {
        Random rand = new Random();
        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            // Genera un número aleatorio entre 1000 y 9999 (4 dígitos)
            arreglo[i] = 1000 + rand.nextInt(9000);
        }
        return arreglo;
    }

    // Si se deasea iniciar un arreglo manualmente, creo que es mejor establecer un
    // arreglo en el Main.java y solo modificarlo como variable.
    // // LLenado de arreglo por usuario
    // public static int[] arrUsInt(int k){
    // int L[] = new int [k];
    // Scanner numero=new Scanner(System.in);
    // int e;
    // for(int i=0; i<k; i++){
    // System.out.print("Dame el número en posición "+i+" :");
    // e=numero.nextInt();
    // L[i]=e;
    // }
    // printArray(L);
    // numero.close();
    // return L;
    // }

    ///////////////////////////////////////////
    /// UTILIDADES PARA ANALISIS COMPLEJIDAD////
    ///////////////////////////////////////////
    // Imprimir Resultados
    public static void printResult(int iteraciones, int cambios, int comparaciones) {
        System.out.println(" \n ----- Resultados -----");
        System.out.print(" ");
        System.out.println(" \n* Iteraciones realizadas: " + iteraciones);
        System.out.println(" \n* Cambios de elementos realizados: " + cambios);
        System.out.println(" \n*Comparaciones realizadas: " + comparaciones);
    }
}
