<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


  <link rel="stylesheet" href="./resources/bootstrap/bootstrap.css">
<link rel="stylesheet" href="./resources/css/style.css">
 

  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">

 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
 
  <script type="text/javascript">
	$(document).ready(function()		
	{
		
		$("#save").click(function()
	    {
	   
	    var value="";
			$.ajax({
			url:"save?name="+$("#studentname").val()+"&address="+$("#address").val(),
			type: "post",
			data: value,
			cache:false,
			success:function(data)
			{
				
				$("#s").html(data);
			}
					
			})
			
	    });
	});
	</script>

</head> 
<body class="login-page">
<div class="container">
    	<div class="logo">
        	<img src="./resources/images/logo.png" alt="" />
        </div>
    </div>
<section class="mid">
	<div class="container mid">
    	<div class="row">
        	<div class="col-lg-6 col-md-6 col-sm-6">
            	<div class="global">
                	<span>Global Resource Management System</span>
                </div>
            </div>
            <div class="col-lg-6 col-md-6 col-sm-6">
            	<div class="login-box-body">
                <p class="login-box-msg">GRMS Portal Login</p>
            
                <form action="loginCheck" method="post">
                  <div class="form-group has-feedback">
                  <label>Email</label>
                    <input type="email" name="sadminemail" class="form-control" placeholder="Email">
                    <span class=" form-control-feedback"><i class="fa fa-envelope" aria-hidden="true"></i>
</span>
                  </div>
                  <div class="form-group has-feedback">
                  <label>Password</label>
                    <input type="password" name="password" class="form-control" placeholder="Password">
                    <span class="form-control-feedback"><i class="fa fa-lock" aria-hidden="true"></i>
</span>
                  </div>
                  <div class="row">
                    <div class="col-xs-8">
                      <div class="checkbox icheck"">
                        <label>
                          <input type="checkbox"> Remember Me
                        </label>
                      </div>
                    </div>
                    <!-- /.col -->
                    <div class="col-xs-4">
                      <button type="submit" class="btn btn-success btn-block btn-flat">Sign In</button>
                    </div>
        <!-- /.col -->
      </div>
    </form>

   

    <a href="#">I forgot my password</a><br>

  </div>
            </div>
        </div>
    </div>
</section>
<footer>
	<div class="container">
    	<div  class="row">
        	<hr></hr>
            <div class="link">
            	<span>Copyright © Proculine. All rights reserved. Copyright with PNCCAPITAL LLC</span>
            </div>    
        </div>
    </div>
</footer>
</body>
</html>