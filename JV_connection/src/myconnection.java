


	/*
	 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
	 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
	 */

	/**
	 *
	 * @author Esron
	 */
	import javax.swing.*;
	import javax.swing.table.DefaultTableModel;
	import java.awt.*;
	import java.awt.event.*;
	import java.sql.*;
	import java.awt.print.PrinterJob;
	import java.awt.print.Printable;
	import java.awt.print.PageFormat;
	import java.awt.print.PrinterException;

	public class myconnection extends JFrame implements ActionListener {

	    JButton b1, b2, b3, b4, b5, b6, b7;
	    JLabel L1, L2, L3, L4, L5, L6, head;
	    JTextField T1, T2, T3, T4, T5, T6;
	    JPanel P1, P2, P3;
	    Connection connection;
	    DefaultTableModel model;
	    JTable dataTable;
	    JFrame F;

	    public myconnection() {
	        head = new JLabel("MYSQL Connection");
	        L1 = new JLabel("Student Id");
	        L2 = new JLabel("First name");
	        L3 = new JLabel("Surname");
	        L4 = new JLabel("Address");
	        L5 = new JLabel("Post code");
	        L6 = new JLabel("Telephone");

	        T1 = new JTextField();
	        T2 = new JTextField();
	        T3 = new JTextField();
	        T4 = new JTextField();
	        T5 = new JTextField();
	        T6 = new JTextField();

	        b1 = new JButton("Add new");
	        b2 = new JButton("Update");
	        b3 = new JButton("Print");
	        b4 = new JButton("Reset");
	        b5 = new JButton("Delete");
	        b7 = new JButton("Delete all");
	        b6 = new JButton("Exit");

	        // Set preferred size for buttons
	        Dimension buttonSize = new Dimension(130, 30);
	        b1.setPreferredSize(buttonSize);
	        b2.setPreferredSize(buttonSize);
	        b3.setPreferredSize(buttonSize);
	        b4.setPreferredSize(buttonSize);
	        b5.setPreferredSize(buttonSize);
	        b6.setPreferredSize(buttonSize);
	        b7.setPreferredSize(buttonSize);

	        P1 = new JPanel();
	        P2 = new JPanel();
	        P3 = new JPanel();

	        P1.add(head);

	        P2.setLayout(new GridLayout(6, 2));
	        P2.add(L1);
	        P2.add(T1);
	        P2.add(L2);
	        P2.add(T2);
	        P2.add(L3);
	        P2.add(T3);
	        P2.add(L4);
	        P2.add(T4);
	        P2.add(L5);
	        P2.add(T5);
	        P2.add(L6);
	        P2.add(T6);

	        P3.setLayout(new GridBagLayout());
	        GridBagConstraints gbc = new GridBagConstraints();
	        // button will be in east position
	        gbc.anchor = GridBagConstraints. EAST;

	        gbc.insets = new Insets(5, 5, 5, 5);
	        gbc.gridx = 0;
	        gbc.gridy = 0;
	        gbc.weighty = 1;

	        P3.add(b1, gbc);
	        gbc.gridy++;
	        P3.add(b2, gbc);
	        gbc.gridy++;
	        P3.add(b3, gbc);
	        gbc.gridy++;
	        P3.add(b4, gbc);
	        gbc.gridy++;
	        P3.add(b5, gbc);
	        gbc.gridy++;
	        P3.add(b7, gbc);
	        gbc.gridy++;
	        P3.add(b6, gbc);

	        F = new JFrame();
	        F.setLayout(new BorderLayout());
	        F.add(P1, BorderLayout.NORTH);
	        F.add(P2, BorderLayout.CENTER);
	        F.add(P3, BorderLayout.EAST);

	        F.setTitle("MySQL Connection");
	        F.setSize(800, 600);
	        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Initialize table
	        model = new DefaultTableModel();
	        model.addColumn("Student ID");
	        model.addColumn("Surname");
	        model.addColumn("First Name");
	        model.addColumn("Address");
	        model.addColumn("Postcode");
	        model.addColumn("Telephone");
	        dataTable = new JTable(model);

	        // Add the table to a JScrollPane and then add the scroll pane to the frame
	        JScrollPane scrollPane = new JScrollPane(dataTable);
	        scrollPane.setPreferredSize(new Dimension(550, 200)); // Set size of JScrollPane
	        F.add(scrollPane, BorderLayout.SOUTH);

	        F.setVisible(true);

	        // Add action listeners
	        b1.addActionListener(this);
	        b2.addActionListener(this);
	        b3.addActionListener(this);
	        b4.addActionListener(this);
	        b5.addActionListener(this);
	        b6.addActionListener(this);
	        b7.addActionListener(this);

	        // Connect to the database
	        try {
	            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/esron","root","Diano21@Esron21%");
	            System.out.println("Connected to database successfully!");
	        } catch (SQLException e) {
	            System.out.println("Connection to database failed.");
	            e.printStackTrace();
	        }
	    }

	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == b1) {
	            // Add new record
	            try {
					addData();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        } else if (e.getSource() == b2) {
	            // Update record
	            updateRecord();
	        } else if (e.getSource() == b3) {
	            // Print records
	            printRecords();
	        } else if (e.getSource() == b4) {
	            // Reset fields
	            resetFields();
	        } else if (e.getSource() == b5) {
	            // Delete record
	            deleteRecord();
	        } else if (e.getSource() == b6) {
	            // Exit application
	            System.exit(0);
	        } else if (e.getSource() == b7) {
	            DeleteAll();
	        }
	    }

	    private void addData() throws SQLException, SQLException {
	        try {
	            String sql = "INSERT INTO students (student_id, first_name, surname, address, postcode, telephone) VALUES (?, ?, ?, ?, ?, ?)";
	            PreparedStatement pstmt = connection.prepareStatement(sql);
	            pstmt.setString(1, T1.getText());
	            pstmt.setString(2, T2.getText());
	            pstmt.setString(3, T3.getText());
	            pstmt.setString(4, T4.getText());
	            pstmt.setString(5, T5.getText());
	            pstmt.setString(6, T6.getText());
	            pstmt.executeUpdate();
	            JOptionPane.showMessageDialog(this, "Data added successfully.");
	            pstmt.close();
	            fetchData(); // Refresh table
	        } catch (SQLException ex) {
	            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
	        }
	    }

	    private void fetchData() {
	        try {
	            String sql = "SELECT student_id, surname, first_name, address, postcode, telephone FROM students";
                    try (Statement stmt = connection.createStatement()) {
                        ResultSet rs = stmt.executeQuery(sql);
                        
                        // Clear existing data
                        model.setRowCount(0);
                        
                        // Add column headers
                        model.setColumnIdentifiers(new Object[]{"Student ID", "Surname", "First Name", "Address", "Postcode", "Telephone"});
                        
                        // Add fetched data to the table
                        while (rs.next()) {
                            Object[] rowData = {
                                rs.getString("student_id"),
                                rs.getString("surname"),
                                rs.getString("first_name"),
                                rs.getString("address"),
                                rs.getString("postcode"),
                                rs.getString("telephone")
                            };
                            model.addRow(rowData);
                        }
                        rs.close();
                    }
	        } catch (SQLException ex) {
	            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
	        }
	    }


	    private void updateRecord() {
	        // Implement update record functionality
	        int selectedRowIndex = dataTable.getSelectedRow();

	        // Check if a row is selected
	        if (selectedRowIndex != -1) {
	            // Get data from the selected row
	            String studentId = model.getValueAt(selectedRowIndex, 0).toString();
	            String surname = model.getValueAt(selectedRowIndex, 1).toString();
	            String firstName = model.getValueAt(selectedRowIndex, 2).toString();
	            String address = model.getValueAt(selectedRowIndex, 3).toString();
	            String postcode = model.getValueAt(selectedRowIndex, 4).toString();
	            String telephone = model.getValueAt(selectedRowIndex, 5).toString();

	            // Populate text fields with the data
	            T1.setText(studentId);
	            T2.setText(firstName);
	            T3.setText(surname);
	            T4.setText(address);
	            T5.setText(postcode);
	            T6.setText(telephone);

	            // Prompt the user to make changes
	            JOptionPane.showMessageDialog(this, "Make changes and click 'Update' to save.");
	        } else {
	            JOptionPane.showMessageDialog(this, "Please select a row to update.");
	        }
	    }

	    private void printRecords() {
	        PrinterJob printerJob = PrinterJob.getPrinterJob();
	        printerJob.setJobName("Print Data");

	        printerJob.setPrintable(new Printable() {
	            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
	                if (pageIndex > 0) {
	                    return Printable.NO_SUCH_PAGE;
	                }

	                Graphics2D g2d = (Graphics2D) graphics;
	                g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

	                
	                dataTable.printAll(graphics);

	                return Printable.PAGE_EXISTS;
	            }
	        });

	        boolean ok = printerJob.printDialog();
	        if (ok) {
	            try {
	                printerJob.print();
	            } catch (PrinterException ex) {
	                JOptionPane.showMessageDialog(this, "Printing failed: " + ex.getMessage());
	            }
	        }
	    }

	    private void resetFields() {
	        T1.setText("");
	        T2.setText("");
	        T3.setText("");
	        T4.setText("");
	        T5.setText("");
	        T6.setText("");
	    }

	    private void deleteRecord() {
	        int selectedRowIndex = dataTable.getSelectedRow();

	        // Check if a row is selected
	        if (selectedRowIndex != -1) {
	            String studentId = model.getValueAt(selectedRowIndex, 0).toString();

	            // Construct the SQL DELETE statement
	            String sqlDelete = "DELETE FROM students WHERE student_id = ?";

	            try {
	                // Prepare the delete statement
	                PreparedStatement pstmtDelete = connection.prepareStatement(sqlDelete);
	                pstmtDelete.setString(1, studentId);

	                // Execute the delete statement
	                pstmtDelete.executeUpdate();

	                // Close the delete statement
	                pstmtDelete.close();

	                // Inform the user
	                JOptionPane.showMessageDialog(this, "Record deleted successfully.");

	                // Refresh the table
	                fetchData();
	            } catch (SQLException ex) {
	                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
	            }
	        } else {
	            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
	        }
	    }

	    public void DeleteAll() {
	        // Implement delete all records functionality
	        int confirmed = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete all records?", "Confirm Delete All", JOptionPane.YES_NO_OPTION);
	        if (confirmed == JOptionPane.YES_OPTION) {
	            String sqlDeleteAll = "DELETE FROM students";

	            try {
	                // Prepare the delete all statement
	                PreparedStatement pstmtDeleteAll = connection.prepareStatement(sqlDeleteAll);

	                // Execute the delete all statement
	                pstmtDeleteAll.executeUpdate();

	                // Close the prepared statement
	                pstmtDeleteAll.close();

	                // Inform the user
	                JOptionPane.showMessageDialog(this, "All records deleted successfully.");

	                // Refresh the table
	                fetchData();
	            } catch (SQLException ex) {
	                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
	            }
	        }
	    }

	    public static void main(String args[]) {
	        new myconnection();
	    }
	}

