package complejidad_ordenamientos;

public class Utilidades_HeapSort {
    public void printSubArray(int[] arr, int low, int high) {
        System.out.print("Sub array : ");
        for (int i = low; i <= high; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
    

}

// void printSubArray(int arr[], int low, int high) {
//     int i;
//     printf("Sub array :  ");
//     for (i = low; i <= high; i++)
//         printf("%d ", arr[i]);
//     printf("\n");
// }

// void swap(int* a, int* b){
//     int t = *a;
//     *a = *b;
//     *b = t;
// }