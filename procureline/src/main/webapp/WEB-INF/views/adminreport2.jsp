<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "include/header.jsp" %>
<%@ include file = "include/sidemenu.jsp" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

 
 <script type="text/javascript">
 
 $(document).ready(function()		
			{

	$("#add_admin_form").hide();
	
	$("#addadmin").click(function()
	{

	$("#add_admin_form").css("display", "block");	
	$("#add_admin_form").fadeIn(3000);
		
	$("#ed").hide();
	$("#ede").empty();
	$("#ede").hide();
		
	})
	
	
	$("a[name=edit]").on("click", function () {
		
	       var k = $(this).data("index"); 
	       
	       var value="";
		  
	    	
	     
			
			  $.ajax({
				     url: getContextPath()+"/editadm?id="+k,
				     type: "post",
				     data: value,
				     cache: false,
				     success: function(data) {
				
				    	 $("#ede").css("display", "block");	
				    	 $("#ede").html(data);
				    	 $("#ed").hide();	
				    	 
				     }
				     });
			
	});
	
	$("#btsaveadmin").click(function()
		    {
		
		
		
	//Validation---------------->
		
		
	if($("#fname").val()=="" || $("#lname").val()=="" )
		{
		
		$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>First name and Last name required !!</b>");
   		$("#isa_error").slideDown();
   		$("#isa_error").show();
   		$("#isa_error").fadeOut(4500)
		
		}
	else if($("#admin_designation").val()==""  )
		{
		$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Admin designation required !!</b>");
   		$("#isa_error").slideDown();
   		$("#isa_error").show();
   		$("#isa_error").fadeOut(4500)
		}
	
	else if($("#admin_company_name").val()==""  )
	{
	$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Admin company name required !!</b>");
		$("#isa_error").slideDown();
		$("#isa_error").show();
		$("#isa_error").fadeOut(4500)
	}
	
	else if($("#admin_employee_id").val()==""  )
	{
	$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Employee id required !!</b>");
		$("#isa_error").slideDown();
		$("#isa_error").show();
		$("#isa_error").fadeOut(4500)
	}
	
	else if($("#email").val()==""  )
	{
	$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Email required !!</b>");
		$("#isa_error").slideDown();
		$("#isa_error").show();
		$("#isa_error").fadeOut(4500)
	}
	
	else if($("#password").val()=="" || $("#conf_password").val()=="" )
	{
	$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Password and Confirm password required!!</b>");
		$("#isa_error").slideDown();
		$("#isa_error").show();
		$("#isa_error").fadeOut(4500)
	}
	
	else if($("#phone").val()==""  )
	{	
		
	$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Phone required !!</b>");
		$("#isa_error").slideDown();
		$("#isa_error").show();
		$("#isa_error").fadeOut(4500)
	}
	
	else if($("#fax").val()==""  )
	{
	$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Fax required !!</b>");
		$("#isa_error").slideDown();
		$("#isa_error").show();
		$("#isa_error").fadeOut(4500)
	}
	
	else if($("#address").val()==""  )
	{
	$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Fax required !!</b>");
		$("#isa_error").slideDown();
		$("#isa_error").show();
		$("#isa_error").fadeOut(4500)
	}
	
	else{
		
		$("#status").remove();

			 $('#btsaveadmin').prop('disabled', true);
		  	 $("#isa_success").fadeIn(2000);
	    	 $("#isa_success").slideDown();
			 $("#isa_success").show();
	    	 $("#isa_success").html("<b style=font-size:18px> Please wait !!</b>");	
		
			
	  	   var value="";
			  
			$.ajax({
			url:"imageupload",
			type: "POST",
			data: new FormData(document.getElementById("add_admin_form")),
	        enctype: 'multipart/form-data',
	        processData: false,
	        contentType: false,
			success:function(data)
			{
				var str = data;
				var n = str.search("ok");
				if(parseInt(n)>0)
					{
					
					 $('#btsaveadmin').prop('disabled', false);
				  	 $("#isa_success").fadeIn(3000);
			    	 $("#isa_success").slideDown();
					 $("#isa_success").show();
			    	 $("#isa_success").html("<b style=font-size:18px>Admin registration completed !!</b>");	
			    	 window.location.replace(getContextPath()+"/adminreport/0");
					}
				else
					{
			$('#btsaveadmin').prop('disabled', false)	;	
			$("#isa_success").fadeOut();
			$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Sorry try again  !!</b>");
	   		$("#isa_error").slideDown();
	   		$("#isa_error").show();
	   		$("#isa_error").fadeOut(7000)

					}
			},
			   error: function() {
				   $('#btsaveadmin').prop('disabled', false)	;	
				   $("#isa_success").fadeOut();
					$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Something happens wrong !!</b>");
			   		$("#isa_error").slideDown();
			   		$("#isa_error").show();
			   		$("#isa_error").fadeOut(4500)
			   }
					
			})
	}

		    });
	
	
	});
 
 </script>
 


    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
              Admin user
                <small>Management</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Manage Admin user</a></li>
                <li class="active">Admin List</li>
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
                    <div class="box">
                    
                    <div class="box">
                        <div class="panel panel-default">
                            <div class="panel-body" style="text-align: right">
                                <a href="#" id="addadmin" style="color: #09274B;"><i class="fa fa-plus" style="color: green;"></i> Add Admin User</a>
                            </div>
                        </div>
                    </div>
                       <div id="ede" style="display: none"; class="box-body table-responsive no-padding">
                       
        
                       
                       
                       </div>
                       
                       
                          <form id="add_admin_form" method="POST" style="display: none" action="imageupload" enctype="multipart/form-data" siq_id="autopick_9675">
                            <div class="panel-body">
                                <div class="row">
                                    <div style="margin-top:20px;" class="col-xs-12 col-sm-12 col-md-12">

                                <div class="form-group has-feedback" id="status">
                                             ${message }
                  </div>
                                        <table class="table table-bordered table-striped" width="100%" border="1" cellspacing="2" cellpadding="2">
                                            <tbody>
                                                <tr>
                                                    <td width="25%">
                                                        <label for="email">Image</label>
                                                    </td>
                                                    <td width="25%">
                                                        <input class="" type="file" name="file" accept="image/*" id="image-file">
                                                        <span style="color: red;">(Max File Size : 2MB)</span>
                                                    </td>
                                                    <td width="25%"><label for="email">Prefix</label></td>
                                                    <td width="25%">
                                                        <input type="radio" id="name_prefix1" name="name_prefix" value="Mr." checked=""> Mr.
                                                        <input type="radio" id="name_prefix2" name="name_prefix" value="Mrs."> Mrs.
                                                        <input type="radio" id="name_prefix3" name="name_prefix" value="Ms."> Ms.
                                                        <input type="radio" id="name_prefix4" name="name_prefix" value="Dr."> Dr.
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <label for="email">First Name<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required,custom[onlyLetterSp]]" type="text" id="fname" name="fname" placeholder="First Name" value="">
                                                    </td>
                                                    <td>
                                                        <label for="email">Last Name<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required,custom[onlyLetterSp]]" type="text" id="lname" name="lname" placeholder="Last Name" value="">
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <label for="email">Designation<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required,custom[onlyLetterSp]]" type="text" id="admin_designation" name="admin_designation" placeholder="Designation" value="">
                                                    </td>
                                                    <td>
                                                        <label for="email">Company Name<span style="color: red;">*</span></label> 
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required]" type="text" id="admin_company_name" name="admin_company_name" placeholder="Company" value="">
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <label for="email">Employee ID</label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control" type="text" id="admin_employee_id" name="admin_employee_id" placeholder="Employee ID" value="">
                                                    </td>
                                                    <td>
                                                        <label for="email">Email ID<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required,custom[email]]" type="text" id="email" name="email" placeholder="Email ID" value="">
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <label for="email">Password<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required]" type="password" id="password" name="password" placeholder="New Password">
                                                    </td>
                                                    <td>
                                                        <label for="email">Confirm Password<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required,equals[password]]" type="password" id="conf_password" name="conf_password" placeholder="Confirm New Password">
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <label for="email">Phone No. <span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required,custom[phone],minSize[10],maxSize[10]]" type="text" id="phone" name="phone" placeholder="Phone No." onkeyup="enterNumber('phone')" value="">
                                                    </td>
                                                    <td>
                                                        <label for="email">Fax No.</label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[custom[onlyNumberSp]]" type="text" id="fax"  name="fax"  onkeyup="enterNumber('fax')" placeholder="Fax" value="">
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <label for="email">Address <span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <textarea name="address" id="address" class="form-control validate[required]" rows="5" cols="10" placeholder="Address" style="resize: none;"></textarea>
                                                    </td>
                                                    <td>&nbsp;</td>
                                                    <td>&nbsp;</td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>

                            <div class="panel-footer">
                                <div class="row">
                                    <div class="col-xs-12 col-sm-12 col-md-12"></div>
            
                                                   <div id="isa_success" class="isa_success">
             
    
               </div>
               <div id="isa_error" class="isa_error">


              </div>
                                    
                                    
                                    <div class="col-xs-12 col-sm-12 col-md-12">
                                       
                                       
                                       
                                        <button id="btsaveadmin" class="btn btn-success" type="button">Add admin</button>
                                        
                                  
                                        
                                        <a href="javascript:void(0)" onclick="window.history.back();" class="btn btn-default">Back</a>
                                        
                                        
                                        
                                        
                                        
                                        <input type="hidden" name="sa_id" value="1">
                                    </div>
                                </div>
                            </div>
                        </form>
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                        <!-- /.box-header -->
                        <div id="ed" class="box-body table-responsive no-padding">
                            <table class="table table-bordered table-striped" style="font-size: 12px;" id="timesheet_tbld">
                                <thead>
                                    <tr>
                                        <th style="text-align: center;">SL No</th>
                                        <th style="text-align: center;">Photo</th>
                                        <th style="text-align: center;">Name</th>
                                        <th style="text-align: center;">Designation</th>
                                        <th style="text-align: center;">Email ID</th>
                                        <th style="text-align: center;">Phone no</th>
                                        <th style="text-align: center;">Fax no</th>
                                        <th style="text-align: center;">Action</th>
                                    
                                    </tr>
                                </thead>
                                <tbody>
                                
                                
                             
                                
                                <c:forEach var="stdentlistValue" varStatus="loop" items="${adminlist}">
                                
                                                <tr>
                                                <td>${loop.index+1}</td>
                                                <td><img src="<%=request.getContextPath()%>/resources/admin/${stdentlistValue.file}" height="40px" width="40px"/></td>
                                                <td>${stdentlistValue.firstName }  </td>
                                                <td>${stdentlistValue.adminDesignation } </td>
                                                <td>${stdentlistValue.adminEmail }
                                                
                                                 </td>
                                                <td>${stdentlistValue.phoneNo }  </td>
                                                <td>${stdentlistValue.faxNo} </td>
                                                
                                              
                                                
                                              <td style="text-align: center;">
                                                   
                                                    
                                                    <a class="tbl_icon" href="#" id="edit${stdentlistValue.adminID}"  data-index="${stdentlistValue.adminID}"  name="edit" data-toggle="tooltip" title="" data-original-title="Edit ">
                                                        <i class="fa fa-pencil-square-o" aria-hidden="true" style="color: #09274B;"></i>
                                                    </a>

