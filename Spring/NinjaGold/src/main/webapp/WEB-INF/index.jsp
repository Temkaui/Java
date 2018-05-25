<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ninja Gold</title>
</head>
<body>
	<h1>Your Gold: <c:out value="${gold}"/></h1>
	<a href ="/clear">Clear Session</a>
	<div style="display: flex">
	
		<div class = "farm">
		<h1>Farm</h1>
		<h3>(earns 10-20 gold)</h3>
		<a href="/farm">Find Gold</a>
		</div>
		
		<div class = "cave">
		<h1>Cave</h1>
		<h3>(earns 5-10 gold)</h3>
		<a href="/cave">Find Gold</a>
		</div>
		
		<div class = "house">
		<h1>House</h1>
		<h3>(earns 2-5 gold)</h3>
		<a href="/house">Find Gold</a>	
		</div>
		
		<div class = "casino">
		<h1>Casino!</h1>
		<h3>(earns/takes 0-50 gold)</h3>
		<a href="/casino">Find Gold</a>	
		</div>
	</div>
	<div>
		<pre><c:out value="${res}"/></pre>
	</div>
</body>
</html>