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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField fname;
	private JTextField lname;
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
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(206, 128, -137, -14);
		contentPane.add(separator_3);
		
		JLabel lblNewLabel = new JLabel(" Registration");
		lblNewLabel.setBounds(380, 118, 159, 43);
		contentPane.add(lblNewLabel);
		lblNewLabel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		
		fname = new JTextField();
		fname.setBounds(249, 186, 159, 20);
		contentPane.add(fname);
		fname.setBackground(new Color(255, 255, 255));
		fname.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		fname.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("First Name");
		lblNewLabel_1_1.setBounds(116, 186, 68, 17);
		contentPane.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel_2 = new JLabel("* Enter Valid First Name");
		lblNewLabel_2.setBounds(290, 207, 134, 17);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(Color.RED);
		
		JLabel lblNewLabel_1_3_1 = new JLabel(" Phone No");
		lblNewLabel_1_3_1.setBounds(116, 237, 93, 28);
		contentPane.add(lblNewLabel_1_3_1);
		lblNewLabel_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		textField_4 = new JTextField();
		textField_4.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textField_4.setBounds(249, 242, 159, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_2_3 = new JLabel("*  Enter Valid Phone No");
		lblNewLabel_2_3.setBounds(289, 262, 159, 17);
		contentPane.add(lblNewLabel_2_3);
		lblNewLabel_2_3.setForeground(Color.RED);
		
		JLabel lblNewLabel_1_3_2 = new JLabel(" DOB :");
		lblNewLabel_1_3_2.setBounds(116, 290, 93, 28);
		contentPane.add(lblNewLabel_1_3_2);
		lblNewLabel_1_3_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		dateChooser.setBounds(249, 290, 159, 20);
		contentPane.add(dateChooser);
		dateChooser.setDateFormatString("dd-MM-yyyy");
		
		JLabel lblNewLabel_1_3_2_1 = new JLabel(" Gender");
		lblNewLabel_1_3_2_1.setBounds(116, 329, 93, 28);
		contentPane.add(lblNewLabel_1_3_2_1);
		lblNewLabel_1_3_2_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		comboBox.setBounds(249, 340, 169, 22);
		contentPane.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female", "Other"}));
		
		JLabel lblNewLabel_3 = new JLabel("* Select Apropriate Gender");
		lblNewLabel_3.setBounds(290, 363, 147, 14);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(Color.RED);
		
		JLabel lblNewLabel_1_3_2_1_2 = new JLabel("Enter Password");
		lblNewLabel_1_3_2_1_2.setBounds(116, 396, 120, 28);
		contentPane.add(lblNewLabel_1_3_2_1_2);
		lblNewLabel_1_3_2_1_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		passwordField.setBounds(249, 401, 159, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_5 = new JLabel("* Enter Pass");
		lblNewLabel_5.setBounds(289, 420, 122, 14);
		contentPane.add(lblNewLabel_5);
		lblNewLabel_5.setForeground(Color.RED);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(156, 511, 147, 43);
		contentPane.add(btnSubmit);
		btnSubmit.setBorderPainted(false);
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnSubmit.setBackground(Color.BLUE);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(391, 510, 129, 43);
		contentPane.add(btnReset);
		btnReset.setForeground(Color.WHITE);
		btnReset.setBorderPainted(false);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBackground(new Color(0, 204, 102));
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(601, 510, 120, 43);
		contentPane.add(btnBack);
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
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setBounds(507, 180, 93, 28);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		lname = new JTextField();
		lname.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		lname.setBounds(614, 185, 159, 20);
		contentPane.add(lname);
		lname.setColumns(10);
		
		JLabel lblNewLabel_2_2 = new JLabel("* Enter Valid Last Name");
		lblNewLabel_2_2.setBounds(651, 207, 120, 17);
		contentPane.add(lblNewLabel_2_2);
		lblNewLabel_2_2.setForeground(Color.RED);
		
		JLabel lblNewLabel_1_3 = new JLabel(" Email ID");
		lblNewLabel_1_3.setBounds(507, 237, 93, 28);
		contentPane.add(lblNewLabel_1_3);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		textField_3 = new JTextField();
		textField_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textField_3.setBounds(614, 242, 159, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2_4 = new JLabel(" * Enter Valid Email");
		lblNewLabel_2_4.setBounds(651, 262, 134, 17);
		contentPane.add(lblNewLabel_2_4);
		lblNewLabel_2_4.setForeground(Color.RED);
		
		JLabel lblNewLabel_1_3_2_1_1 = new JLabel(" Aadhaar No");
		lblNewLabel_1_3_2_1_1.setBounds(507, 285, 93, 28);
		contentPane.add(lblNewLabel_1_3_2_1_1);
		lblNewLabel_1_3_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		textField_6 = new JTextField();
		textField_6.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textField_6.setBounds(614, 290, 159, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_2_6 = new JLabel("* Enter valid Aadhaar No");
		lblNewLabel_2_6.setBounds(648, 310, 159, 19);
		contentPane.add(lblNewLabel_2_6);
		lblNewLabel_2_6.setForeground(Color.RED);
		
		JLabel lblNewLabel_7 = new JLabel("Address");
		lblNewLabel_7.setBounds(507, 338, 93, 24);
		contentPane.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		

		textField_8 = new JTextField();
		textField_8.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textField_8.setBounds(612, 341, 159, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("* Enter address");
		lblNewLabel_6.setBounds(658, 363, 159, 14);
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.setForeground(Color.RED);
		
		JLabel lblNewLabel_1_3_2_1_2_1 = new JLabel("Confirm Password");
		lblNewLabel_1_3_2_1_2_1.setBounds(484, 396, 120, 28);
		contentPane.add(lblNewLabel_1_3_2_1_2_1);
		lblNewLabel_1_3_2_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		passwordField_1.setBounds(612, 401, 159, 20);
		contentPane.add(passwordField_1);
		
		JLabel lblNewLabel_4 = new JLabel("* Confirm Pass Is Incorrect");
		lblNewLabel_4.setBounds(641, 420, 166, 14);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setForeground(Color.RED);
		
		JLabel lblNewLabel_2_5 = new JLabel("* Select Correct Date");
		lblNewLabel_2_5.setBounds(282, 309, 103, 20);
		contentPane.add(lblNewLabel_2_5);
		lblNewLabel_2_5.setForeground(Color.RED);
		
		JLabel lblNewLabel_8 = new JLabel(" Registration");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\White_full.png"));
		lblNewLabel_8.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel_8.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_8.setBounds(380, 118, 159, 43);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel(" Registration");
		lblNewLabel_9.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel_9.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_9.setBounds(380, 118, 159, 43);
		contentPane.add(lblNewLabel_9);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		separator_5.setBounds(106, 138, 690, 447);
		contentPane.add(separator_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home_page hp = new Home_page();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\BACK.jpg"));
		lblNewLabel_4_1.setBounds(827, 599, 37, 38);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\low_poly_banner_design_1711.jpg"));
		lblNewLabel_10.setBounds(0, 54, 924, 594);
		contentPane.add(lblNewLabel_10);
		lblNewLabel_2_5.setVisible(false);
		lblNewLabel_4.setVisible(false);
		lblNewLabel_6.setVisible(false);
		lblNewLabel_2_6.setVisible(false);
		lblNewLabel_2_4.setVisible(false);
		lblNewLabel_2_2.setVisible(false);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fname.setText("");
			//	textField_1.setText("");
				lname.setText("");
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
				 
				 
			
			 b =Pattern.compile("([a-zA-Z]{3,30}\s*)+").matcher(fname.getText()).matches(); 
			 if(b==false) { 
				 lblNewLabel_2.setVisible(true);
				 a=1;
							}
			 else {al.add(fname.getText());}
			 
		/*	 b =Pattern.compile("([a-zA-Z]{3,30}\s*)+").matcher(textField_1.getText()).matches(); 
			 if(b==false) { 
				 lblNewLabel_2_1.setVisible(true);
							}
*/
			 b =Pattern.compile("[a-zA-Z]{3,30}").matcher(lname.getText()).matches(); 
			 if(b==false) { 
				 lblNewLabel_2_2.setVisible(true);
				 a=1;
							}
			 else {al.add(lname.getText());}
			 
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
					SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-");
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
		lblNewLabel_5.setVisible(false);
		lblNewLabel_3.setVisible(false);
		lblNewLabel_2_3.setVisible(false);
		lblNewLabel_2.setVisible(false);
		
		
		

		
	}
}
