<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Login Page</h2>
<form action="checkUser" method="post">
	<label>UserName</label>
	<input type="text" name="user"> <br/>
	<label>Password</label>
	<input type="password" name="pass"> <br/>
	<input type="submit" name="Submit">
	<input type="reset" name="Reset"> 
</form>
</body>
</html>