package Herramienta_Analisis_Numerico;

import java.util.ArrayList;
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

    public List<Integer> ordenarNumeros(List<Integer> numeros) {
        if (numeros.size() <= 1) {
            return numeros;
        }
        List<Integer> izquierda = new ArrayList<>();
        List<Integer> derecha = new ArrayList<>();
        int pivot = numeros.get(numeros.size() / 2);
        for (int num : numeros) {
            if (num < pivot) {
                izquierda.add(num);
            } else if (num > pivot) {
                derecha.add(num);
            }
        }
        izquierda = ordenarNumeros(izquierda);
        derecha = ordenarNumeros(derecha);
        izquierda.add(pivot);
        izquierda.addAll(derecha);
        return izquierda;
    }

}