<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "include/header.jsp" %>
<%@ include file = "include/sidemenu.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
 <script src="./resources/js/project.js"></script> 
 <link rel="stylesheet" href="./resources/css/projectCustom.css">
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <section class="content-header">
            <h1>
           Vendor user
                <small>Management</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Manage Admin user</a></li>
                <li ><a href="<%=request.getContextPath()%>/adminreport"><i class="fa fa-dashboard"></i>Vendor List</a></li>
                <li class="active">Vendor add</li>
            </ol>
        </section>
        <!-- Content Header (Page header) -->
        <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-12">
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <h3 class="panel-title">
                               
                               
                                <p style="float: right;font-size: 11px;"><span style="color:red;">*</span>Required Fields</p>
                            </h3>
                        </div>


                                                    
                        <form id="add_admin_form_Vendoradd" method="POST"  action="vdadds" enctype="multipart/form-data" siq_id="autopick_9675">
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
                                                        <input class="" type="file" name="file" id="image-file">
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
                                                        <label for="email">Vendor <span style="color: red;">*</span></label>
                                                      
                                                    </td>
                                                    <td>
                                                          <select id="adminrecord" class="form-control" name="adminrecord">

                                                           <option value="">----Select Admin -----</option>
                                                            <c:forEach var="adminlist" items="${adminlist}">

                                                            <option value="${adminlist.adminID}">${adminlist.firstName}</option>

                                                           </c:forEach>

                                                         </select>
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
                                                        <input class="form-control validate[required,custom[onlyLetterSp]]" type="text" id="vendor_designation" name="vendor_designation" placeholder="Designation" value="">
                                                    </td>
                                                    <td>
                                                        <label for="email">Company Name<span style="color: red;">*</span></label> 
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required]" type="text" id="vendor_company_name" name="vendor_company_name" placeholder="Company" value="">
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
                                                        <label for="email">Email<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required]" type="text" id="email" name="email" placeholder="Email">
                                                    </td>
                                                    <td>
                                                        <label for="email">Contract Form Date<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                         <input class="form-control validate[required]" type="text" id="contractdate" name="contractdate" placeholder="Company" value="">
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
                   
                   
                  
                   
                </section>
                
                      

                                        <!-- /.Left col -->
            </div>
            <!-- /.row (main row) -->

        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->
    
    <%@ include file = "include/footer.jsp" %>
    
 