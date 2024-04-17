import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import AnalisisGenomico.Conteo_Genes;
import AnalisisGenomico.Combinaciones_Geneticas;
import Gestion_Informacion_Cientifica.Gestion_Fechas;
import Gestion_Informacion_Cientifica.Organizacion_Documentos;
import Optimizacion_Procesos.Mejora_Algoritmos;
import Herramienta_Analisis_Numerico.Calculo_Potencias_Maximos;
import Herramienta_Analisis_Numerico.Sumatoria_Listado_Numeros;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame(" Sistema Interactivo de Análisis Genómico y Organización de Datos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300); // Aumentamos el tamaño del JFrame

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setLocationRelativeTo(null); // Centra la ventana en la pantalla
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel titleLabel = new JLabel("INTERFAZ DE USUARIO PARA LOS INVESTIGADORES");
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(titleLabel);

        panel.add(Box.createRigidArea(new Dimension(0, 20))); // Agrega espacio entre los componentes

        String[] options = {
                "Conteo de genes",
                "Combinaciones genéticas recursivas",
                "Combinaciones genéticas iterativas",
                "Calcular potencias y encontrar máximo",
                "Calcular sumatoria",
                "Ordenar documento (A-Z)",
                "Busqueda de palabras",
                "Agregar fecha",
                "Listar fechas",
                "Algoritmo quicksort (ascendente)",
                "Algoritmo quicksort (descendente)"
        };

        JComboBox<String> comboBox = new JComboBox<>(options);
        comboBox.setMaximumSize(comboBox.getPreferredSize()); // Para evitar que el JComboBox se estire para llenar todo el ancho del panel
        comboBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(comboBox);

        panel.add(Box.createRigidArea(new Dimension(0, 20))); // Agrega espacio entre los componentes

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // Cambiamos a FlowLayout con alineación central
        JButton confirmButton = new JButton("Confirmar");
        buttonPanel.add(confirmButton);
        JButton exitButton = new JButton("Salir");
        buttonPanel.add(exitButton);
        panel.add(buttonPanel);

        Gestion_Fechas gestionFechas = new Gestion_Fechas();
        Mejora_Algoritmos mejoraAlgoritmos = new Mejora_Algoritmos();
        Conteo_Genes conteoGenes = new Conteo_Genes();
        Combinaciones_Geneticas combinacionesGeneticas = new Combinaciones_Geneticas();

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedOption = (String) comboBox.getSelectedItem();
                switch (selectedOption) {

                    case "Conteo de genes":
                        List<String> dnas = Arrays.asList("AGTCGAGTCTAGCTAGCTAGCATG", "AGTAGTAGT", "AGTCGAGT");
                        for (int i = 0; i < dnas.size(); i++) {
                            System.out.println("Cadena de ADN " + (i + 1) + ": " + dnas.get(i));
                            int count = Conteo_Genes.countGenes(dnas.get(i), 0);
                            System.out.println("Número de genes en la cadena de ADN " + (i + 1) + ": " + count);
                        }
                        break;

                    case "Combinaciones genéticas recursivas":
                        String nString = JOptionPane.showInputDialog("Ingrese el valor de n:");
                        String kString = JOptionPane.showInputDialog("Ingrese el valor de k:");
                        int n = Integer.parseInt(nString);
                        int k = Integer.parseInt(kString);
                        long combinacionesRecursivas = combinacionesGeneticas.calcularCombinacionesRecursivo(n, k);
                        JOptionPane.showMessageDialog(null, "Las combinaciones genéticas recursivas son: " + combinacionesRecursivas);
                        break;

                    case "Combinaciones genéticas iterativas":
                        String nStringIterativo = JOptionPane.showInputDialog("Ingrese el valor de n:");
                        String kStringIterativo = JOptionPane.showInputDialog("Ingrese el valor de k:");
                        int nIterativo = Integer.parseInt(nStringIterativo);
                        int kIterativo = Integer.parseInt(kStringIterativo);
                        long combinacionesIterativas = combinacionesGeneticas.calcularCombinacionesIterativo(nIterativo, kIterativo);
                        JOptionPane.showMessageDialog(null, "Las combinaciones genéticas iterativas son: " + combinacionesIterativas);
                        break;
                }
            }
        });
    }
}
