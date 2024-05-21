/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaNetwork;

/**
 *
 * @author Esron
 */
import java.io.*; import java.net.*; import java.sql.*;
public class ServerLogin {
public static void main(String args[]){
try{
ServerSocket ss=new ServerSocket(5577);
System.out.println("Server Ready...");
Socket so=ss.accept();
BufferedReader bb=new BufferedReader(new 
InputStreamReader(so.getInputStream()));
PrintStream ps=new PrintStream(so.getOutputStream());
String user=bb.readLine(); String pass=bb.readLine();
String driver="com.mysql.jdbc.Driver";
String url="jdbc:mysql://127.0.0.1:3306/esron";
String uname="root"; String pname="Diano21@Esron21%";
String q="select * from user where username='"+user+"' " + 
"and password='"+pass+"'";
Class.forName(driver).newInstance();
Connection cn=DriverManager.getConnection(url,uname,pname);
Statement st=cn.createStatement();
ResultSet rs=st.executeQuery(q);
if(rs.next()){
String fn=rs.getString("firstname");
ps.println(fn); }
else{ String msg="Login Error";
ps.println(msg); } }
catch(Exception ex){ ex.printStackTrace(); }
} }
