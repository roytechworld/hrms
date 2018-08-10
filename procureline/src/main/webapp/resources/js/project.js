/**
 * 
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////// Login ,Forgot Login , New password creation starts here  //////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
$(document).ready(function()		
	{


	
	
		$("#btsv").click(function()
	    {
			
			
			var login=$("#email").val();
			var password=$("#password").val();
			var type=$("#type").val();
			
			if(login!="" && password!="" && type!="")
				{
				
				 $('#btsv').prop('disabled', true);
			  	 $("#isa_success").fadeIn(2000);
  	    	     $("#isa_success").slideDown();
				 $("#isa_success").show(1000);
		    	 $("#isa_success").html("<b style=font-size:18px> Processing your request !!</b>");	
		    	 
				   var value="";
			  
					$.ajax({
					url:"loginCheck?email="+$("#email").val()+"&password="+$("#password").val()+"&type="+type,
					type: "post",
					data: value,
					cache:false,
					success:function(data)
					{
						var str = data;
						var n = str.search("ok");
						if(parseInt(n)>0)
							{
							
						  	 $("#isa_success").fadeIn(3000);
				    	 $("#isa_success").slideDown();
							 $("#isa_success").show(1000);
					    	 $("#isa_success").html("<b style=font-size:18px>Sign in success opening your account !!</b>");	
					    	
							document.getElementById("frm").submit(); 
							}
						else
							{
					$('#btsv').prop('disabled', false)	;	
					$("#isa_success").fadeOut();
					$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Invalid credentials try again  !!</b>");
			   		$("#isa_error").slideDown();
			   		$("#isa_error").show(1000);
			   		$("#isa_error").fadeOut(7000)

							}
						
			
					},
					   error: function() {
						   $('#btsv').prop('disabled', false)	;	
						   $("#isa_success").fadeOut();
							$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Something happens wrong !!</b>");
					   	
					   		$("#isa_error").show(1000);
					   		$("#isa_error").fadeOut(4500)
					   }
							
					})
				}
			else
				{
				$('#btsv').prop('disabled', false)	;	
					$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Login , password and type required   !!</b>");
			   		$("#isa_error").slideDown();
			   		$("#isa_error").show(1000);
			   		$("#isa_error").fadeOut(4500)
				   
				}
			
		
	    });
		       
		$("#btforget").click(function()
			    {
			$("#status").remove();
			var login=$("#email").val();
			if(login!="" )
			{
				
				 $('#btforget').prop('disabled', true);
			  	 $("#isa_success").fadeIn(2000);
		    	 $("#isa_success").slideDown();
				 $("#isa_success").show();
		    	 $("#isa_success").html("<b style=font-size:18px> Please wait !!</b>");	
				
				 document.getElementById("frm").submit();  
			}
			else
				{
					$('#btforget').prop('disabled', false)	;	
					$("#isa_success").fadeOut();
					$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Email required !!</b>");
			   		$("#isa_error").slideDown();
			   		$("#isa_error").show();
			   		$("#isa_error").fadeOut(7000)
				}
			    
			    });
		
		
		$("#btnewpasswordsend").click(function()
			    {
			$("#status").remove();
			var otp=$("#password").val();
			var otp2=$("#password2").val()
			
			
			if(otp!="" && otp!="" )
			{
				
				if(otp==otp2)
					{
					
					 $('#btnewpasswordsend').prop('disabled', true);
				  	 $("#isa_success").fadeIn(2000);
			    	 $("#isa_success").slideDown();
					 $("#isa_success").show();
			    	 $("#isa_success").html("<b style=font-size:18px> Please wait !!</b>");	
				
				 document.getElementById("frm").submit();  
					}
				else
					{
					
					$('#btnewpasswordsend').prop('disabled', false)	;	
					$("#isa_success").fadeOut();
					$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>New password and confirm password not matched !!</b>");
			   		$("#isa_error").slideDown();
			   		$("#isa_error").show();
			   		$("#isa_error").fadeOut(7000)
					
					}
			}
			else
				{
				
				$('#btnewpasswordsend').prop('disabled', false)	;	
				$("#isa_success").fadeOut();
				$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>New password and confirm password not matched !!</b>");
		   		$("#isa_error").slideDown();
		   		$("#isa_error").show();
		   		$("#isa_error").fadeOut(7000)
				
				}
			    
			    });
		
		
		$("#btOTPValidate").click(function()
			    {
			$("#status").remove();
			var login=$("#email").val();
			if(login!="" )
			{
				
				 $('#btOTPValidate').prop('disabled', true);
			  	 $("#isa_success").fadeIn(2000);
		    	 $("#isa_success").slideDown();
				 $("#isa_success").show();
		    	 $("#isa_success").html("<b style=font-size:18px> Please wait !!</b>");	
			
				
				document.getElementById("frm").submit();  
			}
			else
				{
				$('#btOTPValidate').prop('disabled', false)	;	
				$("#isa_success").fadeOut();
				$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>OTP required !!</b>");
		   		$("#isa_error").slideDown();
		   		$("#isa_error").show();
		   		$("#isa_error").fadeOut(7000)
				}
			    
			    });
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////// Login ,Forgot Login , New password creation Ends here . Codes by Pradipto Roy//////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////// Admin ,Edit Others , starts here . Codes by Pradipto Roy//////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		

	/////-------------------------------------------------- Admin edit	
		$("#btedit").click(function()
				{
		
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
		$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Address required !!</b>");
			$("#isa_error").slideDown();
			$("#isa_error").show();
			$("#isa_error").fadeOut(4500)
		}
	else{
			
			$("#status").remove();

				 $('#btedit').prop('disabled', true);
			  	 $("#isa_success").fadeIn(2000);
		    	 $("#isa_success").slideDown();
				 $("#isa_success").show();
		    	 $("#isa_success").html("<b style=font-size:18px> Please wait updating !!</b>");	
			
				
		  	   var value="";
				  
				$.ajax({
				url: getContextPath()+"/adminrecordsupdate",
				type: "POST",
				data: new FormData(document.getElementById("updateadmin")),
		        enctype: 'multipart/form-data',
		        processData: false,
		        contentType: false,
				success:function(data)
				{
					var str = data;
					var n = str.search("ok");
					if(parseInt(n)>0)
						{
						
						 $('#btedit').prop('disabled', false);
					  	 $("#isa_success").fadeIn(3000);
				    	 $("#isa_success").slideDown();
						 $("#isa_success").show();
				    	 $("#isa_success").html("<b style=font-size:18px>Admin records updated !!</b>");	
				    	 $("#isa_success").fadeOut(7000)
				    	 
				    	  var newUrl = getContextPath()+"/adminreport/0";
				    	  window.location.href = newUrl;
				    	 
				    	 
						}
					else
						{
				$('#btedit').prop('disabled', false)	;	
				$("#isa_success").fadeOut();
				$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Sorry try again  !!</b>");
		   		$("#isa_error").slideDown();
		   		$("#isa_error").show();
		   		$("#isa_error").fadeOut(7000)

						}
				},
				   error: function() {
					   $('#btedit').prop('disabled', false)	;	
					   $("#isa_success").fadeOut();
						$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Something happens wrong !!</b>");
				   		$("#isa_error").slideDown();
				   		$("#isa_error").show();
				   		$("#isa_error").fadeOut(4500)
				   }
						
				})
		}
			
		});
		$("#btsavendor").click(function()
			    {
			
		//Validation---------------->
			
			
			$("#status").remove();

				 $('#btsaveadmin').prop('disabled', true);
			  	 $("#isa_success").fadeIn(2000);
		    	 $("#isa_success").slideDown();
				 $("#isa_success").show();
		    	 $("#isa_success").html("<b style=font-size:18px> Please wait !!</b>");	
			
		    	
		  	   var value="";
				  
				$.ajax({
				url:"vdadd",
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
				    	 $("#isa_success").html("<b style=font-size:18px>Vendor registration completed !!</b>");	
				    	 window.location.replace(getContextPath()+"/vendorreport");
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
	

			    });
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////// Admin ,Edit Others , ends here . Codes by Pradipto Roy//////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////// Vendor ,Edit Others , starts  here . Codes by Pradipto Roy//////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	
		$("#btsavendor").click(function()
			    {
			
		//Validation---------------->
			
			
			$("#status").remove();

				 $('#btsaveadmin').prop('disabled', true);
			  	 $("#isa_success").fadeIn(2000);
		    	 $("#isa_success").slideDown();
				 $("#isa_success").show();
		    	 $("#isa_success").html("<b style=font-size:18px> Please wait !!</b>");	
			
		    	
		  	   var value="";
				  
				$.ajax({
				url:"vdadd",
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
				    	 $("#isa_success").html("<b style=font-size:18px>Vendor registration completed !!</b>");	
				    	 window.location.replace(getContextPath()+"/vendorreport");
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
	

			    });
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////// Vendor ,Edit Others , ends  here . Codes by Pradipto Roy//////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////// Consultant OR Employee ,Edit Others , starts  here . Codes by Pradipto Roy//////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		$("#consultantadd").click(function()
			    {
			
		//Validation---------------->
			
			
			$("#status").remove();

				 $('#consultantadd').prop('disabled', true);
			  	 $("#isa_success").fadeIn(2000);
		    	 $("#isa_success").slideDown();
				 $("#isa_success").show();
		    	 $("#isa_success").html("<b style=font-size:18px> Please wait !!</b>");	
			
		    	
		  	   var value="";
				  
				$.ajax({
				url:"consultadd",
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
						
						 $('#consultantadd').prop('disabled', false);
					  	 $("#isa_success").fadeIn(3000);
				    	 $("#isa_success").slideDown();
						 $("#isa_success").show();
				    	 $("#isa_success").html("<b style=font-size:18px>Consultant registration completed !!</b>");	
				    	 window.location.replace(getContextPath()+"/consultantreport");
						}
					else
						{
				$('#consultantadd').prop('disabled', false)	;	
				$("#isa_success").fadeOut();
				$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Sorry try again  !!</b>");
		   		$("#isa_error").slideDown();
		   		$("#isa_error").show();
		   		$("#isa_error").fadeOut(7000)

						}
				},
				   error: function() {
					   $('#consultantadd').prop('disabled', false)	;	
					   $("#isa_success").fadeOut();
						$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Something happens wrong !!</b>");
				   		$("#isa_error").slideDown();
				   		$("#isa_error").show();
				   		$("#isa_error").fadeOut(4500)
				   }
						
				})
	

			    });		
		
		
	
		
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////// Consultant OR Employee ,Edit Others , ends  here . Codes by Pradipto Roy//////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		
			
			
	});

function editvendor(k)
{

	document.getElementById("sentid").value=k;
	document.getElementById("edit").submit(); 

}

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ UTIL Functions +++++++++++++++++++++++++++++++++++++++++++++++++++++++
function getContextPath() {
	   return window.location.pathname.substring(0, window.location.pathname.indexOf("/",2));
	}
function myFunction()
		{

		}

function enterNumber(id)
{

 var e = document.getElementById(id);

	if (!/^[0-9]+$/.test(e.value)) 
	{ 
	
	e.value = "";
	}
	}   





//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ UTIL Functions +++++++++++++++++++++++++++++++++++++++++++++++++++++++