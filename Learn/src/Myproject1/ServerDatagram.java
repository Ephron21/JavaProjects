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
public class ServerDatagram{
public static void main (String[] args) {
try {
DatagramSocket socket = new DatagramSocket (1234);
DatagramPacket packet;
byte[] buf = new byte[256];
packet = new DatagramPacket (buf, buf.length);
socket.receive (packet);
String received = new String (packet.getData());
System.out.println ("Hello " + received);
}
catch (IOException e) {
e.printStackTrace(); } 
}
}
