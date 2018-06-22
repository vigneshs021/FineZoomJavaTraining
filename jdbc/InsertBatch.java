package com.finezoom.javatraining.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Insert the student details into db:");
			for(int i=0;i<2;i++)
			{			
				System.out.println("insert the student id into db:");
				int id = scan.nextInt();
				System.out.println("insert the student name into db:");
				String name=scan.next();
				System.out.println("insert the student age into db:");
				int age = scan.nextInt();
				System.out.println("insert the student mark into db:");
				int marks = scan.nextInt();
				
			String query = "INSERT INTO STUDENTDETAILS(ID,NAME,AGE,MARKS)VALUES(?,?,?,?)";
			PreparedStatement po = con.prepareStatement(query);
			po.setInt(1, id);
			po.setString(2, name);
			po.setInt(3, age);
			po.setInt(4, marks);
			po.addBatch(query);
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
