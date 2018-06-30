<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import='java.sql.Connection'%>
<%@ page import='java.sql.DriverManager'%>
<%@page import='java.sql.SQLException'%>
<%@page import='java.sql.Statement'%>
<%@page import='java.sql.ResultSet'%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>database</title>
</head>
<body>
<center>
<h1> StudentDetails</h1>
</center>

<%
String id = request.getParameter("id"); 
String name = request.getParameter("name"); 
String age = request.getParameter("age"); 
String mark = request.getParameter("mark"); 
           
%>

<table border ="1"width = "100%">
<tr>

<th>
<input type="text" value="Id">
</th>
<th>
<input type="text" value="Name">
</th>
<th>
<input type="text" value="Age">
</th>
<th>
<input type="text" value="Mark">
</th>

<%
		Class.forName("com.mysql.jdbc.Driver");
		Connection conect = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/learning", "vignesh",
				"vignesh");
		Statement st = conect.createStatement();

		ResultSet rs = st.executeQuery("select * from studentdetails");
		while (rs.next()) {
	%>

<tr>
	
	 <td><%=rs.getString(1)%></td>
     <td><%=rs.getString(2)%></td> 
   <td><%=rs.getString(3)%></td>
	 <td><%=rs.getString(4)%></td> 
	
	</tr>
</tr>
		 
	<%
		}
	%>
	
	
</table>
<a href="Content.html">Home</a>
</body>
</html>