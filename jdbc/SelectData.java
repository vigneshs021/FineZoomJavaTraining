package com.finezoom.javatraining.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectData {
	public static void select() {
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con;
			try {
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/learning", "vignesh",
						"vignesh");

				Statement state = con.createStatement();

				Scanner s = new Scanner(System.in);
				System.out.println("enter the mark to display from table");
				int mark = s.nextInt();

				//ResultSet rr = state.executeQuery("SELECT * FROM STUDENTDETAILS  WHERE MARKS =  "+mark);

				ResultSet rr = state.executeQuery("SELECT NAME FROM STUDENTDETAILS  WHERE MARKS =  "+mark);
				while(rr.next())
				{
					System.out.println(rr.getString(1));
				}
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
		select();
	}
}
