/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CupuriExample;

/**
 *
 * @author Esron
 */
import java.io.*;
import java.net.*;
import javax.swing.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.50.12", 6345);
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            float number1 = Float.parseFloat(JOptionPane.showInputDialog("Enter first number:"));
            float number2 = Float.parseFloat(JOptionPane.showInputDialog("Enter second number:"));

            dos.writeFloat(number1);
            dos.writeFloat(number2);

            String result = dis.readUTF();
            JOptionPane.showMessageDialog(null, "Result: " + result);

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

