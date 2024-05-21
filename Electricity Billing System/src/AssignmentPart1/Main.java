
/**
 *
 * @author Esron
 */
import java.sql.*; import java.io.*;

public class Main {
public static void main(String args[])
{ String driver, User,Pass,Path,Q1,Q2; 
driver="com.mysql.cj.jdbc.Driver"; User="root"; Pass="Diano21@Esron21%"; Path="jdbc:mysql://localhost:3306/assignment";
try{ Class.forName(driver); Connection con=DriverManager.getConnection(Path,User,Pass);
PreparedStatement ps=con.prepareStatement("insert into User(Id,FirstName,LastName,Email,Tel,Username,Password,Gender,UserType,Photo_id) values(?,?,?,?,?,?,?,?,?,?)"); 
BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
do{ System.out.println("Id:"); int dn=Integer.parseInt(br.readLine()); 
System.out.println("enter first name:"); String fn=br.readLine(); 
System.out.println("last name:"); String ln=br.readLine(); 
System.out.println("Enter  Email:"); String em=br.readLine(); 
System.out.println("Enter Tel:"); String te=br.readLine(); 
System.out.println("username:"); String us=br.readLine(); 
System.out.println("password:"); String pas=br.readLine(); 
System.out.println("Gender:"); String gen=br.readLine(); 
System.out.println("userType:"); String ust=br.readLine(); 
System.out.println("Photo_id:"); String pho=br.readLine(); 
ps.setInt(1,dn); ps.setString(2,fn); ps.setString(3,ln); 
ps.setString(4,em); ps.setString(5,te); ps.setString(6,us); 
ps.setString(7,pas); ps.setString(8,gen); ps.setString(9,ust); 
ps.setString(10,pho); 
int i=ps.executeUpdate(); System.out.println("Do you want to continue: y/n"); 
String s=br.readLine(); if(s.startsWith("n")){ break; } } while(true); 
Statement st=con.createStatement(); ResultSet rs=st.executeQuery("Select * from user");
while(rs.next()){ System.out.println(rs.getString("FirsName")+" "+rs.getString("Email")+" "+rs.getString("Gender")+"\n------------------\n");
} con.close(); } catch(Exception e){ e.printStackTrace(); } } }

