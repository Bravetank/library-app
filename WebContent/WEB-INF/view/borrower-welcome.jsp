<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" 
		  href="${pageContext.request.contextPath}/resources/css/my-test.css">

    <script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
</head>

<body>

<h2>Welcome to the Library</h2>

<br>
<br>
The borrower is registered: ${borrower.firstName} ${borrower.lastName} 
<br>
<br>
City: ${borrower.city}
<br>
<br>

<img src="${pageContext.request.contextPath}/resources/images/books.jpg">

</body>

</html>