package com.finezoom.javatraining.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


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
	st.execute("INSERT INTO STUDENTDETAILS(ID,NAME,AGE,MARKS) VALUES(44115,'FGH',22,88)");
	st.execute("INSERT INTO STUDENTDETAILS(ID,NAME,AGE,MARKS) VALUES(25115,'natHMGHhan',21,23)");
	st.execute("INSERT INTO STUDENTDETAILS(ID,NAME,AGE,MARKS) VALUES(rr,'rrr',21,56)");
	
	st.execute("INSERT INTO STUDENTDETAILS(ID,NAME,AGE,MARKS) VALUES(27,'mani',21,56)");
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
