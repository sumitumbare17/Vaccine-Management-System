package com.cares.services;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
		setBounds(new Rectangle(0, 0, 900, 700));
		setMaximumSize(new Dimension(900, 700));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 608);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 84, 391, 468);
		panel_1.setMaximumSize(new Dimension(300, 600));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\vaccinefu.jpg"));
		lblNewLabel_2.setBounds(0, 0, 391, 468);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(425, 84, 347, 468);
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 6, true));
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(57, 149, 241, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBorder(new LineBorder(new Color(102, 102, 204), 3, true));
		btnNewButton.setBounds(57, 315, 241, 31);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home_page hp= new Home_page();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField_1 = new JTextField();
		textField_1.setBounds(57, 205, 243, 24);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("LOGIN ");
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(102, 102, 204));
		btnNewButton_1.setBounds(55, 255, 243, 31);
		panel.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1 = new JLabel("  User ID");
		lblNewLabel_1.setBounds(57, 124, 99, 25);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_1_1 = new JLabel("  PassWord");
		lblNewLabel_1_1.setBounds(57, 180, 99, 25);
		panel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(160, 160, 160), 6));
		panel_2.setBounds(10, 11, 327, 87);
		panel.add(panel_2);
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  Login  ");
		lblNewLabel.setBounds(124, 29, 83, 29);
		panel_2.add(lblNewLabel);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Utsaah", Font.BOLD, 26));
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\jdoctor.jpg"));
		lblNewLabel_5.setBounds(10, 11, 307, 65);
		panel_2.add(lblNewLabel_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 11, 762, 62);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\cowin.jpg"));
		lblNewLabel_4.setBounds(191, 0, 350, 62);
		panel_3.add(lblNewLabel_4);
	}
}
