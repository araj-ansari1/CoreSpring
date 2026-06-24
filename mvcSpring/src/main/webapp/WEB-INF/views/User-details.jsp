<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hello........<h3>${user.firstName}</h3>
	<hr>
	Your Last Name<h3>${user.lastName}</h3>
	<hr>
	Email........<h3>${user.email}</h3>
	<hr>
	Password.......<h3>${user.password}</h3>
</body>
</html>