<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:include page="./includeProcDesign/header.jsp"></jsp:include>
<jsp:include page="./includeProcDesign/sidemenu.jsp"></jsp:include>

 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
 <script src="<%=request.getContextPath() %>/resources/js/project.js"></script> 
  <script src="<%=request.getContextPath() %>/resources/js/admin.js"></script> 
 <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/projectCustom.css">
    <section class="content">
        <div class="container-fluid">
            <div class="block-header">
                <h2>Admin User Management</h2>
            </div>
        <form id="add_admin_form" method="POST"  action="imageupload" enctype="multipart/form-data" siq_id="autopick_9675">
            <!-- table struture -->
            <div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="card">
                        <div class="body">
                         <div class="row">
								<div class="col-md-12">
								  <div class="form-group form-float">
                                        <div class="form-line">
                                           
                                            <label class="form-label">Add Admin User</label>
                                        </div>
                                    </div>
								</div>
                            </div>
                            <div class="row">
							 <div class="col-md-6">
                                 Choose Prefix : &nbsp;
                                <input type="radio" name="name_prefix" id="basic_checkbox_1"/>
                                <label for="basic_checkbox_1">Mr.</label>
                                <input type="radio" name="name_prefix" id="basic_checkbox_2"/>
                                <label for="basic_checkbox_2">Mrs.</label>
                                <input type="radio" name="name_prefix" id="basic_checkbox_3"/>
                                <label for="basic_checkbox_3">Ms.</label>
                                <input type="radio" name="name_prefix" id="basic_checkbox_4"/>
                                <label for="basic_checkbox_4">Dr.</label>
                             </div>
							 <div class="col-md-6">
                                <label class="form-label">Choose Your Image</label>
                                <input type="file" name="file"></div>
							</div>
                            <div class="row">
								<div class="col-md-6">
								  <div class="form-group form-float">
                                        <div class="form-line">
                                            <input type="text" id="fname" name="fname" class="form-control">
                                            <label class="form-label">First Name*</label>
                                        </div>
                                    </div>
								</div>
								<div class="col-md-6">
									<div class="form-group form-float">
										<div class="form-line">
											<input type="text" id="lname" name="lname" class="form-control">
											<label class="form-label">Last Name*</label>
										</div>
									</div>
								</div>
                             </div>
                             <div class="row">
								<div class="col-md-6">
								  <div class="form-group form-float">
                                        <div class="form-line">
                                            <input type="text" id="admin_designation" name="admin_designation" class="form-control">
                                            <label class="form-label">Designation*</label>
                                        </div>
                                    </div>
								</div>
								<div class="col-md-6">
									<div class="form-group form-float">
										<div class="form-line">
											<input type="text" id="admin_company_name" name="admin_company_name" class="form-control">
											<label class="form-label">Company Name*</label>
										</div>
									</div>
								</div>
                             </div>
                             <div class="row">
								<div class="col-md-6">
								  <div class="form-group form-float">
                                        <div class="form-line">
                                            <input type="text" id="admin_employee_id" name="admin_employee_id" class="form-control">
                                            <label class="form-label">Employee ID</label>
                                        </div>
                                    </div>
								</div>
								<div class="col-md-6">
									<div class="form-group form-float">
										<div class="form-line">
											<input type="text" type="text" id="email" name="email" class="form-control">
											<label class="form-label">Email ID*</label>
										</div>
									</div>
								</div>
                             </div>
                             <div class="row">
								<div class="col-md-6">
								  <div class="form-group form-float">
                                        <div class="form-line">
                                            <input type="password" id="password" name="password" class="form-control">
                                            <label class="form-label">Password*</label>
                                        </div>
                                    </div>
								</div>
								<div class="col-md-6">
									<div class="form-group form-float">
										<div class="form-line">
											<input type="password" id="conf_password" name="conf_password" class="form-control">
											<label class="form-label">Confirm Password*</label>
										</div>
									</div>
								</div>
                             </div>
                             <div class="row">
								<div class="col-md-6">
								  <div class="form-group form-float">
                                        <div class="form-line">
                                            <input type="text" id="phone" name="phone" onkeyup="enterNumber('phone')" class="form-control">
                                            <label class="form-label">Phone No. </label>
                                        </div>
                                    </div>
								</div>
								<div class="col-md-6">
									<div class="form-group form-float">
										<div class="form-line">
											<input type="text" id="fax"  name="fax" onkeyup="enterNumber('fax')" class="form-control">
											<label class="form-label">Fax No. </label>
										</div>
									</div>
								</div>
                             </div>
                             <div class="row">
								<div class="col-md-12">
                                <div class="form-line">
                                    <textarea rows="4" class="form-control no-resize" name="address" id="address" placeholder="Your Adress *"></textarea>
                                </div>
                             </div>
                            </div>
                            
                             <div class="row">
							 <div class="col-md-12">
                                     <div id="isa_success" class="isa_success"></div>
                                     
                                     <div id="isa_error" class="isa_error"> </div>
                             </div>
							</div>
                            
                             <div class="row">
							 <div class="col-md-12">
                                 <button id="btsaveadmin" class="btn btn-primary waves-effect" type="button">ADD</button>
                                
                                <a href="<%=request.getContextPath()%>/adminreport/0" class="btn btn-primary waves-effect" >Back</a>
                                
                                
                             </div>
							</div>
                         </div>
                </div>
            </div>
            <!-- #END# table struture -->

        </div>
        </form>
</section>

<jsp:include page="./includeProcDesign/footer.jsp"></jsp:include>