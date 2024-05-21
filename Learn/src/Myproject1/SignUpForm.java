/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Myproject1;

/**
 *
 * @author Esron
 */
import javax.swing.*;import java.awt.*;import java.awt.event.*;import java.sql.*;
public class SignUpForm extends JApplet implements ActionListener{ JFrame FF;
JLabel L1,L2,L3,L4,L5,L6; JTextField T1,T2,T3,T4,T5,T6; JButton B1,B2;
public SignUpForm() { FF=new JFrame("Sign Up Form"); L1=new JLabel("Fname");
L2=new JLabel("Lname");L3=new JLabel("Class");L4=new JLabel("Tel");
L5=new JLabel("Email"); L6=new JLabel("Gender"); T1=new JTextField(10);
T2=new JTextField(10);T3=new JTextField(10);T4=new JTextField(10);
T5=new JTextField(10);T6=new JTextField(10);B1=new JButton("SignUp");
B2=new JButton("Exit");B1.addActionListener(this);B2.addActionListener(this);
FF.add(L1);FF.add(T1);FF.add(L2);FF.add(T2);FF.add(L3);FF.add(T3);FF.add(L4);
FF.add(T4);FF.add(L5);FF.add(T5);FF.add(L6);FF.add(T6);FF.add(B1);FF.add(B2);
FF.setVisible(true);FF.setSize(300,400);FF.setLayout(new GridLayout(7,2));
}
public void actionPerformed(ActionEvent av){if(av.getActionCommand().equals("SignUp")){
String s1,s2,s3,s4,s5; s1=T1.getText(); s2=T2.getText();s3=T3.getText();s4=T5.getText();
s5=T6.getText(); int tel=Integer.parseInt(T4.getText());
try{Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/esron","root","Diano21@Esron21%");
PreparedStatement ps=con.prepareStatement("insert into Student1(FName,LName,Class,Tel,Email,Gender) values(?,?,?,?,?,?)"); 
ps.setString(1,s1); ps.setString(2,s2); ps.setString(3,s3); 
ps.setInt(4,tel); ps.setString(5,s4); ps.setString(6,s5); 
int i=ps.executeUpdate(); 
if(i>0){new LoginMySQL().setVisible(true); FF.setVisible(false);}
else{System.out.println("Data Not Inserted");} } catch(Exception e){e.printStackTrace();}}else{System.exit(0);}}
public static void main(String args[]){ SignUpForm sf=new SignUpForm();}}

