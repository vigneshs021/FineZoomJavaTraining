package com.finezoom.javatraining.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertBatch {
public static void main(String[] args) {
	insert();
}
private static void insert() {
	try {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con;
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/learning", "vignesh",
					"vignesh");

			Statement st = con.createStatement();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Insert the student details into db:");
			for(int i=0;i<2;i++)
			{						
			String query = "INSERT INTO STUDENTDETAILS(ID,NAME,AGE,MARKS)VALUES('"+sc.nextInt()+"','"+sc.next()+"','"+sc.nextInt()+"','"+sc.nextInt()+"')";
			
			st.addBatch(query);
			}
			
			st.executeBatch();
			st.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
