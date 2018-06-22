package com.finezoom.javatraining.db;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.DatabaseMetaData;

public class Joins {
public static void main(String[] args) throws ClassNotFoundException {
	//Innerjoin();
	//crossjoin();
	leftjoin();
}
public static void Innerjoin() throws ClassNotFoundException
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conect = null;
	
	try {
		conect = (Connection) DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/learning", "vignesh", "vignesh");
		Statement state = conect.createStatement();

		

		ResultSet rs = state.executeQuery("SELECT NAME FROM branch INNER JOIN customer ON branch.CITY = customer.CITY");
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}
		conect.close();
		
		
	} catch (SQLException e) {}

}

public static void crossjoin() throws ClassNotFoundException
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conect = null;
	
	try {
		conect = (Connection) DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/learning", "vignesh", "vignesh");
		Statement state = conect.createStatement();

		

		ResultSet rs = state.executeQuery("select * from customer cross join branch");
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}
		conect.close();
		
		
	} catch (SQLException e) {}

}
public static void leftjoin() throws ClassNotFoundException
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conect = null;
	
	try {
		conect = (Connection) DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/learning", "vignesh", "vignesh");
		Statement state = conect.createStatement();

		
ResultSet rs = state.executeQuery("select user420.id,studentdetails.NAME from user420 left join studentdetails on user420.id = studentdetails.id");
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}
		conect.close();
		
		
	} catch (SQLException e) {}

}
}
