/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Esron
 */

public class ConnectionExample {
    public static void main(String args[]){
//         String url = "jdbc:mysql://localhost:3306/esron";
//        String username = "root";
//        String pass = "Diano21@Esron21%";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/esron","root","Diano21@Esron21%");
//            Statement st = con.createStatement();
            System.out.println("connection is done");
                    
        }catch(Exception e){
            System.out.print("connection Fail");
              e.printStackTrace();
        }
    }}

    
