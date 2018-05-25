<!DOCTYPE html>
<html>
<head>
	<title>Movies</title>
	<meta charset="UTF-8">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<%@taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
	<link type="text/css" rel="stylesheet" href="/css/style.css">
</head>
<body>
	<h1>Person</h1>
	<fieldset>
		<legend>Add a Person</legend>
		<form:form method="POST" action="/person/new" modelAttribute="person">
			<form:label path="firstName">First Name:
				<form:errors path="firstName"/>
				<form:input path="firstName"/>
			</form:label>
			<form:label path="lastName">Last Name:
				<form:errors path="lastName"/>
				<form:input type="text" path="lastName"/>
			</form:label>
			
			<input type="submit" value="Create"/>
			
		</form:form>
	</fieldset>
	
	<%-- <fieldset>
		<legend>Add a License</legend>
		<c:forEach items="${movies}" var="movie">
			<p> ${movie.title} (${movie.year})</p>
		</c:forEach>
	</fieldset> --%>
</body>
</html>