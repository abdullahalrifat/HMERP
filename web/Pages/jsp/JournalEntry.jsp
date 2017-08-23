<%--
  Created by IntelliJ IDEA.
  User: abdullah
  Date: 8/19/17
  Time: 12:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.abdullah.Report.SalesReport.Generate" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">

<head>
    <title>Employees | Klorofil - Free Bootstrap Dashboard Template</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <!-- CSS -->
    <link rel="stylesheet" href="/resources/AdminPanel/template/assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/AdminPanel/template/assets/css/vendor/icon-sets.css">
    <link rel="stylesheet" href="/resources/AdminPanel/template/assets/css/main.min.css">

    <!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
    <link rel="stylesheet" href="/resources/AdminPanel/template/assets/css/demo.css">

    <!-- GOOGLE FONTS -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
    <!-- ICONS -->
    <link rel="apple-touch-icon" sizes="76x76" href="/resources/AdminPanel/template/assets/img/apple-icon.png">
    <link rel="icon" type="image/png" sizes="96x96" href="/resources/AdminPanel/template/assets/img/favicon.png">
    <!--JS
    <script src="/resources/OtherHardCodedJS/updateCustomer.js"></script>
-->

</head>

<body>
<!-- WRAPPER -->
<div id="wrapper">
    <!-- SIDEBAR -->
    <div class="sidebar">
        <div class="brand">
            <a href="index.html"><img src="/resources/AdminPanel/template/assets/img/logo-rhivaan.png" alt="Klorofil Logo" class="img-responsive logo"></a>
        </div>
        <div class="sidebar-scroll">
            <nav>
                <ul class="nav">
                    <li><a href="index.html" class=""><i class="lnr lnr-home"></i> <span>Dashboard</span></a></li>
                    <li><a href="InventoryList.html" class=""><i class="lnr lnr-employee"></i> <span>Inventory</span></a></li>

                    <li><a href="CustomersList.html" class=""><i class="lnr lnr-employee"></i> <span>Customers</span></a></li>
                    <li><a href="ProductList.html" class=""><i class="lnr lnr-employee"></i> <span>Products</span></a></li>
                    <li><a href="PurchaseList.html" class=""><i class="lnr lnr-employee"></i> <span>Purchase</span></a></li>
                    <li><a href="SalesList.html" class=""><i class="lnr lnr-employee"></i> <span>Sales</span></a></li>
                    <li><a href="ProfitLoss.html" class=""><i class="lnr lnr-employee"></i> <span>Profit&Loss</span></a></li>

                    <li><a href="employees.html" class=""><i class="lnr lnr-employee"></i> <span>Employees</span></a></li>
                    <li><a href="projects.html" class=""><i class="lnr lnr-projects"></i> <span>Projects</span></a></li>
                    <li><a href="elements.html" class=""><i class="lnr lnr-code"></i> <span>Elements</span></a></li>
                    <li><a href="charts.html" class=""><i class="lnr lnr-chart-bars"></i> <span>Charts</span></a></li>
                    <li><a href="panels.html" class=""><i class="lnr lnr-cog"></i> <span>Panels</span></a></li>
                    <li><a href="notifications.html" class=""><i class="lnr lnr-alarm"></i> <span>Notifications</span></a></li>
                    <li>
                        <a href="#subPages" data-toggle="collapse" class="collapsed"><i class="lnr lnr-file-empty"></i> <span>Pages</span> <i class="icon-submenu lnr lnr-chevron-left"></i></a>
                        <div id="subPages" class="collapse ">
                            <ul class="nav">
                                <li><a href="page-profile.html" class="">Profile</a></li>
                                <li><a href="page-login.html" class="">Login</a></li>
                                <li><a href="page-lockscreen.html" class="">Lockscreen</a></li>
                            </ul>
                        </div>
                    </li>
                    <li><a href="tables.html" class=""><i class="lnr lnr-dice"></i> <span>Tables</span></a></li>
                    <li><a href="typography.html" class=""><i class="lnr lnr-text-format"></i> <span>Typography</span></a></li>
                    <li><a href="icons.html" class=""><i class="lnr lnr-linearicons"></i> <span>Icons</span></a></li>
                </ul>
            </nav>
        </div>
        <a class="footer" href="http://twitter.com/share?url=https://goo.gl/1dt1MR&amp;text=So cool! Free Bootstrap dashboard template by @thedevelovers. Download at&amp;hashtags=free,bootstrap,dashboard" title="Twitter share" target="_blank"><i class="fa fa-twitter"></i> <span>SHARE THIS FREEBIE</span></a>
    </div>
    <!-- END SIDEBAR -->
    <!-- MAIN -->
    <div class="main">
        <!-- NAVBAR -->
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-btn">
                    <button type="button" class="btn-toggle-fullwidth"><i class="lnr lnr-arrow-left-circle"></i></button>
                </div>
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-menu">
                        <span class="sr-only">Toggle Navigation</span>
                        <i class="fa fa-bars icon-nav"></i>
                    </button>
                </div>
                <div id="navbar-menu" class="navbar-collapse collapse">
                    <form class="navbar-form navbar-left hidden-xs">
                        <div class="input-group">
                            <input type="text" value="" class="form-control" placeholder="Search dashboard...">
                            <span class="input-group-btn"><button type="button" class="btn btn-primary">Go</button></span>
                        </div>
                    </form>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle icon-menu" data-toggle="dropdown">
                                <i class="lnr lnr-alarm"></i>
                                <span class="badge bg-danger">5</span>
                            </a>
                            <ul class="dropdown-menu notifications">
                                <li><a href="#" class="notification-item"><span class="dot bg-warning"></span>System space is almost full</a></li>
                                <li><a href="#" class="notification-item"><span class="dot bg-danger"></span>You have 9 unfinished tasks</a></li>
                                <li><a href="#" class="notification-item"><span class="dot bg-success"></span>Monthly report is available</a></li>
                                <li><a href="#" class="notification-item"><span class="dot bg-warning"></span>Weekly meeting in 1 hour</a></li>
                                <li><a href="#" class="notification-item"><span class="dot bg-success"></span>Your request has been approved</a></li>
                                <li><a href="#" class="more">See all notifications</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="lnr lnr-question-circle"></i> <span>Help</span> <i class="icon-submenu lnr lnr-chevron-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Basic Use</a></li>
                                <li><a href="#">Working With Data</a></li>
                                <li><a href="#">Security</a></li>
                                <li><a href="#">Troubleshooting</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="/resources/AdminPanel/template/assets/img/user.png" class="img-circle" alt="Avatar"> <span>Samuel</span> <i class="icon-submenu lnr lnr-chevron-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="#"><i class="lnr lnr-user"></i> <span>My Profile</span></a></li>
                                <li><a href="#"><i class="lnr lnr-envelope"></i> <span>Message</span></a></li>
                                <li><a href="#"><i class="lnr lnr-cog"></i> <span>Settings</span></a></li>
                                <li><a href="#"><i class="lnr lnr-exit"></i> <span>Logout</span></a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <!-- END NAVBAR -->
        <!-- MAIN CONTENT -->
        <div class="main-content">
            <div class="container-fluid">
                <h3 class="page-title">Tables</h3>
                <!-- TABLE HOVER -->
                <div class="panel">
                    <div class="panel-heading">
                        <h3 class="panel-title">Journal</h3>
                        <label for="journalType">Journal Type:</label>
                        <select id="journalType" name="journal">
                            <option value="General journal">General journal</option>
                            <option value="Purchase journal">Purchase journal</option>
                            <option value="Sales journal">Sales journal</option>
                            <option value="Cash receipts journal">Cash receipts journal</option>
                            <option value="Cash payment journal">Cash payment journal</option>
                            <option value="Purchase return journal">Purchase return journal</option>
                            <option value="Sales return journal">Sales return journal</option>
                        </select>
                    </div>
                    <div class="panel-body">
                        <a class="btn btn-warning btn-xs" onclick=" AddRow(this)" />Add Row</a>

                        <table class="table table-hover" id="JournalEntry" onchange="updateTotal()">
                            <thead>
                            <tr>
                                <!-- Adding menu for the employee table -->
                                <th>#</th>
                                <th>Account No.</th>
                                <th>Account Name</th>
                                <th>Debit</th>
                                <th>Credit</th>
                                <th>Text</th>
                            </tr>
                            </thead>
                            <tbody>
                            <!-- adding all employees  -->
                            <tr>
                                    <script>
                                        var table = document.getElementById("JournalEntry");
                                        var length=table.rows.length;
                                        var row = table.insertRow(length);
                                        var cell1 = row.insertCell(0);
                                        var cell2 = row.insertCell(1);
                                        var cell3 = row.insertCell(2);
                                        var cell4 = row.insertCell(3);
                                        var cell5 = row.insertCell(4);
                                        var cell6 = row.insertCell(5);

                                        cell2.setAttribute('contentEditable', 'true');
                                        cell3.setAttribute('contentEditable', 'true');
                                        cell4.setAttribute('contentEditable', 'true');
                                        cell5.setAttribute('contentEditable', 'true');
                                        cell6.setAttribute('contentEditable', 'true');

                                        cell1.innerHTML = ""+length-1;
                                        cell4.innerHTML=0;
                                        cell5.innerHTML=0;

                                         length=table.rows.length;
                                         row = table.insertRow(length);
                                         cell1 = row.insertCell(0);
                                         cell2 = row.insertCell(1);
                                         cell3 = row.insertCell(2);
                                         cell4 = row.insertCell(3);
                                         cell5 = row.insertCell(4);
                                         cell6 = row.insertCell(5);

                                         cell1.innerHTML = "*";
                                         cell2.innerHTML = "Total";
                                        var removeRow=document.createElement("BUTTON");
                                        removeRow.onclick = function() {
                                            // to do something
                                            var table = document.getElementById("JournalEntry");
                                            var length=table.rows.length;
                                            var rows = table.rows;
                                            var list = total();

                                            rows[length-1].cells[3].innerHTML = list[0];
                                            rows[length-1].cells[4].innerHTML = list[1];
                                        };
                                        removeRow.innerHTML= "refresh";
                                        cell6.appendChild( removeRow );


                                    </script>
                            </tr>


                            </tbody>
                        </table>
                        <a class="btn btn-warning btn-xs" onclick=" Save(this)" />Save</a>

                        <script>
                            function total()
                            {
                                var table = document.getElementById("JournalEntry");
                                var length=table.rows.length;
                                var rows = table.rows;
                                var totalDebit=0;
                                var totalCredit=0;
                                //alert(length);
                                for(var i=2;i<length-1;i++)
                                {
                                    var last = rows[i];
                                    var celldebit = last.cells[3].innerHTML;
                                    var cellcredit = last.cells[4].innerHTML;
                                    totalDebit+=parseInt(celldebit);
                                    totalCredit+=parseInt(cellcredit);

                                }
                                var list=[];

                                list.push(totalDebit);
                                list.push(totalCredit);

                                return list;
                            }
                            function AddRow(n) {
                                var table = document.getElementById("JournalEntry");
                                var length=table.rows.length;
                                var row = table.insertRow(length-1);
                                var cell1 = row.insertCell(0);
                                var cell2 = row.insertCell(1);
                                var cell3 = row.insertCell(2);
                                var cell4 = row.insertCell(3);
                                var cell5 = row.insertCell(4);
                                var cell6 = row.insertCell(5);

                                cell2.setAttribute('contentEditable', 'true');
                                cell3.setAttribute('contentEditable', 'true');
                                cell4.setAttribute('contentEditable', 'true');
                                cell5.setAttribute('contentEditable', 'true');
                                cell6.setAttribute('contentEditable', 'true');
                                cell4.innerHTML=0;
                                cell5.innerHTML=0;

                                cell1.innerHTML = ""+length-2;

                            }

                            function Save(n)
                            {

                                var table = document.getElementById("JournalEntry");
                                var length=table.rows.length;
                                var rows = table.rows;
                                var datas=[];
                                //updateTotal();
                                //alert(length);
                                for(var i=2;i<length-1;i++)
                                {
                                    var last = rows[i];
                                    var rowdata=[];
                                    var cellid = last.cells[0].innerHTML;
                                    var cellacno = last.cells[1].innerHTML;
                                    var cellacname = last.cells[2].innerHTML;
                                    var celldebit = last.cells[3].innerHTML;
                                    var cellcredit = last.cells[4].innerHTML;
                                    var celltext = last.cells[5].innerHTML;
                                    rowdata.push(cellid);
                                    rowdata.push(cellacno);
                                    rowdata.push(cellacname);
                                    rowdata.push(celldebit);
                                    rowdata.push(cellcredit);
                                    rowdata.push(celltext);
                                    datas.push(rowdata);
                                }
                                alert(datas);
                            }
                        </script>
                    </div>
                </div>
                <!-- END TABLE HOVER -->
            </div>
        </div>
        <!-- END MAIN CONTENT -->

    </div>

    <!--
            <footer>
                <div class="container-fluid">
                    <p class="copyright">&copy; 2017. Developed by <a href="http://wngit.com/">W & G Information Technology</a></p>            </div>
            </footer>
    -->
        <!-- END MAIN -->
</div>
<!-- END WRAPPER -->
<!-- Javascript -->
<script src="/resources/AdminPanel/template/assets/js/jquery/jquery-2.1.0.min.js"></script>
<script src="/resources/AdminPanel/template/assets/js/bootstrap/bootstrap.min.js"></script>
<script src="/resources/AdminPanel/template/assets/js/plugins/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<script src="/resources/AdminPanel/template/assets/js/klorofil.min.js"></script>

</body>

</html>


