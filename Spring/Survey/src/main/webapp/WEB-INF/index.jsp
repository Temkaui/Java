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
		<legend>Survey</legend>
		<form method="POST" action="/process">
			<label>Your name: <input type="text" name="name"></label>
    		<label>Dojo Location: <select name="location">
    			<option value="San Jose">San Jose</option>
    			<option value="DC">DC</option>
    			<option value="Chicago">Chicago</option>
    		</select></label>
    		
    		<label>Favourite Language: <select name="language">
    			<option value="python">Python</option>
    			<option value="java">Java</option>
    			<option value="js">JavaScript</option>
    		</select></label>
    		
    		<label>Comment:<textarea rows="10" cols="50" name="comment"></textarea> </label>
    		
   			<button type="submit">Submit</button>
		</form>
	</fieldset>

</body>
</html>