package complejidad_ordenamientos;

public class HeapSort {
    private int heapSize;
    public void heapSortASC(int[] A) {
        System.out.println("\n\t\tHas llamado a Heap Sort Ascendente.\n");
        buildHeapASC(A);
        for (int i = A.length - 1; i > 0; i--) {
            swap(A, 0, heapSize);
            heapSize--;
            System.out.println("Iteracion HS: ");
            printArray(A);
            heapifyASC(A, 0);
        }
    }

    private void heapifyASC(int[] A, int i) {
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
            swap(A, i, largest);
            printArray(A);
            heapifyASC(A, largest);
        }
    }

    private void buildHeapASC(int[] A) {
        heapSize = A.length - 1;
        for (int i = heapSize / 2; i >= 0; i--) {
            heapifyASC(A, i);
        }
        System.out.println("Terminó de construir el HEAP");
    }

    private void swap(int[] A, int a, int b) {
        int t = A[a];
        A[a] = A[b];
        A[b] = t;
    }

    private void printArray(int[] A) {
        for (int i : A) {
            System.out.print(i + " ");
        }
        System.out.println();
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