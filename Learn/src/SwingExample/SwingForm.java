/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwingExample;

/**
 *
 * @author Esron
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class SwingForm extends JFrame implements  ActionListener{
    JFrame f,f1;
    JLabel L1,L2,L3,L4;
    JTextField T1,T2,T3;
    JPasswordField p;
    JButton B1,B2;
    public SwingForm(){
        f=new JFrame("Registration Form");
        L1=new JLabel("Name");
        L2=new JLabel("Age");
        
        L3=new JLabel("UserName");
        L4=new JLabel("Password");
        T1=new JTextField(10);
        T2=new JTextField(10);
        T3=new JTextField(10);
        p=new JPasswordField(10);
        f1=new JFrame("Login");
        B1=new JButton("Send");
        B2=new JButton("Reset");
        L1.setBounds(75,35,70,19);
         f.add(L1); f.add(T1);
         f.add(L2); f.add(T2);
         
         f.add(L3); f.add(T3);
         f.add(L4); f.add(p);
         f.add(B1); f.add(B2);
        f.setLayout(new GridLayout(5,3));
        f.setSize(400,300);
        f.setVisible(true);
        f1.setVisible(false);
        f1.setSize(200,100);
        
    }
    public void actionPerformed(ActionEvent ev){
        if(ev.getSource()==B1){
            String a=T1.getText();
            String b=T2.getText();
            String c=T3.getText();
            String d=p.getText();
            
        }
        
    else{
        }
    
    }
    public static void main(String args[]){
        SwingForm m=new SwingForm();
    }
}
