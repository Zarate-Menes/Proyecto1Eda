//Autor: Zarate Menes Quetzalli
//Fecha de última modificación: 19/03/2024
//Propósito del archivo: 
//

package complejidad_ordenamientos;

public class MergeSort {
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
            if (list[i] < list[j]) {
                list2[k++] = list[i++];
            } else {
                list2[k++] = list[j++];
            }
        }

        while (i <= mid) {
            list2[k++] = list[i++];
        }

        while (j <= last) {
            list2[k++] = list[j++];
        }

        for (i = last; i >= first; i--) {
            list[i] = list2[--k];
        }
}
}
