/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Myproject1;

/**
 *
 * @author Esron
 */
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
public class MyTable1 {
public static void main(String args[]){
JFrame f=new JFrame("Table Example");
String col[]={"UserId","First Name","Last Name","Tel"};
DefaultTableModel m=new DefaultTableModel();
JTable t=new JTable(m);
for(int i=0;i<col.length;i++){
m.addColumn(col[i]);
}
m.addRow(new Object[]{"101","Peter","MUNEZA","0789458625"});
JScrollPane sp=new JScrollPane(t);
f.add(sp,BorderLayout.CENTER);
f.setVisible(true); f.setSize(600,200);
} 
}