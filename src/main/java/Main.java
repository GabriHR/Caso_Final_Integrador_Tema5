import javax.swing.*;
import java.awt.*;


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


    }
}
