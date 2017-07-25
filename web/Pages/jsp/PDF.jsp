<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: abdullah
  Date: 7/15/17
  Time: 10:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>PDF View </title>
    <!-- Load jQuery from Google's CDN -->
    <!-- Load jQuery UI CSS  -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.0/jquery-ui.min.css">
    <link rel="stylesheet" href="/resources/OtherHardCodedDesigns/DatePicker.css" />
</head>
<body onload="dateFormat()">
<div align="center">
    <a href="index.html"><img src="/resources/AdminPanel/template/assets/img/logo-rhivaan.png" alt="Klorofil Logo" class="img-responsive logo"></a>
    <h1>Rhivaan Group of Industries</h1>
    <!-- TABLE HOVER -->
    <div class="panel">
        <div class="panel-heading">
            <h3 class="panel-title">Generate PDF</h3>
        </div>
        <div class="panel-body">
            <!--body goes here-->
            <div class="form">
                <div class="form-style-5">
                    <form method="POST" commandName="register-customer-bill-entity" action="/downloadPDF">
                        <fieldset>
                            <label for="datepicker">Date :</label>
                            <input type="text" id="datepicker" name="datepicker" placeholder="Date *">

                            <label for="clientName">Products:</label>
                            <input type="text" id="clientName" name="clientName" placeholder="Client Name">

                        </fieldset>

                        <input type="submit" value="Apply" />
                    </form>
                </div>

            </div>
            <script>
            function dateFormat()
            {
                $( "#datepicker" ).datepicker({
                dateFormat: 'dd/mm/yy',
                changeMonth: true,//this option for allowing user to select month
                changeYear: true//this option for allowing user to select from year range

                });
                //alert("on inner function");
            }
            </script>
            <!--Body Ends Here-->
        </div>
    </div>
    <!-- END TABLE HOVER -->

    <!--
        <h3><a href="/downloadPDF">Download PDF Document</a></h3>
    -->
</div>
<!-- Javascript -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.0/jquery-ui.min.js"></script>
</body>


</html>