<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "include/header.jsp" %>
<%@ include file = "include/sidemenu.jsp" %>


    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
              <h1>Add admin details here !!</h1>
                <small>Admin</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Admin </a></li>
                <li class="active">Add admin</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">
            <!-- Small boxes (Stat box) -->
           
            <!-- /.row -->
            <!-- Main row -->
            <div class="row">
                <!-- Left col -->

                <section class="col-lg-12 connectedSortable">
                   
                   
                   
                   
                   
                   
 			<form action="adminData" method="post">
 		<div>
 		
 			adminID:<br>
  					<input type="text" name="adminID"><br>
  			saId :<br>
  					<input type="text" name="saId"><br>
 			adminTypeId:<br>
  					<input type="text" name="adminTypeId"><br>
  					
  			prefix:<br>
  					<input type="text" name="namePrefix"><br>
  			First Name:<br>
  					<input type="text" name="firstName"><br>
 			Last Name:<br>
  					<input type="text" name="lastName"><br>
 			Designation:<br>
  					<input type="text" name="adminDesignation"><br>
  			Company Name:<br>
  					<input type="text" name="adminCompanyName"><br>
  					
  			Employee ID:<br>
  					<input type="text" name="adminEmployeeId"><br>
 			Email ID:<br>
  					<input type="text" name="adminEmail"><br>
  			Password:<br>
  					<input type="text" name="adminPassword"><br>
 			ConfirmPassword:<br>
  					<input type="text" name="confirmPassword"><br>
  					
  			Phone Ext:<br>
  					<input type="text" name="phoneExt"><br>
  			PhoneNo:<br>
  					<input type="text" name="phoneNo"><br>
 			FaxNo:<br>
  					<input type="text" name="faxNo"><br>
  			Address:<br>
  					<input type="text" name="address"><br>
 		
 		
 		
 				
  			file:<br>
  					<input type="text" name="file"><br>
  			entryDate:<br>
  					<input type="text" name="entryDate"><br>
 			updatedDate:<br>
  					<input type="text" name="updatedDate"><br>
  			changePassword:<br>
  					<input type="text" name="changePassword"><br>
  					
  					
  					
  			status:<br>
  					<input type="text" name="status"><br>
  			blockStatus:<br>
  					<input type="text" name="blockStatus"><br>
 			isAdmin:<br>
  					<input type="text" name="isAdmin"><br>
  			forgotPasswordOtp:<br>
  					<input type="text" name="forgotPasswordOtp"><br>
  					
  			isDelete:<br>
  					<input type="text" name="isDelete"><br>
  					
  					<input type="submit" value="Submit">
 		 	
 		</div>
 		
 		</form>	
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                </section>
                
                      

                                        <!-- /.Left col -->
            </div>
            <!-- /.row (main row) -->

        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->
    
    <%@ include file = "include/footer.jsp" %>
    
 