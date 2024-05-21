/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwingExample;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
/**
 *
 * @author Esron
 */
public class Form21 extends JFrame implements ActionListener {
    JFrame f1;
    JFrame f2;
    JLabel L1,L2,L3,L4;
    JTextField T1,T2,T3;
    JPasswordField p;
    JButton B1, B2;
    public Form21(){//connstructor
        
        f1=new JFrame("REGISTRATION FORM");
         f2=new JFrame("Login Form");
        L1=new JLabel("FristName");
        L2=new JLabel("LastName");
        L3=new JLabel();
        L4=new JLabel("Password");
        T1 =new JTextField(15);
        T2=new JTextField(15);
        T3=new JTextField(15);
        p=new JPasswordField(15);
        B1=new JButton("Send");
        B2=new JButton("Reset");
        
        L1.setBounds(75,100,25,25);
        L2.setBounds(75,100,25,25);
        L3.setBounds(75,100,25,25);
        L4.setBounds(75,100,25,25);
        T1.setBounds(75,100,25,25);
        T2.setBounds(75,100,25,25);
        T3.setBounds(75,100,25,25);
        p.setBounds(75,100,25,25);
        B1.setBounds(75,100,25,25);
        B2.setBounds(75,100,25,25);
       
                
          
                
    f1.add(L1); f1.add(T1);
   f2.add(L2); f2.add(T2);
   f1.add(L3); f2.add(T3);
   f1.add(L4); f1.add(p);
   f1.add(B1); f1.add(B2);
    B1.addActionListener(this);
    B2.addActionListener(this);
    
    f1.setLayout(new GridLayout(4,2));
    f1.setSize(400,200);
    f1.setVisible(true);
    f1.setResizable(true);
    f2.setVisible(false);
    f2.setLayout(new GridLayout(2,1));
     f2.setSize(200,100);
    }
     public  void actionPerformed(ActionEvent ev){
        if (ev.getSource()==B1){
            String user=T1.getText();
            String pass=p.getText();
            L3.setText(pass);
            if (user.equals("Ephron")&&(pass.equals("e221"))){
                L4.setText("Welcome"+user);
                f1.setVisible(true);
                f2.setVisible(false);
            }
            else {
               
                L3.setText("Wrong Username or Password");
            }
        } else if (ev.getActionCommand().equals("Reset")) {
            T1.setText("");
            p.setText("");
            L3.setText("");

        }
        else {
            System.exit(0);
        }
     }
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Form21 m=new Form21();
      
   
    }
    
}