<!-- 
                                                    <a class="tbl_icon" href="javascript:void(0)" data-toggle="tooltip" title="" onclick="" data-original-title="Unblock"><i class="fa fa-unlock" aria-hidden="true" style="color: green;"></i></a>
                                                                                                                                                                            <a class="tbl_icon" href="#" title="" onclick="" data-original-title="Active"><i class="fa fa-check" aria-hidden="true"></i></a>
                                                           
                                                    <a class="tbl_icon" href="#15" data-toggle="modal" title="View Admin Profile">
                                                        <i class="fa fa-eye" aria-hidden="true" style="color: #09274B;"></i>
                                                    </a>

                                                    <a class="tbl_icon" href="#" data-toggle="tooltip" title="" onclick="" data-original-title="Delete">
                                                        <i class="fa fa-trash-o" aria-hidden="true" style="color: red;"></i>
                                                    </a>

                                                                                                      <a class="tbl_icon" href="#"
                                                                                                           data-toggle="tooltip" title="Delete User" onclick="deleteUser('');">
                                                                                                            <i class="fa fa-times" aria-hidden="true" style="color: red;"></i>
                                                                                                            -->
                                                                                                            
                                                                                                             </td>
                                       </tr>
                                
                                
                                    </c:forEach>
                                
                                
            <tr>
    <td colspan=9 align="right">
    
    <a style="font-size: 17px" href="<%=request.getContextPath()%>/adminreport/0">1</a> 
     
     <c:forEach var="pagination" varStatus="loops" items="${paginationlist}">
     
     <a style="font-size: 17px" href="<%=request.getContextPath()%>/adminreport/${loops.index+1}">${loops.index+1+1}</a> 
     

     </c:forEach>
  
    
    
    </td>
    </tr>
                                
                                
                              </tbody>
                            </table>
                        </div>
                    </div>
                    
                    <form id="edit" method="POST" action="editadmin">
                    
                    <input type="hidden" id="sentid" value="0" name="sentid"/>
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
    
 