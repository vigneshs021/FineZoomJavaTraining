package com.finezoom.javatraining.db;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;

public class UseProcedureCall {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection conect = null;
		
		try {
			conect = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/learning", "vignesh", "vignesh");
			CallableStatement callData =(CallableStatement) conect.prepareCall("{call insertQue(?,?)}");  
			callData.setInt(1, 10001);
			callData.setString(2, "Prakash");
			callData.execute();
			System.out.println("Success");
			//System.out.println(callData.getInt(1));  
			
		} catch (SQLException e) {}
	}

}
