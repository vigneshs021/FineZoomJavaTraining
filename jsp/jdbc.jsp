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
<title>test connection</title>
</head>
<body>
	<%
		Class.forName("com.mysql.jdbc.Driver");
		Connection conect = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/learning", "vignesh",
				"vignesh");
		Statement st = conect.createStatement();

		ResultSet rs = st.executeQuery("select * from studentdetails");
		while (rs.next()) {
	%>
	<%=rs.getString(1)%>
	<%=rs.getString(2)%>
	<%=rs.getString(3)%>
	<%=rs.getString(4)%>

	<%
		}
	%>

</body>
</html>