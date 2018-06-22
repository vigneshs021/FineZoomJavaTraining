package com.finezoom.javatraining.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class RollBackData {
public static void main(String[] args) throws SQLException {
	insertrollback();
}

public static void insertrollback() throws SQLException
{
try {
Class.forName("com.mysql.jdbc.Driver");
Connection conect=null;

try {
	conect = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/learning", "vignesh", "vignesh");
	Statement st = conect.createStatement();
	
	conect.setAutoCommit(false);
	Scanner scan = new Scanner(System.in);
	System.out.println("Insert the student details into db:");
	PreparedStatement pos =null;
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
	
	 pos = conect.prepareStatement("INSERT INTO STUDENTDETAILS(ID,NAME,AGE,MARKS)VALUES(?,?,?,?)");
	pos.setInt(1, id);
	pos.setString(2, name);
	pos.setInt(3, age);
	pos.setInt(4, marks);
	}
	ResultSet rr=pos.executeQuery();
while(rr.next())	
{
		System.out.println("rr.getInt()");
	}
	
	st.close();
	conect.commit();
	conect.close();
} catch (SQLException e) {
	
 try{
	 conect.rollback();
	  
 }catch(SQLException e1){
	 
 }
 //conect.rollback();
    
	//e.printStackTrace();
	
}


} catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();	
}


}
}
