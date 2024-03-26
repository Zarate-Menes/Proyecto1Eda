//Autor: Zarate Menes Quetzalli
//Fecha de última modificación: 19/03/2024
//Propósito del archivo:Evaluar la complejidad del algoritmo CoutingSort, mediante la suma de iteraciones
//e inserciones hechas en el código 

package complejidad_ordenamientos;

public class CountingSort {
    public static int INSERCIONES, ITERACIONES, COMPARACIONES;

    public static void countingSort(int[] A, int n) {
        INSERCIONES=ITERACIONES=COMPARACIONES=0;
        int max = findMax(A, n); // Encontrar el valor máximo en el arreglo
        int[] count = new int[max + 1]; // Crear un arreglo de conteo para almacenar la frecuencia de cada dígito
        
        // Inicializar el arreglo de conteo
        for (int i = 0; i < count.length; i++) {
            ITERACIONES++;
            count[i] = 0;
        }
        
        // Contar la frecuencia de cada dígito
        for (int i = 0; i < n; i++) {
            count[A[i]]++;
            ITERACIONES++;
        }
        
        // Reemplazar los elementos del arreglo original con la frecuencia de cada dígito
        int i = 0;
        for (int j = 0; j < count.length; j++) {
            ITERACIONES++;
            while (count[j] > 0) {
                A[i++] = j;
                count[j]--;
                INSERCIONES++;
            }
        }
    }

    // Función para encontrar el valor máximo en el arreglo
    public static int findMax(int[] A, int n) {
        int max = A[0];
        for (int i = 1; i < n; i++) {
            COMPARACIONES++;
            if (A[i] > max) {
                max = A[i];
                INSERCIONES++;
            }
        }
        return max;
    }
    
    public static void imprimirContadores(){
        System.out.println("El número de operaciones es: " + (INSERCIONES + ITERACIONES + COMPARACIONES));
    }

    public static int retornarContadores(){
        return (INSERCIONES + ITERACIONES+ COMPARACIONES);
    }
}
