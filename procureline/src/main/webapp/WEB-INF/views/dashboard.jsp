<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "include/header.jsp" %>
<%@ include file = "include/sidemenu.jsp" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                Dashboard
                <small>Control panel</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                <li class="active">Dashboard</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">
            <!-- Small boxes (Stat box) -->
            <div class="row">

                                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
                                                                <!-- small box -->
                                <div class="small-box bg-aqua">
                                    <div class="inner">
                                        <h3>${admincount}</h3>

                                        <p>Admin</p>
                                    </div>
                                    <div class="icon">
                                        <i class="ion ion-person-stalker"></i>
                                    </div>
                                    <a href="#" class="small-box-footer">View All <i
                                            class="fa fa-arrow-circle-right"></i></a>
                                </div>
                            </div>
                                                <!-- ./col -->

                                                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
                                                                <!-- small box -->
                                <div class="small-box bg-green">
                                    <div class="inner">
                                        <h3>${vendorcount}<sup style="font-size: 20px"></sup></h3>

                                        <p>Vendor</p>
                                    </div>
                                    <div class="icon">
                                        <i class="ion ion-ios-people"></i>
                                    </div>
                                    <a href="#" class="small-box-footer">View All <i
                                            class="fa fa-arrow-circle-right"></i></a>
                                </div>
                            </div>
                                                <!-- ./col -->

                    
                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
                                                                <!-- small box -->
                                <div class="small-box bg-yellow">
                                    <div class="inner">
                                        <h3>${consultantcount}</h3>

                                        <p>Consultant</p>
                                    </div>
                                    <div class="icon">
                                        <i class="ion ion-android-people"></i>
                                    </div>
                                    <a href="#" class="small-box-footer">View All <i
                                            class="fa fa-arrow-circle-right"></i></a>
                                </div>
                            </div>

                                                <!-- ./col -->

                    
                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
                                                                <!-- small box -->
                                <div class="small-box bg-aqua">
                                    <div class="inner">
                                        <h3>${employeecount}</h3>

                                        <p>Employee</p>
                                    </div>
                                    <div class="icon">
                                        <i class="ion ion-person-stalker"></i>
                                    </div>
                                    <a href="#" class="small-box-footer">View All <i
                                            class="fa fa-arrow-circle-right"></i></a>
                                </div>
                            </div>

                                                <!-- ./col -->

                    
            </div>
            <!-- /.row -->
            <!-- Main row -->
            <div class="row">
                <!-- Left col -->

                <section class="col-lg-12 connectedSortable">
                    <div class="box">
                        <div class="box-header">
                            <h3 class="box-title">Timesheet</h3>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body table-responsive no-padding">
                            <table class="table table-bordered table-striped" style="font-size: 12px;" id="timesheet_tbl">
                                <thead>
                                    <tr>
                                        <th style="text-align: center;">Timesheet ID</th>
                                        <th style="text-align: center;">Project Code</th>
                                        <th style="text-align: center;">Project Name</th>
                                        <th style="text-align: center;">Code</th>
                                        <th style="text-align: center;">Name</th>
                                        <th style="text-align: center;">Type</th>
                                        <th style="text-align: center;">Start Date</th>
                                        <th style="text-align: center;">End Date</th>
                                        <th style="text-align: center;">ST</th>
                                        <th style="text-align: center;">OT</th>
                                        <th style="text-align: center;">Timesheet Status</th>
                                    </tr>
                                </thead>
                                <tbody>
                                
                                
                             
                                
                                <c:forEach var="stdentlistValue" varStatus="loop" items="${stlist}">
                                
                                                <tr>
                                                <td><a href="#">${stdentlistValue.timesheetid}</a></td>
                                                <td>${stdentlistValue.projectcode }</td>
                                                <td>${stdentlistValue.projectname }  </td>
                                                <td>${stdentlistValue.code } </td>
                                                <td>${stdentlistValue.name } </td>
                                                <td>${stdentlistValue.type }  </td>
                                                <td>${stdentlistValue.startdate } </td>
                                                <td>${stdentlistValue.enddate } </td>
                                                <td>${stdentlistValue.st } </td>
                                                <td>${stdentlistValue.ot } </td>
                                                 
                                                <td>
                                                <span style="color: #f39c12;">Pending Approval</span>
                                                 </td>
                                            </tr>
                                
                                
                                    </c:forEach>
                                
                                
            
                                
                                
                              </tbody>
                            </table>
                        </div>
                    </div>
                </section>
                
                        <section class="col-lg-12 connectedSortable">
                            <div class="box">
                                <div class="box-header">
                                    <h3 class="box-title">Consultant's Invoice Summary</h3>
                                </div>
                                <!-- /.box-header -->
                                <div class="box-body table-responsive no-padding">
                                    <table id="van_tbl" class="table table-bordered table-striped table-responsive"
                                           style="font-size: 11px;" width="100%">
                                        <thead>
                                            <tr>
                                                <th width="1%">SL No.</th>
                                                <th>Invoice ID</th>
                                                <th>Timesheet ID</th>
                                                <th>Consultant Name</th>
                                                <th>Consultant Code</th>
                                                <th>Consultant Designation</th>
                                                <th>Point of Contact</th>
                                                <th>Company Name</th>
                                                <th>Admin Name</th>
                                                <th>Payment Mode</th>
                                                <th>Date</th>
                                                <th>Time</th>
                                                <th>Rate</th>
                                                <th>Pay</th>
                                                <th>Invoice Status</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                                                                                  
                                                        
                                        </tbody>

                                    </table>
                                </div>
                            </div>
                        </section>

                        <section class="col-lg-12 connectedSortable">
                            <div class="box">
                                <div class="box-header">
                                    <h3 class="box-title">Employee's Invoice Summary</h3>
                                </div>
                                <!-- /.box-header -->
                                <div class="box-body table-responsive no-padding">
                                    <table id="emp_tbl" class="table table-bordered table-striped table-responsive"
                                           style="font-size: 11px;" width="100%">
                                        <thead>
                                            <tr>
                                                <th width="1%">SL No.</th>
                                                <th>Invoice ID</th>
                                                <th>Timesheet ID</th>
                                                <th>Employee Name</th>
                                                <th>Employee Code</th>
                                                <th>Employee Designation</th>
                                                <th>Payment Mode</th>
                                                <th>Date</th>
                                                <th>Time</th>
                                                <th>Rate</th>
                                                <th>Pay</th>
                                                <th>Invoice Status</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                                                                            
                                                    
                                        </tbody>

                                    </table>
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
    
 