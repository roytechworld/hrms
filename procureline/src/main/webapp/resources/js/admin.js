/**
 * 
 */


$(document).ready(function()		
	{
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