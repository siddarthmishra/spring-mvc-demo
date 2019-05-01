<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student-confirmation</title>
</head>
<body>
	Student is Confirmed : ${student.firstName} ${student.lastName}
	<br><br>
	Country : ${student.country}
	<br><br>
	countryOptionsResult : ${student.countryOptionsResult}
	<br><br>
	countryPropertiesResult : ${student.countryPropertiesResult}
	<br><br>
	<a href="${pageContext.request.contextPath}/">Home</a>
</body>
</html>