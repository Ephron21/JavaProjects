/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/**
 *
 * @author Esron
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Esron
 */
import java.sql.*; import java.io.*;
import javax.swing.JOptionPane;


public class Student_info {
public static void main(String args[])
{ String driver, User,Pass,Path,Q1,Q2; 
driver="com.mysql.jdbc.Driver"; User="root"; Pass="Diano21@Esron21%"; Path="jdbc:mysql://localhost:3306/registration_details";
try{ Class.forName(driver); Connection con=DriverManager.getConnection(Path,User,Pass);
PreparedStatement ps=con.prepareStatement("insert into student_info(id,FirstName,LastName,RegNo,Pin,Email,PhoneNO) values(?,?,?,?,?,?,?)"); 
BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
do{int id;
id=Integer.parseInt(JOptionPane.showInputDialog("pls enter id"));
    //System.out.println("id:"); String id=br.readLine();
//System.out.println("enter First name:"); String fn=br.readLine(); 
//System.out.println("Last name:"); String ln=br.readLine(); 
//System.out.println("RegNo:"); String rn=br.readLine(); 
//System.out.println("Pin:"); String pn=br.readLine(); 
//System.out.println("email:"); String em=br.readLine(); 
//System.out.println("PhoneNO:"); String pno=br.readLine(); 
String fn=JOptionPane.showInputDialog("pls enter FirstName");
String ln=JOptionPane.showInputDialog("pls enter LastName");
String rn=JOptionPane.showInputDialog("pls enter RegNO");
String pn=JOptionPane.showInputDialog("pls enter Pin");
String em=JOptionPane.showInputDialog("pls enter Email");
String pno=JOptionPane.showInputDialog("pls enter YPhoneNO");
ps.setInt(1,id); ps.setString(2,fn); ps.setString(3,ln); ps.setString(4,rn); 
ps.setString(5,pn); ps.setString(6,em); ps.setString(7,pno); 
int i=ps.executeUpdate();// System.out.println("Do you want to continue: y/n"); 
 JOptionPane.showMessageDialog(null,"Do you want to continue: Y/n");
String s=br.readLine(); if(s.startsWith("n")){ break; } } while(true); 
Statement st=con.createStatement(); ResultSet rs=st.executeQuery("Select * from Student_info");
while(rs.next()){ System.out.println(rs.getString("FirstName")+" "+rs.getString("LastName")+" "+rs.getString("RegNo")+"\n------------------\n");
} con.close(); } catch(Exception e){ e.printStackTrace(); } } }


