<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title> Library System - New Application</title>

<link rel="stylesheet" type="text/css" 
		  href="${pageContext.request.contextPath}/resources/css/my-test.css">

    <script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
</head>

<body>
<h1>Application form</h1>
	
		<form:form action="processForm" modelAttribute="borrower">
	
		First name: <form:input path="firstName" />
		
		<br><br>
	
		Last name: <form:input path="lastName" />
		
		<br><br>
		
		City: 
		
		<form:select path="city">
			<form:options items="${borrower.cityOptions}" />
		</form:select>	
		
		<br>
		<br>
		
		<input type="submit" value="Submit" />
		<br>
		<br>
	
	</form:form>
	
<img src="${pageContext.request.contextPath}/resources/images/books.jpg">

</body>

</html>