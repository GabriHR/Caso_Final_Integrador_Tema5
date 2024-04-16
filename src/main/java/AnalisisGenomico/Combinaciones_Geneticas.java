package AnalisisGenomico;

public class Combinaciones_Geneticas {

    public static long calcularCombinacionesRecursivo(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return calcularCombinacionesRecursivo(n - 1, k - 1) + calcularCombinacionesRecursivo(n - 1, k);
        }
    }

}