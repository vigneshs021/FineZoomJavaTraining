package com.boot.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet
{		
	
		
		    private static final long serialVersionUID = 1L;

		   

		    protected String processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
		        
		    
		        String name=request.getParameter("txtUserName");
		        String pass=request.getParameter("txtPass");
		        
		      //  System.out.println(name); 
		      //  System.out.println(pass);

		        
		        Class.forName("com.mysql.jdbc.Driver");
				Connection conect = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/learning", "vignesh",
						"vignesh");
				Statement st = conect.createStatement();

				PreparedStatement ps = conect.prepareStatement("select username,password from users where username=? and password=?");
				ps.setString(1, name);
				ps.setString(2, pass);
		 
				ResultSet rs = ps.executeQuery();
				
				
				//request.getRequestDispatcher("welcome.jsp").forward(request, response); 
				
				while (rs.next()) {
					 RequestDispatcher rd=request.getRequestDispatcher("success.jsp"); 
					 request.setAttribute("name", name);
			            rd.forward(request,response);  
			 
				/*	request.setAttribute("name",login);
					request.getRequestDispatcher("success.jsp").forward(request, response); */
					//response.sendRedirect("success.jsp");
					return name;
				}
				response.sendRedirect("error.jsp");
				return name;
		             
		        
		        
		        
		      /*  if(name.equalsIgnoreCase("vignesh")&& pass.equalsIgnoreCase("vignesh"))
		        {
		              RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		            request.setAttribute("uname", name);
		            rd.forward(request, response);
		        }
		        else
		        {//if name&pass not match then it display error page//
		            response.sendRedirect("error.jsp");
		        }*/
		        
		    }
		    
		    
		    
		    
		    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		        try {
					processRequest(request, response);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }

		    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		        try {
					processRequest(request, response);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }

}
