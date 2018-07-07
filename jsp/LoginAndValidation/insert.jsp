<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import='java.sql.Connection'%>
<%@ page import='java.sql.DriverManager'%>
<%@page import='java.sql.SQLException'%>
<%@page import='java.sql.Statement'%>
<%@page import='java.sql.PreparedStatement'%>



<%
String firstname = request.getParameter("firstname"); 
String lastname = request.getParameter("lastname"); 
String username = request.getParameter("username"); 
String password = request.getParameter("password"); 
String address = request.getParameter("address"); 
String contact = request.getParameter("contact"); 
           
%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert data </title>
</head>
<body>
<%
		Class.forName("com.mysql.jdbc.Driver");
		Connection conect = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/learning", "vignesh",
				"vignesh");
		Statement st = conect.createStatement();


		PreparedStatement ps=conect.prepareStatement("INSERT INTO STUDENTDETAILS(firstname,lastname,username,password,address,contact)VALUES(?,?,?,?) ");
		%>	
	ps.setInt(1, firstname);

	ps.setString(2, lastname);

	ps.setInt(3, username);

	ps.setInt(4, password);
		
	ps.setInt(5, address);
		
	ps.setInt(6, contact);
		
		ps.execute();
	
		
</body>
</html>