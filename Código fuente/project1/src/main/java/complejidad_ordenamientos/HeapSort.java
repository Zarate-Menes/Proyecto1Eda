//Autor: Zarate Menes Quetzalli
//Fecha de última modificación: 19/03/2024
//Propósito del archivo: 
//

package complejidad_ordenamientos;

public class HeapSort {
    private static int heapSize;
    public static int ITERACIONES=0, INTERCAMBIOS=0, COMPARACIONES=0;
    
    public static void heapSortASC(int[] A) {
        buildHeapASC(A);
        for (int i = A.length - 1; i > 0; i--) {
            Utilerias.swap(A, 0, heapSize);
            INTERCAMBIOS++;
            ITERACIONES++;
            heapSize--;
            heapifyASC(A, 0);
        }
}

    private static void heapifyASC(int[] A, int i) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest;

        if (l <= heapSize && A[l] > A[i]){
            largest = l;
            COMPARACIONES+=2;
        }
        else
            largest = i;

        if (r <= heapSize && A[r] > A[largest]){
            largest = r;
            COMPARACIONES+=2;
        }
            
        if (largest != i) {
            Utilerias.swap(A, i, largest);
            INTERCAMBIOS++;
            heapifyASC(A, largest);
        }
    }

    private static void buildHeapASC(int[] A) {
        heapSize = A.length - 1;
        for (int i = heapSize / 2; i >= 0; i--) {
            ITERACIONES++;
            heapifyASC(A, i);
        }
    }

    public static void imprimirContadores(){
        System.out.println("El número de operaciones es: " + (INTERCAMBIOS + COMPARACIONES + ITERACIONES));
        ITERACIONES=0;
        INTERCAMBIOS=0;
        COMPARACIONES=0;
    }

}

