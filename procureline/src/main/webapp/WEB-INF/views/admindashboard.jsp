<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "include/header.jsp" %>
<%@ include file = "include/admin_sidemenu.jsp" %>


    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
               Admin Dashboard
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
                                                                                <tr>
                                                <td><a href="http://projecttrial.procuretech.net/procureline-vms/sadmin-view-period-timesheet/OA==">REC004002</a></td>
                                                <td>REC004</td>
                                                <td>PROCURELINE GRMS</td>
                                                <td>TTC003</td>
                                                <td>Urwashi Thakkar</td>
                                                <td>
                                                    Consultant                                                </td>
                                                <td>05-08-2018</td>
                                                <td>05-09-2018</td>
                                                <td>24.00</td>
                                                <td>0.00</td>
                                                <td>
                                                                                                            <span style="color: #f39c12;">Pending Approval</span>
                                                                                                        </td>
                                            </tr>
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
    
 