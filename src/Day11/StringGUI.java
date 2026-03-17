package Day11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StringGUI extends JFrame implements ActionListener {

    JTextField t1, t2;
    JButton caps, small, reverse, vowels, convert, words, letters, freq, begin, reset;

    StringGUI() {

        setTitle("My Frame");
        setSize(700,400);
        setLayout(null);
        getContentPane().setBackground(new Color(230,150,150));

        JLabel l1 = new JLabel("Enter the string:");
        l1.setBounds(120,80,150,25);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(250,80,250,25);
        add(t1);

        JLabel l2 = new JLabel("String in upper case:");
        l2.setBounds(120,130,150,25);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(250,130,250,25);
        add(t2);

        caps = new JButton("IN CAPS");
        small = new JButton("IN SMALL");
        reverse = new JButton("REVERSE");
        vowels = new JButton("VOWELS");
        convert = new JButton("CONVERT CASE");
        words = new JButton("WORDS");
        letters = new JButton("LETTERS");
        freq = new JButton("FREQUENCY");
        begin = new JButton("BEGIN CAPS");
        reset = new JButton("RESET");

        JButton b[] = {caps, small, reverse, vowels, convert, words, letters, freq, begin};

        int x = 40;

        for(JButton btn : b)
        {
            btn.setBounds(x,200,110,30);
            add(btn);
            btn.addActionListener(this);
            x += 120;
        }

        reset.setBounds(300,270,100,30);
        add(reset);
        reset.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String str = t1.getText();

        if(e.getActionCommand().equals("IN CAPS"))
            t2.setText(str.toUpperCase());

        else if(e.getActionCommand().equals("IN SMALL"))
            t2.setText(str.toLowerCase());

        else if(e.getActionCommand().equals("REVERSE"))
        {
            String rev="";
            for(int i=str.length()-1;i>=0;i--)
                rev+=str.charAt(i);
            t2.setText(rev);
        }

        else if(e.getActionCommand().equals("VOWELS"))
        {
            int count=0;
            for(char c: str.toLowerCase().toCharArray())
                if("aeiou".indexOf(c)!=-1)
                    count++;
            t2.setText("Vowels = "+count);
        }

        else if(e.getActionCommand().equals("WORDS"))
        {
            String w[] = str.trim().split("\\s+");
            t2.setText("Words = "+w.length);
        }

        else if(e.getActionCommand().equals("LETTERS"))
        {
            t2.setText("Letters = "+str.length());
        }

        else if(e.getActionCommand().equals("CONVERT CASE"))
        {
            String result="";
            for(char c : str.toCharArray())
            {
                if(Character.isUpperCase(c))
                    result+=Character.toLowerCase(c);
                else
                    result+=Character.toUpperCase(c);
            }
            t2.setText(result);
        }

        else if(e.getActionCommand().equals("FREQUENCY"))
        {
            int count=0;
            char ch='a';

            for(char c:str.toLowerCase().toCharArray())
                if(c==ch)
                    count++;

            t2.setText("Frequency of 'a' = "+count);
        }

        else if(e.getActionCommand().equals("BEGIN CAPS"))
        {
            String words[]=str.split(" ");
            String res="";

            for(String w:words)
                res+=Character.toUpperCase(w.charAt(0))+w.substring(1)+" ";

            t2.setText(res);
        }

        else if(e.getActionCommand().equals("RESET"))
        {
            t1.setText("");
            t2.setText("");
        }
    }

    public static void main(String args[]) {

        new StringGUI();
    }
}