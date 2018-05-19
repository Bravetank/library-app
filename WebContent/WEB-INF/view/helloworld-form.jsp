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
<img src="${pageContext.request.contextPath}/resources/images/books.jpg">

		<form action="processForm" method="GET">
			<input type="text" name="customerName"
			placeholder="What's your name?" />
			
			<input type="text" name="customerAge"
			placeholder="How old are you?" />
			<input type="submit" />
			
		</form>

</body>

</html>