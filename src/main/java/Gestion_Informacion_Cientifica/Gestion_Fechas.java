package Gestion_Informacion_Cientifica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Gestion_Fechas {

    private List<LocalDate> fechas = new ArrayList<>();

    public void agregarFecha(LocalDate fecha) {
        fechas.add(fecha);
    }

}