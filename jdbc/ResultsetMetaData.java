package com.finezoom.javatraining.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.DatabaseMetaData;

public class ResultsetMetaData {
public static void main(String[] args) throws ClassNotFoundException {
	meta();
}
private static void meta() throws ClassNotFoundException
{
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conect;
		
			conect = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/learning", "vignesh", "vignesh");
			Statement st = conect.createStatement();

			PreparedStatement pp= conect.prepareStatement("select * from studentdetails");
			ResultSet rr=pp.executeQuery();
			ResultSetMetaData rmd=rr.getMetaData();
			
			System.out.println("Total column :"+ rmd.getColumnCount());
			System.out.println("display name of 1 column :"+ rmd.getColumnName(1));
			System.out.println("Total type name of 1 column :"+ rmd.getColumnTypeName(1));
			System.out.println("display size of 1 column :"+ rmd.getColumnDisplaySize(1));
			
			
			
			DatabaseMetaData dbmd = (DatabaseMetaData) conect.getMetaData();
			
			System.out.println("Driver Name: "+dbmd.getDriverName());  
			System.out.println("Driver Version: "+dbmd.getDriverVersion());  
			System.out.println("UserName: "+dbmd.getUserName());  
			System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
			System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	
}
}
