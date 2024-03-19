package complejidad_ordenamientos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean condicional=true;



        while(condicional== true){
            System.out.println("\nLos tamaños de arreglo sugerido son los siguientes: \n\t\t50\n\t\t100\n\t\t500\n\t\t800\n\t\t1,000\n\t\t2,000\n\t\t5,000\n\t\t10,000" + "\n¿Que tamaño de arreglo te gustaría probar?\t");
            int size=scanner.nextInt();

            int[] ArregloDesordenado=Utilerias.llenarArregloConAleatorios(size);

            int[] ArregloAOrdenar = new int[ArregloDesordenado.length];
            System.arraycopy(ArregloDesordenado, 0, ArregloAOrdenar, 0, ArregloDesordenado.length);
            
            //Prueba 1er algoritmo
            System.out.println("\n***ORDENAMIENTO CON InsertionSort***");
            System.out.println("\nArreglo ORIGINAL: ");
            Utilerias.printArray(ArregloDesordenado);

            System.out.println("\nLista ordenada:");
            Utilerias.printArray(ArregloAOrdenar);

            //Prueba 2do algoritmo
            System.arraycopy(ArregloDesordenado, 0, ArregloAOrdenar, 0, ArregloDesordenado.length);
            System.out.println("\n***ORDENAMIENTO CON SelectionSort***");
            System.out.println("\nArreglo ORIGINAL: ");
            Utilerias.printArray(ArregloDesordenado);

            System.out.println("\nLista ordenada:");
            Utilerias.printArray(ArregloAOrdenar);

            //Prueba 3er algoritmo
            System.arraycopy(ArregloDesordenado, 0, ArregloAOrdenar, 0, ArregloDesordenado.length);
            System.out.println("\n***ORDENAMIENTO CON Heapsort***");
            System.out.println("\nArreglo ORIGINAL: ");
            Utilerias.printArray(ArregloDesordenado);
            HeapSort.heapSortASC(ArregloAOrdenar);
            System.out.println("\nLista ordenada:");
            Utilerias.printArray(ArregloAOrdenar);

            //Prueba 4to algoritmo
            System.arraycopy(ArregloDesordenado, 0, ArregloAOrdenar, 0, ArregloDesordenado.length);
            System.out.println("\n***ORDENAMIENTO CON BubbleSort***");
            System.out.println("\nArreglo ORIGINAL: ");
            Utilerias.printArray(ArregloDesordenado);

            System.out.println("\nLista ordenada:");
            Utilerias.printArray(ArregloAOrdenar);

            //Prueba 5to algoritmo
            System.arraycopy(ArregloDesordenado, 0, ArregloAOrdenar, 0, ArregloDesordenado.length);
            System.out.println("\n***ORDENAMIENTO CON Quicksort***");
            System.out.println("\nArreglo ORIGINAL: ");
            Utilerias.printArray(ArregloDesordenado);

            System.out.println("\nLista ordenada:");
            Utilerias.printArray(ArregloAOrdenar);

            //Prueba 6to algoritmo
            System.arraycopy(ArregloDesordenado, 0, ArregloAOrdenar, 0, ArregloDesordenado.length);
            System.out.println("\n***ORDENAMIENTO CON MergeSort***");
            System.out.println("\nArreglo ORIGINAL: ");
            Utilerias.printArray(ArregloDesordenado);
            MergeSort.mergeSort(ArregloAOrdenar, 0, size-1);
            System.out.println("\nLista ordenada:");
            Utilerias.printArray(ArregloAOrdenar);

            //Prueba 7mo algoritmo OPCIONAL
            System.arraycopy(ArregloDesordenado, 0, ArregloAOrdenar, 0, ArregloDesordenado.length);
            System.out.println("\n***ORDENAMIENTO CON CountingSort***");
            System.out.println("\nArreglo ORIGINAL: ");
            Utilerias.printArray(ArregloDesordenado);
            CountingSort.countingSort(ArregloAOrdenar, size);
            System.out.println("\nLista ordenada:");
            Utilerias.printArray(ArregloAOrdenar);

            System.out.println("\n¿Quieres volver a repetir con otro tamaño de arreglo? \n\t1)SI \t2)NO");
            int decision = scanner.nextInt();
            if(decision==2){
                condicional=false;
                System.out.println("Hasta luego");
            }
                
        }

        scanner.close();
    }
}