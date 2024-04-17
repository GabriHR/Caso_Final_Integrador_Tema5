package Gestion_Informacion_Cientifica;

import java.io.*;

public class Busqueda_Eficiente_Textos {

    public boolean busquedaLineal(String rutaArchivo, String palabra) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.contains(palabra)) {
                    return true;
                }
            }
        }
        return false;
    }

}