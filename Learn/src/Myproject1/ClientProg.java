/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Myproject1;

/**
 *
 * @author Esron
 */
import java.io.*;
import java.net.*;
public class ClientProg {
public static void main(String args[]){
String s1,s2; int a,b,c;
try {
ServerSocket ss=new ServerSocket(5600);
System.out.println("Server Started");
Socket s=ss.accept();
System.out.println("Client Connected");
BufferedReader br=new BufferedReader(new 
InputStreamReader(s.getInputStream()));
PrintStream ps=new PrintStream(s.getOutputStream());
s1=br.readLine();
a=Integer.parseInt(s1);
s2=br.readLine();
b=Integer.parseInt(s2);
if(a<=b) {
c=a+b;
ps.println(c); }
else{
c=a*b;
ps.println(c); } }
catch(Exception e){ e.printStackTrace();
} } }

