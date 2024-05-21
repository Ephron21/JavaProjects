/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwingExample;

/**
 *
 * @author Esron
 */


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Sum extends JFrame implements ActionListener {
    private JFrame f;
    private JLabel L1, L2, L3;
    private JTextField T1, T2;
    private JButton B;

    public Sum() {
        f = new JFrame("Calculator");
        L1 = new JLabel("Num1");
        L2 = new JLabel("Num2");
        L3 = new JLabel("");
        B = new JButton("Compute");
        T1 = new JTextField(10);
        T2 = new JTextField(10);

        f.add(L1);
        f.add(T1);
        f.add(L2);
        f.add(T2);
        f.add(L3);
        f.add(B);

        f.setLayout(new GridLayout(4, 2));
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        B.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        try {
            int a = Integer.parseInt(T1.getText());
            int b = Integer.parseInt(T2.getText());
            int s = a + b;
            L3.setText("Sum: " + s);
        } catch (NumberFormatException ex) {
            L3.setText("Invalid input. Please enter valid integers.");
        }
    }

    public static void main(String[] args) {
        new Sum();
    }
}

