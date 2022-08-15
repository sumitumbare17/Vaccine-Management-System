package com.cares.services;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.cares.dao.DataBase;
import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Random;
import javax.swing.JPasswordField;

public class EditProfile extends JFrame {

	private JPanel contentPane;
	private JTextField fname;
	private JTextField lname;
	private JTextField phno;
	private JTextField email;
	private JTextField add;
	private JTextField dob;
public int OTP=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditProfile frame = new EditProfile("");
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
	public EditProfile(String Adhar) {
		
		DataBase db = new DataBase();
		db.getDetails(Adhar);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 944, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Coronavirus disease (COVID-19): Vaccines");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 25));
		lblNewLabel_3.setBounds(127, 11, 655, 44);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\heading.jpg"));
		lblNewLabel_2.setBounds(0, 0, 918, 55);
		contentPane.add(lblNewLabel_2);
		
		
		ArrayList al = new  ArrayList();
		
		JLabel lblNewLabel_1_1 = new JLabel("First Name");
		lblNewLabel_1_1.setBounds(143, 169, 68, 17);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		fname = new JTextField();
		fname.setBounds(250, 168, 159, 20);
		fname.setColumns(10);
		fname.setText(db.fname);
		
		JLabel lblNewLabel_1_3_1 = new JLabel(" Phone No");
		lblNewLabel_1_3_1.setBounds(143, 210, 93, 28);
		lblNewLabel_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		phno = new JTextField();
		phno.setBounds(250, 215, 159, 20);
		phno.setColumns(10);
		phno.setText(db.PHONE);
		
		JLabel lblNewLabel_1_3_2 = new JLabel(" DOB :");
		lblNewLabel_1_3_2.setBounds(143, 268, 93, 28);
		lblNewLabel_1_3_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		dob = new JTextField();
		dob.setBounds(250, 273, 159, 20);
		dob.setColumns(10);
		dob.setText(db.dob);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setBounds(493, 163, 93, 28);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		lname = new JTextField();
		lname.setBounds(577, 168, 159, 20);
		lname.setColumns(10);
		lname.setText(db.lname);
		
		JLabel lblNewLabel_1_3 = new JLabel(" Email ID");
		lblNewLabel_1_3.setBounds(493, 210, 93, 28);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		email = new JTextField();
		email.setBounds(577, 215, 159, 20);
		email.setColumns(10);
		email.setText(db.EMAIL);
		
		JLabel lblNewLabel_7 = new JLabel("Address");
		lblNewLabel_7.setBounds(493, 269, 93, 26);
		lblNewLabel_7.setForeground(Color.DARK_GRAY);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		add = new JTextField();
		add.setBounds(577, 273, 159, 20);
		contentPane.add(add);
		add.setColumns(10);
		add.setText(db.ADDRESS);
		contentPane.add(lblNewLabel_1_1);
		contentPane.add(fname);
		contentPane.add(lblNewLabel_1_3_1);
		contentPane.add(phno);
		contentPane.add(lblNewLabel_1_3_2);
		contentPane.add(dob);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lname);
		contentPane.add(lblNewLabel_1_3);
		contentPane.add(email);
		contentPane.add(lblNewLabel_7);
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(356, 384, 128, 35);
		contentPane.add(btnNewButton);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setBounds(325, 190, 109, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("New label");
		lblNewLabel_4_1.setForeground(Color.RED);
		lblNewLabel_4_1.setBounds(649, 190, 109, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("New label");
		lblNewLabel_4_2.setForeground(Color.RED);
		lblNewLabel_4_2.setBounds(325, 237, 149, 14);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("New label");
		lblNewLabel_4_3.setForeground(Color.RED);
		lblNewLabel_4_3.setBounds(649, 237, 109, 14);
		contentPane.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("New label");
		lblNewLabel_4_4.setForeground(Color.RED);
		lblNewLabel_4_4.setBounds(325, 295, 109, 14);
		contentPane.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_5 = new JLabel("New label");
		lblNewLabel_4_5.setForeground(Color.RED);
		lblNewLabel_4_5.setBounds(649, 295, 109, 14);
		contentPane.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_5 = new JLabel("  Edit Your Profile ");
		lblNewLabel_5.setIcon(null);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_5.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		lblNewLabel_5.setBounds(342, 79, 164, 35);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("  Edit Your Profile ");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\White_full.png"));
		lblNewLabel.setBounds(342, 79, 164, 35);
		contentPane.add(lblNewLabel);
		lblNewLabel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		separator.setBounds(92, 98, 690, 392);
		contentPane.add(separator);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DashBoard bc= new DashBoard(Adhar);
				bc.setVisible(true);
				setVisible(false);
				
				
			}
		});
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\BACK.jpg"));
		lblNewLabel_6.setBounds(808, 486, 37, 28);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\low_poly_banner_design_1711.jpg"));
		lblNewLabel_8.setBounds(0, 54, 928, 506);
		contentPane.add(lblNewLabel_8);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean b;
				int a = 0;
				int c =0;
				
				
				
				//Fname
				
				 b =Pattern.compile("").matcher(fname.getText()).matches(); 
				 if(b==true) { 
					 lblNewLabel_4.setText("* Enter Name");
					 a=1;
				 }else {

				 b =Pattern.compile("([a-zA-Z]{3,30}\s*)+").matcher(fname.getText()).matches(); 
				 if(b==false) { 
					 lblNewLabel_4.setText("* Enter valid Name");
					 a=1;
								}
				 else {al.add(fname.getText());}
				 }
				 
				 //Last Name 
				 
			 b =Pattern.compile("").matcher(fname.getText()).matches(); 
			 	if(b==true) { 
			 		lblNewLabel_4_1.setText(" * Enter Name");
			 		 a=1;
			 	}
			 	else {
				 b =Pattern.compile("[a-zA-Z]{3,30}").matcher(lname.getText()).matches(); 
				 if(b==false) { 
					 lblNewLabel_4_1.setText("* Enter Valid Name");
					 a=1;
								}
				 else {al.add(lname.getText());}
				 
			}
			 	 //phone no 
				 b =Pattern.compile("^\\d{10}$").matcher(phno.getText()).matches(); 
				 if(b==false) { 
					 lblNewLabel_4_2.setText("* Enter Valid Phone No");
					 a=1;
								}
				 else { al.add(phno.getText()); }
				 
			 	//email
			 	
			 	 b =Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$").matcher(email.getText()).matches(); 
				 if(b==false) { 
					 lblNewLabel_4_3.setText("* Enter Valid Email");
					 a=1;
								}
				 else {al.add(email.getText());}
				 
				//date of birth
				 b =Pattern.compile("").matcher(dob.getText()).matches(); 
				 if(b==true) { 
					 lblNewLabel_4_4.setText("* Enter DOB ");
					 a=1;
				 }else {
				 b =Pattern.compile(" ^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$").matcher(dob.getText()).matches(); 
				 if(b==true) { 
					 lblNewLabel_4_4.setText("* Enter Valid Date");
					 a=1;
				 }else {
					 al.add(dob.getText());
				 }
				 }
				 
				 //address 
				 b =Pattern.compile("").matcher(add.getText()).matches(); 
				 if(b==true) { 
					 lblNewLabel_4_5.setText("* Enter Address");
					 a=1;
				 }else {
					 al.add(add.getText());
				 }
				 
				
				if(a==0) {
					 c = db.UpdateDetails(al , Adhar);
					JOptionPane.showMessageDialog(null, c);
					}
					if(c==1) {
						JOptionPane.showMessageDialog(null, "Succesfully Submited");
						}
					else {JOptionPane.showMessageDialog(null, " Dosent Submited");
					a=0;}
			}
		});
		
		
		
	}
}
