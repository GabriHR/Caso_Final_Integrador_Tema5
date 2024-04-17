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

    private int partition(int[] arr, int low, int high, boolean ascendente) {
        int pivotIndex = medianOfThree(arr, low, high);
        int pivotValue = arr[pivotIndex];
        swap(arr, pivotIndex, high);
        int storeIndex = low;
        for (int i = low; i < high; i++) {
            if (ascendente ? arr[i] < pivotValue : arr[i] > pivotValue) {
                swap(arr, i, storeIndex);
                storeIndex++;
                printArrayWithDelay(arr);
            }
        }
        swap(arr, storeIndex, high);
        printArrayWithDelay(arr);
        return storeIndex;
    }

}