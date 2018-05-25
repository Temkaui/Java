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

<h3 class="subtitle">Welcome ${user.name }</h3>

<h2 class="title">Ideas</h2>
<table class="table is-bordered">
	<tr>
		<th>Idea</th>
		<th>Created By</th>
		<th>Likes </th>
		<th>Action</th>
	</tr>
	<c:forEach items="${ideas }" var="one">
	<tr>
		<td>
			<a href="/ideas/${one.id}"><c:out value="${one.ideaname}"></c:out></a>
		</td>
		<td><c:out value="${one.op.name}"></c:out></td>
		<%-- <c:if test="${one.liking == null}">
			${one.liking = 0 }
		<td><c:out value="${one.liking}"></c:out></td>
		</c:if>
		<c:if test="${one.liking != null}"> --%>
		<td><c:out value="${one.liking}"></c:out></td>
		<td><a href="/ideas/${one.id }/like">Like</a></td>
		<%-- </c:if> --%>
	</tr>
	</c:forEach>
</table>
<a href="/ideas/new" class="button is-dark">Add an Idea</a>

</body>
</html>