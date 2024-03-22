package complejidad_ordenamientos;

public class QuickSort{
    private static int INSERCIONES=0, INTERCAMBIOS=0, COMPARACIONES=0;
    

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) { 
            if (arr[j] <= pivot) {
                i++;
                Utilerias.swap(arr, i, j);
                INTERCAMBIOS++; 
                COMPARACIONES++;
            }
        }
        Utilerias.swap(arr, i + 1, high);
        INSERCIONES++; 
        return (i + 1);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            if (low < pi - 1) { 
                quickSort(arr, low, pi - 1);
            }
            if (pi + 1 < high) { 
                quickSort(arr, pi + 1, high);
            }
        }
    }

    public static void imprimirContadores() {
        System.out.println("El número de operaciones es: "+ (INSERCIONES + INTERCAMBIOS + COMPARACIONES));
        INSERCIONES=0;
        INTERCAMBIOS=0;
        COMPARACIONES=0;
    }
}