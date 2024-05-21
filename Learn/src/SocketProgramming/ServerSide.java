/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketProgramming;

/**
 *
 * @author Esron
 */
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide{
    public static void main(String[] args) {

        try{
            System.out.println("Waiting for clients...");
            ServerSocket ss = new ServerSocket(9806);
            System.out.println("Connection established!");
            Socket soc = ss.accept();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}

