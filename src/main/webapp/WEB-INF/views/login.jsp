<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/cyborg/bootstrap.min.css" rel="stylesheet" integrity="sha384-mtS696VnV9qeIoC8w/PrPoRzJ5gwydRVn0oQ9b+RJOPxE1Z1jXuuJcyeNxvNZhdx" crossorigin="anonymous">
</head>
<body>
	<a href="/" class="btn btn-secondary">Home</a>

	<h1>New User Stuff</h1>
	
	<form name="loggingUserQueury" action="/logUser" method="post">
	
		Email:<input type="text" name="email" required><br>
		Password:<input type="password" name="pass" required><br>
		<input type="submit" value="Submit"> 
	
	</form>
	
	${notValidloginAlert}
	
</body>
</html>