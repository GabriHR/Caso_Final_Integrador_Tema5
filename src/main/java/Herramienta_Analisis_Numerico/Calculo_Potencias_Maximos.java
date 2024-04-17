package Herramienta_Analisis_Numerico;


public class Calculo_Potencias_Maximos {

    public int calcularPotencia(int base, int exponente) {
        int resultado = 1;
        while (exponente != 0) {
            resultado *= base;
            --exponente;
        }
        return resultado;
    }


}