<%--
  Created by IntelliJ IDEA.
  User: abdullah
  Date: 3/23/17
  Time: 12:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>
    <meta charset="UTF-8">
    <title>Add Employee</title>



    <link rel="stylesheet" href="/resources/Login/css/style.css">


</head>

<body>
<div class="AddEmployees">
    <div class="form">
        <form method="POST" commandName="register-Employee-entity" action="/add-employees.html">
            <input name="name" type="text" placeholder="Full Name"/>
            <input name="phone" type="text" placeholder="Phone"/>
            <input name="address" type="text" placeholder="Address"/>
            <input name="position" type="text" placeholder="Position"/>
            <button>Add</button>
        </form>

    </div>
</div>

<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src="/resources/Login/js/index.js"></script>

</body>
</html>



