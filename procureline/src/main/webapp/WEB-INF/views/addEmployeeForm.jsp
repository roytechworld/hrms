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
          Employee
                <small>Management</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Manage Employee</a></li>
                <li ><a href="<%=request.getContextPath()%>/consultantreport"><i class="fa fa-dashboard"></i>Employee List</a></li>
                <li class="active">Employee add</li>
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


                       <form id="add_admin_form" method="POST"  action="consultadd" enctype="multipart/form-data" siq_id="autopick_9675">
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
                                                        <label for="email">Vendor type<span style="color: red;">*</span></label>
                                                      
                                                    </td>
                                                    <td>
                                                          <select id="adminrecord" class="form-control" name="adminrecord">

                                                           <option value="">----Select Client -----</option>
                                                            <c:forEach var="clientlist" items="${clientlist}">

                                                            <option value="${clientlist.id}">${clientlist.clientName}</option>

                                                           </c:forEach>

                                                         </select>
                                                    </td>
                                                
                                                    </tr>
                                                    <tr>
                                                         <td>
                                                        <label for="email">Employee First Name<span style="color: red;">*</span></label>
                                                      
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required,custom[onlyLetterSp]]" type="text" id="fname" name="fname" placeholder="First Name" value="">
                                                    </td>
                                                    <td>
                                                        <label for="email">Employee Last Name<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required,custom[onlyLetterSp]]" type="text" id="lname" name="lname" placeholder="Last Name" value="">
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <label for="email">Employee Category<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                         <select id="category" name="category" class="form-control" name="adminrecord">

                                                         

                                                           <option value="">----Select category -----</option>
                                                          

                                                            <option value="1">w2</option>
                                                            <option value="2">Subcontractor</option>
                                                            <option value="3">1099</option>


                                                         </select>
                                                    </td>
                                                    <td>
                                                        <label for="email">Upload Resume<span style="color: red;">*</span></label> 
                                                    </td>
                                                    <td>
                                                        <input class="" type="file" name="file" id="image-file">
                                                    </td>
                                                </tr>
                                        
                                                <tr>
                                                    <td>
                                                        <label for="email">Phone no<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required]" type="text" id="phoneno" name="phoneno" placeholder="phone no">
                                                    </td>
                                                    <td>
                                                        <label for="email">FAX<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required,equals[password]]" type="text" id="fax" name="fax" placeholder="Fax">
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
                                                
                                                
                                                
                                                      <tr>
                                                    <td>
                                                        <label for="email">Bill Rate<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required]" type="text" id="billrate" name="billrate" placeholder="Bill Rate">
                                                    </td>
                                                    <td>
                                                        <label for="email">Bill Rate type<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                      <select name="billratetype" id="billratetype">
                                                      
                                                            <option value="">----Select Type -----</option>
                                                          

                                                            <option value="hourly">Hourly</option>
                                                            <option value="yearly">Yearly</option>
                                                            
                                                      
                                                      
                                                      </select> 
                                                       
                                                       
                                                       
                                                       
                                                    </td>
                                                </tr>
                                                
                                                
                                                
                                                    <tr>
                                                    <td>
                                                        <label for="email">Pay Rate<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required]" type="text" id="payrate" name="payrate" placeholder="pay rate">
                                                    </td>
                                                    <td>
                                                        <label for="email">Pay Rate type<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                      <select name="payratetype" id="payratetype">
                                                      
                                                            <option value="">----Select Type -----</option>
                                                          
                                                            <option value="hourly">Hourly</option>
                                                            <option value="yearly">Yearly</option>

                                                      
                                                      </select> 
                                                       
                                                    </td>
                                                </tr>
                                                
                                                <tr>
                                                    <td>
                                                        <label for="email">Over time Rate<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required]" type="text" id="billrate" name="billrate" placeholder="Over time rate">
                                                    </td>
                                                    <td>
                                                        <label for="email">Date of Joining<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                        <input class="form-control validate[required,equals[password]]" type="text" id="dateofjoining"  name="dateofjoining" placeholder="Date of joining">
                                                    </td>
                                                </tr>
                                                
                                                
                                                   <tr>
                                                    <td>
                                                        <label for="email">Upload pay staff<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                       <input class="" type="file" name="file" id="image-file">
                                                        
                                                        
                                                        
                                                        
                                                        
                                                    </td>
                                                    <td>
                                                        <label for="email">Upload W2<span style="color: red;">*</span></label>
                                                    </td>
                                                    <td>
                                                          <input class="" type="file" name="file" id="image-file">
                                                    </td>
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
                                        
                                        <button id="consultantadd" class="btn btn-success" type="button">Add Employee</button>
                                        <a href="<%=request.getContextPath()%>/consultantreport" class="btn btn-default">Back</a>
                                        
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
    
 