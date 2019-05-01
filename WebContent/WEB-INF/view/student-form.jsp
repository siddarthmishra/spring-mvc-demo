<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student-form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		
		First Name : <form:input path="firstName"/>
		<br><br>
		Last Name : <form:input path="lastName"/>
		<br><br>
		Country : <form:select path="country">
					<form:option value="Brazil" label="Brazil" />
					<form:option value="France" label="France" />
					<form:option value="Germany" label="Germany"></form:option>
					<form:option value="India" label="India"></form:option>
					<form:option value="" label="Select" />
				</form:select>
		<br><br>
		Country : <form:select path="countryOptionsResult">
					<form:options items="${student.countryOptions}" />
				</form:select>
		<br><br>
		Country : <form:select path="countryPropertiesResult">
					<form:options items="${theCountryOptions}" />
				</form:select>
		<br><br>
		Favorite Language :
			Java<form:radiobutton path="favoriteLanguage" value="Java" /> &nbsp;&nbsp;
			C#<form:radiobutton path="favoriteLanguage" value="C#" /> &nbsp;&nbsp;
			Ruby<form:radiobutton path="favoriteLanguage" value="Ruby" /> &nbsp;&nbsp;
			PHP<form:radiobutton path="favoriteLanguage" value="PHP" /> &nbsp;&nbsp;
			None<form:radiobutton path="favoriteLanguage" value="" />
		<br><br>
		Favorite Language : <form:radiobuttons path="favoriteLanguageOptionsResult" items="${student.favoriteLanguageOptions}"/>
		<br><br>
		Favorite Language : <form:radiobuttons path="favoriteLanguagePropertiesResult" items="${theFavoriteLanguageOptions}"/>
		<br><br>
		<input type="submit" value="Submit">
		
	</form:form>
	<br>
	<a href="${pageContext.request.contextPath}/">Home</a>
</body>
</html>