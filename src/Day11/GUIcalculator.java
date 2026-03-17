package Day11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIcalculator extends JFrame implements ActionListener {

    JTextField tf;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    JButton add,sub,mul,div,mod,eq,off;

    double num1, num2, result;
    String operator;

    GUIcalculator() {

        setTitle("Calculator");
        setSize(300,300);
        setLayout(new BorderLayout());

        tf = new JTextField();
        add(tf, BorderLayout.NORTH);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(5,4));

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        add = new JButton("+");

        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        sub = new JButton("-");

        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        mul = new JButton("*");

        div = new JButton("/");
        b0 = new JButton("0");
        mod = new JButton("%");
        eq = new JButton("=");

        off = new JButton("OFF");

        JButton buttons[] = {b1,b2,b3,add,b4,b5,b6,sub,b7,b8,b9,mul,div,b0,mod,eq};

        for(JButton b : buttons)
        {
            p.add(b);
            b.addActionListener(this);
        }

        add(p, BorderLayout.CENTER);

        off.addActionListener(this);
        add(off, BorderLayout.SOUTH);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();

        if(s.matches("[0-9]"))
        {
            tf.setText(tf.getText()+s);
        }

        else if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("%"))
        {
            num1 = Double.parseDouble(tf.getText());
            operator = s;
            tf.setText("");
        }

        else if(s.equals("="))
        {
            num2 = Double.parseDouble(tf.getText());

            switch(operator)
            {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
                case "%": result = num1 % num2; break;
            }

            tf.setText(String.valueOf(result));
        }

        else if(s.equals("OFF"))
        {
            System.exit(0);
        }
    }

    public static void main(String args[])
    {
        new GUIcalculator();
    }
}