package com.finezoom.javatraining.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) 
			 {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conect;
			try {
				conect = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/learning", "vignesh", "vignesh");
				Statement st = conect.createStatement();

				//st.execute("CREATE TABLE STUDENTDETAILS(ID int,NAME VARCHAR(10),AGE int,MARKS int)");
				//st.execute("INSERT INTO STUDENTDETAILS(ID,NAME,AGE,MARKS) VALUES(14,'BALA',22,76)");
				//st.execute("INSERT INTO STUDENTDETAILS(ID,NAME,AGE,MARKS) VALUES(2,'BALA',22,76)");
				//st.execute("INSERT INTO STUDENTDETAILS(ID,NAME,AGE,MARKS) VALUES(3,'david',23,66)");
				//st.execute("INSERT INTO STUDENTDETAILS(ID,NAME,AGE,MARKS) VALUES(4,'ganesh',22,88)");
				//st.execute("INSERT INTO STUDENTDETAILS(ID,NAME,AGE,MARKS) VALUES(5,'naveen',21,23)");
				//st.execute("INSERT INTO STUDENTDETAILS(ID,NAME,AGE,MARKS) VALUES(6,'praveen',21,56)");
				//st.execute("UPDATE STUDENTDETAILS SET NAME='ARUL',AGE=23,MARKS=88 WHERE ID=1");
				//st.execute("INSERT INTO STUDENTDETAILS(ID,NAME,AGE,MARKS) VALUES(6,'RAJA',21,56)");
				st.execute("DELETE FROM STUDENTDETAILS WHERE NAME='RAJA'");
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