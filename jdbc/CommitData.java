package com.finezoom.javatraining.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CommitData {

	private static void insert() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con;
			try {
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/learning", "vignesh",
						"vignesh");

				Statement st = con.createStatement();
				
				Scanner scan = new Scanner(System.in);
				con.setAutoCommit(false);
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
				
				
				PreparedStatement ps=con.prepareStatement("INSERT INTO STUDENTDETAILS(ID,NAME,AGE,MARKS)VALUES(?,?,?,?) ");
				
				ps.setInt(1, id);
		
				ps.setString(2, name);
		
				ps.setInt(3, age);
		
				ps.setInt(4, marks);
				ps.execute();
				}
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			Connection con = null;
			con.commit();
			e.printStackTrace();
		}

	}


	public static void main(String[] args) throws SQLException {
		insert();
	}
}
