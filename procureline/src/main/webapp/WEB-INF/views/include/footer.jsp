 
    <footer class="main-footer">
    <div class="pull-right hidden-xs">

    </div>
    Copyright &copy; Procureline. All rights reserved. Copyright with PNCCAPITAL LLC    <span style="float: right;">
        <div id="google_translate_element"></div><script type="text/javascript">
            function googleTranslateElementInit() {
                new google.translate.TranslateElement({pageLanguage: 'en', layout: google.translate.TranslateElement.InlineLayout.SIMPLE, autoDisplay: false, multilanguagePage: true}, 'google_translate_element');
            }
        </script><script type="text/javascript" src="//translate.google.com/translate_a/element.js?cb=googleTranslateElementInit"></script>
    </span>
</footer>

<!-- Add the sidebar's background. This div must be placed
     immediately after the control sidebar -->
<div class="control-sidebar-bg"></div></div>
<!-- ./wrapper -->

<!-- jQuery 2.2.3 -->
<!--<script src="assets/plugins/jQuery/jquery-2.2.3.min.js"></script>-->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<!-- Bootstrap 3.3.6 -->
<script src="http://projecttrial.procuretech.net/procureline-vms/assets/bootstrap/js/bootstrap.min.js"></script>
<!-- DataTables -->
<script src="http://projecttrial.procuretech.net/procureline-vms/assets/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="http://projecttrial.procuretech.net/procureline-vms/assets/plugins/datatables/dataTables.bootstrap.min.js"></script>
<!-- Morris.js charts -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
<script src="http://projecttrial.procuretech.net/procureline-vms/assets/plugins/morris/morris.min.js"></script>
<!-- Sparkline -->
<script src="http://projecttrial.procuretech.net/procureline-vms/assets/plugins/sparkline/jquery.sparkline.min.js"></script>
<!-- jvectormap -->
<script src="http://projecttrial.procuretech.net/procureline-vms/assets/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="http://projecttrial.procuretech.net/procureline-vms/assets/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<!-- jQuery Knob Chart -->
<script src="http://projecttrial.procuretech.net/procureline-vms/assets/plugins/knob/jquery.knob.js"></script>
<!-- daterangepicker -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
<script src="http://projecttrial.procuretech.net/procureline-vms/assets/plugins/daterangepicker/daterangepicker.js"></script>
<!-- datepicker -->
<script src="http://projecttrial.procuretech.net/procureline-vms/assets/plugins/datepicker/bootstrap-datepicker.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script src="http://projecttrial.procuretech.net/procureline-vms/assets/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<!-- Slimscroll -->
<script src="http://projecttrial.procuretech.net/procureline-vms/assets/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="http://projecttrial.procuretech.net/procureline-vms/assets/plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="http://projecttrial.procuretech.net/procureline-vms/assets/dist/js/app.min.js"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<!--<script src="--><!--assets/dist/js/pages/dashboard.js"></script>-->
<!-- AdminLTE for demo purposes -->
<script src="http://projecttrial.procuretech.net/procureline-vms/assets/dist/js/demo.js"></script>

<script src="http://projecttrial.procuretech.net/procureline-vms/assets/js/select2.min.js"></script>

