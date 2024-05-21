/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaNetwork;

import java.net.URL;

/**
 *
 * @author Esron
 */
public class Myurl {
    public static void main(String args[]){
        try{
        URL u=new URL("https://www.tutorialspoint.com/java/java_networking.htm");
        System.out.println("Protocal:"+u.getProtocol());
         System.out.println("Host Name:"+u.getHost());
          System.out.println("Port Number:"+u.getPort());
           System.out.println("File Name:"+u.getFile());
           System.out.println("Default Port:"+u.getDefaultPort());
        }catch(Exception e){
        System.out.print(e);
        }
    }
    
}
