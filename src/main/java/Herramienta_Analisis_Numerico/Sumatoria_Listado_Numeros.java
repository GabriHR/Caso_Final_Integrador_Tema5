package Herramienta_Analisis_Numerico;

import java.util.ArrayList;
import java.util.List;

public class Sumatoria_Listado_Numeros {

    public int calcularSumatoria(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + calcularSumatoria(n - 1);
        }
    }

}