<script>

    $(function () {

        $('.alert').delay(5000).fadeOut('slow');
    })

    $(document).ready(function () {
        var firstName = $('#firstName').text();
        var lastName = $('#lastName').text();
        var intials = $('#firstName').text().charAt(0) + $('#lastName').text().charAt(0);
        var profileImage = $('#profileImage').text(intials);
        var profileImage1 = $('#profileImage1').text(intials);
        var profileImage2 = $('#profileImage2').text(intials);
        var profileImage3 = $('#profileImage3').text(intials);
        var profileImage4 = $('#profileImage4').text(intials);
        var profileImage5 = $('#profileImage5').text(intials);
        var profileImage6 = $('#profileImage6').text(intials);
    });

    function addcount(type, msg) {
//        alert(msg);
        $('#notification-count').text(msg);
    }

    function addmail(type, msg) {
        //alert(msg);
        $('#notification-latest').html(msg);
    }

    function get_notification() {
        $.ajax({

            type: "GET",
            url: "http://projecttrial.procuretech.net/procureline-vms/get_notification_count",
            async: true,
            cache: false,
            timeout: 50000,
            success: function (data) {
//                console.log(data);
                if (data != 'na') {
                    addcount("new", data);
                    setTimeout(get_notification, 10000);
                } else
                {
                    window.location.href = "http://projecttrial.procuretech.net/procureline-vms/logout";
                }
            },
            error: function () {

            }
        });
    }

    function get_mail_notification() {
        $.ajax({

            type: "GET",
            url: "http://projecttrial.procuretech.net/procureline-vms/get_mail_notification",
            async: true,
            cache: false,
            timeout: 50000,
            success: function (data) {
//                console.log(data);
                if (data != 'na') {
                    addmail("new", data);
                    setTimeout(get_mail_notification, 10000);
                } else
                {
                    window.location.href = "http://projecttrial.procuretech.net/procureline-vms/logout";
                }
            },
            error: function () {

            }
        });
    }

    /*-------------------------All Others Notifications-------------------------*/

    function addotherscount(type, msg) {
        //alert(msg);
        $('#others-notification-count').text(msg);
    }

    function addothersdetails(type, msg) {
        //alert(msg);
        $('#others-notification-latest').html(msg);
    }

    function get_others_notification() {
        $.ajax({

            type: "GET",
            url: "http://projecttrial.procuretech.net/procureline-vms/get_superadmin_others_notification_count",
            async: true,
            cache: false,
            timeout: 50000,
            success: function (data) {
//                alert(data);
//                return false;
                if (data != 'na') {
                    addotherscount("new", data);
                    setTimeout(get_others_notification, 10000);
                } else
                {
                    window.location.href = "http://projecttrial.procuretech.net/procureline-vms/logout";
                }
            }
        });
    }

    function get_others_notification_details() {
        $.ajax({

            type: "GET",
            url: "http://projecttrial.procuretech.net/procureline-vms/get_superadmin_others_notification_details",
            async: true,
            cache: false,
            timeout: 50000,
            success: function (data) {
//                alert(data);
//                return false;
                if (data != 'na') {
                    addothersdetails("new", data);
                    setTimeout(get_others_notification_details, 10000);
                } else
                {
                    window.location.href = "http://projecttrial.procuretech.net/procureline-vms/logout";
                }
            }
        });
    }

    /*-------------------------All Others Notifications-------------------------*/

    $(document).ready(function () {
        get_notification();
        get_mail_notification();
        get_others_notification();
        get_others_notification_details();
    });

</script>

<script type="text/javascript">
    $('select').select2();
</script>
<script src="http://projecttrial.procuretech.net/procureline-vms/assets/js/fancybox/lib/jquery.mousewheel.pack.js?v=3.1.3"></script>
<script src="http://projecttrial.procuretech.net/procureline-vms/assets/js/fancybox/source/jquery.fancybox.pack.js?v=2.1.5"></script>
<link rel="stylesheet" type="text/css" href="http://projecttrial.procuretech.net/procureline-vms/assets/js/fancybox/source/jquery.fancybox.css?v=2.1.5" media="screen" />
<script type="text/javascript">
    $(document).ready(function () {
        $(".fancybox").fancybox({
            width: 1024,
            height: 768,
            type: 'iframe'
        });
    });
</script>
<script type="text/javascript">
    var $zoho = $zoho || {};
    $zoho.salesiq = $zoho.salesiq || {widgetcode: "e5e3ac71d9190edc2b394dac001fcd1c4773b26b48f429e035732afd8b3deb1b44bad168f7c211b73a19ecb1c8e813ec", values: {}, ready: function () {}};
    var d = document;
    s = d.createElement("script");
    s.type = "text/javascript";
    s.id = "zsiqscript";
    s.defer = true;
    s.src = "https://salesiq.zoho.com/widget";
    t = d.getElementsByTagName("script")[0];
    t.parentNode.insertBefore(s, t);
    d.write("<div id='zsiqwidget'></div>");
</script>
</body>
</html>
<script>
    $(function () {

        $('#timesheet_tbl').DataTable({
            //scrollY: "300px",
            scrollX: true,
            scrollCollapse: true,
//            paging: false,

        });

        $('#van_tbl').DataTable();
        $('#emp_tbl').DataTable();

    });

    function getApprove(val) {
        var invoice_id = val;

        $.post("http://projecttrial.procuretech.net/procureline-vms/approve_invoice", {invoice_id: invoice_id}, function (data) {
            //alert(data);
            if (data == 1) {
                location.reload();
                $(".err").hide();
                $(".succ").show();
            } else {
                location.reload();
                $(".err").show();
                $(".succ").hide();
            }

        });
    }
</script>