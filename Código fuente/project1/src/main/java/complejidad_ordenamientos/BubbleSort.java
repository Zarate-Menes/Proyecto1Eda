//Autor: Giron Escalona Erendira Nayely y Quetzalli Zarate Menes
//Fecha de última modificación: 23/03/2024
//Propósito del archivo: Integración se BubbleSort
//
package complejidad_ordenamientos;

public class BubbleSort {
    private static int comparaciones=0, intercambiamos=0, iteraciones=0;
    public static void bubbleSort(int[] arreglo){
        int n = arreglo.length;

        for (int i = n - 1; i > 0; i--) {
            iteraciones++; // Incrementamos la iteración por cada paso exterior
            for (int j = 0; j < i; j++) {
                comparaciones++; // Incrementamos la comparación por cada comparación
                if (arreglo[j] > arreglo[j + 1]) {
                    Utilerias.swap(arreglo, j, j + 1);
                    intercambiamos++; // Incrementamos los intercambios si se hizo un swap
                }
            }
        }
    }
    public static void imprimirContadores() {
        System.out.println("El número de operaciones es: "+ (iteraciones+ intercambiamos + comparaciones));
        iteraciones=0;
        intercambiamos=0;
        comparaciones=0;
    }
}