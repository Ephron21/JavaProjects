/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Myproject1;

/**
 *
 * @author Esron
 */
import javax.swing.*; import java.awt.*; import java.awt.event.*;
import java.net.*; import java.io.*; 
public class ClientLogin extends JApplet implements ActionListener
{
JFrame f1,f2; JLabel L1,L2,L3; JTextField T; JPasswordField P; JButton
B1,B2,B3; 
public ClientLogin(){
f1=new JFrame("Login Form"); f2=new JFrame("Welcome Window");
L1=new JLabel("Username:"); L2=new JLabel("Password");
L3=new JLabel(""); T=new JTextField(10);
P=new JPasswordField(10); B1=new JButton("Login");
B2=new JButton("Cancel"); B3=new JButton("Logout");
B1.addActionListener(this); B2.addActionListener(this);
B3.addActionListener(this); f1.add(L1); f1.add(T); f1.add(L2); f1.add(P);
f1.add(B1);f1.add(B2); f1.setVisible(true);
f1.setLayout(new GridLayout(3,2)); f1.setSize(300,250);
f2.add(L3); f2.add(B3); f2.setLayout(new GridLayout(2,1));
f2.setVisible(false); f2.setSize(500,250); }
public void actionPerformed(ActionEvent ev){
try{ if(ev.getActionCommand().equals("Login")){
String s1,s2; s1=T.getText(); s2=P.getText();
Socket s=new Socket("127.0.0.1",5577);
BufferedReader b=new BufferedReader(new InputStreamReader(s.getInputStream()));
PrintStream pp=new PrintStream(s.getOutputStream());
pp.println(s1); pp.println(s2); String op=b.readLine();
L3.setText("Welcome "+op); f1.setVisible(false); f2.setVisible(true); }
else if(ev.getActionCommand().equals("Logout")){
f1.setVisible(true); f2.setVisible(false); }
else{ System.exit(1); } }
catch(Exception ex){ ex.printStackTrace(); } }
public static void main(String args[]){
ClientProg cp=new ClientProg(); } }

