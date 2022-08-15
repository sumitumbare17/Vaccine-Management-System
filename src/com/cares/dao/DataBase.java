package com.cares.dao;

import java.sql.*;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;

import com.cares.services.DashBoard;
import com.cares.services.Login;

public class DataBase {
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "system";
	private static String pass = "0503";
	private static String driver = "oracle.jdbc.driver.OracleDriver";

	public String fname = null;
	public String lname = null;
	public String name = null;
	public String EMAIL = null;
	public String PHONE = null;
	public String GENDER = null;
	public String  ADDRESS = null;
	public String dob = null;
	public String passw = null;
	public String FIRST_DOSE = null;
	public String FIRST_DOSE_DATE	= null;
	public String SECOND_DOSE= null;
	public String SECON_DOSE_DATE	= null;
	
	
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

			String sql = "select FNAME ,LNAME,EMAIL,PHONE,GENDER, ADDRESS , DOB ,PASSWORD from registration where AADHAR = ? ";
			stm = con.prepareStatement(sql);
			stm.setString(1,adhar);
			rs= stm.executeQuery();
					      
			 while (rs.next()) 
			 {
			        	fname  = rs.getString(1);
			        	lname= rs.getString(2);
			        	EMAIL = rs.getString(3);
			        	PHONE = rs.getString(4);
			        	GENDER= rs.getString(5);
			        	ADDRESS = rs.getString(6);
			        	dob = rs.getString(7);
			        	passw = rs.getString(8);
			        	
			        }
			 name = fname+" "+lname;

		} catch(NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Enter Only Numbers  ");
		}
		catch (Exception e) {
			
		}
		
	}
	
	public int UpdateDetails(ArrayList e , String Adhar)
	{
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		int a=0;
		
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();

			String sql = "UPDATE registration SET FNAME = ? , LNAME = ? ,PHONE = ? ,EMAIL = ? , DOB = ? , ADDRESS = ?   where AADHAR = ? ";
			stm = con.prepareStatement(sql);
			stm.setString(7,Adhar);
			stm.setString(1, (String) e.get(0));
			stm.setString(2,(String)e.get(1));
			stm.setString(3,(String)e.get(2));
			stm.setString(4,(String)e.get(3));
			stm.setString(5,(String)e.get(4));
			stm.setString(6,(String)e.get(5));
			a  = stm.executeUpdate();
			
	}catch(Exception g) {}
		return a;
}
	
	public int forgotPass(String Adhar, String pass1)
	{
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		int a=0;
		
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();

			String sql = "UPDATE registration SET PASSWORD = ?  where AADHAR = ? ";
			stm = con.prepareStatement(sql);
			stm.setString(2,Adhar);
			stm.setString(1, (String) pass1);
			a  = stm.executeUpdate();
			
	}catch(Exception g) {}
		return a;
}
	
	public void avaiblity(String Vaccine , String center, String Adhar,String date)
	{
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		int slot = 0;
		int count;
		String cent;
		boolean b=false;
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();
			
			String sql = "select VACCINE_NAME,SLOTS from Vaccine_slots where CENTER_NAME = ?";
			stm = con.prepareStatement(sql);
			stm.setString(1,center);
			rs = stm.executeQuery();
			 while (rs.next()) 
			 {
				 cent = rs.getString(1);
				 String slots  = rs.getString(2);
				 slot = Integer.parseInt(slots);
				 if(cent.equals(Vaccine)&&slot>0) {
					 b = true;
				 }
			 }
			    if(b==true ) {
		 sql = "UPDATE Vaccine_slots  SET SLOTS = ? WHERE VACCINE_NAME = ? AND  CENTER_NAME = ? ";
		 stm = con.prepareStatement(sql);
			stm.setInt(1,slot-1);
			stm.setString(2,Vaccine);
			stm.setString(3,center);
		     count =   stm.executeUpdate();
		     if(count==1) {
		    	 JOptionPane.showMessageDialog(null, "Successfully Booked :)" );
		    	 DataBase db = new DataBase();
		    	 db.bookingCheck( Adhar ) ;
		    	 db.bookingUpdate( Adhar, Vaccine ,  date , center );
		     }else {
		    	 JOptionPane.showMessageDialog(null, "Unsuccessful To Booked" );
		     }
			    }else {
			    	 JOptionPane.showMessageDialog(null, "Slot Unavaliable.." );
			    }
			        			        	
			  }catch(Exception n) {
				  JOptionPane.showMessageDialog(null, n );
			  }
	}
	
	public  void bookingCheck(String Adhar ) 
	{
		String sql;
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		int a = 0;
		ResultSet rs = null;
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();

			
			sql = "select FIRST_DOSE,FIRST_DOSE_DATE,	SECOND_DOSE,SECON_DOSE_DATE  from CovidVaccinabooking where AADHAR = ? ";
			stm = con.prepareStatement(sql);
			stm.setString(1, Adhar );
			rs = stm.executeQuery();
			 while (rs.next()) 
			 {
				 FIRST_DOSE  = rs.getString(1);
				 FIRST_DOSE_DATE= rs.getString(2);
				 SECOND_DOSE = rs.getString(3);
				 SECON_DOSE_DATE = rs.getString(4);
			        	
			        }
		}catch(Exception f) {
			JOptionPane.showMessageDialog(null, f);
			}
	}
	
	public   int bookingUpdate(String Adhar,String Vaccine , String date ,String center )
	{
		String sql = null;
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		int a = 0;
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();
			
			System.out.println(SECOND_DOSE);
			if(FIRST_DOSE == null) {

			sql = "INSERT into CovidVaccinabooking(VACCINE,FIRST_DOSE,FIRST_DOSE_DATE,CENTER, AADHAR) VALUES(?,?,?,?,?) ";
			
		
			}
			else if(FIRST_DOSE.equals("Taken")&&SECOND_DOSE==null) {
				sql = "UPDATE CovidVaccinabooking set VACCINE = ? ,SECOND_DOSE = ? ,SECON_DOSE_DATE = ? ,CENTER = ? where AADHAR = ? ";
			}
			else {
				JOptionPane.showMessageDialog(null,"You Had Taken Both Vaccine You Cant Book Vaccine NOW");
			}
			
				stm = con.prepareStatement(sql);
				stm.setString(1,Vaccine);
				stm.setString(2, "Taken");
				stm.setString(3,date);
				stm.setString(4, center);
				stm.setString(5, Adhar );
				a = stm.executeUpdate();
				if(a==1) {
					JOptionPane.showMessageDialog(null,"Your  Vaccine Has Been Booked on  "+ date );
				}				
			
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, e1);
		}
		return a;
	}
	
	/*
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

			String sql = "select FNAME ,LNAME,EMAIL,PHONE,GENDER, ADDRESS , DOB ,PASSWORD from registration where AADHAR = ? ";
			stm = con.prepareStatement(sql);
			stm.setString(1,adhar);
			rs= stm.executeQuery();
			ResultSetMetaData rm = rs.getMetaData();
			Vector columnNames = new Vector();
			Vector data = new Vector();
			int column = rm.getColumnCount();
			for (int i=1;i<=column;i++)
			{
				columnNames.addElement(rm.getColumnName(i));
			}
			while(rs.next()) {
				Vector row = new Vector();
				for (int i=1;i<=column;i++)
				{
					row.addElement(rs.getObject(i));
				}
				data.addElement(row);
			}
		} catch(NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Enter Only Numbers  ");
		}
		catch (Exception e) {
			
		}
		
	}
	*/
}
