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

public class JavaExamApplet extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Set the background color
        setBackground(Color.BLUE);
        
        // Set the color for the oval and text
        g.setColor(Color.WHITE);
        g.fillOval(50, 50, 200, 100);
        
        // Set the text color
        g.setColor(Color.CYAN);
        g.drawString("Java Exam", 120, 100);
    }

    public static void main(String[] args) {
        // Create a frame to hold the panel
        JFrame frame = new JFrame("Java Exam");
        
        // Create an instance of the panel
        JavaExamApplet applet = new JavaExamApplet();
        
        // Add the panel to the frame
        frame.add(applet);
        
        // Set the frame size and other properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}