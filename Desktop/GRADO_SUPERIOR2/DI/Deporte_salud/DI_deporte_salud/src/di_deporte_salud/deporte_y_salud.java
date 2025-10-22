package di_deporte_salud;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class deporte_y_salud extends JFrame {

    private JButton jButton1;
    private JButton jButton2;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1, jLabel2, jLabel4, jLabel6, jLabel7, jLabel8;
    private JTextField jTextField1, jTextField4, jTextField5;
    private java.awt.List list1;

    public deporte_y_salud() {
        initComponents();
        setTitle("Deporte y Salud");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        jButton1 = new JButton("Aceptar");
        jButton2 = new JButton("Borrar");
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel4 = new JLabel("Entrenamiento realizado");
        jLabel6 = new JLabel("Fecha entrenamiento");
        jLabel7 = new JLabel("Pulsaciones");
        jLabel8 = new JLabel("Tiempo entrenado (en minutos)");
        jComboBox1 = new JComboBox<>(new String[] { "SELECCIONAR", "Cardio", "Pierna", "Running", "Yoga", "Pilates", "Escalada", "Otro" });
        jTextField1 = new JTextField(10);
        jTextField4 = new JTextField(10);
        jTextField5 = new JTextField(10);
        list1 = new java.awt.List();

        try {
            ImageIcon im1 = new ImageIcon(getClass().getResource("/imagenes/heart.png"));
            Image img1 = im1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            jLabel1.setIcon(new ImageIcon(img1));

            URL url = new URL("https://www.pngplay.com/wp-content/uploads/6/Exercise-Vector-Background-PNG-Image.png");
            ImageIcon im2 = new ImageIcon(url);
            Image img2 = im2.getImage().getScaledInstance(200, 130, Image.SCALE_SMOOTH);
            jLabel2.setIcon(new ImageIcon(img2));
        } catch (Exception e) {
            e.printStackTrace();
        }

            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5);
            gbc.fill = GridBagConstraints.HORIZONTAL;

            gbc.gridx = 0; gbc.gridy = 0;
            add(jLabel4, gbc);

            gbc.gridy++;
            add(jComboBox1, gbc);

            gbc.gridy++;
            add(jLabel6, gbc);

            gbc.gridy++;
            add(jTextField1, gbc);

            gbc.gridy++;
            add(jLabel8, gbc);

            gbc.gridy++;
            add(jTextField5, gbc);

            gbc.gridy++;
            add(jLabel7, gbc);

            gbc.gridy++;
            add(jTextField4, gbc);

            gbc.gridy++;
            add(jLabel1, gbc);


        JPanel panelBotones = new JPanel(new GridLayout(1, 2, 10, 0));
        panelBotones.add(jButton1);
        panelBotones.add(jButton2);

        gbc.gridy++;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(panelBotones, gbc);

        gbc.gridx = 2; gbc.gridy = 0;
        gbc.gridheight = 10;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        add(list1, gbc);

        gbc.gridy = 10;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(jLabel2, gbc);

        jButton1.addActionListener(e -> {
            String tipo = jComboBox1.getSelectedItem().toString();
            if (!tipo.equals("SELECCIONAR")) {
                String datos = "Tipo: " + tipo
                        + ", Fecha: " + jTextField1.getText()
                        + ", Tiempo: " + jTextField5.getText()
                        + ", Pulsaciones: " + jTextField4.getText();
                list1.add(datos);
            }
        });

        jButton2.addActionListener(e -> {
            int total = list1.getItemCount();
            if (total > 0) list1.remove(total - 1);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new deporte_y_salud().setVisible(true);
        });
    }
}
