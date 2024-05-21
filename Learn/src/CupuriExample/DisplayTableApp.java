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

public class DisplayTableApp extends JFrame {
    private JPanel panel;
    private JRadioButton redButton;
    private JRadioButton greenButton;
    private JButton logoutButton;
    private JMenuBar menuBar;
    private JMenu toolsMenu;
    private JMenuItem displayItem;
    private JMenuItem closeItem;

    public DisplayTableApp() {
        setTitle("Display Table App");
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
                dispose();
                new LoginWindow();
            }
        });

        panel.add(redButton);
        panel.add(greenButton);
        panel.add(logoutButton);

        // Menu setup
        menuBar = new JMenuBar();
        toolsMenu = new JMenu("Tools");
        displayItem = new JMenuItem("Display");
        closeItem = new JMenuItem("Close");

        displayItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayStudentTable();
            }
        });

        closeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        toolsMenu.add(displayItem);
        toolsMenu.add(closeItem);
        menuBar.add(toolsMenu);
        setJMenuBar(menuBar);

        add(panel);
        setVisible(true);
    }

    private void displayStudentTable() {
        JFrame tableFrame = new JFrame("Student List");
        tableFrame.setSize(400, 300);

        String[] columnNames = {"Fname", "RegNo", "Email"};
        Object[][] data = {
                {"John Doe", "123", "john@example.com"},
                {"Jane Smith", "456", "jane@example.com"},
                {"Mike Johnson", "789", "mike@example.com"}
        };

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        tableFrame.add(scrollPane);

        tableFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new DisplayTableApp();
    }
}
