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

/**
 *
 * @author Esron
 */
public class LoginMySQL extends JApplet implements ActionListener{
JFrame f; JLabel L1,L2,L3; JTextField T; JPasswordField P; JButton B1,B2;
public LoginMySQL() {L3=new JLabel(""); f=new JFrame("Login Form"); L1=new JLabel("Username:"); 
L2=new JLabel("Password"); T=new JTextField(10);P=new JPasswordField(10);B1=new JButton("SignIn");
B2=new JButton("New");B1.addActionListener(this);B2.addActionListener(this);
f.add(L1);f.add(T);f.add(L2);f.add(P);f.add(B1);f.add(B2);f.add(L3);f.setVisible(true);
f.setSize(300,200);f.setLayout(new GridLayout(4,2));f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}
public static void main(String args[]){ LoginMySQL Lm=new LoginMySQL(); }
public void actionPerformed(ActionEvent ev){ if(ev.getActionCommand().equals("SignIn")){
String Uname=T.getText(); int Pass=Integer.parseInt(P.getText());
try{ Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/esron","root","Diano21@esron21%");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from Student1 where FName='"+Uname+"' and Tel='"+Pass+"'");
if(rs.next()) {new ProductWindow().setVisible(true);f.setVisible(false);}
else{ L3.setText("Wrong Username or Password!");
L3.setForeground(Color.red); }}
catch(Exception e){e.printStackTrace(); } }
else{new SignUpForm().setVisible(true);f.setVisible(false);} }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

