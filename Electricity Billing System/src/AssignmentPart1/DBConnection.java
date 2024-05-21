/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssignmentPart1;

/**
 *
 * @author Esron
 */

import java.sql.*;

public class DBConnection {
    private Connection con;

    public DBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:6306/mysql","root","qwerty123");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "Diano21@Esron21%");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean isConnected(){
        if(con != null){
            return true;
        }
        return false;
    }

    public boolean login(String userName, String Password) throws SQLException {
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM user WHERE Username = '"+userName+"' AND password = '"+ Password+"'; ");
        int conf = 0;
        while (resultSet.next()){
            conf++;
        }
        if (conf != 0) return true;
        return false;
    }



}

