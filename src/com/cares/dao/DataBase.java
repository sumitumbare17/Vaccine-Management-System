package com.cares.dao;

import java.sql.*;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import com.cares.services.DashBoard;
import com.cares.services.Login;

public class DataBase {
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "system";
	private static String pass = "0503";
	private static String driver = "oracle.jdbc.driver.OracleDriver";

	public String name = null;
	public String EMAIL = null;
	public String PHONE = null;
	public String GENDER = null;
	public String  ADDRESS = null;
	public String dob = null;
	
	public int insertIntoDB(ArrayList e) {
		String sql;
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		int a = 0;
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();

			sql = "INSERT into registration VALUES(id_seq.nextval,?,?,?,?,?,?,?,?,?)";
			stm = con.prepareStatement(sql);

			stm.setString(1, (String) e.get(0));
			stm.setString(2, (String) e.get(1));
			stm.setString(3, (String) e.get(2));
			stm.setString(4, (String) e.get(3));
			stm.setString(5, (String) e.get(4));
			stm.setString(6, (String) e.get(5));
			stm.setString(7, (String) e.get(6));
			stm.setString(8, (String) e.get(7));
			stm.setString(9, (String) e.get(8));
			a = stm.executeUpdate();

		} catch (Exception e1) {

		}
		return a;
	}

	public int login(String pa , String adhar ) {
		String sql;
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		String user_id;
		String pas = null;
		String name = null;
		ResultSet rs = null;
		int b = 0;
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();

			sql = "select  PASSWORD ,FNAME  from registration where AADHAR = ? ";
			stm = con.prepareStatement(sql);
			stm.setString(1,adhar);
			rs= stm.executeQuery();
			if (rs.next() == false) {
			       b=1;
			      } else {
			    	  
			        do {
			        	pas = rs.getString(1);
						name = rs.getString(2);
			        } while (rs.next());
			     }
			if (pas.equals(pa)) {
				JOptionPane.showMessageDialog(null, "Welcome  " + name);
				DashBoard r = new DashBoard(adhar);
				Login n = new Login();
				r.setVisible(true);
				n.setVisible(false);
			} else {
				// JOptionPane.showMessageDialog(null, "Enter valid User Id And Pass");
				b = 2;
			}

		} catch(NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Enter Only Numbers  ");
		}
		catch (Exception e) {
			
		}
		return b;

	}
	
	public void getDetails(String adhar)
	{		
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();

			String sql = "select FNAME ,LNAME,EMAIL,PHONE,GENDER, ADDRESS , DOB from registration where AADHAR = ? ";
			stm = con.prepareStatement(sql);
			stm.setString(1,adhar);
			rs= stm.executeQuery();
					      
			 while (rs.next()) 
			 {
			        	name  = rs.getString(1)+" "+rs.getString(2);
			        	EMAIL = rs.getString(3);
			        	PHONE = rs.getString(4);
			        	GENDER= rs.getString(5);
			        	ADDRESS = rs.getString(6);
			        	dob = rs.getString(7);
			        	
			        }

		} catch(NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Enter Only Numbers  ");
		}
		catch (Exception e) {
			
		}
		
	}
}
