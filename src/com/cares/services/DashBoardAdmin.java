package com.cares.services;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;

import javax.swing.JScrollPane;

public class DashBoardAdmin extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoardAdmin frame = new DashBoardAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DashBoardAdmin() {
				
		Vector columnNames = new Vector();
		Vector data = new Vector();
			PreparedStatement stm = null;
			Connection con = null;
			Statement stmt = null;
			ResultSet rs = null;
			
			try {

				Class.forName("oracle.jdbc.driver.OracleDriver");

				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "0503");

				String sql = "select * from registration ";
				stm = con.prepareStatement(sql);
				rs= stm.executeQuery();
				ResultSetMetaData rm = rs.getMetaData();
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
			} catch(NumberFormatException e) {
				
				JOptionPane.showMessageDialog(null, "Enter Only Numbers  ");
			}
			catch (Exception e) {
				
			}
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 924, 554);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3_2 = new JLabel("Coronavirus disease (COVID-19): Vaccines");
		lblNewLabel_3_2.setBounds(131, 5, 655, 44);
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 25));
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setBounds(0, 0, 941, 55);
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\heading.jpg"));
		contentPane.add(lblNewLabel_2_1);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 84, 255, 280);
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setVisible(false);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel((String) null);
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_1.setBounds(10, 11, 215, 19);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel((String) null);
		lblNewLabel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_1_1.setBounds(10, 41, 215, 19);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel((String) null);
		lblNewLabel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_1_2.setBounds(10, 71, 215, 19);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel((String) null);
		lblNewLabel_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_1_3.setBounds(10, 101, 215, 19);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel((String) null);
		lblNewLabel_1_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_1_4.setBounds(10, 131, 215, 19);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel((String) null);
		lblNewLabel_1_5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_1_5.setBounds(10, 161, 215, 19);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("LOG OUT");
		lblNewLabel_3_3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login n = new Login();
				n.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_3_3_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3_3_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_3_3_2.setBounds(75, 202, 78, 19);
		panel.add(lblNewLabel_3_3_2);
		
		
		JLabel lblNewLabel_3_3_1 = new JLabel("");
		lblNewLabel_3_3_1.setBounds(0, 55, 39, 34);
		lblNewLabel_3_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setVisible(true);
			}
		});
		lblNewLabel_3_3_1.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\menu_icon1.jpg"));
		contentPane.add(lblNewLabel_3_3_1);
		
		
		JLabel lblNewLabel_3_3_2_1 = new JLabel("Cancel");
		lblNewLabel_3_3_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setVisible(false);
			}
		});
		lblNewLabel_3_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_3_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_3_3_2_1.setBounds(75, 245, 78, 19);
		panel.add(lblNewLabel_3_3_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\log out.png"));
		lblNewLabel_4.setBounds(40, 193, 30, 30);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\cancle.png"));
		lblNewLabel_7.setBounds(40, 234, 25, 30);
		panel.add(lblNewLabel_7);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(60, 258, 802, 230);
		contentPane.add(scrollPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane);
		
		table = new JTable(data,columnNames) {
			public Class getColumnClass(int column) {
				for(int row =0;row<getRowCount();row++) {
					Object o = getValueAt(row,column);
					if(o!=null) {
					return o.getClass();
					}
				}
				return Object.class;
			}
		};
		
		scrollPane.setViewportView(table);
	}
}
