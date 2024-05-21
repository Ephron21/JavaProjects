package login;

import java.sql.*;

public class Login {

    public static void main(String[] args) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/esrondb";
        String username = "root";
        String pass = "Diano21@Esron21%";

        try {
            Class.forName(driver);
            try (Connection con = DriverManager.getConnection(url, username, pass)) {
                Statement st = con.createStatement();
                String createTableQuery = "CREATE TABLE if not exists dian (id INT NOT NULL primary key,name VARCHAR(200) NOT NULL,age INT NOT NULL)";
                st.executeUpdate(createTableQuery);
                var insert = "insert into dian(id,name,age) values(1,'manzi', 02) ";
               
                int rowsAffected = st.executeUpdate(insert);
                System.out.println(rowsAffected + " rows inserted.");
                ResultSet rs = st.executeQuery("select * from dian");
         
                while (rs.next()) {
                    System.out.println(rs.getString("id") + " |------| " + rs.getString("name") + " |-------| :"
                            + rs.getString("age"));
                }
                
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace(); 
        }
        }
    }
  