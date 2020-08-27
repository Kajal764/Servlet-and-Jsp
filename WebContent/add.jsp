<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<%
		int a = Integer.parseInt(request.getParameter("num1")); //here request and response reference we will get through jsp also called implicit object
	int b = Integer.parseInt(request.getParameter("num2"));
	int sum = a + b;

	out.println("Result : " +sum); //this out object is bydefault provided by jsp
	%>





</body>
</html>