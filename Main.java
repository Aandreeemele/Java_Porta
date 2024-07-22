import IMC.IMC;
import calculadora.EdadCalcular;
import calculadora.Mate;
import colegio.SegundoPrimaria;
import conversor.Grados_FC;
import conversor.longitudes;
import conversor.monedas;
import lista.ListaCompras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rockemma");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);
        frame.setLayout(new BorderLayout());

        JLabel title = new JLabel("Rockemma", JLabel.CENTER);
        frame.add(title, BorderLayout.NORTH);

        JPanel listPanel = new JPanel();
        listPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;

        Dimension buttonSize = new Dimension(50, 30);

        JButton[] buttons = new JButton[10];
        for (int i = 1; i <= 10; i++) {
            buttons[i - 1] = new JButton(String.valueOf(i));
            buttons[i - 1].setPreferredSize(buttonSize);
            gbc.gridx = (i - 1) % 2;
            gbc.gridy = (i - 1) / 2;
            listPanel.add(buttons[i - 1], gbc);

            // Action listener for each button
            final int option = i; // to be used inside the lambda expression
            buttons[i - 1].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    handleOption(option);
                }
            });
        }

        frame.add(listPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JButton checkButton = new JButton("Salir");
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Close the application
            }
        });
        buttonPanel.add(checkButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private static void handleOption(int option) {
        switch (option) {
            case 1:
                Mate.Calculadora();
                break;
            case 2:
                IMC.programaIMC();
                break;
            case 3:
                Grados_FC.gradosxd();
                break;
            case 5:
                EdadCalcular.proceso();
                break;
            case 6:
                longitudes.proceso();
                break;
            case 7:
                ListaCompras.Compra();
                break;
            case 8:
                monedas.conversor();
                break;
            case 9:
                SegundoPrimaria.programa();
                break;
            case 10:
                System.exit(0); // Close the application
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
        }
    }
}
