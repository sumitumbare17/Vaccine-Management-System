package com.cares.services;

import java.awt.EventQueue;

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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;

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
		setBounds(100, 100, 536, 488);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 5, 419, 52);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Registration Page");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(82, 11, 256, 30);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(37, 124, 93, 28);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(140, 74, 159, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("First Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(37, 68, 93, 28);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(140, 104, 159, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("MiddleName");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(37, 98, 93, 28);
		contentPane.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(140, 130, 159, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_3 = new JLabel(" Email ID");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(37, 181, 93, 28);
		contentPane.add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(140, 187, 159, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(140, 161, 159, 20);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_3_1 = new JLabel(" Phone No");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_1.setBounds(37, 153, 93, 28);
		contentPane.add(lblNewLabel_1_3_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(140, 250, 159, 20);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_1_3_2 = new JLabel(" DOB :");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_2.setBounds(37, 212, 93, 28);
		contentPane.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_2_1 = new JLabel(" Zender");
		lblNewLabel_1_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_2_1.setBounds(37, 273, 93, 28);
		contentPane.add(lblNewLabel_1_3_2_1);
		
		JLabel lblNewLabel_1_3_2_1_1 = new JLabel(" Aadhaar No");
		lblNewLabel_1_3_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_2_1_1.setBounds(37, 244, 93, 28);
		contentPane.add(lblNewLabel_1_3_2_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("* Enter Valid First Name");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(309, 76, 134, 17);
		lblNewLabel_2.setVisible(false);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("* Enter Valid Middle Name");
		lblNewLabel_2_1.setForeground(Color.RED);
		lblNewLabel_2_1.setBounds(309, 107, 159, 17);
		lblNewLabel_2_1.setVisible(false);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("* Enter Valid Last Name");
		lblNewLabel_2_2.setForeground(Color.RED);
		lblNewLabel_2_2.setBounds(309, 133, 120, 17);
		lblNewLabel_2_2.setVisible(false);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("*  Enter Valid Phone No");
		lblNewLabel_2_3.setForeground(Color.RED);
		lblNewLabel_2_3.setBounds(309, 164, 159, 17);
		lblNewLabel_2_3.setVisible(false);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel(" * Enter Valid Email");
		lblNewLabel_2_4.setForeground(Color.RED);
		lblNewLabel_2_4.setBounds(309, 190, 134, 17);
		lblNewLabel_2_4.setVisible(false);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("* Select Correct Date");
		lblNewLabel_2_5.setForeground(Color.RED);
		lblNewLabel_2_5.setBounds(309, 221, 147, 17);
		lblNewLabel_2_5.setVisible(false);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("* Enter valid Aadhaar No");
		lblNewLabel_2_6.setForeground(Color.RED);
		lblNewLabel_2_6.setBounds(309, 251, 159, 19);
		lblNewLabel_2_6.setVisible(false);
		contentPane.add(lblNewLabel_2_6);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(140, 218, 159, 20);
		contentPane.add(dateChooser);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female", "Other"}));
		comboBox.setBounds(141, 281, 147, 22);
		contentPane.add(comboBox);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(Color.BLACK);
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSubmit.setBackground(Color.WHITE);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			boolean b;
			
			 b =Pattern.compile("").matcher(textField.getText()).matches(); 
			 if(b==true) { 
				 lblNewLabel_2.setVisible(true);
							}
			 b =Pattern.compile("").matcher(textField_1.getText()).matches(); 
			 if(b==true) { 
				 lblNewLabel_2_1.setVisible(true);
							}

			 b =Pattern.compile("").matcher(textField_2.getText()).matches(); 
			 if(b==true) { 
				 lblNewLabel_2_2.setVisible(true);
							}
			 
				 b =Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$").matcher(textField_3.getText()).matches(); 
				 if(b==false) { 
					 lblNewLabel_2_4.setVisible(true);
								}
				 
				 b =Pattern.compile("^\\d{10}$").matcher(textField_4.getText()).matches(); 
				 if(b==false) { 
					 lblNewLabel_2_3.setVisible(true);
								}
				 
				 b =Pattern.compile("^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$").matcher(textField_6.getText()).matches(); 
				 if(b==false) { 
					 lblNewLabel_2_6.setVisible(true);
								}
				if( dateChooser.getDate()==null) {
					lblNewLabel_2_5.setVisible(true);
				}
				 
			}
		});
		btnSubmit.setBounds(53, 344, 98, 28);
		contentPane.add(btnSubmit);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBackground(Color.WHITE);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				dateChooser.setDate(null);
				textField_6.setText("");
				lblNewLabel_2.setVisible(false);
				lblNewLabel_2_1.setVisible(false);
				lblNewLabel_2_2.setVisible(false);
				lblNewLabel_2_3.setVisible(false);
				lblNewLabel_2_4.setVisible(false);
				lblNewLabel_2_5.setVisible(false);
				lblNewLabel_2_6.setVisible(false);
				comboBox.setSelectedIndex(0);
				
			}
		});
		btnReset.setBounds(173, 344, 104, 28);
		contentPane.add(btnReset);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home_page hp = new Home_page();
				setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(300, 344, 104, 28);
		contentPane.add(btnBack);
		
		
		
		
	}
}
