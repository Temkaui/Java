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
	<h1 class="title">${show.showname}</h1>
	<p class="subtitle">Network: ${show.network }</p>
	${show.ratings }
	<h2 class="subtitle">User Who rated this show</h2>
	
	<table class="table is-bordered">
		<tr>
			<th>Name</th>
			<th>Rating</th>
		</tr>
		<c:forEach items="${show.ratings }" var="eachrate">
		<tr>
			<td><c:out value="${eachrate.name}"></c:out></td>
			<td><c:out value="${r.user.getName()}"></c:out></td>
		</tr>
		</c:forEach>
		
	</table>
	
	<a class="button is-dark" href="/shows/${show.id}/edit">Edit</a><br><br>
	<form action="/shows/${show.id}/rating" method="post">
		<label>Leave a Rating</label>
	<select name="r">
		<option value="1">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
		<option value="4">4</option>
		<option value="5">5</option>
	</select>
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	<button type="submit" class="button is-dark">Rate!!</button>
	</form>
</body>
</html>