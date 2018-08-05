<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "include/header.jsp" %>
<%@ include file = "include/sidemenu.jsp" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
 <script src="<%=request.getContextPath() %>/resources/js/project.js"></script> 
 
 <script type="text/javascript">
 
 $(document).ready(function()		
			{
	$("#timesheet_tbl").dataTable({
	    "paging": false
	});
 
			});
 
 </script>
 
 <link rel="stylesheet" href="./resources/css/projectCustom.css">

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
                                <a href="<%=request.getContextPath()%>/admin" style="color: #09274B;"><i class="fa fa-plus" style="color: green;"></i> Add Admin User</a>
                            </div>
                        </div>
                    </div>
                        <div class="box-header">
                            <h3 class="box-title"></h3>
                        </div>
                        <!-- /.box-header -->
                        <div id="editload" class="box-body table-responsive no-padding">
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
    
 