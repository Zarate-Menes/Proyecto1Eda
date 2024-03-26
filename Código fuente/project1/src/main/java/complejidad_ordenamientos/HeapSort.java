//Autor: Zarate Menes Quetzalli
//Fecha de última modificación: 24/03/2024
//Propósito del archivo: Evaluar la complejidad del algoritmo HeapSort, mediante la suma de intercambios 
//y comparaciones hechas en el código 

package complejidad_ordenamientos;

public class HeapSort {
    private static int heapSize;
    public static int INTERCAMBIOS=0, COMPARACIONES=0;
    
    public static void heapSortASC(int[] A) {
        buildHeapASC(A);
        for (int i = A.length - 1; i > 0; i--) {
            Utilerias.swap(A, 0, heapSize);
            INTERCAMBIOS++;
            heapSize--;
            heapifyASC(A, 0);
        }
}

    private static void heapifyASC(int[] A, int i) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest;
        COMPARACIONES++;
        if (l <= heapSize && A[l] > A[i]){
            largest = l;
        }
        else
            largest = i;

        if (r <= heapSize && A[r] > A[largest]){
            COMPARACIONES++;
            largest = r;
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
            heapifyASC(A, i);
        }
    }

    public static void imprimirContadores(){
        System.out.println("El número de operaciones es: " + (INTERCAMBIOS + COMPARACIONES ));
        INTERCAMBIOS=0;
        COMPARACIONES=0;
        
    }

    public static int retunContadores(){
        return (INTERCAMBIOS+COMPARACIONES);
    }

}

