<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Average values</title>
</head>
<body>
<center>

<% int m,m1,m2,m3,m4;%>
		
		<%
		int i, number, sum = 0;
		%>
		
		<%	String v = request.getParameter("m"); 
  m=Integer.parseInt(v);
  String v1 = request.getParameter("m1"); 
  m1=Integer.parseInt(v1);
  String v2 = request.getParameter("m2"); 
  m2=Integer.parseInt(v2);
  String v3 = request.getParameter("m3"); 
  m3=Integer.parseInt(v3);
  String v4 = request.getParameter("m4"); 
  m4=Integer.parseInt(v4);%>

		<%
		sum= m+m1+m2+m3+m4;
			%>
			
			
			
		
		
<h1>Total some of Value <h1><%= sum%></h1></h1>
		<%
		int average = sum / m;
		%>

		<h1>The Average Value Is:<%=average%></h1>
		<a href="Content.html">Home</a>
		</center>
</body>
</html>