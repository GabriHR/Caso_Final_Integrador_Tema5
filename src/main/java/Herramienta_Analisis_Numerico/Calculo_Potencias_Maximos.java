package Herramienta_Analisis_Numerico;

import java.util.List;

public class Calculo_Potencias_Maximos {

    public int calcularPotencia(int base, int exponente) {
        int resultado = 1;
        while (exponente != 0) {
            resultado *= base;
            --exponente;
        }
        return resultado;
    }

    public int encontrarMaximo(List<Integer> numeros) {
        int maximo = numeros.get(0);
        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        return maximo;
    }
}