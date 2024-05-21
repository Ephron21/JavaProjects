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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class CheckBoxApp extends JFrame {
    private JPanel panel;
    private ArrayList<JCheckBox> checkBoxes;

    public CheckBoxApp() {
        setTitle("CheckBox App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        String[] languages = {"Java", "C++", "Python", "JavaScript", ".NET"};
        checkBoxes = new ArrayList<>();

        for (String language : languages) {
            JCheckBox checkBox = new JCheckBox(language);
            checkBox.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        System.out.println(language + " selected");
                    } else {
                        System.out.println(language + " deselected");
                    }
                }
            });
            checkBoxes.add(checkBox);
            panel.add(checkBox);
        }

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxApp();
    }
}

