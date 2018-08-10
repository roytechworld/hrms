   
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>
            Super Admin Dashboard | Global Resource Management System        </title>
        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <!-- Bootstrap 3.3.6 -->
        <link rel="stylesheet" href="http://projecttrial.procuretech.net/procureline-vms/assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="http://projecttrial.procuretech.net/procureline-vms/assets/plugins/datatables/dataTables.bootstrap.css">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
        <!-- Ionicons -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="http://projecttrial.procuretech.net/procureline-vms/assets/dist/css/AdminLTE.min.css">
        <!-- AdminLTE Skins. Choose a skin from the css/skins
             folder instead of downloading all of them to reduce the load. -->
        <link rel="stylesheet" href="http://projecttrial.procuretech.net/procureline-vms/assets/dist/css/skins/_all-skins.min.css">
        <!-- iCheck -->
        <link rel="stylesheet" href="http://projecttrial.procuretech.net/procureline-vms/assets/plugins/iCheck/flat/blue.css">
        <!-- Morris chart -->
        <link rel="stylesheet" href="http://projecttrial.procuretech.net/procureline-vms/assets/plugins/morris/morris.css">
        <!-- jvectormap -->
        <link rel="stylesheet" href="http://projecttrial.procuretech.net/procureline-vms/assets/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
        <!-- Date Picker -->
        <link rel="stylesheet" href="http://projecttrial.procuretech.net/procureline-vms/assets/plugins/datepicker/datepicker3.css">
        <!-- Daterange picker -->
        <link rel="stylesheet" href="http://projecttrial.procuretech.net/procureline-vms/assets/plugins/daterangepicker/daterangepicker.css">
        <!-- bootstrap wysihtml5 - text editor -->
        <link rel="stylesheet" href="http://projecttrial.procuretech.net/procureline-vms/assets/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
        <link rel="stylesheet" href="https://procureline.us/assets/css/select2.min.css">
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
 <script src="<%=request.getContextPath() %>/resources/js/project.js"></script> 
  <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/projectCustom.css">


        <!-- Favicon -->

        <link rel="icon" sizes="57x57" href="http://projecttrial.procuretech.net/procureline-vms/assets/favicon.ico/apple-icon-57x57.png">
        <link rel="icon" sizes="60x60" href="http://projecttrial.procuretech.net/procureline-vms/assets/favicon.ico/apple-icon-60x60.png">
        <link rel="icon" sizes="72x72" href="http://projecttrial.procuretech.net/procureline-vms/assets/favicon.ico/apple-icon-72x72.png">
        <link rel="icon" sizes="76x76" href="http://projecttrial.procuretech.net/procureline-vms/assets/favicon.ico/apple-icon-76x76.png">
        <link rel="icon" sizes="114x114" href="http://projecttrial.procuretech.net/procureline-vms/assets/favicon.ico/apple-icon-114x114.png">
        <link rel="icon" sizes="120x120" href="http://projecttrial.procuretech.net/procureline-vms/assets/favicon.ico/apple-icon-120x120.png">
        <link rel="icon" sizes="144x144" href="http://projecttrial.procuretech.net/procureline-vms/assets/favicon.ico/apple-icon-144x144.png">
        <link rel="icon" sizes="152x152" href="http://projecttrial.procuretech.net/procureline-vms/assets/favicon.ico/apple-icon-152x152.png">
        <link rel="icon" sizes="180x180" href="http://projecttrial.procuretech.net/procureline-vms/assets/favicon.ico/apple-icon-180x180.png">
        <link rel="icon" type="image/png" sizes="192x192"  href="http://projecttrial.procuretech.net/procureline-vms/assets/favicon.ico/android-icon-192x192.png">
        <link rel="icon" type="image/png" sizes="32x32" href="http://projecttrial.procuretech.net/procureline-vms/assets/favicon.ico/favicon-32x32.png">
        <link rel="icon" type="image/png" sizes="96x96" href="http://projecttrial.procuretech.net/procureline-vms/assets/favicon.ico/favicon-96x96.png">
        <link rel="icon" type="image/png" sizes="16x16" href="http://projecttrial.procuretech.net/procureline-vms/assets/favicon.ico/favicon-16x16.png">
        <link rel="manifest" href="http://projecttrial.procuretech.net/procureline-vms/assets/favicon.ico/manifest.json">
        <meta name="msapplication-TileColor" content="#ffffff">
        <meta name="msapplication-TileImage" content="http://projecttrial.procuretech.net/procureline-vms/assets/favicon.ico/ms-icon-144x144.png">
        <meta name="theme-color" content="#ffffff">

        <!-- Favicon -->

        <style type="text/css">
            #profileImage {
                background: #512da8 none repeat scroll 0 0;
                border-radius: 50%;
                color: #fff;
                font-size: 22px;
                margin: -9px 0;
                padding: 9px;
            }
            #profileImage3 {
                background: #512da8 none repeat scroll 0 0;
                border-radius: 50%;
                color: #fff;
                font-size: 22px;
                margin: -9px 0;
                padding: 9px;
            }
            #profileImage4 {
                background: #512da8 none repeat scroll 0 0;
                border-radius: 50%;
                color: #fff;
                font-size: 22px;
                margin: -9px 0;
                padding: 9px;
            }
            #profileImage5 {
                background: #512da8 none repeat scroll 0 0;
                border-radius: 50%;
                color: #fff;
                font-size: 22px;
                margin: -9px 0;
                padding: 9px;
            }
            #profileImage6 {
                background: #512da8 none repeat scroll 0 0;
                border-radius: 50%;
                color: #fff;
                font-size: 22px;
                margin: -9px 0;
                padding: 9px;
            }
            #profileImage1 {
                background: #512da8 none repeat scroll 0 0;
                border-radius: 50%;
                color: #fff;
                font-size: 20px;
                margin: 0 auto;
                width: 90px;
                height: 90px;
                line-height: 90px;
            }

            #profileImage2 {
                background: #512da8 none repeat scroll 0 0;
                border-radius: 50%;
                color: #fff;
                font-size: 22px;
                margin: 0 auto;
                width: 50px;
                height: 50px;
                line-height: 50px;
                text-align: center;
            }
            .sidebar-menu{
                line-height: 1px !important;
            }

            .navbar-nav > .user-menu > .dropdown-menu > li.user-header {
                height: 115px;
                padding: 10px;
                text-align: center;
            }

            .select2-selection__choice{
                color: #000 !important;
            }
            .select2-container .select2-selection--single .select2-selection__rendered {
                display: block;
                padding-left: 0px !important;
                padding-right: 20px;
                overflow: hidden;
                text-overflow: ellipsis;
                white-space: nowrap;
                line-height: 20px;
            }
            /*--------------Table Style-------------------------------*/

            .table-bordered > thead > tr > th{
                border-bottom-width: 2px;
                color: #fff;
                background: #09274b;

                /*border-bottom: 4px solid #9ea7af;*/
                border-right: 1px solid #343a45;
                /*font-size: 23px;*/
                /*font-weight: 100;*/
                /*padding: 24px;*/
                /*text-align: left;*/
                text-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
                vertical-align: middle;
                font-size: 11px;
            }

            .select2{
                width:200px !important;
            }
            .modal-header {
                padding: 5px !important;
            }

            /*--------------Table Style-------------------------------*/

            /*---------------------------User Settings---------------*/
            .menu-css a
            {
                display: block;
                background: #fff;
                /*width: 240px;*/
                height: 40px;
                padding: 0 0 0 10px;
                font: bold 13px Helvetica, sans-serif;
                text-transform: uppercase;
                text-decoration: none;
                color: #000000;
                line-height: 40px;
                box-shadow: 0 1px 1px rgba( 0, 0, 0, 0.2 );
                font-size: 11px;
            }

            .menu-css a:nth-child( 2 )
            {
                border-top-left-radius: 3px;
                border-top-right-radius: 3px;
            }

            .menu-css a:last-child
            {
                border-bottom-left-radius: 3px;
                border-bottom-right-radius: 3px;
            }

            .menu-css a:hover { color: #555555; }

            .menu-css a:hover > .octicon { color: #555555; }

            .icon
            {
                float: right;
                margin-top: 10px;
                font-size: 20px;
                color: #000000;
                color: rgba( 0, 0, 0, 0.4 );
                opacity: 0.8;
            }

            .octicon-person { margin-right: 16px; }
            .octicon-graph { margin-right: 11px; }
            .octicon-cloud-upload { margin-right: 11px; }
            .octicon-pencil { margin-right: 13px; }

            .arrow
            {
                width: 0;
                height: 0;
                margin-left: 15px;
                border-left: 7px solid transparent;
                border-right: 7px solid transparent;
                border-bottom: 9px solid #F8F8F8;
            }
            /*---------------------------User Settings---------------*/
            .content {
                min-height: 600px;
            }

        </style>
    </head>
    <body class="hold-transition skin-blue sidebar-mini"><style>
    table.scroll {
        /* width: 100%; */
        /* Optional */
        /* border-collapse: collapse; */
        border-spacing: 0;
        /*border: 2px solid black;*/
    }

    table.scroll tbody,
    table.scroll thead {
        /*display: block;*/
    }

    table.scroll thead tr th {
        height: 30px;
        line-height: 30px;
        /* text-align: left; */
    }

    table.scroll tbody {
        height: 400px;
        overflow-y: auto;
        overflow-x: hidden;
    }

    table.scroll tbody {
        /*border-top: 2px solid black; */
    }

    table.scroll tbody td, thead th {
        /* width: 20%; */
        /* Optional */
        /*border-right: 1px solid black;*/
        /* white-space: nowrap; */
    }

    table.scroll tbody td:last-child, thead th:last-child {
        border-right: none;
    }
</style>
<div class="wrapper" xmlns="http://www.w3.org/1999/html">

    <header class="main-header">
        <!-- Logo -->
        <a href="http://projecttrial.procuretech.net/procureline-vms/dashboard" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><img src="http://projecttrial.procuretech.net/procureline-vms/assets/images/2.png" alt=""></span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><img src="http://projecttrial.procuretech.net/procureline-vms/assets/images/1.png" alt=""></span>
        </a>
        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top">
            <!--<div id="sdf" style="background: #fff;color: #000;"></div>-->
<!-- Sidebar toggle button-->
<a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
    <span class="sr-only">Toggle navigation</span>
</a>

<div class="navbar-custom-menu">
    <ul class="nav navbar-nav">
        <!-- Messages: style can be found in dropdown.less-->
        <li class="dropdown messages-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                <i class="fa fa-envelope-o"></i>
                <span class="label label-success" id="notification-count"></span>
            </a>
            <ul class="dropdown-menu" id="notification-latest" style="width: 325px;">

            </ul>
        </li>

        <!-- Notifications: style can be found in dropdown.less -->

        <li class="dropdown messages-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                <i class="fa fa-bell-o"></i>
                <span class="label label-success" id="others-notification-count"></span>
            </a>
            <ul class="dropdown-menu" id="others-notification-latest" style="width: 325px;">

            </ul>
        </li>


        <!-- User Account: style can be found in dropdown.less -->
        <li class="dropdown user user-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                    <img src="http://projecttrial.procuretech.net/procureline-vms/uploads/151377234614.png" class="user-image"  alt="User Image">
                    
            </a>
            <ul class="dropdown-menu">
                <!-- User image -->
                <li class="user-header">
                                            <img src="http://projecttrial.procuretech.net/procureline-vms/uploads/151377234614.png" class="img-circle"  alt="User Image">
                                        </li>
                <li class="user-body">
                    <div class="row">
                        <div class="col-xs-12 text-center">
                            Hi, Super Admin                        </div>
                    </div>
                    <!-- /.row -->
                </li>
                <li class="user-footer">
                    <div class="menu-css">
                        <a href="http://projecttrial.procuretech.net/procureline-vms/profile">Edit Profile <i class="fa fa-user icon octicon octicon-person" aria-hidden="true"></i></a>
                        <a href="http://projecttrial.procuretech.net/procureline-vms/change-password">Change Password <i class="fa fa-key icon octicon octicon-graph" aria-hidden="true"></i></a>
                        <a href="/procureline">Logout <i class="fa fa-sign-out icon octicon octicon-pencil" aria-hidden="true"></i></a>
                    </div>
                </li>
            </ul>
        </li>
    </ul>
</div>
        </nav>
    </header>