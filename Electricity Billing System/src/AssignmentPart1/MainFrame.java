/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssignmentPart1;

/**
 *
 * @author Esron
 */

import DBConnector.DBConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class MainFrame {
    private JFrame frame;
    private JFrame dashboardFrame;
    private JFrame dataDisplay;

    private JFrame editData;

    private JFrame logoutFrame;

    private DBConnection myConnection;
    public  MainFrame() throws SQLException {
        initialize();


    }

    public void initialize() throws SQLException {
        myConnection = new DBConnection();
//        System.out.println(this.myConnection.isConnected());


        //frame creation
        frame = new JFrame();
        this.frame.setTitle("Java Assignment");

        //main body
        JPanel panel = new JPanel();
        ImageIcon image;
        JLabel displayField;
        try{
            image = new ImageIcon(getClass().getResource("/assets/lock.png"));
            Image imageClone = image.getImage(); // Transform ImageIcon to Image
            Image resizedImage = imageClone.getScaledInstance(180, 180, Image.SCALE_SMOOTH); // Set the desired width and height
            image = new ImageIcon(resizedImage); // Transform Image back to ImageIcon
            displayField = new JLabel(image);
            displayField.setBorder(BorderFactory.createLineBorder(Color.BLACK,8));
            panel.add(displayField);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
        frame.add(panel,BorderLayout.NORTH);


        JPanel panelForm = new JPanel();
        JLabel L1,L2;
        JTextField T1;
        JPasswordField T2;






        JPanel div1 = new JPanel();
        div1 = new JPanel();
        div1.setBounds(0,0,10,20);
        div1.setLayout(new FlowLayout(FlowLayout.CENTER,50,5));
        L1 = new JLabel("Username");
        T1 = new JTextField(19);
        div1.add(L1);
        div1.add(T1);
        panelForm.add(div1);



        JPanel div2 = new JPanel();
        div2 = new JPanel();
        div2.setBounds(0,0,10,20);
        div2.setLayout(new FlowLayout(FlowLayout.CENTER,50,5));
        L2 = new JLabel("Password");
        T2 = new JPasswordField(19);
        div2.add(L2);
        div2.add(T2);
        panelForm.add(div2);

        JPanel div4 = new JPanel();
        div4 = new JPanel();
        div4.setBounds(0,0,10,20);
        div4.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));

        JLabel L3 = new JLabel("");
        L3.setForeground(Color.RED);
        div4.add(L3);

        JPanel div3 = new JPanel();
        div3 = new JPanel();
        div3.setBounds(0,0,10,20);
        div3.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
        JButton signInButton = new JButton("SignIn");

        signInButton.addActionListener(new ActionListener() {

            // Override the actionPerformed() method
            public void actionPerformed(ActionEvent e){

                boolean loginAction = false;
                loginAction = myConnection.login(T1.getText(),T2.getText());
                if (loginAction){
                    frame.setVisible(false); // Hide the login frame
                    dashboardFrame.setVisible(true);
                }else{
                    L3.setText("Wrong username or password");
                }
                System.out.println(loginAction);


            }});
        JButton signUpButton = new JButton("SignUp");
        JCheckBox checkBox1 = new JCheckBox("Show password");

        checkBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JCheckBox checkBox = (JCheckBox)e.getSource();
                T2.setEchoChar(checkBox.isSelected() ? '\0' : '*');
            }
        });
        div3.add(signInButton);
        div3.add(checkBox1);
        div3.add(signUpButton);
        panelForm.add(div3);


        panelForm.add(div4);

        panelForm.setLayout(new GridLayout(4, 2));
        frame.add(panelForm,BorderLayout.SOUTH);



        //frame call
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setSize(500,400);
        this.frame.setLocationRelativeTo(null);
        this.frame.setResizable(false);
        this.frame.setVisible(true);




        //frame creation
        dashboardFrame = new JFrame();
        this.dashboardFrame.setTitle("Dashboard");

        JPanel profilePicturePanel = new JPanel();
        ImageIcon profilePicture;
        JLabel profilePictureLabel;
        try{
            profilePicture = new ImageIcon(getClass().getResource("/assets/cat.jpg"));
            Image imageClone = profilePicture.getImage(); // Transform ImageIcon to Image
            Image resizedImage = imageClone.getScaledInstance(180, 180, Image.SCALE_SMOOTH); // Set the desired width and height
            image = new ImageIcon(resizedImage); // Transform Image back to ImageIcon
            profilePictureLabel = new JLabel(image);
            profilePictureLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK,8));
            profilePicturePanel.add(profilePictureLabel);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        profilePicturePanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
        dashboardFrame.add(profilePicturePanel,BorderLayout.NORTH);





        JPanel dashboardActions = new JPanel();
        JPanel buttonHolder1 = new JPanel();
        buttonHolder1.setLayout(new FlowLayout(FlowLayout.CENTER,100,5));
        JButton logoutButton = new JButton("Logout");
        JButton displayData = new JButton("Display Data");
        displayData.addActionListener(new ActionListener() {

            // Override the actionPerformed() method
            public void actionPerformed(ActionEvent e){
                // Update the text of the label
                dashboardFrame.setVisible(false); // Hide the login frame
                dataDisplay.setVisible(true);
            }});



        buttonHolder1.add(logoutButton);
        buttonHolder1.add(displayData);
