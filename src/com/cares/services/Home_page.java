package com.cares.services;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class Home_page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_page frame = new Home_page();
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
	public Home_page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLUE, 5, true));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 65, 414, 185);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(175, 64, 89, 23);
		panel.add(btnNewButton);
		btnNewButton.setBorder(new LineBorder(new Color(255, 255, 0), 3, true));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login lg = new Login();
				lg.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnNewButton_1 = new JButton("Sign UP");
		btnNewButton_1.setBounds(175, 127, 89, 23);
		panel.add(btnNewButton_1);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration reg = new Registration();
				reg.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\1598055738172.jpg"));
		lblNewLabel_1.setBounds(0, 0, 414, 185);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(0, 87, 414, 43);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\coronavirus-2.tmb-479v.jpg"));
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel_1.setBounds(10, 11, 414, 43);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOME PAGE");
		lblNewLabel.setBounds(157, 11, 101, 24);
		panel_1.add(lblNewLabel);
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD, 20));
	}
}
