//Autor: Zarate Menes Quetzalli
//Fecha de última modificación: 19/03/2024
//Propósito del archivo: Evaluar la complejidad del algoritmo MergeSort, mediante la suma de inserciones 
//y comparaciones hechas en el código 

package complejidad_ordenamientos;

public class MergeSort {
    public static int INSERCIONES, COMPARACIONES;
    public static void mergeSort(int[] list, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergeSort(list, first, mid);
            mergeSort(list, mid + 1, last);
            merge(list, first, mid, last);
        }
    }

    public static void merge(int[] list, int first, int mid, int last) {
        int[] list2 = new int[last - first + 1];
        int i = first;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= last) {
            COMPARACIONES++;
            if (list[i] < list[j]) {
                list2[k++] = list[i++];
            } else {
                list2[k++] = list[j++];
            }
            INSERCIONES++;
        }

        while (i <= mid) {
            list2[k++] = list[i++];
            INSERCIONES++;
        }

        while (j <= last) {
            list2[k++] = list[j++];
            INSERCIONES++;
        }

        for (i = last; i >= first; i--) {
            list[i] = list2[--k];
            INSERCIONES++;
        }
}

public static void imprimirContadores(){
    System.out.println("El número de operaciones es: " + ( COMPARACIONES + INSERCIONES));
        INSERCIONES=0;
        COMPARACIONES=0;
}

public static int retornarContadores(){
    return(COMPARACIONES + INSERCIONES);
}

}



