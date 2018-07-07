<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import='java.sql.Connection'%>
<%@ page import='java.sql.DriverManager'%>
<%@page import='java.sql.SQLException'%>
<%@page import='java.sql.Statement'%>
<%@page import='java.sql.ResultSet'%>
<%@page import='java.sql.PreparedStatement'%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
String first_name=request.getParameter("first_name");
String last_name=request.getParameter("last_name");
String city_name=request.getParameter("city_name");
String email=request.getParameter("email");
%>

<table border ="1"width = "100%">
<tr>

<th>
<input type="text" value="firstname">
</th>
<th>
<input type="text" value="lastname">
</th>
<th>
<input type="text" value="city">
</th>
<th>
<input type="text" value="email">
</th>

<%
Class.forName("com.mysql.jdbc.Driver");
Connection conect = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/learning", "vignesh",
		"vignesh");
Statement st = conect.createStatement();

ResultSet rs = st.executeQuery("select * from student");
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
		
	
	</tr>
	</table>
<a href="details.html">back</a>
</body>
</html>