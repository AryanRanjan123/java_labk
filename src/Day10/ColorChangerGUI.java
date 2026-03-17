package Day10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChangerGUI extends JFrame implements ActionListener {

    private JList<String> colorList;
    private JButton changeButton;
    private JPanel panel;

    public ColorChangerGUI() {

        setTitle("Color Changer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        // Panel whose color will change
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        add(panel, BorderLayout.CENTER);

        // List Box
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        colorList = new JList<>(colors);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(colorList);
        add(scrollPane, BorderLayout.WEST);

        // Button
        changeButton = new JButton("Change Color");
        changeButton.addActionListener(this);
        add(changeButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String selectedColor = colorList.getSelectedValue();

        if (selectedColor != null) {

            switch (selectedColor) {
                case "Red":
                    panel.setBackground(Color.RED);
                    break;
                case "Green":
                    panel.setBackground(Color.GREEN);
                    break;
                case "Blue":
                    panel.setBackground(Color.BLUE);
                    break;
                case "Yellow":
                    panel.setBackground(Color.YELLOW);
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a color!");
        }
    }

    public static void main(String[] args) {
        new ColorChangerGUI();
    }
}
