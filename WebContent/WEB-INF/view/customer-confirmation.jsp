<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>
	The Customer is Confirmed : ${customer.firstName} ${customer.lastName}
	<br>

	<br>
	<a href="${pageContext.request.contextPath}/">Home</a>
</body>
</html>