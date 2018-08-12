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
              Vendor 
                <small>Management</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Manage Vendor</a></li>
                <li class="active">Vendor List</li>
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
                         
                         
                           <a href="<%=request.getContextPath()%>/admin" style="color: #09274B;"><i class="fa fa-plus" style="color: green;"></i> Add Vendor (Full details) </a>
                                <a href="<%=request.getContextPath()%>/vendor" style="color: #09274B;"><i class="fa fa-plus" style="color: green;"></i> Add Vendor (Short Details) </a>
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
                                        <th style="text-align: center;">Logo</th>
                                        <th style="text-align: center;">Pont of Contact</th>
                                        <th style="text-align: center;">Company Name</th>
                                        <th style="text-align: center;">Vendor email id</th>
                                        <th style="text-align: center;">Phone No</th>
                                        <th style="text-align: center;">Contract Start date</th>
                                        <th style="text-align: center;">Contract End date</th>
                                        <th style="text-align: center;">No of Consultant</th>
                                        <th style="text-align: center;">Document varified</th>
                                        <th style="text-align: center;">Action</th>
                                    
                                    </tr>
                                </thead>
                                <tbody>
                                
                                
                             
                                
                                <c:forEach var="propertylist" varStatus="loop" items="${vendorlist}">
                                
                                                <tr>
                                                <td>${loop.index+1}</td>
                                               
                                                <td>${propertylist.adminname}  </td>
                                                <td>Not Available </td>
                                                <td>${propertylist.firstName }
                                                 </td>
                                                <td>${propertylist.vendorCompanyName }  </td>
                                                <td>${propertylist.vendorEmail} </td>
                                                <td>${propertylist.phoneNo} </td>
                                                <td>${propertylist.contractFromDate} </td>
                                                <td>${propertylist.contractToDate} </td>
                                                <td>Not Available </td>
                                          
                                                <td>Not Available </td>
                                              
                                                
                                                <td style="text-align: center;">
                                                   
                                                    
                                                      <a class="tbl_icon" href="#" onclick="editvendor('${propertylist.vendorId}')"  data-toggle="tooltip" title="" data-original-title="Edit ">
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
                                
                                
            
                                
                                
                              </tbody>
                            </table>
                        </div>
                    </div>
                    
                    <form id="edit" action="vendorEdit" method="POST">
                    
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
    
 