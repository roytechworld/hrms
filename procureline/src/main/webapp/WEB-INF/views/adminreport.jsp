<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:include page="./includeProcDesign/header.jsp"></jsp:include>
<jsp:include page="./includeProcDesign/sidemenu.jsp"></jsp:include>

 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
 <script src="<%=request.getContextPath() %>/resources/js/project.js"></script> 

    <section class="content">
        <div class="container-fluid">
            <!--<div class="block-header">
                <h2>Admin User Management</h2>
            </div>-->

            <!-- table struture -->
            <div class="row clearfix">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="card">
                    <div class="header">
							<div class="row">
								<div class="col-md-6">
								  <h2>Admin User Management</h2>
								</div>
								<div class="col-md-6 text-right">
								  <a href="<%=request.getContextPath()%>/admin"><i class="fas fa-plus-square fa-lg"></i>  Add Admin User</a>
								</div>
							</div>
                        </div>
                        <div class="body">
                            <div class="table-responsive">
                                <table class="table table-bordered table-striped table-hover js-basic-example dataTable">
                                    <thead>
                                        <tr>
                                          <th >SL No</th>
                                        <th >Photo</th>
                                        <th >Name</th>
                                        <th >Designation</th>
                                        <th >Email ID</th>
                                        <th >Phone no</th>
                                        <th >Fax no</th>
                                        <th >Action</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                    <tr>
                                            <th >SL No</th>
                                        <th >Photo</th>
                                        <th >Name</th>
                                        <th >Designation</th>
                                        <th >Email ID</th>
                                        <th >Phone no</th>
                                        <th >Fax no</th>
                                        <th >Action</th>
                                        </tr>
                                    </tfoot>
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
                                            <td>
											  <a href="#" id="edit${stdentlistValue.adminID}"  data-index="${stdentlistValue.adminID}"  title="Edit"><i class="fas fa-edit"></i></a>
											  <a href="#" data-toggle="modal" data-target="#myModal"  title="Block"><i class="fas fa-lock"></i></a>
											  <a href="#" title="Active"><i class="fas fa-check"></i></a> 
                                              <a href="#" title="View"><i class="fas fa-eye"></i></a>
                                            </td>
                                        </tr>
                                           </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
                 <div class="modal fade" id="myModal" role="dialog">
  <div class="modal-dialog modal-lg">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Modal Header</h4>
        </div>
        <div class="modal-body">
          <p>This is a large modal.</p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-primary waves-effect" >Yes</button>
           <button type="button" class="btn btn-primary waves-effect" data-dismiss="modal">No</button>
        </div>
      </div>
    </div>
  </div>
</div>
            </div>
            <!-- #END# table struture -->

        </div>
  
</section>


<jsp:include page="./includeProcDesign/footer.jsp"></jsp:include>