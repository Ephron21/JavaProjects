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
public class JavaDB1 {
public static void main(String args[]){
String driver, User,Pass,Path,Q1,Q2; driver="com.mysql.jdbc.Driver"; User="root"; 
Pass="Diano21@Esron21%";
Path="jdbc:mysql://localhost:3306/esron";
Q1="create table if not exists student1 (StId int primary key auto_increment,FName text,LName text, Class text, Tel int(12),Email text, Gender varchar(10))";
Q2="insert into student1(FName,LName,Class,Tel,Email,Gender)values('Diano','MANZI TUYISHIME','Year2',0787846344,'diano21@gmail.com','M')";
try{ Class.forName(driver);
    try (Connection con = DriverManager.getConnection(Path,User,Pass)) {
        Statement st=con.createStatement();
        st.executeUpdate(Q1); st.executeUpdate(Q2);
        String Q3="Select * from Student1";
        ResultSet rs=st.executeQuery(Q3);
        String D="delete from student1 where stid=01";
        ResultSet r=st.executeQuery(D);
        while(rs.next()){
            System.out.println(rs.getString("FName")+" "+rs.getInt("Tel")); }
    }
}
catch(ClassNotFoundException | SQLException e){} } }
