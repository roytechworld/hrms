<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <title>Sign In</title>
    <!-- Favicon-->
    <link rel="icon" href="../../favicon.ico" type="image/x-icon">

 
	
<jsp:include page="./loginconfig/header.jsp"></jsp:include>

</head>

<body class="login-page">
    <div class="login-box">
        <div class="logo">
            <img src="<%=request.getContextPath() %>/resources/login/images/logo-white.png" class="img-responsive logo"/>
            <small>Welcome To Procureline Next Generation Global Resource Management System</small>
        </div>
        <div class="card">
            <div class="body">
                <form:form id="frm" action="dash" method="post"  >
					
					<div class="row">
						<div class="col-xs-6"><div class="msg">GRMS BETA LOGIN</div></div>
						<div class="col-xs-6">
							<div class="input-group">
							<span class="input-group-addon">Sign As : </span>
							<select id="type" class="form-control" >
							
							<option value="superadmin">SAdmin</option>
                   <option value="admin">Admin</option>
                   <option value="vendor">Vendor</option>
                   <option value="consultant">Consultant</option>
                   <option value="employee">Employee</option>
							</select>
							
				
						  </div>
							
		             </div>
					</div>
                    <div class="input-group">
                        <span class="input-group-addon">
                            <i class="material-icons">person</i>
                        </span>
                        <div class="form-line">
                             <form:input id="email"  cssClass="form-control" path="sa_email" placeholder="Email"/>
                        </div>
                    </div>
                    <div class="input-group">
                        <span class="input-group-addon">
                            <i class="material-icons">lock</i>
                        </span>
                        <div class="form-line">
                       
                   <form:password id="password" cssClass="form-control" path="sa_password" placeholder="password"  />
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-xs-8 p-t-5">
                            <input type="checkbox" name="rememberme" id="rememberme" class="filled-in chk-col-pink">
                            <label for="rememberme">Remember Me</label>
                        </div>
                        <div class="col-xs-4">
                          
                            <input id="btsv"  type="button" class="btn btn-block bg-pink waves-effect" value="SIGN IN"/>
                        </div>
                    </div>
                    
                       <div class="row">
                        <div id="isa_success" class="isa_success">
                           
                        </div>
                        <div id="isa_error" class="isa_error">
                            
                        </div>
                    </div>
                    
                    
                    
                    <div class="row">
                        <div class="col-xs-12">
                            <a href="<%=request.getContextPath()%>/forgotpasscall">Forgot Password?</a>
                        </div>
                    </div> 
                    
                   
                   </form:form>
            </div>
        </div>
	<jsp:include page="./loginconfig/footer.jsp"></jsp:include>	
	
</body>
</html>