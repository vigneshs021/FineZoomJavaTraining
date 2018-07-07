package com.finezoom.javatraining.oops;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class EmployeeDatabase {
	public void dbConnection(EmployeeModel model) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/learning", "vignesh",
					"vignesh");

			java.sql.Statement stmt = con.createStatement();

			PreparedStatement ps = con
					.prepareStatement("INSERT INTO STUDENTDETAILS(ID,NAME,AGE,MARKS)VALUES(?,?,?,?) ");

			int id = 0;
			ps.setInt(1, id);

			String name = null;
			ps.setString(2, name);

			String age = null;
			ps.setString(3, age);

			String address = null;
			ps.setString(4, address);

			int salary = 0;
			ps.setInt(5, salary);
			ps.execute();

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void updateconnection(EmployeeModel model) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/learning", "vignesh",
					"vignesh");

			java.sql.Statement stmt = con.createStatement();

			PreparedStatement pstatement = con
					.prepareStatement("UPDATE STUDENTDETAILS SET id=?"
							+ " WHERE name=?");
			int id = 0;
			pstatement.setInt(1, id);
			String name = null;
			pstatement.setString(2, name);
			pstatement.executeUpdate();

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void deleteconnection(EmployeeModel model) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/learning", "vignesh",
					"vignesh");

			java.sql.Statement stmt = con.createStatement();

			PreparedStatement pp = con
					.prepareStatement("DELETE FROM STUDENTDETAILS WHERE NAME= ? ");
			String name = null;
			pp.setString(1, name);
			pp.executeUpdate();

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
