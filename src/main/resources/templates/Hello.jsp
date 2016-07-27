<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
	xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="resources/js/hello.js"></script>
<title>Insert title here</title>
</head>
<body>

	<p th:text="'Hello, ' + ${name} + '!'" />

	<!-- <div class="container">
<div class = "form-group form">
<form action='input' method="post">
<div>
<label> Enter Number : </label>
<input type="text" id="inputId" name="inputId" placeholder=" Input Number" class="form-control" />
</div>
<button id="submitButton" class="form-control"> Submit </button>
 

</form>
</div>
</div> -->


</body>
</html>