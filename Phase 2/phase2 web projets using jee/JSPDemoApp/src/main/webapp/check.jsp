<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>check page</title>
</head>
<body>
<%--Declare --%>
<%! String email,password; %>

<%
response.setContentType("text/html"); //For Run in Crome browser
	email = request.getParameter("email");
	password = request.getParameter("password");
	
	if(email.equals("raj@gmail.com") && password.equals("123"))
	{
		out.println("Successfully Login	");
		%>
		<jsp:forward page="home.jsp"></jsp:forward>		<%--for new page output--%>
		<%
	}else {
		out.println("Failure try once again");
		%>
		<jsp:include page="login.jsp"></jsp:include>	<%--for same page output --%>
		<%
	}
%>

</body>
</html>