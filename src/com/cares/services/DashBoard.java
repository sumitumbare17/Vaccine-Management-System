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
import javax.swing.JOptionPane;

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
		db.bookingCheck(Adhar);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 957, 729);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);
		
		JLabel status_name_1 = new JLabel("  YOUR VACCINATION STATUS");
		status_name_1.setBackground(Color.WHITE);
		status_name_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		status_name_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		status_name_1.setBounds(388, 67, 235, 28);
		contentPane.add(status_name_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 86, 219, 365);
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
		lblNewLabel.setBounds(59, 21, 150, 19);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(db.name);
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_1.setBounds(59, 51, 150, 19);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(db.EMAIL);
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_2.setBounds(59, 91, 150, 19);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(db.GENDER);
		lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_3.setBounds(59, 121, 150, 19);
		panel.add(lblNewLabel_3);
		 
		
		JLabel lblNewLabel_3_1 = new JLabel(db.PHONE);
		lblNewLabel_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_3_1.setBounds(59, 162, 150, 19);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("Edit Profile");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EditProfile ep = new EditProfile(Adhar);
				ep.setVisible(true);
				setVisible(false);
				
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
		
		JLabel lblNewLabel_5 = new JLabel("BOOK");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VaccineBooking vb = new VaccineBooking(Adhar);
				vb.setVisible(true);
				setVisible(false);
				
			}
		});
		
		
		JLabel lblNewLabel_3_3_2_1 = new JLabel("Cancel");
		lblNewLabel_3_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_3_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			panel.setVisible(false);
				
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
		lblNewLabel_5.setBounds(58, 206, 151, 19);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\edit.png"));
		lblNewLabel_6.setBounds(10, 260, 30, 30);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\cancle.png"));
		lblNewLabel_7.setBounds(10, 324, 25, 30);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\id.png"));
		lblNewLabel_13.setBounds(19, 8, 30, 29);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\mail2.png"));
		lblNewLabel_15.setBounds(10, 83, 30, 27);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\heloo.png"));
		lblNewLabel_16.setBounds(13, 51, 46, 22);
		panel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\MALE.png"));
		lblNewLabel_17.setBounds(10, 121, 30, 30);
		panel.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\phone-icon-clip-art--royalty--7.png"));
		lblNewLabel_18.setBounds(10, 162, 30, 30);
		panel.add(lblNewLabel_18);
		
		JLabel lblNewLabel_18_1 = new JLabel("");
		lblNewLabel_18_1.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\female_icon_sign_flat_symmetric_geometry_silhouette_design_6923667\\female (1).png"));
		lblNewLabel_18_1.setBounds(10, 112, 46, 42);
		panel.add(lblNewLabel_18_1);
		
		JLabel lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\book_medical_sign_icon_contrast_black_white_sketch_6922216\\book-medical.png"));
		lblNewLabel_19.setBounds(10, 206, 30, 30);
		panel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("");
		lblNewLabel_3_3_1.setBounds(0, 51, 39, 34);
		contentPane.add(lblNewLabel_3_3_1);
		lblNewLabel_3_3_1.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("unlikely-arg-type")
			@Override
			public void mouseClicked(MouseEvent e) {
				if(panel.isVisible()==true)
				{
					panel.setVisible(false);
				}
				panel.setVisible(true);
				if(lblNewLabel_3.getText().equals("Male")) 
				{
					lblNewLabel_17.setVisible(true);
					lblNewLabel_18_1.setVisible(false);
					
				}
				else 
				{
					lblNewLabel_18_1.setVisible(true);
					lblNewLabel_17.setVisible(false);
				}
				
			}
		});
		lblNewLabel_3_3_1.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\menu_icon1.jpg"));
		
		JLabel lblNewLabel_3_2 = new JLabel("Coronavirus disease (COVID-19): Vaccines");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 25));
		lblNewLabel_3_2.setBounds(130, 5, 655, 44);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\heading.jpg"));
		lblNewLabel_2_1.setBounds(0, 0, 941, 55);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\White_full.png"));
		lblNewLabel_8.setBounds(388, 70, 235, 20);
		contentPane.add(lblNewLabel_8);
		
		JLabel status_name = new JLabel(db.name);
		status_name.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		status_name.setBorder(new LineBorder(new Color(0, 0, 0)));
		status_name.setBounds(388, 318, 229, 28);
		contentPane.add(status_name);
		
		JLabel lblNewLabel_10 = new JLabel("Dose 1");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(288, 383, 85, 28);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_10_1 = new JLabel("Dose 2");
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10_1.setBounds(633, 383, 85, 28);
		contentPane.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_2 = new JLabel("Successfully Taken ");
		lblNewLabel_10_2.setForeground(Color.GREEN);
		lblNewLabel_10_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_2.setBounds(253, 436, 146, 28);
		contentPane.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_10_2_1 = new JLabel("Not Taken ");
		lblNewLabel_10_2_1.setForeground(Color.RED);
		lblNewLabel_10_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_2_1.setBounds(605, 436, 146, 28);
		contentPane.add(lblNewLabel_10_2_1);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\success-green-check-mark-icon.jpg"));
		lblNewLabel_11.setBounds(272, 487, 64, 62);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_11_1 = new JLabel("New label");
		lblNewLabel_11_1.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\red-x-line-icon.jpg"));
		lblNewLabel_11_1.setBounds(633, 487, 64, 62);
		contentPane.add(lblNewLabel_11_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VaccineBooking vb = new VaccineBooking(Adhar);
				vb.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(405, 606, 229, 34);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_9.setBounds(258, 560, 115, 20);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("New label");
		lblNewLabel_9_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_9_1.setBounds(618, 560, 115, 20);
		contentPane.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("");
		lblNewLabel_8_1.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\kindpng_1468338-modified-modified.png"));
		lblNewLabel_8_1.setBounds(425, 127, 181, 180);
		contentPane.add(lblNewLabel_8_1);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		separator.setBounds(132, 84, 735, 547);
		contentPane.add(separator);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\low_poly_banner_design_1711.jpg"));
		lblNewLabel_12.setBounds(0, 51, 941, 639);
		contentPane.add(lblNewLabel_12);
		
		if(db.FIRST_DOSE==null&&db.SECOND_DOSE==null)
		{
			lblNewLabel_11.setIcon(new ImageIcon("C:\\\\Users\\\\sumit\\\\Downloads\\\\red-x-line-icon.jpg"));
			lblNewLabel_11_1.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\red-x-line-icon.jpg"));
		    lblNewLabel_10_2_1.setText("    Not Taken ");
		    lblNewLabel_10_2_1.setForeground(Color.RED);
		    lblNewLabel_10_2.setText("    Not Taken ");
		    lblNewLabel_10_2.setForeground(Color.RED);
		    lblNewLabel_9.setVisible(false);
		    lblNewLabel_9_1.setVisible(false);
		    btnNewButton.setText("BOOK YOUR FIRST VACCINE");
		}
		else if(db.FIRST_DOSE.equals("Taken")&&db.SECOND_DOSE==null) {
			lblNewLabel_11.setIcon(new ImageIcon("C:\\\\Users\\\\sumit\\\\Downloads\\\\success-green-check-mark-icon.jpg"));
			lblNewLabel_10_2.setText("Successfully Taken ");
			lblNewLabel_10_2.setForeground(Color.GREEN);
			lblNewLabel_11_1.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\red-x-line-icon.jpg"));
		    lblNewLabel_10_2_1.setText("    Not Taken ");
		    lblNewLabel_10_2_1.setForeground(Color.RED);
		    lblNewLabel_9.setText("Taken on "+db.FIRST_DOSE_DATE);
		    lblNewLabel_9_1.setVisible(false);
		    btnNewButton.setText("BOOK YOUR SECOND VACCINE");
		}
		else if(db.FIRST_DOSE.equals("Taken")&&db.SECOND_DOSE.equals("Taken")) {
			lblNewLabel_11.setIcon(new ImageIcon("C:\\\\Users\\\\sumit\\\\Downloads\\\\success-green-check-mark-icon.jpg"));
			lblNewLabel_10_2.setText("Successfully Taken ");
			lblNewLabel_10_2.setForeground(Color.GREEN);
			lblNewLabel_11_1.setIcon(new ImageIcon("C:\\\\\\\\Users\\\\\\\\sumit\\\\\\\\Downloads\\\\\\\\success-green-check-mark-icon.jpg"));
		    lblNewLabel_10_2_1.setText("Successfully Taken ");
		    lblNewLabel_10_2_1.setForeground(Color.GREEN);
		    lblNewLabel_9.setText("Taken on "+db.FIRST_DOSE_DATE);
		    lblNewLabel_9_1.setText("Taken on "+db.SECON_DOSE_DATE);
		    btnNewButton.setVisible(false);
		}
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
