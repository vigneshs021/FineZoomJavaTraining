<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@page import='java.sql.Connection'%>
<%@ page import='java.sql.DriverManager'%>
<%@page import='java.sql.SQLException'%>
<%@page import='java.sql.Statement'%>
<%@page import='java.sql.PreparedStatement'%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<h1><center> User SignUp  </center></h1>
<body>

<%
String firstname = request.getParameter("firstname"); 
String lastname = request.getParameter("lastname"); 
String username = request.getParameter("username"); 
String password = request.getParameter("password"); 
String address = request.getParameter("address"); 
String contact = request.getParameter("contact"); 
           
%>
<form >
<center>

			<table style="with: 50%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstname" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastname" /></td>
				</tr>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="username" /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td>Contact No</td>
					<td><input type="text" name="contact" /></td>
				</tr></table>
			<input type="submit" value="Submit" />
			</center>
			</form>
			<a href="login.jsp">login</a>
		<%
		Class.forName("com.mysql.jdbc.Driver");
		Connection conect = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/learning", "vignesh",
				"vignesh");
		Statement st = conect.createStatement();


		PreparedStatement ps=conect.prepareStatement("INSERT INTO users(firstname,lastname,username,password,address,contact)VALUES(?,?,?,?,?,?) ");
		%>	
	<% ps.setString(1, firstname);

	ps.setString(2, lastname);

	ps.setString(3, username);

	ps.setString(4, password);
		
	ps.setString(5, address);
	
	ps.setString(6, contact);

		ps.execute();%>
							
</body>
</html>