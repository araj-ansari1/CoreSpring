<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
</head>
<body>
	<form action="saveUser" method="post" modelAttribute="User">
		<pre>
			Enter Name   <form:input path="firstName"/>
			Enter Last   <form:input path="lastName"/>
			Enter Email  <form:input path="email"/>
			username     <form:input path="username"/>
			password     <form:input path="password"/>
			             <form:button>Submit</form:button>
		</pre>
	</form>
</body>
</html>
