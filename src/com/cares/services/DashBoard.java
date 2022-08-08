package com.cares.services;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import com.cares.dao.DataBase;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.Period;

import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JLayeredPane;
import java.awt.Label;
import javax.swing.SwingConstants;

public class DashBoard extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard frame = new DashBoard("");
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
	
	
	public static int calculateAge(LocalDate dob)   
	{  
	//creating an instance of the LocalDate class and invoking the now() method      
	//now() method obtains the current date from the system clock in the default time zone      
	LocalDate curDate = LocalDate.now();  
	//calculates the amount of time between two dates and returns the years  
	if ((dob != null) && (curDate != null))   
	{  
	return Period.between(dob, curDate).getYears();  
	}  
	else  
	{  
	return 0;  
	}  
	}  
	
	
	public DashBoard(String Adhar) {
		
		DataBase db = new DataBase();
		db.getDetails(Adhar);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 957, 690);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 84, 219, 365);
		panel.setBackground(Color.WHITE);
		panel.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setVisible(false);
		
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			}
		});
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel_14 = new JLabel("Username");
		lblNewLabel_14.setBounds(136, 23, 94, 14);
		panel.add(lblNewLabel_14);
		lblNewLabel_14.setVisible(false);
		
		JLabel lblNewLabel = new JLabel(Adhar);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_14.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_14.setVisible(false);
			}
		});
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel.setBounds(10, 21, 199, 19);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(db.name);
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_1.setBounds(10, 51, 199, 19);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(db.EMAIL);
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_2.setBounds(10, 81, 199, 19);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(db.GENDER);
		lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_3.setBounds(10, 111, 199, 19);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel(db.PHONE);
		lblNewLabel_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_3_1.setBounds(10, 141, 199, 19);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("Edit Profile");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		lblNewLabel_3_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_3_3.setBounds(59, 271, 78, 19);
		panel.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("LOG OUT");
		lblNewLabel_3_3_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3_3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login n = new Login();
				n.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_3_3_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_3_3_2.setBounds(59, 301, 78, 19);
		panel.add(lblNewLabel_3_3_2);
		
		JPanel statuspanel = new JPanel();
		statuspanel.setBounds(908, 82, 677, 516);
		contentPane.add(statuspanel);
		statuspanel.setVisible(false);
		statuspanel.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Status");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				statuspanel.setVisible(true);
			}
		});
		
		
		JLabel lblNewLabel_3_3_2_1 = new JLabel("Cancel");
		lblNewLabel_3_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_3_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setVisible(false);
				statuspanel.setVisible(false);
				
			}
		});
		lblNewLabel_3_3_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_3_3_2_1.setBounds(59, 335, 78, 19);
		panel.add(lblNewLabel_3_3_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\log out.png"));
		lblNewLabel_4.setBounds(10, 294, 30, 30);
		panel.add(lblNewLabel_4);
		
		
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_5.setBounds(10, 171, 151, 19);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\edit.png"));
		lblNewLabel_6.setBounds(10, 260, 30, 30);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\cancle.png"));
		lblNewLabel_7.setBounds(10, 324, 25, 30);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_15 = new JLabel("X");
		lblNewLabel_15.setForeground(Color.RED);
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				statuspanel.setVisible(false);
			}
		});
		lblNewLabel_15.setBounds(639, 0, 28, 28);
		statuspanel.add(lblNewLabel_15);
			
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\profile icon images-modified.jpg"));
		lblNewLabel_8.setBounds(241, 11, 154, 171);
		statuspanel.add(lblNewLabel_8);
		
		JLabel status_name = new JLabel(db.name);
		status_name.setBorder(new LineBorder(new Color(0, 0, 0)));
		status_name.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		status_name.setBounds(211, 193, 229, 28);
		statuspanel.add(status_name);
		
		JLabel lblNewLabel_9 = new JLabel("   Vaccination Status");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_9.setBounds(241, 243, 171, 34);
		statuspanel.add(lblNewLabel_9);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBorder(new MatteBorder(3, 0, 0, 0, (Color) new Color(0, 0, 0)));
		separator_4.setBounds(23, 261, 218, 21);
		statuspanel.add(separator_4);
		
		JSeparator separator_4_1 = new JSeparator();
		separator_4_1.setBorder(new MatteBorder(3, 0, 0, 0, (Color) new Color(0, 0, 0)));
		separator_4_1.setBounds(404, 261, 218, 21);
		statuspanel.add(separator_4_1);
		
		JSeparator separator_4_2 = new JSeparator();
		separator_4_2.setBorder(new MatteBorder(0, 3, 0, 0, (Color) new Color(0, 0, 0)));
		separator_4_2.setBounds(23, 261, 13, 233);
		statuspanel.add(separator_4_2);
		
		JSeparator separator_4_2_1 = new JSeparator();
		separator_4_2_1.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		separator_4_2_1.setBounds(23, 492, 599, 2);
		statuspanel.add(separator_4_2_1);
		
		JSeparator separator_4_2_2 = new JSeparator();
		separator_4_2_2.setBorder(new MatteBorder(0, 0, 0, 3, (Color) new Color(0, 0, 0)));
		separator_4_2_2.setBounds(580, 261, 42, 233);
		statuspanel.add(separator_4_2_2);
		
		JLabel lblNewLabel_10 = new JLabel("Dose 1");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(58, 304, 85, 28);
		statuspanel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_10_1 = new JLabel("Dose 2");
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10_1.setBounds(404, 304, 85, 28);
		statuspanel.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_2 = new JLabel("Successfully Taken ");
		lblNewLabel_10_2.setForeground(Color.GREEN);
		lblNewLabel_10_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_2.setBounds(53, 356, 146, 28);
		statuspanel.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\success-green-check-mark-icon.jpg"));
		lblNewLabel_11.setBounds(79, 397, 64, 62);
		statuspanel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_11_1 = new JLabel("New label");
		lblNewLabel_11_1.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\red-x-line-icon.jpg"));
		lblNewLabel_11_1.setBounds(404, 397, 64, 62);
		statuspanel.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_10_2_1 = new JLabel("Not Taken ");
		lblNewLabel_10_2_1.setForeground(Color.RED);
		lblNewLabel_10_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_2_1.setBounds(404, 356, 146, 28);
		statuspanel.add(lblNewLabel_10_2_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("");
		lblNewLabel_3_3_1.setBounds(0, 51, 39, 34);
		contentPane.add(lblNewLabel_3_3_1);
		lblNewLabel_3_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(panel.isVisible()==true)
				{
					panel.setVisible(false);
				}
				panel.setVisible(true);
				
			}
		});
		lblNewLabel_3_3_1.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\menu_icon1.jpg"));
		
		JLabel lblNewLabel_3_2 = new JLabel("Coronavirus disease (COVID-19): Vaccines");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 25));
		lblNewLabel_3_2.setBounds(85, 11, 655, 44);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\heading.jpg"));
		lblNewLabel_2_1.setBounds(0, 0, 941, 55);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LocalDate dob = LocalDate.parse(db.dob);   
				System.out.println("You are " + calculateAge(dob)+" years old.");  
			}
		});
		btnNewButton.setBounds(461, 260, 89, 23);
		contentPane.add(btnNewButton);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
