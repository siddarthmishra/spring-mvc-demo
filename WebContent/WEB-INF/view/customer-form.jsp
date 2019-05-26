<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page
	import="java.util.*, org.springframework.web.servlet.support.RequestContext, org.springframework.validation.Errors, org.springframework.validation.ObjectError, org.springframework.validation.FieldError"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration Form</title>
<style type="text/css">
.error {
	color: red;
	font-style: italic;
	font-family: cursive;
}
</style>
</head>
<body>

	<br>
	<form:form action="processForm" modelAttribute="customer">
		<div class="error">${customer.errorMessage}</div>
		<br>
	 	First Name : <form:input path="firstName" />
		<br>
		<br>
		Last Name (*) : <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br>
		<br>
		Email (*) : <form:input path="email" />
		<br>
		<br>
		Free Passes (*) : <form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error" />
		<br>
		<br>
		Postal Code : <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" />
		<br>
		<br>
		Course Code : <form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="error" />
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>
	<br>
	<a href="${pageContext.request.contextPath}/">Home</a>
	<hr>

	Viewing raw validation errors data

	<p>

		<%
			RequestContext requestContext = (RequestContext) pageContext
					.getAttribute("org.springframework.web.servlet.tags.REQUEST_CONTEXT");

			Errors theErrors = requestContext.getErrors("customer");

			List<FieldError> fieldErrors = theErrors.getFieldErrors();

			out.println("hasFieldErrors=" + !fieldErrors.isEmpty() + "<br><br>");

			for (FieldError temp : fieldErrors) {
				out.println("field=" + temp.getField() + "<br>");
				out.println("rejected value=" + temp.getRejectedValue() + "<br>");
				out.println("default message=" + temp.getDefaultMessage() + "<br>");

				out.println("<br>");
				out.println("Full dump: " + temp);
				out.println("<br>");
			}
		%>

	</p>
	<br>
</body>
</html>