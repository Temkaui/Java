<!DOCTYPE html>
<html>
<head>
	<title>Shows</title>
	<meta charset="UTF-8">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.1/css/bulma.min.css">
	<link type="text/css" rel="stylesheet" href="/css/style.css">
	<script defer src="https://use.fontawesome.com/releases/v5.0.6/js/all.js"></script>
</head>
<body>
	<h1 class="title">Wireless Charging For Laptop</h1>
	<p class="subtitle">Created by: ${idea.op.name }</p>

	<h2 class="subtitle">User who liked this idea:</h2>
	
	<table class="table is-bordered">
		<tr>
			<th>Name</th>
		</tr>
		<%-- <c:forEach items="${idea }" var="each">
		<tr>
			<td><c:out value="names of the person who liked"></c:out></td>
		</tr>
		</c:forEach> --%>
		<tr><td>${idea.ideaname }</td></tr>
		
	</table>
	
	<a class="button is-dark" href="/ideas/${idea.id}/edit">Edit</a><br><br>
	
</body>
</html>