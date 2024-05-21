/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CupuriExample;

/**
 *
 * @author Esron
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeApp extends JFrame {
    private JPanel panel;
    private JRadioButton redButton;
    private JRadioButton greenButton;
    private JButton logoutButton;

    public ColorChangeApp() {
        setTitle("Color Change App");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        redButton = new JRadioButton("Red Color");
        greenButton = new JRadioButton("Green Color");
        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(greenButton);

        logoutButton = new JButton("Logout");

        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.RED);
            }
        });

        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.GREEN);
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform logout and show login window
                dispose();
                new LoginWindow();
            }
        });

        panel.add(redButton);
        panel.add(greenButton);
        panel.add(logoutButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorChangeApp();
    }
}

class LoginWindow extends JFrame {
    public LoginWindow() {
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Add login components here
        setVisible(true);
    }
}

