<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> Welcome to Simple HTML Code</h1>

<%--Declaration Tag --%>	
<%! int a,b,sum; %>

<%-- JSP --%>
	<%
		a=10;
		b=20;
		sum=a+b;
		out.println("Welcome to JSP Page<br/>"); 
		out.println("Sum of two number is "+sum);
	%>
	
	<br/>
	
	<%-- Express Tag --%>
	<font color="red">Value of A is <%=a %> and B is <%=b %> 
	and its sum is <%=sum %> 
					
	 </font>
</body>
</html>