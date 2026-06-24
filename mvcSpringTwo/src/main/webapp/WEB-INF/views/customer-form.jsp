<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Title here</title>
</head>
<body>
	<form:form modelAttribute="customer" action="processForm">
		<pre>
			First Name <form:input path="firstName"/>
			<hr/>
			Last Name <form:input path="lastName"/>
			<hr/>
			Free Passes <form:input path="freepasses"/>
			<hr/>
			Postal Code <form:input path="postCode"/>
			Email <form:input path="email"/>
			<hr>
			<input type="submit" value="Submit"/>
		</pre>
	</form:form>
</body>
</html>