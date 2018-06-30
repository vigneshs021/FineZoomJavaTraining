<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
 int n,i,flag=0;%>
          
        <% String s= request.getParameter("n");
            n=Integer.parseInt(s);
            %>
            
       <% if(n>1)
                {
    	   %>
              <%
                for(i=2;i<=n/2;i++)
                    {
                	%>
                	<%
                        if(n%i==0)
                            {
                               flag=1;
                               break;
                              
                        }
                	 %>
                     <%
                    }
                }
       %>
       <%
            if(flag==0)
                {
            	%>
                <h1>The number is  prime</h1>
             <%
            }
            else
                {
            	%>
                 <h1> The number is  not prime</h1>
                 <%
            }
       %>
<a href="Content.html">Home</a>


</body>
</html>