

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
public class TableExample extends JApplet implements ActionListener{
    JFrame f;
    JTextField T1,T2,T3;
    DefaultTableModel m;
    JButton B;
    JTable t;
    public TableExample(){
        f=new JFrame("Table Data Example");
        T1=new JTextField(10);
        T1.setText("First Name:");
        T2=new JTextField(10);
        T2.setText("Last Name:");
        T3=new JTextField(10);
        T3.setText("Telephone");
        B=new JButton("Save");
        B.addActionListener(this);
        m=new DefaultTableModel();
        t=new JTable(m);
        m.addColumn("ID"); m.addColumn("First Name");
        m.addColumn("Last Name"); m.addColumn("Telephone");
        f.add(T1);f.add(T2);f.add(T3);f.add(B);
        JScrollPane sp=new JScrollPane(t);
        f.add(sp);
        f.setLayout(new GridLayout(5,1));
        f.setVisible(true);f.setLocation(100,150);f.setSize(600,300);
        f.setBounds(100,100,400,300);
    }
    public void actionPerformed(ActionEvent ea){
        if(ea.getActionCommand().equals("Save")){
            String s1,s2,s3;
            s1=T1.getText();
            s2=T2.getText();
            s3=T3.getText();
            m.addRow(new Object[]{"1",s1,s2,s3});

        }
    }
    public static void main(String args[]){
        TableExample te=new TableExample();
    }
}
