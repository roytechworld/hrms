<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "include/header.jsp" %>
<%@ include file = "include/sidemenu.jsp" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
 <script src="./resources/js/project.js"></script> 
 <link rel="stylesheet" href="./resources/css/projectCustom.css">

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
              Employee
                <small>Management</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Manage Employee</a></li>
                <li class="active">Employee List</li>
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
                         
                         
                           <a href="<%=request.getContextPath()%>/employeeaddCall" style="color: #09274B;"><i class="fa fa-plus" style="color: green;"></i> Add Employee  </a>
                                <a href="#" style="color: #09274B;"><i class="fa fa-plus" style="color: green;"></i> Add Project to Employees</a>
                            </div>
                        </div>
                    </div>
                        <div class="box-header">
                            <h3 class="box-title"></h3>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body table-responsive no-padding">
                            <table class="table table-bordered table-striped" style="font-size: 12px;" id="timesheet_tbl">
                                <thead>
                                    <tr>
                                        <th style="text-align: center;">SL No</th>
                                        <th style="text-align: center;">Admin Name </th>
                                          <th style="text-align: center;">Client Name</th>
                                        <th style="text-align: center;">Photo</th>
                                        <th style="text-align: center;">Employee code</th>
                                        <th style="text-align: center;">Employee Name</th>
                                        <th style="text-align: center;">Employee Email</th>
                                        <th style="text-align: center;">Employee Designation</th>
                                        <th style="text-align: center;">Employee Category</th>
                                        <th style="text-align: center;">Phone no</th>
                                        <th style="text-align: center;">Resume</th>
                                        <th style="text-align: center;">Employee documents</th>
                                        <th style="text-align: center;">Time sheet</th>
                                        <th style="text-align: center;">Generate Login Details</th>
                                        <th style="text-align: center;">On boarding</th>
                                        <th style="text-align: center;">Status</th>
                                         <th style="text-align: center;">Action</th>
                                              
                                    
                                    </tr>
                                </thead>
                                <tbody>
                                
                                <c:forEach var="stdentlistValue" varStatus="loop" items="${employeelist}">
                                
                                                <tr>
                                                <td>${loop.index+1}</td>
                                               
                                                <td>${stdentlistValue.adminId}  </td>
                                                <td>${stdentlistValue.clientId }  </td>
                                                <td> NA </td>
                                                <td>${stdentlistValue.employeeCode }  </td>
                                                <td>${stdentlistValue.firstName} </td>
                                                <td>${stdentlistValue.employeeEmail} </td>
                                                <td>${stdentlistValue.employeeDesignation} </td>
                                                <td>${stdentlistValue.employeeCategory} </td>
                                                <td>${stdentlistValue.phoneNo} </td>
                                          
                                                <td>NA </td>
                                              
                                                
                                              <td style="text-align: center;">
                                                    
                                                    <a class="tbl_icon" href="#"  data-toggle="tooltip" title="" data-original-title="Edit ">
                                                        <i class="fa fa-file-pdf-o" aria-hidden="true" style="color: #09274B;"></i>
                                                     
                                                    </a>

                                                                                                            
                                                 </td>
                                                                                                             
                                               <td> </td>
                                               <td>NA </td>
                                               <td>  
                                            
                                            
                                            
                                            <a class="tbl_icon" href="#" data-toggle="tooltip" title="" data-original-title="Onboarding"><img src="http://projecttrial.procuretech.net/procureline-vms/assets/images/onboarding.png" style="width: 25px;"></a>
                                            
                                            
                                            
                                            
                                            
                                            
                                            </td>
                                               <td>NA </td>
                                                    <td>                   
                                                    <a class="tbl_icon" href="#" onclick=""  data-toggle="tooltip" title="" data-original-title="Edit ">
                                                        <i class="fa fa-pencil-square-o" aria-hidden="true" style="color: #09274B;"></i>
                                                    </a>
</td>
                                                                                                          
                                                                                                             
                                       </tr>
                                
                                
                                    </c:forEach>
                                
                                
            
                                
                                
                              </tbody>
                            </table>
                        </div>
                    </div>
                    
                    <form id="edit" method="post">
                    
                    
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
    
 