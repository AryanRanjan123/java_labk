package Day10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registration extends JFrame implements ActionListener {

    private JTextField nameField;
    private JTextArea addressArea;
    private JRadioButton male, female;
    private JCheckBox terms;
    private JButton submit;

    public Registration() {

        setTitle("Registration Form");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main Panel
        JPanel panel = new JPanel(new BorderLayout(10,10));
        add(panel);

        // Image (optional)
        ImageIcon icon = new ImageIcon("user.png");
        JLabel imageLabel = new JLabel(icon);
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(imageLabel, BorderLayout.NORTH);

        // Form Panel
        JPanel formPanel = new JPanel(new GridLayout(5,2,10,10));
        panel.add(formPanel, BorderLayout.CENTER);

        // Name
        formPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        formPanel.add(nameField);

        // Address
        formPanel.add(new JLabel("Address:"));
        addressArea = new JTextArea(3,20);
        JScrollPane scrollPane = new JScrollPane(addressArea);
        formPanel.add(scrollPane);

        // Gender
        formPanel.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        genderPanel.add(male);
        genderPanel.add(female);
        formPanel.add(genderPanel);

        // Terms
        formPanel.add(new JLabel("Terms:"));
        terms = new JCheckBox("Accept Terms & Conditions");
        formPanel.add(terms);

        // Submit Button
        submit = new JButton("Submit");
        submit.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submit);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(nameField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your name.");
        }
        else if(!male.isSelected() && !female.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please select gender.");
        }
        else if(!terms.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please accept terms.");
        }
        else {
            JOptionPane.showMessageDialog(this, "Registration Successful!");
        }
    }

    public static void main(String[] args) {
        new Registration();
    }
}