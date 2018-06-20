package com.finezoom.javatraining.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[] args) {
		//update();
		//insert();
		sort();
	}

	public static void update() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conect;
			try {
				conect = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/learning", "vignesh",
						"vignesh");
				Statement st = conect.createStatement();

				Scanner scan = new Scanner(System.in);

				System.out
						.println("enter the name of student to update mark in db");
				String name = scan.next();

				System.out.println("enter the mark  to replace in db");
				int mark = scan.nextInt();

				PreparedStatement pstatement = conect
						.prepareStatement("UPDATE STUDENTDETAILS SET marks=?"
								+ " WHERE name=?");
				pstatement.setInt(1, mark);
				pstatement.setString(2, name);
				pstatement.executeUpdate();

				// st.execute("UPDATE STUDENTDETAILS SET NAME='ARUL',AGE=23,MARKS=88 WHERE ID=1");st.execute("DELETE FROM STUDENTDETAILS WHERE NAME='RAJA'");
				conect.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void sort()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conect;
			try {
				conect = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/learning", "vignesh", "vignesh");
				Statement st = conect.createStatement();

				
				st.execute("SELECT ID,NAME,AGE,MARKS FROM STUDENTDETAILS ORDER BY ID;");
				conect.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	}

		
	}
	
	
	
}
