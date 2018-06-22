package com.finezoom.javatraining.db;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;

public class SelcetProcedure {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conect = null;
		
		try {
			conect = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/learning", "vignesh", "vignesh");
			  CallableStatement cc = (CallableStatement) conect.prepareCall("call dispaly()");
			ResultSet rs= cc.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(3));
			}
		} catch (SQLException e) {}
	
	}
}
