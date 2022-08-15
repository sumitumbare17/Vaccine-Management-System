package com.cares.services;

import java.awt.BorderLayout;
import net.proteanit.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JProgressBar;

public class DEMO extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	private JTable table_2;
	private JTable table_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DEMO frame = new DEMO();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public DEMO() throws ClassNotFoundException, SQLException {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 874, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
	
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String pass = "0503";
			String driver = "oracle.jdbc.driver.OracleDriver";

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();

			String sql = "select FNAME ,LNAME,EMAIL,PHONE,GENDER, ADDRESS , DOB ,PASSWORD from registration ";
			rs= stmt.executeQuery(sql);
			//table_3.setModel(DbUtils.resultSetToTableModel(rs));
			
			
			ResultSetMetaData rm = rs.getMetaData();
			Vector columnNames = new Vector();
			Vector data = new Vector();
			int column = rm.getColumnCount();
			for (int i=1;i<=column;i++)
			{
				columnNames.addElement(rm.getColumnName(i));
			}
			while(rs.next()) {
				Vector row = new Vector();
				for (int i=1;i<=column;i++)
				{
					row.addElement(rs.getObject(i));
				}
				data.addElement(row);
			}
			
			table_4 = new JTable(data,columnNames) {
				
			};
			table_4.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"ID"
				}
			));
			table_4.setSurrendersFocusOnKeystroke(true);
			table_4.setColumnSelectionAllowed(true);
			table_4.setCellSelectionEnabled(true);
			
			table_4.setBounds(69, 24, 718, 178);
			contentPane.add(table_4);
			
			JProgressBar progressBar = new JProgressBar();
			progressBar.setBounds(10, 281, 317, 14);
			contentPane.add(progressBar);
		
		
		
	}
}
