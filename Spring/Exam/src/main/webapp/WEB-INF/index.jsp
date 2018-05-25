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
	<link type="text/css" rel="stylesheet" href="/css/logreg.css">
	<!-- <script defer src="https://use.fontawesome.com/releases/v5.0.6/js/all.js"></script> -->
</head>
<body>
	<div class="container" style="display: flex">
			<form action="/register" method="post">
			
			
				<div class="register" style="display: flex">
					<div>
						<label>Name:</label><br>
						<label>Email:</label><br>
						<label>Password:</label><br>
						<label>Confirm Password:</label><br>
					</div>
					<div>
						<input type="text" name="name" placeholder="Name"><br>
						<input type="text" name="email" placeholder="Email"><br>
						<input type="password" name="password" placeholder="Password"><br>
						<input type="password" name="confirm" placeholder="Confirm Password"> 
		               	<br>	
					</div>
				</div>
				<div>
               		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                	<input class="button is-dark" type="submit" value="Register">
                	
               	</div>
               	<div>
               		<c:if test="${errors != null}">
	                <ul>
	                	<li>${errors.name}</li>
	                	<li>${errors.email}</li>
	                	<li>${errors.password}</li>
	                	<li>${errors.confirm}</li>
	                </ul>		
					</c:if><br>
               	</div>
            </form>
            
            
            <form action="/login" method="post">
            	
				<div style="display: flex">
	                <div>
	                    <label>Email:</label><br>
	                	<label>Password:</label>
	                </div>
	                <div class="field">
	                    <div>
	                        <input type="text" name="email" placeholder="Email">
	                    </div>
	                    <div>
	                        <input type="password" name="password" placeholder="Password">
	                    </div>
	                </div>
	            </div>
	            <div class="at-bottom">
                	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> 
                	<input class="button is-dark" type="submit" value="Login">
               	</div>
				<div>
               		<c:if test="${error != null}">
	                	${error}  
					</c:if>
               	</div>
				</form>

       </div>

</body>
</html>