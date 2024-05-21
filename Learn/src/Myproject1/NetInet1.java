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
public class NetInet1 {
public static void main(String args[]){
InetAddress in;
try{
//Using Local Host
in=InetAddress.getLocalHost();
System.out.println("HostName:"+in.getHostName());
System.out.println("HostIP:"+in.getHostAddress());
// get network info on an online computer
in=InetAddress.getByName("igihe.com");
System.out.println("HostName:"+in.getHostName());
System.out.println("HostIP:"+in.getHostAddress());
//Displaying all IP Adrresses of UR
InetAddress []inet=InetAddress.getAllByName("ur.ac.rw");
for (int i=0;i<inet.length;i++) {
System.out.println("Host IP:"+inet[i].getHostAddress()); 
System.out.println("Host Name:"+inet[i].getHostName());}
//Displaying Host Name given its IP Address
InetAddress ip=InetAddress.getByName("www.facebook.com"); 
System.out.println("Host Name: "+ip.getHostName()); 
System.out.println("IP Address: "+ip.getHostAddress()); }
catch(Exception e){
e.printStackTrace();} } }

