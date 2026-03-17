package Day10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RGBColorGUI extends JFrame implements ActionListener {

    private JComboBox<Integer> comboRed, comboGreen, comboBlue;
    private JButton btnShow;
    private JPanel panel;

    public RGBColorGUI() {

        setTitle("RGB Color Changer");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10,10));

        // Panel whose color will change
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        add(panel, BorderLayout.CENTER);

        // Top Panel for controls
        JPanel controlPanel = new JPanel(new GridLayout(4,2,10,10));

        controlPanel.add(new JLabel("Red"));
        comboRed = new JComboBox<>();
        controlPanel.add(comboRed);

        controlPanel.add(new JLabel("Green"));
        comboGreen = new JComboBox<>();
        controlPanel.add(comboGreen);

        controlPanel.add(new JLabel("Blue"));
        comboBlue = new JComboBox<>();
        controlPanel.add(comboBlue);

        btnShow = new JButton("Show Output");
        btnShow.addActionListener(this);

        controlPanel.add(new JLabel()); // empty cell
        controlPanel.add(btnShow);

        add(controlPanel, BorderLayout.NORTH);

        // Fill combo boxes with 0–255
        for(int i = 0; i <= 255; i++) {
            comboRed.addItem(i);
            comboGreen.addItem(i);
            comboBlue.addItem(i);
        }

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int r = (Integer) comboRed.getSelectedItem();
        int g = (Integer) comboGreen.getSelectedItem();
        int b = (Integer) comboBlue.getSelectedItem();

        Color selectedColor = new Color(r, g, b);
        panel.setBackground(selectedColor);
    }

    public static void main(String[] args) {
        new RGBColorGUI();
    }
}
