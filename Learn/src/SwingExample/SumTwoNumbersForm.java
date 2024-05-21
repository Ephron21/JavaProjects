/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwingExample;

/**
 *
 * @author Esron
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumTwoNumbersForm extends JFrame {
    private JTextField numberField1;
    private JTextField numberField2;
    private JButton submitButton;
    private JLabel resultLabel;

    public SumTwoNumbersForm() {
        setTitle("Sum Two Numbers Form");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel promptLabel1 = new JLabel("Enter first number:");
        numberField1 = new JTextField(10);

        JLabel promptLabel2 = new JLabel("Enter second number:");
        numberField2 = new JTextField(10);

        submitButton = new JButton("Submit");
        resultLabel = new JLabel();

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number1 = Integer.parseInt(numberField1.getText());
                    int number2 = Integer.parseInt(numberField2.getText());
                    int sum = number1 + number2;
                    resultLabel.setText("Sum: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input. Please enter valid integers.");
                }
            }
        });

        add(promptLabel1);
        add(numberField1);
        add(promptLabel2);
        add(numberField2);
        add(submitButton);
        add(resultLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new SumTwoNumbersForm();
    }
}
