//Autor: Giron Escalona Erendira Nayely y Quetzalli Zarate Menes
//Fecha de última modificación: 22/03/2024
//Propósito del archivo: Integración se SelectionSort
//
package complejidad_ordenamientos;
public class SelectionSort {
    private static int comparaciones=0, intercambiamos=0, iteraciones=0;
    public static void selection(int[] arreglo) {
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {  
            iteraciones++; // Incrementamos la iteración por cada paso exterior
            int min = i;  
            for (int j = i + 1; j < n; j++) { // Recorremos desde i+1 hasta el final
                comparaciones++; // Incrementamos la comparación por cada comparación
                if (arreglo[j] < arreglo[min]) {  
                    min = j;  
                }                      
            }
            if (min != i) { // Solo intercambiamos si encontramos un nuevo mínimo
                Utilerias.swap(arreglo, i, min);
                intercambiamos++; // Incrementamos los intercambios si se hizo un swap
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