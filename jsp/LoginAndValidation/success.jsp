<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert success</title>
</head>
<center>
<%

String name=(String)request.getAttribute("name");

if(name!=null)
{
    %>
    <h1>Hi  <%=name%> </h1>  
    
    <h2> welcome!!!</h2>  
<%
}
%>

<h1>WAIT FOR SOMESECONDS </h1> 
<%@include  file="loadingbar.html" %>
<META HTTP-EQUIV="refresh" CONTENT="5;URL=http://localhost:9090/JSPTraining/Content.html">
</center>
</body>
</html>