package com.cares.services;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.cares.dao.DataBase;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.MatteBorder;
import javax.swing.JSeparator;

public class VaccineBooking extends JFrame {
	private JTextField phno;
	public int a;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VaccineBooking frame = new VaccineBooking("");
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
	public VaccineBooking(String Adhar) {
		
		DataBase Db = new DataBase();
		Db.getDetails(Adhar);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 921, 560);
		JPanel contentPane = new JPanel();
		contentPane.setToolTipText("Select Center");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3_2 = new JLabel("Coronavirus disease (COVID-19): Vaccines");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 25));
		lblNewLabel_3_2.setBounds(83, 11, 655, 44);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\heading.jpg"));
		lblNewLabel_2.setBounds(0, 0, 918, 55);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Enter Your Phone NO");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(185, 169, 141, 14);
		contentPane.add(lblNewLabel);
		
		phno = new JTextField();
		phno.setBounds(385, 167, 154, 20);
		contentPane.add(phno);
		phno.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Select Your Vaccine");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(185, 223, 141, 19);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Covishild");
		rdbtnNewRadioButton.setBounds(385, 222, 96, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Covaxin");
		rdbtnNewRadioButton_1.setBounds(385, 254, 96, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton);
		
		JLabel pno_error = new JLabel("New label");
		pno_error.setForeground(Color.RED);
		pno_error.setBounds(567, 169, 163, 17);
		pno_error.setVisible(false);
		contentPane.add(pno_error);
		
		JLabel lblNewLabel_5 = new JLabel("*Select Center");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setBounds(555, 312, 116, 14);
		lblNewLabel_5.setVisible(false);
		contentPane.add(lblNewLabel_5);
		
		JLabel vaccine_error1 = new JLabel("New label");
		vaccine_error1.setForeground(Color.RED);
		vaccine_error1.setBounds(511, 243, 116, 14);
		vaccine_error1.setVisible(false);
		contentPane.add(vaccine_error1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Center", "CNS Hospital", "Shiv Santoshi Hospital", "CIVIL Hospital", ""}));
		comboBox.setBounds(387, 308, 131, 22);
		contentPane.add(comboBox);
		
		
		JButton btnNewButton = new JButton("BOOK ");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String vaccine= "";
				
				int c = 0;
			if(phno.getText()==" ") {
				pno_error.setText("Enter Your Phone No");
				pno_error.setVisible(true);
				c=1;
			}else
			if(phno.getText().equals(Db.PHONE))
				{
				DashBoard db = new DashBoard(Adhar);
				LocalDate dob = LocalDate.parse(Db.dob);  
				int age = db.calculateAge(dob );
				if(!rdbtnNewRadioButton.isSelected()&&!rdbtnNewRadioButton_1.isSelected())
				{
					vaccine_error1.setText("Select Your Vaccine ");
					vaccine_error1.setVisible(true);
					c=1;
				}
			
				if(rdbtnNewRadioButton.isSelected()) {
					vaccine="Covishild";
				}
				else {
					vaccine="Covaxin";
				}
				//vaccine= group.getSelection().getActionCommand();
				System.out.println(vaccine);
				if(vaccine=="Covishild")
				{
					if(age>=18)
					{
					a=1;
					rdbtnNewRadioButton.setSelected(true);
					
					}
					else
					{
						JOptionPane.showMessageDialog(null, "YOU ARE UNDER 18 You Have TO Take Covaxin ");
						rdbtnNewRadioButton_1.setSelected(true);
						
					}
					if(comboBox.getSelectedIndex()==0)
					{
						lblNewLabel_5.setVisible(true);
						c=1;
					}
					
					
				}
				}else {
					pno_error.setText("*Enter Registred Number ");
					pno_error.setVisible(true);
					c=1;
			}
			if(c==0) {
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
				   LocalDateTime now = LocalDateTime.now();   
				Db.avaiblity(vaccine , comboBox.getSelectedItem().toString(),Adhar,dtf.format(now));
			}
			}
		});
		btnNewButton.setBounds(328, 394, 96, 34);
		contentPane.add(btnNewButton);
		
		
		
		
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Select Your Center ");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(185, 311, 141, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Vaccine Booking");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(320, 85, 141, 34);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\White_full.png"));
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4_1.setBounds(307, 85, 154, 34);
		contentPane.add(lblNewLabel_4_1);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		separator.setBounds(89, 95, 628, 371);
		contentPane.add(separator);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("");
		lblNewLabel_4_1_1.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\BACK.jpg"));
		lblNewLabel_4_1_1.setBounds(802, 472, 37, 38);
		contentPane.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\low_poly_banner_design_1711.jpg"));
		lblNewLabel_6.setBounds(0, 55, 905, 466);
		contentPane.add(lblNewLabel_6);
		
	}
}
