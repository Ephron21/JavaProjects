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
import java.io.*;
public class ClientDatagram{
public static void main (String[] args) {
try {
DataInputStream ds=new DataInputStream(System.in);
System.out.println("Enter Name: ");
String name=ds.readLine();
DatagramSocket socket = new DatagramSocket ();
byte[] buf = new byte[256];
buf = name.getBytes ();
InetAddress address = InetAddress.getByName
("127.0.0.1");
DatagramPacket packet = new DatagramPacket (buf, 
buf.length, address, 1234);
socket.send(packet);
}
catch (IOException e) {
e.printStackTrace(); }
}
}
