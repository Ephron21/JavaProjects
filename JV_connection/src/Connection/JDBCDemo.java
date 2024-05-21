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

class JDBCDemo {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/ephron_db";
        String username = "root";
        String pass = "Diano21@Esron21%";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, pass);
            Statement st = con.createStatement();
            String query = "create table if not exists worker(id int not null primary key auto_increment,name text,username text,password varchar(15),email text)";
            st.executeUpdate(query);
            String insert = "insert into users(name,username,password,email) values('Esron','esron_21','Ep2024_05','esron@ur.ac.rw_05')";
            int rowsAffected = st.executeUpdate(insert);
            System.out.println(rowsAffected + " rows inserted.");
            ResultSet rs = st.executeQuery("select * from users");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " |------| " + rs.getString("username") + " |-------| :"
                        + rs.getString("email")  + rs.getString("password"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

