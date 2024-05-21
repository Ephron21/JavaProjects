/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketProgramming;

/**
 *
 * @author Esron
 */

import java.net.Socket;

public class ClientSide {
    public static void main(String[] args) {

       try{
           System.out.println("Client Side Started!");
           Socket soc = new Socket("localhost", 9806);
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}