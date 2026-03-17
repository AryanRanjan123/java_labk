package Day10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame implements ActionListener {

    private JTextField txtFirst, txtSecond, txtResult;
    private JButton btnAdd, btnSub, btnMul, btnReset;

    public CalculatorGUI() {

        setTitle("Simple Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(5,2,10,10));

        // Labels and TextFields
        add(new JLabel("Enter First Number:"));
        txtFirst = new JTextField();
        add(txtFirst);

        add(new JLabel("Enter Second Number:"));
        txtSecond = new JTextField();
        add(txtSecond);

        add(new JLabel("Result:"));
        txtResult = new JTextField();
        txtResult.setEditable(false); // Result should not be editable
        add(txtResult);

        // Buttons
        btnAdd = new JButton("Add");
        btnSub = new JButton("Sub");
        btnMul = new JButton("Multiply");
        btnReset = new JButton("Reset");

        add(btnAdd);
        add(btnSub);
        add(btnMul);
        add(btnReset);

        // Add Action Listener
        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        btnMul.addActionListener(this);
        btnReset.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try {
            double num1 = Double.parseDouble(txtFirst.getText());
            double num2 = Double.parseDouble(txtSecond.getText());
            double result = 0;

            if(e.getSource() == btnAdd) {
                result = num1 + num2;
            }
            else if(e.getSource() == btnSub) {
                result = num1 - num2;
            }
            else if(e.getSource() == btnMul) {
                result = num1 * num2;
            }
            else if(e.getSource() == btnReset) {
                txtFirst.setText("");
                txtSecond.setText("");
                txtResult.setText("");
                return;
            }

            txtResult.setText(String.valueOf(result));

        } catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
