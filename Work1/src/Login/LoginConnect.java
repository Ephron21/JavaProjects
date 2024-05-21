

import java.awt.EventQueue;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginConnect extends JFrame implements ActionListener {
    JLabel L1,L2,L3,L4;

    JButton B1,B2;
    private JFrame frame,welcome;
    private JTextField textField;
    private JPasswordField passwordField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginConnect window = new LoginConnect();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public LoginConnect() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        welcome=new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);


        L1 = new JLabel("Username:");
        L1.setBounds(24, 15, 110, 29);
        frame.getContentPane().add(L1);

        L2 = new JLabel("Password:");
        L2.setBounds(20, 51, 114, 29);
        frame.getContentPane().add(L2);
        L3=new JLabel();
        L4=new JLabel("");
        L4.setBounds(24, 150, 150, 29);
        textField = new JTextField();
        textField.setBounds(127, 19, 130, 25);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(127, 55, 130, 25);
        frame.getContentPane().add(passwordField);

        JButton B1 = new JButton("Login");
        B1.setBounds(24, 101, 95, 29);
        B1.addActionListener(this);
        frame.getContentPane().add(B1);

        JButton B2 = new JButton("Reset");
        B2.setBounds(127, 101, 130, 29);
        B2.addActionListener(this);
        frame.getContentPane().add(B2);
        welcome.add(L3);
        welcome.setSize(400,300);
        welcome.setLayout(new FlowLayout());
        frame.getContentPane().add(L4);
    }
    public void actionPerformed(ActionEvent ev) {
        if(ev.getActionCommand().equals("Login")) {
            String user=textField.getText();
            String pass=passwordField.getText();
            String username="root";
            String password="";
            String driver="com.mysql.cj.jdbc.Driver";
            String url="jdbc:mysql://localhost:3306/esron","root","Diano21@Esron21%";
            try {
                Class.forName(driver);
                Connection cn=DriverManager.getConnection(url,username,password);
                String credentials="select * from users where username='"+user+"' and password='"+pass+"'";
                Statement st=cn.createStatement();
                ResultSet rs=st.executeQuery(credentials);





                if(rs.next()) {
                    welcome.setVisible(true);
                    frame.setVisible(false);
                    L3.setText("Welcome "+rs.getString("username"));
                }
                else {
                    textField.setText("");
                    passwordField.setText("");
                    L4.setText("Incorrect Credentials");
                    L4.setFont(new Font("Arial",Font.BOLD,20));
                    L4.setForeground(Color.red);
                }
            }
            catch(Exception e) {
                e.fillInStackTrace();
            }
        }
        else {
            textField.setText("");
            passwordField.setText("");
        }
    }
}
