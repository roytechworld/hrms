<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>Welcome To Vendor page</h1>
		
		<form action="vendorData" method="post">
		
		
			Company Id:<br>
  					<input type="text" name="companyId"><br>
  			Vendor City:<br>
  					<input type="text" name="city"><br>
 			Vendor address:<br>
  					<input type="text" name="address"><br>
  			Country:<br>
  					<input type="text" name="country"><br><br><br>
 			
 						
  					<input type="submit" value="Submit">
  		</form>			
</body>
</html>