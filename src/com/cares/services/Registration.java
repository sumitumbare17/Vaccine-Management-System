package com.cares.services;

import java.awt.EventQueue;
import com.cares.dao.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.BorderLayout;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 940, 687);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(900, 700));
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		ArrayList al = new ArrayList();
		
		JSeparator separator = new JSeparator();
		separator.setBounds(191, 169, 36, -20);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(156, 175, 52, -14);
		separator_1.setBackground(Color.GRAY);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(150, 207, -39, 7);
		contentPane.add(separator_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Coronavirus disease (COVID-19): Vaccines");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 25));
		lblNewLabel_3_1.setBounds(116, 5, 655, 44);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\heading.jpg"));
		lblNewLabel_2_1.setBounds(-3, 0, 927, 55);
		contentPane.add(lblNewLabel_2_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 149, 237));
		panel.setBorder(new MatteBorder(0, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel.setBounds(58, 151, 810, 484);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("First Name");
		lblNewLabel_1_1.setBounds(23, 36, 68, 17);
		panel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel_2 = new JLabel("* Enter Valid First Name");
		lblNewLabel_2.setBounds(114, 67, 134, 17);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(Color.RED);
		
		textField = new JTextField();
		textField.setBounds(117, 36, 159, 20);
		panel.add(textField);
		textField.setBackground(Color.CYAN);
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textField.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(117, 116, 159, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1_3_1 = new JLabel(" Phone No");
		lblNewLabel_1_3_1.setBounds(23, 111, 93, 28);
		panel.add(lblNewLabel_1_3_1);
		lblNewLabel_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel_2_3 = new JLabel("*  Enter Valid Phone No");
		lblNewLabel_2_3.setBounds(127, 147, 159, 17);
		panel.add(lblNewLabel_2_3);
		lblNewLabel_2_3.setForeground(Color.RED);
		
		JLabel lblNewLabel_1_3_2 = new JLabel(" DOB :");
		lblNewLabel_1_3_2.setBounds(23, 197, 93, 28);
		panel.add(lblNewLabel_1_3_2);
		lblNewLabel_1_3_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel_2_5 = new JLabel("* Select Correct Date");
		lblNewLabel_2_5.setBounds(114, 222, 159, 14);
		panel.add(lblNewLabel_2_5);
		lblNewLabel_2_5.setForeground(Color.RED);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(114, 197, 159, 20);
		panel.add(dateChooser);
		dateChooser.setDateFormatString("dd-MM-yyyy");
		
		textField_2 = new JTextField();
		textField_2.setBounds(526, 35, 159, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setBounds(423, 30, 93, 28);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel_2_2 = new JLabel("* Enter Valid Last Name");
		lblNewLabel_2_2.setBounds(548, 55, 120, 17);
		panel.add(lblNewLabel_2_2);
		lblNewLabel_2_2.setForeground(Color.RED);
		
		JLabel lblNewLabel_1_3 = new JLabel(" Email ID");
		lblNewLabel_1_3.setBounds(409, 111, 93, 28);
		panel.add(lblNewLabel_1_3);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		textField_3 = new JTextField();
		textField_3.setBounds(526, 116, 159, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2_4 = new JLabel(" * Enter Valid Email");
		lblNewLabel_2_4.setBounds(523, 135, 134, 17);
		panel.add(lblNewLabel_2_4);
		lblNewLabel_2_4.setForeground(Color.RED);
		
		textField_6 = new JTextField();
		textField_6.setBounds(509, 181, 159, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_1_3_2_1_1 = new JLabel(" Aadhaar No");
		lblNewLabel_1_3_2_1_1.setBounds(409, 176, 93, 28);
		panel.add(lblNewLabel_1_3_2_1_1);
		lblNewLabel_1_3_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel_2_6 = new JLabel("* Enter valid Aadhaar No");
		lblNewLabel_2_6.setBounds(526, 203, 159, 19);
		panel.add(lblNewLabel_2_6);
		lblNewLabel_2_6.setForeground(Color.RED);
		
		JLabel lblNewLabel_1_3_2_1 = new JLabel(" Gender");
		lblNewLabel_1_3_2_1.setBounds(10, 248, 93, 28);
		panel.add(lblNewLabel_1_3_2_1);
		lblNewLabel_1_3_2_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(114, 254, 169, 22);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female", "Other"}));
		
		JLabel lblNewLabel_3 = new JLabel("* Select Apropriate Gender");
		lblNewLabel_3.setBounds(129, 287, 147, 14);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(Color.RED);
		
		JLabel lblNewLabel_5 = new JLabel("* Enter Pass");
		lblNewLabel_5.setBounds(129, 364, 122, 14);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setForeground(Color.RED);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(130, 341, 146, 20);
		panel.add(passwordField);
		
		JLabel lblNewLabel_1_3_2_1_2 = new JLabel("Enter Password");
		lblNewLabel_1_3_2_1_2.setBounds(10, 336, 120, 28);
		panel.add(lblNewLabel_1_3_2_1_2);
		lblNewLabel_1_3_2_1_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel_6 = new JLabel("* Enter address");
		lblNewLabel_6.setBounds(526, 273, 159, 14);
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setForeground(Color.RED);
		

		textField_8 = new JTextField();
		textField_8.setBounds(526, 242, 159, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Address");
		lblNewLabel_7.setBounds(425, 239, 93, 24);
		panel.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(526, 328, 159, 20);
		panel.add(passwordField_1);
		
		JLabel lblNewLabel_4 = new JLabel("* Confirm Pass Is Incorrect");
		lblNewLabel_4.setBounds(536, 364, 166, 14);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setForeground(Color.RED);
		
		JLabel lblNewLabel_1_3_2_1_2_1 = new JLabel("Confirm Password");
		lblNewLabel_1_3_2_1_2_1.setBounds(398, 323, 120, 28);
		panel.add(lblNewLabel_1_3_2_1_2_1);
		lblNewLabel_1_3_2_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(114, 414, 147, 43);
		panel.add(btnSubmit);
		btnSubmit.setBorderPainted(false);
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnSubmit.setBackground(Color.BLUE);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(336, 413, 129, 43);
		panel.add(btnReset);
		btnReset.setForeground(Color.WHITE);
		btnReset.setBorderPainted(false);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBackground(new Color(0, 204, 102));
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(526, 413, 120, 43);
		panel.add(btnBack);
		btnBack.setForeground(Color.WHITE);
		btnBack.setBorderPainted(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home_page hp = new Home_page();
				setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBack.setBackground(new Color(255, 0, 0));
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\wallpaper2you_172698.jpg"));
		lblNewLabel_9.setBounds(0, 0, 810, 494);
		panel.add(lblNewLabel_9);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(206, 128, -137, -14);
		contentPane.add(separator_3);
		
		JLabel lblNewLabel = new JLabel(" Registration");
		lblNewLabel.setBounds(370, 105, 159, 43);
		contentPane.add(lblNewLabel);
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBorder(new MatteBorder(3, 0, 0, 0, (Color) new Color(0, 0, 0)));
		separator_4.setBounds(49, 128, 323, 21);
		contentPane.add(separator_4);
		
		JSeparator separator_4_1 = new JSeparator();
		separator_4_1.setBorder(new MatteBorder(3, 0, 0, 0, (Color) new Color(0, 0, 0)));
		separator_4_1.setBounds(529, 126, 339, 21);
		contentPane.add(separator_4_1);
		
		JSeparator separator_4_2 = new JSeparator();
		separator_4_2.setBorder(new MatteBorder(0, 3, 0, 0, (Color) new Color(0, 0, 0)));
		separator_4_2.setBounds(47, 128, 298, 30);
		contentPane.add(separator_4_2);
		
		JSeparator separator_4_3 = new JSeparator();
		separator_4_3.setBorder(new MatteBorder(0, 0, 0, 3, (Color) new Color(0, 0, 0)));
		separator_4_3.setBounds(795, 126, 77, 35);
		contentPane.add(separator_4_3);
		
		JSeparator separator_4_4 = new JSeparator();
		separator_4_4.setBorder(new MatteBorder(0, 3, 3, 3, (Color) new Color(0, 0, 0)));
		separator_4_4.setBounds(47, 145, 825, 503);
		contentPane.add(separator_4_4);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\wallpaper2you_172698.jpg"));
		lblNewLabel_8.setBounds(-3, 54, 917, 594);
		contentPane.add(lblNewLabel_8);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			//	textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				dateChooser.setDate(null);
				textField_6.setText("");
				passwordField_1.setText(null);
				passwordField.setText(null);
				
				lblNewLabel_2.setVisible(false);
			//	lblNewLabel_2_1.setVisible(false);
				lblNewLabel_2_2.setVisible(false);
				lblNewLabel_2_3.setVisible(false);
				lblNewLabel_2_4.setVisible(false);
				lblNewLabel_2_5.setVisible(false);
				lblNewLabel_2_6.setVisible(false);
				comboBox.setSelectedIndex(0);
				lblNewLabel_3.setVisible(false);
				lblNewLabel_4.setVisible(false);
				 lblNewLabel_5.setVisible(false);
				 
				 
				
			}
		});
		btnSubmit.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
			boolean b;
			int a = 0;
			int c =0;
			
				lblNewLabel_2.setVisible(false);
			//	lblNewLabel_2_1.setVisible(false);
				lblNewLabel_2_2.setVisible(false);
				lblNewLabel_2_3.setVisible(false);
				lblNewLabel_2_4.setVisible(false);
				lblNewLabel_2_5.setVisible(false);
				lblNewLabel_2_6.setVisible(false);
				lblNewLabel_3.setVisible(false);
				lblNewLabel_4.setVisible(false);
				 lblNewLabel_5.setVisible(false);
				 
				 
			
			 b =Pattern.compile("([a-zA-Z]{3,30}\s*)+").matcher(textField.getText()).matches(); 
			 if(b==false) { 
				 lblNewLabel_2.setVisible(true);
				 a=1;
							}
			 else {al.add(textField.getText());}
			 
		/*	 b =Pattern.compile("([a-zA-Z]{3,30}\s*)+").matcher(textField_1.getText()).matches(); 
			 if(b==false) { 
				 lblNewLabel_2_1.setVisible(true);
							}
*/
			 b =Pattern.compile("[a-zA-Z]{3,30}").matcher(textField_2.getText()).matches(); 
			 if(b==false) { 
				 lblNewLabel_2_2.setVisible(true);
				 a=1;
							}
			 else {al.add(textField_2.getText());}
			 
				 b =Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$").matcher(textField_3.getText()).matches(); 
				 if(b==false) { 
					 lblNewLabel_2_4.setVisible(true);
					 a=1;
								}
				 else {al.add(textField_3.getText());}
				 
				 b =Pattern.compile("^\\d{10}$").matcher(textField_4.getText()).matches(); 
				 if(b==false) { 
					 lblNewLabel_2_3.setVisible(true);
					 a=1;
								}
				 else { al.add(textField_4.getText()); }
				 
				 b =Pattern.compile("^[2-9]{1}[0-9]{3}[0-9]{4}[0-9]{4}$").matcher(textField_6.getText()).matches(); 
				 if(b==false) { 
					 lblNewLabel_2_6.setVisible(true);
					 a=1;
								}
				 else {al.add(textField_6.getText());}
				 
				
				if(comboBox.getSelectedIndex()==0)
				{
					lblNewLabel_3.setVisible(true);
					 a=1;
				}
				else {al.add(comboBox.getSelectedItem().toString());}
				
				
				 b =Pattern.compile("").matcher(passwordField.getText()).matches(); 
				 if(b==true) { 
					 lblNewLabel_5.setVisible(true);
					 a=1;
					 }
				
				if(!passwordField_1.getText().equals(passwordField.getText())) {
					lblNewLabel_4.setVisible(true);
					 a=1;
				}
				else {al.add(passwordField_1.getText());}
				
				if(textField_8.getText()==null) {
					lblNewLabel_6.setVisible(true);
					 a=1;
				}
				else{al.add(textField_8.getText());}
				
				if (dateChooser.getDate()==null) {
					lblNewLabel_2_5.setVisible(true);
					a=1;
				}else {
					SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd");
					String stringDate= DateFor.format(dateChooser.getDate());
					//String stringDate= dateChooser.getDate().toString();
					al.add(stringDate);
				}
				
				
			if(a==0) {
			DataBase db = new DataBase();
			 c = db.insertIntoDB(al);
			JOptionPane.showMessageDialog(null, c);
			}
			if(c==1) {
				JOptionPane.showMessageDialog(null, "Succesfully Submited");
				}
			else {JOptionPane.showMessageDialog(null, " Dosent Submited");
			a=0;}
			
			}
			
			
		    
			});
		lblNewLabel_4.setVisible(false);
		lblNewLabel_6.setVisible(false);
		lblNewLabel_5.setVisible(false);
		lblNewLabel_3.setVisible(false);
		lblNewLabel_2_6.setVisible(false);
		lblNewLabel_2_4.setVisible(false);
		lblNewLabel_2_2.setVisible(false);
		lblNewLabel_2_5.setVisible(false);
		lblNewLabel_2_3.setVisible(false);
		lblNewLabel_2.setVisible(false);
		
		
		

		
	}
}
