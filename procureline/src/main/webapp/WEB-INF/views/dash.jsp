<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<jsp:include page="./includeProcDesign/header.jsp"></jsp:include>
<jsp:include page="./includeProcDesign/sidemenu.jsp"></jsp:include>

</head>

<body>

    <section class="content">
        <div class="container-fluid">
            <div class="block-header">
                <h2>DASHBOARD</h2>
            </div>

            <!-- Widgets -->
            <div class="row clearfix">
                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                    <div class="info-box bg-pink hover-expand-effect">
                        <div class="icon">
                            <i class="material-icons">playlist_add_check</i>
                        </div>
                        <div class="content">
                            <div class="text">Admin</div>
                            <div class="number count-to" data-from="0" data-to="125" data-speed="15" data-fresh-interval="20"></div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                    <div class="info-box bg-cyan hover-expand-effect">
                        <div class="icon">
                            <i class="material-icons">help</i>
                        </div>
                        <div class="content">
                            <div class="text">Vendor</div>
                            <div class="number count-to" data-from="0" data-to="257" data-speed="1000" data-fresh-interval="20"></div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                    <div class="info-box bg-light-green hover-expand-effect">
                        <div class="icon">
                            <i class="material-icons">forum</i>
                        </div>
                        <div class="content">
                            <div class="text">Consultant</div>
                            <div class="number count-to" data-from="0" data-to="243" data-speed="1000" data-fresh-interval="20"></div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                    <div class="info-box bg-orange hover-expand-effect">
                        <div class="icon">
                            <i class="material-icons">person_add</i>
                        </div>
                        <div class="content">
                            <div class="text">Employee</div>
                            <div class="number count-to" data-from="0" data-to="1225" data-speed="1000" data-fresh-interval="20"></div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- #END# Widgets -->

            <!-- Timesheet -->
            <div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="card">
                        <div class="header">
                            <h2>
                            Timesheet
                            </h2>
                        </div>
                        <div class="body">
                            <div class="table-responsive">
                                <table class="table table-bordered table-striped table-hover js-basic-example dataTable">
                                    <thead>
                                        <tr>
                                            <th>Timesheet ID</th>
                                            <th>Project Code</th>
                                            <th>Project Name</th>
                                            <th>Codee</th>
                                            <th>Name</th>
                                            <th>Type</th>
                                            <th>Start Date</th>
                                            <th>End Date</th>
                                            <th>ST</th>
                                            <th>OT</th>
                                            <th>Timesheet Status</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                    <tr>
                                            <th>Timesheet ID</th>
                                            <th>Project Code</th>
                                            <th>Project Name</th>
                                            <th>Codee</th>
                                            <th>Name</th>
                                            <th>Type</th>
                                            <th>Start Date</th>
                                            <th>End Date</th>
                                            <th>ST</th>
                                            <th>OT</th>
                                            <th>Timesheet Status</th>
                                        </tr>
                                    </tfoot>
                                    <tbody>
                                        <tr>
                                            <td>REC004002</td>
                                            <td>REC004</td>
                                            <td>PROCURELINE GRMS</td>
                                            <td>TTC003</td>
                                            <td>Urwashi Thakkar</td>
                                            <td>Consultant</td>
                                            <td>05-08-2018</td>
                                            <td>05-09-2018</td>
                                            <td>24.00</td>
                                            <td>0.00r</td>
                                            <td>Pending Approval</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- #END# Timesheet -->

            <!-- Consultant's Invoice Summary -->
            <div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="card">
                        <div class="header">
                            <h2>
                            Consultant's Invoice Summary
                            </h2>
                        </div>
                        <div class="body">
                            <div class="table-responsive">
                                <table class="table table-bordered table-striped table-hover js-basic-example dataTable">
                                    <thead>
                                        <tr>
                                            <th>SL No.</th>
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
                                    <tfoot>
                                    <tr>
                                            <th>SL No.</th>
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
                                    </tfoot>
                                    <tbody>
                                        <tr>
                                            <td>3</td>
                                            <td>Timesheet Not Approved</td>
                                            <td>REC001001</td>
                                            <td>GRMS EMPLOYEE</td>
                                            <td>TCS001</td>
                                            <td>Developer</td>
                                            <td>Mr. Grms Vendor</td>
                                            <td>TCS Test</td>
                                            <td>Grms Admin</td>
                                            <td>Net 45</td>
                                            <td>01/01/2018 - 01/05/2018</td>
                                            <td>
                                                <div><b>Standard Time:</b><br/> 40.00 hours</div><br/>
                                                <div><b>Over Time:</b><br/> 0.00 hours</div>
                                            </td>
                                            <td>
                                                <div><b>Standard Rate:</b><br/> $ 40.00 </div><br/>
                                                <div><b>Over Time Rate:</b><br/> $ 10.00 </div>
                                            </td>
                                            <td>
                                                <div><b>Standard Pay:</b><br/>  $ 40.00 </div><br/>
                                                <div><b>Over Pay:</b><br/> $ 10.00 </div>
                                            </td>
                                            <td>Pending Approval</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- #END# Consultant's Invoice Summary -->


            <!-- Consultant's Invoice Summary -->
            <div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="card">
                        <div class="header">
                            <h2>
                            Employee's Invoice Summary
                            </h2>
                        </div>
                        <div class="body">
                            <div class="table-responsive">
                                <table class="table table-bordered table-striped table-hover js-basic-example dataTable">
                                    <thead>
                                        <tr>
                                            <th>SL No.</th>
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
                                    <tfoot>
                                    <tr>
                                            <th>SL No.</th>
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
                                    </tfoot>
                                    <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>INV003</td>
                                        <td>REC001001</td>
                                        <td>Test EMPLOYEE</td>
                                        <td>PES001</td>
                                        <td>Developer</td>
                                        <td>Net 45</td>
                                        <td>01/01/2018 - 01/05/2018</td>
                                        <td>
                                            <div><b>Standard Time:</b><br/> 40.00 hours</div><br/>
                                            <div><b>Over Time:</b><br/> 0.00 hours</div>
                                        </td>
                                        <td>
                                            <div><b>Standard Rate:</b><br/> $ 40.00 </div><br/>
                                            <div><b>Over Time Rate:</b><br/> $ 10.00 </div>
                                        </td>
                                        <td>
                                            <div><b>Standard Pay:</b><br/>  $ 40.00 </div><br/>
                                            <div><b>Over Pay:</b><br/> $ 10.00 </div>
                                        </td>
                                        <td>Invoice Approved</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- #END# Consultant's Invoice Summary -->


           
      

        </div>
    </section>

<jsp:include page="./includeProcDesign/footer.jsp"></jsp:include>
</body>

</html>