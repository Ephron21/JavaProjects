/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.*;

public class JDBC {

    public static void main(String[] args) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/workq1";
        String username = "root";
        String pass = "";

        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, pass);
            Statement st = con.createStatement();
            String createTableQuery = "CREATE TABLE JMV (\n" +
"    id INT NOT NULL,\n" +
"    name VARCHAR(200) NOT NULL,\n" +
"    age INT NOT NULL,\n" +
"    PRIMARY KEY (id)\n" +
");";
            st.executeUpdate(createTableQuery);

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
