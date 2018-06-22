package com.finezoom.javatraining.db;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.DatabaseMetaData;

public class NoOfTablesInDataBase {
public static void main(String[] args) throws ClassNotFoundException {
	dbmeatadata();
}
private static void dbmeatadata() throws ClassNotFoundException
{
	
		Class.forName("com.mysql.jdbc.Driver");
		Connection conect = null;
		
		try {
			conect = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/learning", "vignesh", "vignesh");
			  
			DatabaseMetaData dbmd = (DatabaseMetaData) conect.getMetaData();
			
			String table[]={"TABLE"};
			
			ResultSet rs= dbmd.getTables( null, null, null, table);
			while(rs.next())
			{
				System.out.println(rs.getString(2));
			}
		} catch (SQLException e) {}
	
	}
}

