public class QuickSort{

    private int comparaciones = 0;
    private int intercambios = 0;
    private int inserciones = 0;

    public void reiniciarContadores() {
        comparaciones = 0;
        intercambios = 0;
        inserciones = 0;
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int var : arreglo) {
            System.out.print(var + " ");
        }
        System.out.println();
    }


    public void printSubArray(int[] arr, int low, int high) {
        if (low <= high) { // Asegura que el subarreglo no esté vacío
            System.out.print("Sub array: ");
            for (int i = low; i <= high; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        System.out.println("Pivote: " + pivot);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            comparaciones++; 
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
                intercambios++; 
            }
        }
        swap(arr, i + 1, high);
        inserciones++; 
        return (i + 1);
    }

    public void quickSort(int[] arr, int low, int high) {
        reiniciarContadores();
        if (low < high) {
            int pi = partition(arr, low, high);
            if (low < pi - 1) { 
                printSubArray(arr, low, pi - 1);
                quickSort(arr, low, pi - 1);
            }
            if (pi + 1 < high) { 
                printSubArray(arr, pi + 1, high);
                quickSort(arr, pi + 1, high);
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        intercambios++; 
    }

    public void imprimirContadores() {
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Intercambios: " + intercambios);
        System.out.println("Inserciones: " + inserciones);
    }

}