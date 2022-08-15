package com.cares.services;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import com.cares.dao.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setBounds(new Rectangle(0, 0, 900, 600));
		setMaximumSize(new Dimension(900, 700));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 929, 698);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Log In");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Script MT Bold", Font.BOLD, 29));
		lblNewLabel.setBounds(388, 119, 99, 40);
		contentPane.add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		separator_1.setBackground(Color.WHITE);
		separator_1.setBounds(388, 170, 125, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		separator_3.setBackground(Color.WHITE);
		separator_3.setBounds(388, 157, 125, 2);
		contentPane.add(separator_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(88, 195, 728, 410);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 410, 410);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\can-beat-coronavirus-optimistic-.jpg"));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(456, 222, 241, 29);
		panel.add(passwordField);
		passwordField.setOpaque(false);
		passwordField.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(456, 249, 241, 2);
		panel.add(separator);
		separator.setBackground(Color.BLACK);
		separator.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		textField = new JTextField();
		textField.setBounds(456, 151, 241, 31);
		panel.add(textField);
		
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textField.setOpaque(false);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel(" User ID :");
		lblNewLabel_1.setBounds(450, 115, 93, 25);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_1 = new JLabel("  PassWord :");
		lblNewLabel_1_1.setBounds(444, 200, 99, 25);
		panel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel_3_1 = new JLabel("* Enter Correct Pass");
		lblNewLabel_3_1.setBounds(598, 206, 107, 14);
		panel.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setForeground(Color.RED);
		
		JLabel lblNewLabel_3 = new JLabel("* This Aadhar No is Not Registered ");
		lblNewLabel_3.setBounds(527, 121, 170, 14);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(Color.RED);
		
		JLabel lblNewLabel_8 = new JLabel("* Enter Aadhar No");
		lblNewLabel_8.setBounds(605, 121, 93, 14);
		panel.add(lblNewLabel_8);
		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setVisible(false);
		lblNewLabel_3.setVisible(false);
		lblNewLabel_3_1.setVisible(false);
		
		
		JButton btnNewButton_1 = new JButton("LOGIN ");
		btnNewButton_1.setBackground(new Color(240, 248, 255));
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 191, 255), 3));
		btnNewButton_1.setBounds(512, 324, 115, 29);
		
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("Forgot PassWord");
		lblNewLabel_5.setForeground(Color.BLUE);
		lblNewLabel_5.setVisible(false);
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ForgotPass ps = new ForgotPass(textField.getText());
				ps.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_5.setBounds(527, 278, 86, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3_2 = new JLabel("Coronavirus disease (COVID-19): Vaccines");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 25));
		lblNewLabel_3_2.setBounds(100, 5, 655, 44);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\heading.jpg"));
		lblNewLabel_2_1.setBounds(0, 0, 927, 55);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home_page hp = new Home_page();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\BACK.jpg"));
		lblNewLabel_4.setBounds(822, 610, 37, 38);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\low_poly_banner_design_1711.jpg"));
		lblNewLabel_6.setBounds(0, 55, 913, 604);
		contentPane.add(lblNewLabel_6);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_8.setVisible(false);
				lblNewLabel_3_1.setVisible(false);
				lblNewLabel_3.setVisible(false);
				lblNewLabel_5.setVisible(false);
				
				
				if(textField.getText().equals(""))
				{
					lblNewLabel_8.setVisible(true);
				}
				else {
				
				DataBase db = new DataBase();
				int a = db.login(passwordField.getText(),textField.getText());
				switch (a)
				{
				case 1: 
					lblNewLabel_3.setVisible(true);
					break;
				case 2:
					lblNewLabel_3_1.setVisible(true);
					lblNewLabel_5.setVisible(true);
					
					break;
				}
				
				}
				
			}
		});
		
	}
}
