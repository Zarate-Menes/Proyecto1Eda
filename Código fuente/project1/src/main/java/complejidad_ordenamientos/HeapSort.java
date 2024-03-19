//Autor: Zarate Menes Quetzalli
//Fecha de última modificación: 19/03/2024
//Propósito del archivo: 
//

package complejidad_ordenamientos;

public class HeapSort {
    private static int heapSize;
    public static void heapSortASC(int[] A) {
        System.out.println("\n\t\tHas llamado a Heap Sort.\n");
        buildHeapASC(A);
        for (int i = A.length - 1; i > 0; i--) {
            Utilerias.swap(A, 0, heapSize);
            heapSize--;
            System.out.println("Iteracion HS: ");
            Utilerias.printArray(A);
            heapifyASC(A, 0);
        }
    }

    private static void heapifyASC(int[] A, int i) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest;

        if (l <= heapSize && A[l] > A[i])
            largest = l;
        else
            largest = i;

        if (r <= heapSize && A[r] > A[largest])
            largest = r;

        if (largest != i) {
            Utilerias.swap(A, i, largest);
            Utilerias.printArray(A);
            heapifyASC(A, largest);
        }
    }

    private static void buildHeapASC(int[] A) {
        heapSize = A.length - 1;
        for (int i = heapSize / 2; i >= 0; i--) {
            heapifyASC(A, i);
        }
        System.out.println("Terminó de construir el HEAP");
    }

}

//------------------//
//----HeapSort-----//
//----------------//

// int heapSize;

// //Heap Sort Ascendente
// void HeapSortASC(int *A, int size)
// {
// 	printf("\n\t\tHas llamado a Heap Sort Ascendente.\n");
//     BuildHeapASC(A, size);
//     int i;
//     for (i = size - 1; i > 0; i--)
//     {
//         swap(&A[0], &A[heapSize]);
//         heapSize--;
//         printf("Iteracion HS: \n");
//         printArray(A, size);
//         HeapifyASC(A, 0, size);
//     }
// }

// void HeapifyASC(int *A, int i, int size)
// {
//     int l = 2 * i + 1;
//     int r = 2 * i + 2;
//     int largest;

//     if (l <= heapSize && A[l] > A[i])
//         largest = l;
//     else
//         largest = i;
//     if (r <= heapSize && A[r] > A[largest])
//         largest = r;
//     if (largest != i)
//     {
//         swap(&A[i], &A[largest]);
//         printArray(A, size);
//         HeapifyASC(A, largest, size);
//     }
// }

// void BuildHeapASC(int *A, int size)
// {
//     heapSize = size - 1;
//     int i;
//     for (i = (size - 1) / 2; i >= 0; i--)
//     {
//         HeapifyASC(A, i, size);
//     }
//     printf("Termin%c de construir el HEAP \n", 162);
// }