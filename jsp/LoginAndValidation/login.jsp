<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<br>
	
				<h1>
					<b><font color="black" style="font-family: fantasy;">
						User Login Page</font> </b>
				</h1>
			
			<div class="panel-body" align="center">

				<div class="container " style="margin-top: 10%; margin-bottom: 10%;">

					<div class="panel panel-success" style="max-width: 35%;"
						align="left">

						<div class="panel-heading form-group">
							<b><font color="white"> Login Form</font> </b>
						</div>

						<div class="panel-body">

							<form action="Servlet" method="post">
								<div class="form-group">
									<label for="exampleInputEmail1">User Name</label> <input
										type="text" class="form-control" name="txtUserName"
										id="txtUserName" placeholder="Enter User Name"
										required="required">
                                              <br>
                                              <br>
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1">Password</label> <input
										type="password" class="form-control" name="txtPass"
										id="txtPass" placeholder="Password" required="required">
								</div>
								
								<br>
								<br>
								<button type="submit" style="width: 50%; font-size: 1.1em;"
									class="btn btn-large btn btn-success btn-lg btn-block">
									<b>Login</b>
								</button>

							</form>

						</div>
					</div>

				</div>

			</div>
			<a href="signup.jsp">signup</a>

</body>
</html>