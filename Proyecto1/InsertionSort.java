
public class InsertionSort{

	public static void imprimirArreglo(int[] arreglo) {
        for (int var : arreglo) {
            System.out.print(var + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arreglo) {
        //contadores
        int comparaciones = 0;
        int swaps = 0;
        int inserciones = 0;

        for (int i = 1; i < arreglo.length; i++) {
            int index = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > index) {
                comparaciones++; // Se incrementa el contador de comparaciones
                arreglo[j + 1] = arreglo[j];
                swaps++; // Se incrementa el contador de intercambios
                j = j - 1;
            }
            inserciones++; // Se incrementa el contador de inserciones
            arreglo[j + 1] = index;
        }

        System.out.println("\nComparaciones: " + comparaciones);
        System.out.println("Intercambios: " + swaps);
        System.out.println("Inserciones: " + inserciones);
    }
}