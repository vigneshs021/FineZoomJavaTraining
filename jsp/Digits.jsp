<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>

<%
int i,j = 0;
%>

<%	String v = request.getParameter("m"); 
 int m=Integer.parseInt(v);
	
%>
		
    <%
		while (m > 0)
		{
			i = m % 10;
			m = m / 10;
			j = j + i;
			%>
<%
		}
    %>
<h1>The sum of Value Is:<%=j%></h1>
		<a href="Content.html">Home</a>
		
</center>
</body>
</html>