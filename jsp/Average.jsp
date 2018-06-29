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
<h1><u>Average</u></h1>
<% int[] totalvalues =
		{ 10, 20, 30, 40, 50, 60 };%>
		
		<%
		int indexofArray, number, sum = 0;
		%>

		<%
		for (indexofArray = 0; indexofArray < totalvalues.length; indexofArray++)
		{
			sum = sum + totalvalues[indexofArray];
			%>
			<h1><%=sum%></h1>
			
			
		<%
		
		}
		
		%>
		
<h1>Total some of Value <h1><%= sum%></h1></h1>
		<%
		int average = sum / totalvalues.length;
		%>

		<h1>The Average Value Is:<%=average%></h1>
		<a href="Content.html">Home</a>
		</center>
</body>
</html>