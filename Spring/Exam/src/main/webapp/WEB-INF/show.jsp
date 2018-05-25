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
<h2 class="title">TV Shows</h2>
<h3 class="subtitle">Welcome ${user.name }</h3>


<table class="table is-bordered">
	<tr>
		<th>Show</th>
		<th>Network</th>
		<th>Average Rating</th>
	</tr>
	<c:forEach items="${ideas }" var="one">
	<tr>
		<td>
			<a href="/shows/${one.id}"><c:out value="${one.ideaname}"></c:out></a>
		</td>
		<td><c:out value="${one.network}"></c:out></td>
		<c:if test="${one.avgRating == null}">
		<td>Not yet rated</td>
		</c:if>
		<c:if test="${one.avgRating != null}">
		<td><c:out value="${one.avgRating}"></c:out></td>
		</c:if>
	</tr>
	</c:forEach>
</table>

<a href="/shows/new" class="button is-dark">Add a Show</a>

</body>
</html>