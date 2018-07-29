<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Welcome to Procurelione!!!
</h1>
	
	<form action="addData" method="post">
  			Sadmin ID:<br>
  					<input type="text" name="sadminid"><br>
 			Sadmin Name:<br>
  					<input type="text" name="sadminname"><br>
 			Sadmin Email:<br>
  					<input type="text" name="sadminemail"><br>
  			Password:<br>
  					<input type="text" name="password"><br><br>
  					
  					<input type="submit" value="Submit">
  	</form>				
	
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>

