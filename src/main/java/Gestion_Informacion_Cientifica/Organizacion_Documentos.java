package Gestion_Informacion_Cientifica;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Organizacion_Documentos {

    public static void sortAndWriteLines(ArrayList<String> lines, String outputPath) throws IOException {
        Collections.sort(lines);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            for (String sortedLine : lines) {
                writer.write(sortedLine);
                writer.newLine();
            }
        }
    }

}