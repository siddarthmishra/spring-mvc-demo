<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Spring Demo</title>
		<link rel="stylesheet" type="text/css" 
		  href="${pageContext.request.contextPath}/resources/css/my-test.css">
    	<script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
	</head>
	<body>
		<img src="${pageContext.request.contextPath}/resources/images/spring-logo.png" height="200"/>
		<h1>Spring MVC Demo - Home Page</h1>
		<a href="showForm">Show Form</a>
		<br><br>
		<input type="button" onclick="doSomeWork()" value="Click Me"/>
	</body>
</html>