import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;

public class ConversorMonedasGUI implements ActionListener {
    private final JTextField cantidadTextField;
    private final JComboBox<String> monedaComboBoxDestino;
    private final JComboBox<String> monedaComboBoxOrigen;

    public ConversorMonedasGUI() {
        // Crear la interfaz gráfica
        JFrame frame = new JFrame("Conversor de monedas");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel cantidadLabel = new JLabel("Cantidad:");
        cantidadLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        cantidadTextField = new JTextField();
        cantidadTextField.setMaximumSize(new Dimension(300, 20));

        JLabel tituloLabel = new JLabel("Conversor de divisas ");
        tituloLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel monedaLabelOrigen = new JLabel("Moneda  Origen:");
        monedaLabelOrigen.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel monedaLabelDestino = new JLabel("Moneda Destino:");
        monedaLabelDestino.setAlignmentX(Component.CENTER_ALIGNMENT);

        String[] opciones = {"CLP","USD", "EUR", "GBP", "JPY", "KRW"};
        monedaComboBoxDestino = new JComboBox<>(opciones);
        monedaComboBoxDestino.setMaximumSize(new Dimension(300, 20));

        monedaComboBoxOrigen = new JComboBox<>(opciones);
        monedaComboBoxOrigen.setMaximumSize(new Dimension(300, 20));

        JButton convertirButton = new JButton("Convertir");
        convertirButton.addActionListener(this);
        convertirButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(tituloLabel);
        panel.add(Box.createVerticalStrut(20));
        panel.add(monedaLabelOrigen);
        panel.add(monedaComboBoxOrigen);
        panel.add(Box.createVerticalStrut(20));
        panel.add(cantidadLabel);
        panel.add(cantidadTextField);
        panel.add(Box.createVerticalStrut(10));
        panel.add(monedaLabelDestino);
        panel.add(monedaComboBoxDestino);
        panel.add(Box.createVerticalStrut(20));
        panel.add(convertirButton);
        frame.add(panel);
        frame.setSize(300,300);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String monedaDestino = (String) monedaComboBoxDestino.getSelectedItem();
        String monedaOrigen = (String) monedaComboBoxOrigen.getSelectedItem();
        double cantidad = Double.parseDouble(cantidadTextField.getText());


        ConversorMonedas conversor = ConversorMonedas.crearConversor(monedaOrigen,monedaDestino);

        double resultado;
        resultado = conversor.convertir(cantidad);

        assert monedaOrigen != null;
        String formato = obtenerFormatoMoneda(monedaDestino);
        String resultadoFormateado = String.format(formato, resultado);

        JOptionPane.showMessageDialog(null, "Resultado: " + resultadoFormateado);
    }

    private String obtenerFormatoMoneda(String moneda) {
        switch (moneda) {
            case "USD":
                return "$%,.2f";
            case "EUR":
                return "€%,.2f";
            case "GBP":
                return "£%,.2f";
            case "JPY":
                return "¥%,.0f";
            case "KRW":
                return "₩%,.0f";
            default:
                return "%.2f";
        }
    }

}
