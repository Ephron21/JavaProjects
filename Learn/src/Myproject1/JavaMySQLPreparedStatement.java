/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Myproject1;

/**
 *
 * @author Esron
 */
import java.sql.*; import java.io.*;

public class JavaMySQLPreparedStatement {
public static void main(String args[])
{ String driver, User,Pass,Path,Q1,Q2; 
driver="com.mysql.jdbc.Driver"; User="root"; Pass="Diano21@Esron21%"; Path="jdbc:mysql://localhost:3306/esron";
try{ Class.forName(driver); Connection con=DriverManager.getConnection(Path,User,Pass);
PreparedStatement ps=con.prepareStatement("insert into Student1(FName,LName,Class,Tel,Email,Gender) values(?,?,?,?,?,?)"); 
BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
do{ System.out.println("telephone:"); int tel=Integer.parseInt(br.readLine()); 
System.out.println("enter first name:"); String fn=br.readLine(); 
System.out.println("last name:"); String ln=br.readLine(); 
System.out.println("class name:"); String cn=br.readLine(); 
System.out.println("email:"); String em=br.readLine(); 
System.out.println("gender:"); String gen=br.readLine(); 
ps.setString(1,fn); ps.setString(2,ln); ps.setString(3,cn); 
ps.setInt(4,tel); ps.setString(5,em); ps.setString(6,gen); 
int i=ps.executeUpdate(); System.out.println("Do you want to continue: y/n"); 
String s=br.readLine(); if(s.startsWith("n")){ break; } } while(true); 
Statement st=con.createStatement(); ResultSet rs=st.executeQuery("Select * from Student1");
while(rs.next()){ System.out.println(rs.getString("FName")+" "+rs.getString("Class")+" "+rs.getString("Gender")+"\n------------------\n");
} con.close(); } catch(Exception e){ e.printStackTrace(); } } }