//        dashboardActions.setPreferredSize(new Dimension(0,0));
        dashboardActions.add(buttonHolder1);


        dashboardFrame.add(dashboardActions,BorderLayout.SOUTH);
        //frame call
        this.dashboardFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.dashboardFrame.setSize(500,400);
        this.dashboardFrame.setLocationRelativeTo(null);
        this.dashboardFrame.setResizable(false);
        this.dashboardFrame.setVisible(false);







        //frame creation
        dataDisplay = new JFrame();
        this.dataDisplay.setTitle("Display data");

        JPanel title = new JPanel();
        JLabel tableTitle = new JLabel("List of Users");
        tableTitle.setForeground(Color.blue);
        title.add(tableTitle);



        JPanel tableHolder = new JPanel();

        String data[][]={
                {"101","Amit","670000"},
                {"101","Amit","670000"},
                {"101","Amit","670000"},{"101","Amit","670000"},{"101","Amit","670000"},
        };
        String column[]={"ID","NAME","SALARY"};
        JTable jt=new JTable(data,column);
        JScrollPane sp=new JScrollPane(jt);
        sp.setPreferredSize(new Dimension(400, 300));
//        jt.setBounds(30,40,200,300);

        tableHolder.add(sp);

        title.add(tableHolder);


        JPanel buttonHolder2 = new JPanel();
        JButton editButton = new JButton("Edit");

        editButton.addActionListener(new ActionListener() {

            // Override the actionPerformed() method
            public void actionPerformed(ActionEvent e){
                // Update the text of the label
                dataDisplay.setVisible(false); // Hide the login frame
                editData.setVisible(true);
            }});


        JButton deleteButton = new JButton("Delete");

        buttonHolder2.add(editButton);
        buttonHolder2.add(deleteButton);

        dataDisplay.add(title,BorderLayout.NORTH);
        dataDisplay.add(buttonHolder2,BorderLayout.SOUTH);
        //frame call
        this.dataDisplay.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.dataDisplay.setSize(500,400);
        this.dataDisplay.setLocationRelativeTo(null);
        this.dataDisplay.setResizable(false);
        this.dataDisplay.setVisible(false);



        //frame creation
        editData = new JFrame();
        this.editData.setTitle("Edit data");
        //body

        JLabel editTitle = new JLabel("Edit User");
        editTitle.setForeground(Color.blue); // Set the foreground color to blue
        editTitle.setBackground(Color.pink); // Set the background color to pink
        editTitle.setOpaque(false); // Make sure to setOpaque(true) to make the background color visible
        editTitle.setSize(100, 30); // Set the size of the JLabel
        editTitle.setLocation(200, 20); // Set the location of the JLabel


        JLabel userId = new JLabel("User ID: 1");
        userId.setSize(100, 30); // Set the size of the JLabel
        userId.setLocation(200, 40); // Set the location of the JLabel

        JPanel formContainer = new JPanel();
