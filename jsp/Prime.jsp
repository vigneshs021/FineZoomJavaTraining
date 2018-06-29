<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import='java.util.Scanner'%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%int calculate;
int reminder;
int flag=0;
 int i;

%><center>Check Number Is Prime Or Not</center>
      
     <% int n ; %>

      
      <h1>enter the number</h1>  
       <p> <%=n=98 %></p>
		
		 <%
		 
		 for(i=2;i<=n;i++)
			 {
			 reminder = n%i; 
			 %>
			 <%
			 if(reminder ==0)
			  {
			  flag =1;
			 
			   }
			 %>
			 <%
	 		 }
		
		   if(flag==1)
		   {
			   %>
			   <h1> The number is not prime</h1>
		  <%
		   }else 
		   {
			     	 %> 
		   	 <h1>The number is  prime</h1>
		
		   	 <%
		   }	
		   %>
          <a href="Content.html">Home</a>
</body>
</html>