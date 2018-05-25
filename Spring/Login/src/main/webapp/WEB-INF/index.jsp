<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.1/css/bulma.min.css">
<link type="text/css" rel="stylesheet" href="/css/style.css">
<script defer src="https://use.fontawesome.com/releases/v5.0.6/js/all.js"></script>

<title>Login and Registration</title>
</head>
<body>
	<div class="container">
		<div class="hero is-primary">
			<h1 class="title">Users</h1>
		</div>
		<div class="columns">
			<div class="column">
				<h1>Registration</h1>
				<form action="/register" method="post">
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
					<p>${errors.username }</p>
					<p>Username: <input type="text" name="username"></p>
					<p>${errors.email }</p>
					<p>Email: <input type="text" name="email"></p>
					<p>${errors.password }</p>
					<p>Password: <input type="password" name="password"></p>
					<p>${errors.confirm }</p>
					<p>Confirm Pass: <input type="password" name="confirm"></p>
					<button type="submit" class="button is-dark">Register</button>
				</form>
			</div>
			<div class="column">
				<h1>Login</h1>
				<form action="/login" method="post">
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
					<p>Email: <input type="text" name="username"></p>
					<p>Password: <input type="password" name="username"></p>
					<button type="submit" class="button is-dark">Login</button>
				</form>
			</div>
			<div class="column"></div>
		</div>
	</div>
</body>
</html>