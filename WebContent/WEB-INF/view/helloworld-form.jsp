<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello World - Input Form</title>

<%-- Support for jQuery --%>
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.4.0.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
</head>
<body>

	<%-- <form action="processForm" method="GET">
		<input type="text" name="studentName" placeholder="What's your name?">
		<input type="submit" value="Submit">
	</form> --%>
	<form action="processFormVersionTwo" method="GET">
		<input id="studentName" type="text" name="studentName" placeholder="What's your name?" onblur="checkSubmitButton()">
		<br>
		<input id="submitForm" type="submit" value="Submit" disabled="disabled">
	</form>
	<br><br>
	<form action="/spring-mvc-demo/">
		<input type="submit" value="Home">
	</form>
</body>
</html>