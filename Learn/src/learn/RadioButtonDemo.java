/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RadioButtonDemo extends JFrame implements ActionListener {
	
	ButtonGroup radiobg;
	JRadioButton R1,R2;
	JTextField T;
	JButton B;
	JFrame F;
	
	public RadioButtonDemo() {
		F=new JFrame("::Radio Button Program::");
		R1=new JRadioButton("Java");
		R2=new JRadioButton("Python");
		T=new JTextField(20);
		B=new JButton("Display");
		radiobg=new ButtonGroup();
		R1.addActionListener(this);
		R2.addActionListener(this);
		T.setEditable(false);
		radiobg.add(R1);
		radiobg.add(R2);
		B.addActionListener(this);
		F.add(R1);
		F.add(R2);
		F.add(B);
		F.add(T);
		F.setLayout(new GridLayout(4,1));
		F.setSize(500,300);
		F.setVisible(true);
	}
	
        @Override
	public void actionPerformed(ActionEvent ev) {
		if(ev.getSource()==B) {
			if(R1.isSelected()) {
				T.setText("I Like java Programming");
			}
			if(R2.isSelected()) {
				T.setText("I Like Python Programming!");
			}
		}
	}
	public static void main(String args[]){
            RadioButtonDemo demo=new RadioButtonDemo();
            
        }

}
