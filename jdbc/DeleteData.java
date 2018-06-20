package com.finezoom.javatraining.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner; 

public class DeleteData {
	public static void delete() {
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con;
			try {
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/learning", "vignesh",
						"vignesh");

				Statement state = con.createStatement();

				Scanner s = new Scanner(System.in);
				System.out.println("enter the name to delete from table");
				String name = s.next();

				PreparedStatement pp = con
						.prepareStatement("DELETE FROM STUDENTDETAILS WHERE NAME= ? ");
				pp.setString(1, name);
				pp.executeUpdate();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		delete();
	}
}
