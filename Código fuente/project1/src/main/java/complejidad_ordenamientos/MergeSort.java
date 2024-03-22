//Autor: Zarate Menes Quetzalli
//Fecha de última modificación: 19/03/2024
//Propósito del archivo: 
//

package complejidad_ordenamientos;

public class MergeSort {
    public static int INSERCIONES, INTERCAMBIOS, COMPARACIONES;
    public static void mergeSort(int[] list, int first, int last) {
        if (first < last) {
            COMPARACIONES++;
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
            COMPARACIONES=+2;
            if (list[i] < list[j]) {
                COMPARACIONES++;
                INSERCIONES++;
                list2[k++] = list[i++];
            } else {
                list2[k++] = list[j++];
                COMPARACIONES++;
                INSERCIONES++;
            }
        }

        while (i <= mid) {
            list2[k++] = list[i++];
            COMPARACIONES++;
            INSERCIONES++;
        }

        while (j <= last) {
            list2[k++] = list[j++];
            COMPARACIONES++;
            INSERCIONES++;
        }

        for (i = last; i >= first; i--) {
            list[i] = list2[--k];
            INSERCIONES++;
        }
}

public static void imprimirContadores(){
    System.out.println("El número de operaciones es: " + (INTERCAMBIOS + COMPARACIONES + INSERCIONES));
        INSERCIONES=0;
        INTERCAMBIOS=0;
        COMPARACIONES=0;
}

}



