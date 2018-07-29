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
				 $("#isa_success").show();
		    	 $("#isa_success").html("<b style=font-size:18px> Please wait !!</b>");	
		    	 
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
							 $("#isa_success").show();
					    	 $("#isa_success").html("<b style=font-size:18px>Login success please wait !!</b>");	
					    	
							document.getElementById("frm").submit(); 
							}
						else
							{
					$('#btsv').prop('disabled', false)	;	
					$("#isa_success").fadeOut();
					$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Invalid credentials try again  !!</b>");
			   		$("#isa_error").slideDown();
			   		$("#isa_error").show();
			   		$("#isa_error").fadeOut(7000)

							}
						
			
					},
					   error: function() {
						   $('#btsv').prop('disabled', false)	;	
						   $("#isa_success").fadeOut();
							$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Something happens wrong !!</b>");
					   		$("#isa_error").slideDown();
					   		$("#isa_error").show();
					   		$("#isa_error").fadeOut(4500)
					   }
							
					})
				}
			else
				{
				$('#btsv').prop('disabled', false)	;	
					$("#isa_error").html("<b style=color:red;font-size:15px;font-family: Arial, Helvetica, sans-serif;>Login , password and type required   !!</b>");
			   		$("#isa_error").slideDown();
			   		$("#isa_error").show();
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
		
	});
		
		function myFunction()
		{

		}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////// Login ,Forgot Login , New password creation Ends here . Codes by Pradipto Roy//////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////