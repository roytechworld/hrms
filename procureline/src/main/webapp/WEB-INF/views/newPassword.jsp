<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Procureline</title>


  <link rel="stylesheet" href="./resources/bootstrap/bootstrap.css">
<link rel="stylesheet" href="./resources/css/style.css">
 

  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
 <link rel="stylesheet" href="./resources/css/projectCustom.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <link rel="stylesheet" href="./resources/css/projectCustom.css">
 <script src="./resources/js/project.js"></script> 
 
  
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
                <p class="login-box-msg">Create new password </p>
            
                 <form id="frm" action="newpasswordcr" method="post">
                  <div class="form-group has-feedback">
                  
                    <input type="password" id="password" name="password" class="form-control" placeholder="new password">
                    <span class=" form-control-feedback">
   </span>
                  </div>
                  
                     <div class="form-group has-feedback">
                  
                    <input type="password" id="password2" name="password2" class="form-control" placeholder="confirm password">
                    <span class=" form-control-feedback">
   </span>
                  </div>
                  <input type="hidden" value="${email}" name="email" />
                  </form>
                  <div class="form-group has-feedback" id="status">
                   ${message}
                  </div>
                  
               <div id="isa_success" class="isa_success">
              
    
               </div>
               <div id="isa_error" class="isa_error">


              </div>
                  
                  <div class="row">
               
                    <!-- /.col -->
                    <div class="col-xs-4">
                      <button id="btnewpasswordsend" class="btn btn-success btn-block btn-flat">Send</button>
                    </div>
                    
                    <a href="<%=request.getContextPath()%>/forgotpasscall">Back</a>
                       
        <!-- /.col -->
      </div>
  
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