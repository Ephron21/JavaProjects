/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketProgramming;

/**
 *
 * @author Esron
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerPro {
    public static void main(String[] args) {

        try{
            System.out.println("Waiting for clients...");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("Connection established!");
            BufferedReader in = new BufferedReader( new InputStreamReader(soc.getInputStream()));
            //notice that now we are getting bytes from sockets
            String str = in.readLine(); // you read input with this method
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            // notice that sockets are composed in the same way
            out.println("Server says " + str);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}