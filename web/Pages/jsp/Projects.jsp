<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <title>Projects | Klorofil - Free Bootstrap Dashboard Template</title>
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



</head>

<body>
<!-- WRAPPER -->
<div id="wrapper">
    <!-- SIDEBAR -->
    <div class="sidebar">
        <div class="brand">
            <a href="index.html"><img src="/resources/AdminPanel/template/assets/img/logo.png" alt="Klorofil Logo" class="img-responsive logo"></a>
        </div>
        <div class="sidebar-scroll">
            <nav>
                <ul class="nav">
                    <li><a href="index.html" class=""><i class="lnr lnr-home"></i> <span>Dashboard</span></a></li>
                    <li><a href="employees.html" class=""><i class="lnr lnr-employee"></i> <span>Employees</span></a></li>
                    <li><a href="projects.html" class="active"><i class="lnr lnr-projects"></i> <span>Projects</span></a></li>
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


            <!-- Style sheet for project add button -->
            <link data-require="bootstrap-css@3.1.1" data-semver="3.1.1" rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" />
            <link rel="stylesheet" href="/resources/OtherHardCodedDesigns/ProjectsAddStyle.css" />
            <!-- for adding projects table -->
            <link rel="stylesheet" href="/resources/Login/css/style.css">

            <!-- for adding project add button -->
            <script data-require="jquery@*" data-semver="2.0.3" src="http://code.jquery.com/jquery-2.0.3.min.js"></script>
            <script data-require="bootstrap@*" data-semver="3.1.1" src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>

            <!-- for adding projects table -->
            <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
            <script src="/resources/Login/js/index.js"></script>




            <div class="container-fluid">
                <h3 class="page-title">Projects</h3>

                <!--
                    demo for adding class as text clicked
                <a hrefas="#openModal">Open Modal</a>-->
                <a class="btn" href="#openModal"><img src="/resources/AdminPanel/template/assets/img/projects.png" class="img-circle" alt="Avatar"></a>
                <!-- TABLE HOVER -->
                <div class="panel">
                    <div class="panel-heading">
                        <h3 class="panel-title">Projects</h3>
                    </div>
                    <div class="panel-body">
                        <table class="table table-hover">
                            <thead>
                            <tr>
                                <!-- Adding menu for the employee table -->
                                <th>#</th>
                                <th>Project Name</th>
                                <th>Project Client</th>
                                <th>Project Manager</th>
                                <th>Project DeadLine</th>
                                <th>Project Status</th>
                            </tr>
                            </thead>
                            <tbody>


                            <!-- adding all employees  -->
                            <c:forEach var = "listValue" items = "${projectList}">
                            <!--
                                <tr onclick="window.document.location='#UpdateModal';">
                                -->
                                <tr onclick="setrow('${listValue.getId()}','${listValue.getProjectName()}','${listValue.getProjectClient()}','${listValue.getProjectManager()}','${listValue.getProjectDeadLine()}','${listValue.getProjectStatus()}')">
                                    <td>
                                        <c:out value="${listValue.getId()}"/>
                                    </td>
                                    <td>
                                        <c:out value="${listValue.getProjectName()}"/>
                                    </td>
                                    <td>
                                        <c:out value="${listValue.getProjectClient()}"/>
                                    </td>
                                    <td>
                                        <c:out value="${listValue.getProjectManager()}"/>
                                    </td>
                                    <td>
                                        <c:out value="${listValue.getProjectDeadLine()}"/>
                                    </td>
                                    <td>
                                        <c:out value="${listValue.getProjectStatus()}"/>
                                    </td>
                                </tr>

                            </c:forEach>



                            </tbody>
                        </table>
                    </div>
                </div>
                <!-- END TABLE HOVER -->


                <!-- Here goes the contents of this page-->

            </div>
        </div>
        <!-- Projects Add Style -->
        <div id="openModal" class="modalDialog">
            <div>
                <a href="#close" title="Close" class="close">X</a>
                <div class="form">
                    <form method="POST" commandName="register-Project-entity" action="/add-project.html">
                        <input name="ProjectName" type="text" placeholder="Project Name"/>
                        <input name="ProjectClient" type="text" placeholder="Project Client"/>
                        <input name="ProjectManager" type="text" placeholder="Project Manager"/>
                        <input name="ProjectDeadLine" type="text" placeholder="Project DeadLine"/>
                        <!--
                        <select name="ProjectStatus">
                            <option value="On-Going">On-Going</option>
                            <option value="Done">Done</option>
                            <option value="In-Queue">In-Queue</option>
                        </select>
                        -->
                        <input name="ProjectStatus" type="text" placeholder="Project Status"/>
                        <button>Add</button>
                    </form>

                </div>
            </div>
        </div>
        <script type="text/javascript">
            var rownumber;

            function getselectedrow() {
                return rownumber;
            }
            function setrow() {
                rownumber=arguments[0];

               // alert("Row index is: " + arguments[0]);
                document.getElementById("pid").value=parseInt(arguments[0]);
                 document.getElementById("pname").value=arguments[1];
                 document.getElementById("pclient").value=arguments[2];
                 document.getElementById("pmanager").value=arguments[3] ;
                 document.getElementById("pdeadline").value=arguments[4];
                document.getElementById("pstatus").value=arguments[5];
                window.document.location='#UpdateModal';
            }

        </script>
        <!-- Projects Update Style -->
        <div id="UpdateModal" class="modalDialog">
            <div>
                <a href="#close" title="Close" class="close">X</a>
                <div class="form">
                        <form method="POST" commandName="register-Project-entity" action="/update-project.html">
                            <input type="hidden" name="Id" id="pid" type="number" placeholder="ID">
                            <input name="ProjectName" id="pname" type="text" placeholder="Project Name"/>
                            <input name="ProjectClient" id="pclient" type="text" placeholder="Project Client"/>
                            <input name="ProjectManager" id="pmanager" type="text" placeholder="Project Manager"/>
                            <input name="ProjectDeadLine" id ="pdeadline" type="text" placeholder="Project DeadLine"/>
                            <input name="ProjectStatus" id ="pstatus" type="text" placeholder="Project Status"/>
                            <button>Update</button>
                    </form>
                </div>
            </div>
        </div>


        <!-- END MAIN CONTENT -->
        <footer>
            <div class="container-fluid">
                <p class="copyright">&copy; 2017. Developed by <a href="https://theicthub.com/">The ICT Hub Inc.</a></p>
            </div>
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

