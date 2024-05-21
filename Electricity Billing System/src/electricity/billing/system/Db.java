/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricity.billing.system;
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author Esron
 */
public class Db {
    Connection con =null;
    java.sql.PreparedStatement pst;
    public static Connection dbconnect() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sinupform","root","Diano21@Esron21%");
            return conn;
        }catch(ClassNotFoundException e2){
            System.out.println(e2);
            return null;
                    
                    }
        
    }
    
    
}
