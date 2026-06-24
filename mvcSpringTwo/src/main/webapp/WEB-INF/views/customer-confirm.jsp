<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Confirmation</title>
</head>
<body>
	The customer is confirmed : ${customer.firstName }${customer.lastName }
	<br><br>Free Passes : ${customer.freepasses }
	<br><br>Email : ${customer.email }
	<br><br>Postal Code ${customer.postCode }
	
</body>
</html>