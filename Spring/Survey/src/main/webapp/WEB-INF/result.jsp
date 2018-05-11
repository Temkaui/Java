<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Submitted info</legend>
			<label>Your name: <c:out value="${first}"/></label>
    		<label>Dojo Location: <c:out value="${location}"/></label>
    		
    		<label>Favourite Language: <c:out value="${language}"/></label>
    		
    		<label>Comment:<c:out value="${comment}"/></label>
    		
 	</fieldset>

</body>
</html>