/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BSTExample;

/**
 *
 * @author Esron
 */
import java.awt.event.*;
public class CCPHandler implements ActionListener {
 public final static String CUT = "cut";
 public final static String COPY = "copy";
 public final static String PASTE = "paste";
 public void actionPerformed(ActionEvent e) {
 String command = e.getActionCommand( );
 if (command == CUT) { // We can do this since we're comparing constants.
 System.out.println("Got Cut event");
 }
 else if (command == COPY) {
 System.out.println("Got Copy event");
 }
 else if (command == PASTE) {
 System.out.println("Got Paste event");
 }
 }
}
