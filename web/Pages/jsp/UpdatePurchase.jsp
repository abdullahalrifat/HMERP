<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: abdullah
  Date: 3/21/17
  Time: 12:49 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">

<head>
    <title>Employees | Klorofil - Free Bootstrap Dashboard Template</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <!-- CSS -->
    <link rel="stylesheet" href="/resources/OtherHardCodedDesigns/InputFormDesign.css">
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
    <script type="text/javascript" src="/resources/OtherHardCodedJS/updateCustomer.js"></script>
        -->

</head>

<body >
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
                    <li><a href="PurchaseList.html" class="active"><i class="lnr lnr-employee"></i> <span>Purchase</span></a></li>
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
                <a class="btn" href="AddPurchase.html"><img src="/resources/AdminPanel/template/assets/img/add.png" class="img-circle" alt="Avatar"></a>
                <!-- TABLE HOVER -->
                <div class="panel" id="UpdateModal">
                    <div class="panel-heading">
                        <h3 class="panel-title">Update Purchase</h3>
                    </div>
                    <div class="panel-body" >
                        <!--body goes here-->
                        <div class="form">
                            <div class="form-style-5">
                                <form  id ="CustomerForm" method="POST" commandName="update-Purchase-entity" action="/update-purchase-row.html">

                                    <fieldset>
                                        <input type="hidden" name="Id" id="pid" type="number" placeholder="ID">
                                        <input type="datetime" id="pdate" name="date" placeholder="Date *">
                                        <script>
                                            var today = new Date();
                                            var dd = today.getDate();
                                            var mm = today.getMonth()+1; //January is 0!
                                            var yyyy = today.getFullYear();
                                            if(dd<10){
                                                dd='0'+dd;
                                            }
                                            if(mm<10){
                                                mm='0'+mm;
                                            }
                                            var today =dd+'/'+mm+'/'+yyyy;
                                            alert(today);
                                            document.getElementById("pdate").value = today;
                                        </script>
                                        <input type="text" name="billNo" id="pbill" placeholder="Bill No *">
                                        <label for="pproduct">Products:</label>
                                        <select id="pproduct" onchange="update();updateQuantity()" name="product">
                                        </select>
                                        <c:forEach  items="${productList}" var="listValue">
                                            <script>
                                                //alert('${listValue.getName()}');
                                                var select=document.getElementById('pproduct');
                                                var opt = document.createElement('option');
                                                opt.value = '${listValue.getName()}';
                                                opt.innerHTML = '${listValue.getName()}';
                                                select.appendChild(opt);
                                            </script>
                                        </c:forEach>
                                        <label for="psupplier">Suppliers:</label>
                                        <select id="psupplier" name="supplier">
                                            <option value="HP">HP</option>

                                            <option value="DELL">DELL</option>

                                            <option value="NOKIA">NOKIA</option>
                                        </select>
                                        <input type="number" name="tax" id="ptax" onchange="updateQuantity()" placeholder="Tax *">
                                        <input type="number" name="quantity" id="pquantity" onchange="updateQuantity()" placeholder="Quantity *">
                                        <input type="number" name="rate" id="prate" onchange="updateQuantity()" placeholder="Rate *">
                                        <input type="number" name="totalAmount" id="ptotal" onchange="updateQuantity()" placeholder="Total Amount">
                                        <input type="number" name="net" id="pnet" placeholder="Net">
                                        <label for="ppayMode">Country:</label>
                                        <select id="ppayMode" name="payMode">
                                            <option value="HandCash">Hand Cash</option>

                                            <option value="Bank">Bank</option>
                                        </select>
                                    </fieldset>
                                    <input type="submit" value="Apply" />

                                </form>
                            </div>

                        </div>
                        <script>
                            var price;
                            var tax;
                            function update()
                            {
                                //alert(selectedValue);
                                <c:forEach  items="${productList}" var="listValue">
                                compare('${listValue.getName()}','${listValue.getPrice()}','${listValue.getTax()}');
                                </c:forEach>
                            }
                            function compare()
                            {
                                var selectBox = document.getElementById("pproduct");
                                var selectedValue = selectBox.options[selectBox.selectedIndex].value;
                                // alert("before compare");
                                if(selectedValue==arguments[0])
                                {
                                    //alert("ok");
                                    document.getElementById("prate").value=parseInt(arguments[1]);
                                    document.getElementById("ptax").value=parseFloat(arguments[2]);
                                    price=arguments[1];
                                    tax=arguments[2];
                                }
                            }
                            function updateQuantity()
                            {
                                var quantity=document.getElementById("pquantity").value;
                                var price=document.getElementById("prate").value;
                                var tax=document.getElementById("ptax").value;
                                var totalPrice=quantity*price;
                                var taxx=totalPrice+(totalPrice*(tax/100));
                                document.getElementById("ptotal").value=totalPrice;
                                document.getElementById("pnet").value=taxx;
                            }
                        </script>

                        <!--Body Ends Here-->
                        <c:forEach  items="${purchaselist}" var="listValue">
                            <script>
                                // alert("mara khai");
                                document.getElementById("pid").value=parseInt('${listValue.getId()}');
                                document.getElementById("pdate").value='${listValue.getDate()}';
                                document.getElementById("pbill").value=parseInt('${listValue.getBillNo()}');
                                document.getElementById("pproduct").value='${listValue.getProduct()}';
                                document.getElementById("psupplier").value='${listValue.getSupplier()}';
                                document.getElementById("ptax").value=parseFloat('${listValue.getTax()}');
                                document.getElementById("pquantity").value=parseInt('${listValue.getQuantity()}');
                                document.getElementById("prate").value=parseInt('${listValue.getRate()}');
                                document.getElementById("ptotal").value=parseInt('${listValue.getTotalAmount()}');
                                document.getElementById("pnet").value=parseInt('${listValue.getNet()}');
                                document.getElementById("ppayMode").value='${listValue.getPayMode()}';
                            </script>
                        </c:forEach>

                    </div>
                </div>
                <!-- END TABLE HOVER -->



            </div>
        </div>
        <!-- END MAIN CONTENT -->
        <footer>
            <div class="container-fluid">
                <p class="copyright">&copy; 2017. Developed by <a href="http://wngit.com/">W & G Information Technology</a></p>            </div>
        </footer>
    </div>
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

