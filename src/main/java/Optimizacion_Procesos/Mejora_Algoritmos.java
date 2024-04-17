package Optimizacion_Procesos;

import java.util.Random;

public class Mejora_Algoritmos {

    private static Random rand = new Random();

    public void quickSort(int[] arr, int low, int high, boolean ascendente) {
        if (low < high) {
            if (low == 0 && high == arr.length - 1) {
                printArrayWithDelay(arr);
            }
            int pivotIndex = partition(arr, low, high, ascendente);
            quickSort(arr, low, pivotIndex - 1, ascendente);
            quickSort(arr, pivotIndex + 1, high, ascendente);
        }
    }

}