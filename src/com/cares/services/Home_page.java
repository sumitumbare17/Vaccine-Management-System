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
		setBounds(100, 100, 832, 515);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel_1.setBounds(10, 11, 763, 169);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 62, 763, 386);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(295, 244, 89, 23);
		panel.add(btnNewButton);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(new LineBorder(new Color(255, 255, 0), 3, true));
		btnNewButton.setBackground(new Color(51, 0, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login lg = new Login();
				lg.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JButton btnNewButton_1 = new JButton("Sign UP");
		btnNewButton_1.setBounds(295, 296, 89, 23);
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
		
		JLabel lblNewLabel = new JLabel("Registration Or Login For Vaccination");
		lblNewLabel.setBounds(192, 186, 303, 24);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD, 20));
	}
}
