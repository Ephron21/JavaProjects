/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketProgramming;

/**
 *
 * @author Esron
 */
    

import java.io.*;
import java.net.Socket;

public class ClientPro {
    public static void main(String[] args) {

       try{
           System.out.println("Client Side Started!");
           Socket soc = new Socket("localhost", 9806);
           
           
           BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
           // System.in gets bytes from keyboard
           // Input stream reader converts bytes into sequences of characters
           // BufferedReader converts the sequence into the one string
           String str  = userInput.readLine();
           //readLine method allows the user to enter from the keyboard
           PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
           //Print Writer is a getway to send your data to a target server. note that you have not specified the data yet!
           // you have to put autoFlush parameter to true for data be automatically sent
           // if you did not use autFlush you have to write (out.flush()) method in our scenario
           out.println(str); // not the request has been sent

           // reading the response section

           BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
           System.out.println(in.readLine());


       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
