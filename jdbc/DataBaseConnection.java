package com.finezoom.javatraining.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {
	public static void main(String[] args)

	{
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/learning", "vignesh", "vignesh");

			Statement state = con.createStatement();

			ResultSet rs = state.executeQuery("SELECT * FROM customer");
			while (rs.next()) {
				System.out.println(rs.getInt(1));
			}
			con.close();
		}

		catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		}

	}
}
