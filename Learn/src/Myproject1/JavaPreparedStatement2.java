/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Myproject1;

/**
 *
 * @author Esron
 */
import java.sql.*; 
public class JavaPreparedStatement2 { 
public static void main(String args[]){ 
String driver, User,Pass,Path;
User="root"; Pass="Diano21@Esron21%"; Path="jdbc:mysql://localhost:3306/esron";
try{ 
Class.forName("com.mysql.jdbc.Driver"); 
Connection con=DriverManager.getConnection( Path,User,Pass); 
PreparedStatement ps1=con.prepareStatement("select * from Student1"); 
PreparedStatement ps2=con.prepareStatement("delete from Student1 where StId=1"); 
ResultSet rs=ps1.executeQuery(); 
ResultSetMetaData rsmd=rs.getMetaData(); 
ps2.executeUpdate();
System.out.println("Total columns: "+rsmd.getColumnCount()); 
System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1)); 
System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1)); 
while(rs.next()){
System.out.println("\n------------\n"+rs.getString("Fname")+" "+rs.getString("Gender")+"\n----------\n"); 
}
con.close(); }catch(Exception e){ System.out.println(e);} } }
