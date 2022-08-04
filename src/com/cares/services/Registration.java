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
		setBounds(100, 100, 800, 584);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(900, 700));
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 5, 817, 112);
		panel.setBackground(SystemColor.menu);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("COVID-19 Vaccine Registration Form");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(105, 28, 547, 43);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setBounds(379, 144, 93, 28);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("First Name");
		lblNewLabel_1_1.setBounds(37, 144, 93, 28);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(536, 149, 159, 20);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_3 = new JLabel(" Email ID");
		lblNewLabel_1_3.setBounds(379, 207, 93, 28);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(536, 212, 159, 20);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(140, 212, 159, 20);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_3_1 = new JLabel(" Phone No");
		lblNewLabel_1_3_1.setBounds(37, 207, 93, 28);
		lblNewLabel_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1_3_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(536, 276, 159, 20);
		textField_6.setColumns(10);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_1_3_2 = new JLabel(" DOB :");
		lblNewLabel_1_3_2.setBounds(37, 271, 93, 28);
		lblNewLabel_1_3_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_2_1 = new JLabel(" Gender");
		lblNewLabel_1_3_2_1.setBounds(37, 352, 93, 28);
		lblNewLabel_1_3_2_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1_3_2_1);
		
		JLabel lblNewLabel_1_3_2_1_1 = new JLabel(" Aadhaar No");
		lblNewLabel_1_3_2_1_1.setBounds(379, 271, 93, 28);
		lblNewLabel_1_3_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1_3_2_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("* Enter Valid First Name");
		lblNewLabel_2.setBounds(140, 184, 134, 17);
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setVisible(false);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("* Enter Valid Last Name");
		lblNewLabel_2_2.setBounds(536, 180, 120, 17);
		lblNewLabel_2_2.setForeground(Color.RED);
		lblNewLabel_2_2.setVisible(false);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("*  Enter Valid Phone No");
		lblNewLabel_2_3.setBounds(140, 243, 159, 17);
		lblNewLabel_2_3.setForeground(Color.RED);
		lblNewLabel_2_3.setVisible(false);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel(" * Enter Valid Email");
		lblNewLabel_2_4.setBounds(536, 243, 134, 17);
		lblNewLabel_2_4.setForeground(Color.RED);
		lblNewLabel_2_4.setVisible(false);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("* Select Correct Date");
		lblNewLabel_2_5.setBounds(140, 310, 147, 17);
		lblNewLabel_2_5.setForeground(Color.RED);
		lblNewLabel_2_5.setVisible(false);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("* Enter valid Aadhaar No");
		lblNewLabel_2_6.setBounds(536, 309, 159, 19);
		lblNewLabel_2_6.setForeground(Color.RED);
		lblNewLabel_2_6.setVisible(false);
		contentPane.add(lblNewLabel_2_6);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(140, 279, 159, 20);
		contentPane.add(dateChooser);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(140, 356, 147, 22);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female", "Other"}));
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("* Select Apropriate Gender");
		lblNewLabel_3.setBounds(140, 390, 147, 14);
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setVisible(false);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("* Confirm Pass Is Incorrect");
		lblNewLabel_4.setBounds(536, 447, 166, 14);
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setVisible(false);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("* Enter Pass");
		lblNewLabel_5.setBounds(151, 447, 122, 14);
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setVisible(false);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("* Enter address");
		lblNewLabel_6.setBounds(536, 390, 159, 14);
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setVisible(false);
		contentPane.add(lblNewLabel_6);
		

		textField_8 = new JTextField();
		textField_8.setBounds(536, 357, 159, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(167, 416, 146, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(552, 416, 146, 20);
		contentPane.add(passwordField_1);
		
		
		ArrayList al = new ArrayList();
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(41, 491, 147, 43);
		btnSubmit.setBorderPainted(false);
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnSubmit.setBackground(Color.BLUE);
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
				comboBox.setSelectedIndex(0);
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
				 
				if( dateChooser.getDate()==null) {
					lblNewLabel_2_5.setVisible(true);
					 a=1;
				}
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
			
				textField.setText("");
			//	textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				dateChooser.setDate(null);
				textField_6.setText("");
				passwordField_1.setText(null);
				passwordField.setText(null);
				}
		    
			});
		contentPane.add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(343, 490, 129, 43);
		btnReset.setForeground(Color.WHITE);
		btnReset.setBorderPainted(false);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBackground(new Color(0, 204, 102));
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
		contentPane.add(btnReset);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(627, 490, 120, 43);
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
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_1_3_2_1_2 = new JLabel("Enter Password");
		lblNewLabel_1_3_2_1_2.setBounds(37, 411, 120, 28);
		lblNewLabel_1_3_2_1_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1_3_2_1_2);
		
		JLabel lblNewLabel_1_3_2_1_2_1 = new JLabel("Confirm Password");
		lblNewLabel_1_3_2_1_2_1.setBounds(379, 411, 120, 28);
		lblNewLabel_1_3_2_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1_3_2_1_2_1);
		
		textField = new JTextField();
		textField.setBounds(140, 150, 159, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Address");
		lblNewLabel_7.setBounds(390, 352, 93, 24);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblNewLabel_7);
		
		
		

		
	}
}
