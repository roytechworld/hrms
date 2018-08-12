<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<section>
        <!-- Left Sidebar -->
        <aside id="leftsidebar" class="sidebar">
            <!-- User Info -->
            <div class="user-info">
                <div class="image">
                    <img src="<%=request.getContextPath() %>/resources/procUpdateDesign/images/user.png" width="48" height="48" alt="User" />
                </div>
                <div class="info-container">
                    <div class="name" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Super Admin</div>
                    <div class="btn-group user-helper-dropdown">
                        <i class="material-icons" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">keyboard_arrow_down</i>
                        <ul class="dropdown-menu pull-right">
                            <li><a href="javascript:void(0);"><i class="material-icons">person</i>Profile</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="javascript:void(0);"><i class="material-icons">group</i>Followers</a></li>
                            <li><a href="javascript:void(0);"><i class="material-icons">shopping_cart</i>Sales</a></li>
                            <li><a href="javascript:void(0);"><i class="material-icons">favorite</i>Likes</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="<%=request.getContextPath() %>/logout"><i class="material-icons">input</i>Sign Out</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- #User Info -->
            <!-- Menu -->
            <div class="menu">
                <ul class="list">
                    <li class="header">MAIN NAVIGATION</li>
                    <li class="active">
                        <a href="index.html">
                            <i class="material-icons">home</i>
                            <span>Dashboard</span>
                        </a>
                    </li>
                    <li>
						<a href="javascript:void(0);" class="menu-toggle">
							<i class="material-icons">text_fields</i>
							<span>Manage Admin User</span>
						</a>
						<ul class="ml-menu">
                            <li>
                                <a href="<%=request.getContextPath()%>/adminreport/0">Admin Lists</a>
                            </li>
                        </ul>
						
                    </li>
                    <li>
                        <a href="javascript:void(0);" class="menu-toggle">
                            <i class="material-icons">layers</i>
                            <span>Manage Vendor User</span>
                        </a>
						<ul class="ml-menu">
                            <li>
                                <a href="<%=request.getContextPath()%>/vendorreport">Vendor Lists</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#">
                            <i class="material-icons">widgets</i>
                            <span>Vendors Documents</span>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:void(0);" class="menu-toggle">
                            <i class="material-icons">swap_calls</i>
                            <span>Manage Consultant</span>
                        </a>
                        <ul class="ml-menu">
                            <li>
                                <a href="<%=request.getContextPath()%>/consultantreport">Consultant Lists</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#">
                            <i class="material-icons">assignment</i>
                            <span>Manage Documents</span>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:void(0);" class="menu-toggle">
                            <i class="material-icons">view_list</i>
                            <span>Manage Employee</span>
                        </a>
                        <ul class="ml-menu">
                            <li>
                                <a href="#">Employee Lists</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="javascript:void(0);" class="menu-toggle">
                            <i class="material-icons">perm_media</i>
                            <span>Manage Projects</span>
                        </a>
                        <ul class="ml-menu">
                            <li>
                                <a href="#">Project Lists</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="javascript:void(0);" class="menu-toggle">
                            <i class="material-icons">pie_chart</i>
                            <span>Manage Timesheet</span>
                        </a>
                        <ul class="ml-menu">
                            <li>
                                <a href="#">Consultant Timesheet</a>
                            </li>
                            <li>
                                <a href="#">Employee Timesheet</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="javascript:void(0);" class="menu-toggle">
                            <i class="material-icons">content_copy</i>
                            <span>Manage Invoice</span>
                        </a>
                        <ul class="ml-menu">
                            <li>
                                <a href="#"> Consultant Invoice Summary</a>
                            </li>
                            <li>
                                <a href="#"> Vendor Invoice Summary</a>
                            </li>
							<li>
                                <a href="#"> Employee Invoice Summary</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#">
                            <i class="material-icons">map</i>
                            <span>Update Profile</span>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <i class="material-icons">trending_down</i>
                            <span>Manage Super-Admin User</span>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:void(0);" class="menu-toggle">
                            <i class="material-icons">layers</i>
                            <span>Manage Permissions</span>
                        </a>
						<ul class="ml-menu">
                            <li>
                                <a href="#">Super Admin Menu Permissions</a>
                            </li>
                            <li>
                                <a href="#">Admin Menu Permissions</a>
                            </li>
                        </ul>
                    </li>
					<li>
                        <a href="pages/changelogs.html">
                            <i class="material-icons">update</i>
                            <span>Manage Notifications</span>
                        </a>
                    </li>
					<li>
                        <a href="javascript:void(0);" class="menu-toggle">
                            <i class="material-icons">pie_chart</i>
                            <span>Communication</span>
                        </a>
						<ul class="ml-menu">
                            <li>
                                <a href="#">Compose</a>
                            </li>
                            <li>
                                <a href="#">Inbox</a>
                            </li>
							<li>
                                <a href="#">Sent Item</a>
                            </li>
                        </ul>
                    </li>
                   <li>
                         <a href="javascript:void(0);" class="menu-toggle">
                            <i class="material-icons">perm_media</i>
                            <span>Manage User Account</span>
                        </a>
					   <ul class="ml-menu">
                            <li>
                                <a href="#">User Recovery</a>
                            </li>
                            <li>
                                <a href="#">User Access Log</a>
                            </li>
                        </ul>
                    </li>
					<li>
                         <a href="javascript:void(0);" class="menu-toggle">
                             <i class="material-icons">assignment</i>
                            <span>PTS Internal Files</span>
                        </a>
						<ul class="ml-menu">
                            <li>
                                <a href="#"> For Consultants/Employees</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
            <!-- #Menu -->
            <!-- Footer -->
            <div class="legal">
                <div class="copyright">
                    &copy; Procureline. All rights reserved. Copyright with PNCCAPITAL LLC 
                </div>
                <!--<div class="version">
                    <b>Version: </b> 1.0.5
                </div>-->
            </div>
            <!-- #Footer -->
        </aside>
        <!-- #END# Left Sidebar -->
        <!-- Right Sidebar -->
        <aside id="rightsidebar" class="right-sidebar">
            <ul class="nav nav-tabs tab-nav-right" role="tablist">
                <li role="presentation" class="active"><a href="#skins" data-toggle="tab">SKINS</a></li>
                <li role="presentation"><a href="#settings" data-toggle="tab">SETTINGS</a></li>
            </ul>
            <div class="tab-content">
                <div role="tabpanel" class="tab-pane fade in active in active" id="skins">
                    <ul class="demo-choose-skin">
                        <li data-theme="red" class="active">
                            <div class="red"></div>
                            <span>Red</span>
                        </li>
                        <li data-theme="pink">
                            <div class="pink"></div>
                            <span>Pink</span>
                        </li>
                        <li data-theme="purple">
                            <div class="purple"></div>
                            <span>Purple</span>
                        </li>
                        <li data-theme="deep-purple">
                            <div class="deep-purple"></div>
                            <span>Deep Purple</span>
                        </li>
                        <li data-theme="indigo">
                            <div class="indigo"></div>
                            <span>Indigo</span>
                        </li>
                        <li data-theme="blue">
                            <div class="blue"></div>
                            <span>Blue</span>
                        </li>
                        <li data-theme="light-blue">
                            <div class="light-blue"></div>
                            <span>Light Blue</span>
                        </li>
                        <li data-theme="cyan">
                            <div class="cyan"></div>
                            <span>Cyan</span>
                        </li>
                        <li data-theme="teal">
                            <div class="teal"></div>
                            <span>Teal</span>
                        </li>
                        <li data-theme="green">
                            <div class="green"></div>
                            <span>Green</span>
                        </li>
                        <li data-theme="light-green">
                            <div class="light-green"></div>
                            <span>Light Green</span>
                        </li>
                        <li data-theme="lime">
                            <div class="lime"></div>
                            <span>Lime</span>
                        </li>
                        <li data-theme="yellow">
                            <div class="yellow"></div>
                            <span>Yellow</span>
                        </li>
                        <li data-theme="amber">
                            <div class="amber"></div>
                            <span>Amber</span>
                        </li>
                        <li data-theme="orange">
                            <div class="orange"></div>
                            <span>Orange</span>
                        </li>
                        <li data-theme="deep-orange">
                            <div class="deep-orange"></div>
                            <span>Deep Orange</span>
                        </li>
                        <li data-theme="brown">
                            <div class="brown"></div>
                            <span>Brown</span>
                        </li>
                        <li data-theme="grey">
                            <div class="grey"></div>
                            <span>Grey</span>
                        </li>
                        <li data-theme="blue-grey">
                            <div class="blue-grey"></div>
                            <span>Blue Grey</span>
                        </li>
                        <li data-theme="black">
                            <div class="black"></div>
                            <span>Black</span>
                        </li>
                    </ul>
                </div>
                <div role="tabpanel" class="tab-pane fade" id="settings">
                    <div class="demo-settings">
                        <p>GENERAL SETTINGS</p>
                        <ul class="setting-list">
                            <li>
                                <span>Report Panel Usage</span>
                                <div class="switch">
                                    <label><input type="checkbox" checked><span class="lever"></span></label>
                                </div>
                            </li>
                            <li>
                                <span>Email Redirect</span>
                                <div class="switch">
                                    <label><input type="checkbox"><span class="lever"></span></label>
                                </div>
                            </li>
                        </ul>
                        <p>SYSTEM SETTINGS</p>
                        <ul class="setting-list">
                            <li>
                                <span>Notifications</span>
                                <div class="switch">
                                    <label><input type="checkbox" checked><span class="lever"></span></label>
                                </div>
                            </li>
                            <li>
                                <span>Auto Updates</span>
                                <div class="switch">
                                    <label><input type="checkbox" checked><span class="lever"></span></label>
                                </div>
                            </li>
                        </ul>
                        <p>ACCOUNT SETTINGS</p>
                        <ul class="setting-list">
                            <li>
                                <span>Offline</span>
                                <div class="switch">
                                    <label><input type="checkbox"><span class="lever"></span></label>
                                </div>
                            </li>
                            <li>
                                <span>Location Permission</span>
                                <div class="switch">
                                    <label><input type="checkbox" checked><span class="lever"></span></label>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </aside>
        <!-- #END# Right Sidebar -->
    </section>