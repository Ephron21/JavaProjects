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

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6345);
            System.out.println("Server started...");

            while (true) {
                Socket socket = serverSocket.accept();
                DataInputStream dis = new DataInputStream(socket.getInputStream());
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

                float number1 = dis.readFloat();
                float number2 = dis.readFloat();

                if (number1 <= number2) {
                    float product = number1 * number2;
                    dos.writeUTF("Product: " + product);
                } else {
                    float sum = number1 + number2;
                    dos.writeUTF("Sum: " + sum);
                }

                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

