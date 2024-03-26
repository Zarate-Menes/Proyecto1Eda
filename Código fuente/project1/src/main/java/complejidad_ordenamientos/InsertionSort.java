package complejidad_ordenamientos;

public class InsertionSort{
    private static int INSERCIONES=0, INTERCAMBIOS=0, COMPARACIONES=0;

    public static void insertionSort(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int index = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > index) {
                COMPARACIONES++; // Se incrementa el contador de comparaciones
                arreglo[j + 1] = arreglo[j];
                INTERCAMBIOS++; // Se incrementa el contador de intercambios
                j = j - 1;
            }
            INSERCIONES++; // Se incrementa el contador de inserciones
            arreglo[j + 1] = index;
        }
    }



    public static void imprimirContadores() {
        System.out.println("El número de operaciones es: "+ (INSERCIONES + INTERCAMBIOS + COMPARACIONES));
        INSERCIONES=0;
        INTERCAMBIOS=0;
        COMPARACIONES=0;
    }
}