//        userId.setSize(100, 30); // Set the size of the JLabel



        JTextField firstName, lastName, phone, email,userName;

        firstName = new JTextField(15);
        firstName.setSize(150, 23); // Set the size of the JLabel
        firstName.setLocation(100, 80);

        lastName = new JTextField(15);
        lastName.setSize(150, 23); // Set the size of the JLabel
        lastName.setLocation(270, 80);


        phone = new JTextField(15);
        phone.setSize(150, 23); // Set the size of the JLabel
        phone.setLocation(100, 120);

        email = new JTextField(15);
        email.setSize(150, 23); // Set the size of the JLabel
        email.setLocation(270, 120);

        userName = new JTextField(15);
        userName.setSize(150, 23); // Set the size of the JLabel
        userName.setLocation(100, 160);

        String country[]={"India","Aus","U.S.A","England","Newzealand","rwanda"};
        JComboBox userType=new JComboBox(country);
        userType.setSize(150, 23); // Set the size of the JLabel
        userType.setLocation(270, 160);

        JRadioButton r1=new JRadioButton("A) Male");
        r1.setSize(150, 23); // Set the size of the JLabel
        r1.setLocation(100, 200);

        JRadioButton r2=new JRadioButton("A) Female");
        r2.setSize(150, 23); // Set the size of the JLabel
        r2.setLocation(270, 200);

        JLabel uploadLabel = new JLabel("Plase upload Picture");
        uploadLabel.setSize(150, 23); // Set the size of the JLabel
        uploadLabel.setLocation(100, 240);

        JButton upload=new JButton("Upload File");
        upload.setSize(150, 23); // Set the size of the JLabel
        upload.setLocation(270, 240);

        JButton save=new JButton("Save");
        save.setSize(90, 23); // Set the size of the JLabel
        save.setLocation(100, 280);


        save.addActionListener(new ActionListener() {

            // Override the actionPerformed() method
            public void actionPerformed(ActionEvent e){
                // Update the text of the label
                editData.setVisible(false); // Hide the login frame
                logoutFrame.setVisible(true);
            }});

















        editData.setLayout(null);
        editData.add(editTitle);
        editData.add(userId);
        editData.add(firstName);
        editData.add(lastName);
        editData.add(phone);
        editData.add(email);
        editData.add(userName);
        editData.add(userType);
        editData.add(r1);
        editData.add(r2);
        editData.add(uploadLabel);
        editData.add(upload);
        editData.add(save);



//        editData.add(buttonHolder2,BorderLayout.SOUTH);
        //frame call
        this.editData.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.editData.setSize(500,400);
        this.editData.setLocationRelativeTo(null);
        this.editData.setResizable(false);
        this.editData.setVisible(false);











        //frame creation
        logoutFrame = new JFrame();
        this.frame.setTitle("Java Assignment");

        //main body
        JPanel panel1 = new JPanel();
        ImageIcon image1;
        JLabel displayField1;
        try{
            image1 = new ImageIcon(getClass().getResource("/assets/lock.png"));
            Image imageClone = image1.getImage(); // Transform ImageIcon to Image
            Image resizedImage = imageClone.getScaledInstance(180, 180, Image.SCALE_SMOOTH); // Set the desired width and height
            image = new ImageIcon(resizedImage); // Transform Image back to ImageIcon
            displayField1 = new JLabel(image);
            displayField1.setBorder(BorderFactory.createLineBorder(Color.BLACK,8));
            panel1.add(displayField1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        panel1.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
        logoutFrame.add(panel1,BorderLayout.NORTH);




        JPanel dashboardActions1 = new JPanel();
        JPanel buttonHolder3 = new JPanel();
        buttonHolder3.setLayout(new FlowLayout(FlowLayout.CENTER,100,5));
        JButton logout = new JButton("Logout");
        logout.addActionListener(new ActionListener() {

            // Override the actionPerformed() method
            public void actionPerformed(ActionEvent e){
                // Update the text of the label
                dashboardFrame.setVisible(false); // Hide the login frame
                dataDisplay.setVisible(false);
            }});



        buttonHolder3.add(logoutButton);
//        dashboardActions.setPreferredSize(new Dimension(0,0));
        dashboardActions1.add(buttonHolder3);


        logoutFrame.add(dashboardActions1,BorderLayout.SOUTH);

        //        editData.add(buttonHolder2,BorderLayout.SOUTH);
        //frame call
        this.logoutFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.logoutFrame.setSize(500,400);
        this.logoutFrame.setLocationRelativeTo(null);
        this.logoutFrame.setResizable(false);
        this.logoutFrame.setVisible(false);



    }
}

