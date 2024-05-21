/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

/**
 *
 * @author Esron
 */


import java.sql.*;

public class javaconnection {

	public static void main(String[] args) {
		
		
		Connection conn;
            conn = null;
		
		try {
			
			  String dbURL = "jdbc:mysql://localhost:3306/esron";
			  String dbUname = "root";
			  String dbPass = "Diano21@Esron21%";
			  
			  conn = DriverManager.getConnection(dbURL,dbUname,dbPass);
			  
			  if(conn != null) {
				  System.out.println("Database Connected Successful!");
			  }
			
	           
	            
			  
		}catch(Exception e) {
			System.out.println("An Error Occured while database trying to connect!");
			System.out.println(e.getMessage()); 
		}

}
	}
