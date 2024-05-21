/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Myproject1;

/**
 *
 * @author Esron
 */
import javax.swing.*;import java.awt.*;import java.awt.event.*;
public class ProductWindow extends JApplet implements ActionListener{ 
JFrame F;JLabel L1; JTextField T1,T2;JButton B1,B2;
public ProductWindow() { F=new JFrame("Product Window"); L1=new JLabel("");
T1=new JTextField(15);T1.setText("Enter Number1:"); T2=new JTextField(15);
T2.setText("Enter Number2:"); B1=new JButton("Product"); B2=new 
JButton("Logout");
B1.addActionListener(this);B2.addActionListener(this);F.add(L1);F.add(T1);F.add(T2);
F.add(B1);F.add(B2); F.setVisible(true);F.setSize(300,400);F.setLayout(new 
GridLayout(5,1));
F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent
e){if(e.getActionCommand().equals("Product")){
int a=Integer.parseInt(T1.getText()); int b=Integer.parseInt(T2.getText());
int c=a*b; L1.setText("Product="+c);L1.setForeground(Color.blue);
}
else{new LoginMySQL().setVisible(true); F.setVisible(false); } }
public static void main(String args[]){ProductWindow pw=new ProductWindow();
} }

