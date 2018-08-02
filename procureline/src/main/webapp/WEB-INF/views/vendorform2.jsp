<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "include/header.jsp" %>
<%@ include file = "include/sidemenu.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <script src="./resources/js/project.js"></script> 
 <link rel="stylesheet" href="./resources/css/projectCustom.css">
    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <section class="content-header">
            <h1>
            Add Vendor user
                <small>Management</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Manage Vendor user</a></li>
                <li ><a href="<%=request.getContextPath()%>/vendorreport"><i class="fa fa-dashboard"></i>Vendor List</a></li>
                <li class="active">Vendor add</li>
            </ol>
        </section>
        
        
        
        <section class="content">

            <!-- Main row -->
            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-12">
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <h3 class="panel-title">
                                <span class="glyphicon glyphicon-user"></span>
                                Add Vendor User
                                <p style="float: right;font-size: 11px;"><span style="color:red;">*</span>Required Fields</p>
                            </h3>
                        </div>

                                                    
                           <form id="add_admin_form" method="POST"  action="vdadd" enctype="multipart/form-data" siq_id="autopick_9675">
                            <div class="panel-body">
                                <div class="row">

                                   <div style="margin-top:20px;" class="col-xs-12 col-sm-12 col-md-12">

                                        <table class="table table-bordered table-striped" width="100%" border="1" cellspacing="2" cellpadding="2">
                                            <tbody>
                                                <tr>
                                                    <td width="25%">
                                                        <label for="email">Company Logo <span style="color: red;">*</span></label>
                                                    </td>
                                                    <td width="25%">
                                                        <input class="image-file validate[required]" type="file" name="photo">
                                                        <span style="color: red;">(Max File Size : 2MB)</span>
                                                    </td>
                                                    <td width="25%"><label for="email">Admin Name<span style="color: red;">*</span></label></td>
                                                    <td width="25%">
                                                  
                                                  
                                                        <select id="adminrecord" class="form-control" name="adminrecord">

                                                           <option value="">----Select Admin -----</option>
                                                            <c:forEach var="adminlist" items="${adminlist}">

                                                            <option value="${adminlist}">${adminlist.firstName}</option>

                                                           </c:forEach>

                                                         </select>

                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <label for="email">Prefix</label>
                                                    </td>
                                                    <td>
                                                        <input type="radio" id="name_prefix1" name="name_prefix" value="Mr." checked=""> Mr.
                                                        <input type="radio" id="name_prefix2" name="name_prefix" value="Mrs."> Mrs.
                                                        <input type="radio" id="name_prefix3" name="name_prefix" value="Ms."> Ms.
                                                        <input type="radio" id="name_prefix4" name="name_prefix" value="Dr."> Dr.
                                                    </td>
                                                    <td>&nbsp;</td>
                                                    <td>&nbsp;</td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <label for="email">POC First Name<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required,custom[onlyLetterSp]]" type="text" id="first_name" name="first_name" placeholder="First Name" value="">
                                                    </td>
                                                    <td>
                                                        <label for="email">POC Last Name<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required,custom[onlyLetterSp]]" type="text" id="last_name" name="last_name" placeholder="Last Name" value="">
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <label for="email">Designation <span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required,custom[onlyLetterSp]]" type="text" id="vendor_designation" name="vendor_designation" placeholder="Designation" value="">
                                                    </td>
                                                    <td>
                                                        <label for="email">Company <span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required]" type="text" id="vendor_company_name" name="vendor_company_name" placeholder="Company" value="">
                                                    </td>
                                                </tr>

                                                <tr>
                                                    <td>
                                                        <label for="email">Email ID<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required,custom[email]]" type="text" id="vendor_email" name="vendor_email" placeholder="Email ID" value="">
                                                    </td>
                                                    <td>&nbsp;</td>
                                                    <td>&nbsp;</td>
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
                                                        <label for="email">Contract From Date <span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control date validate[required]" type="text" name="contract_from_date" id="contract_from_date">
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
                                       
                                        <button id="btsavendor" class="btn btn-success" type="button">Add Vendor</button>
                                        
                                        <a href="javascript:void(0)" onclick="window.history.back();" class="btn btn-default">Back</a>
                                        
                                        <input type="hidden" name="sa_id" value="1">
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <!-- /.row (main row) -->

        </section>
        
        
        
        
        
        
        
        
        
        
        
                   
                   
                  
                   
               
                
                      

                                        <!-- /.Left col -->
            </div>
            <!-- /.row (main row) -->


    <!-- /.content-wrapper -->
    
    <%@ include file = "include/footer.jsp" %>
    
 