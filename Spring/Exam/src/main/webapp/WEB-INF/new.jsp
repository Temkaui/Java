<!DOCTYPE html>
<html>
<head>
	<title>Ideas</title>
	<meta charset="UTF-8">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.1/css/bulma.min.css">
	<link type="text/css" rel="stylesheet" href="/css/style.css">
	<script defer src="https://use.fontawesome.com/releases/v5.0.6/js/all.js"></script>
</head>
<body>
		
		<h1 class="title">New Idea</h1>

		<form:form method="POST" action="/ideas/create" modelAttribute="idea">
                <label>Idea</label>
                <form:input path="ideaname" placeholder="Idea"/>
                <form:errors path="ideaname"/><br>
            	
            <button type="submit" class="button is-dark">Create an Idea</button>
		</form:form>
	
</body>
</html>