/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Myproject1;

/**
 *
 * @author Esron
 */
import java.net.*; 
public class MyURL{ 
public static void main(String[] args){ 
try{ 
URL url=new URL("https://www.tutorialspoint.com/java/java_networking.htm"); 
System.out.println("Protocol: "+url.getProtocol()); 
System.out.println("Host Name: "+url.getHost()); 
System.out.println("Port Number: "+url.getPort()); 
System.out.println("File Name: "+url.getFile()); 
System.out.println("Default Port:"+url.getDefaultPort());
}
catch(Exception e){System.out.println(e);} 
} 
}