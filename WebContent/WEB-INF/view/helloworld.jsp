<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation</title>
</head>
<body>
<p>Hello World of Spring!</p>
<p>Student name : ${param.studentName}</p>
<p>Message : ${message}</p>
<br><br>
<form action="/spring-mvc-demo/">
	<input type="submit" value="Home">
</form>
<a href="${pageContext.request.contextPath}/">Home</a>
</body>
</html>