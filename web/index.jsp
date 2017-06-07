<%--
  Created by IntelliJ IDEA.
  User: abdullah
  Date: 1/31/17
  Time: 10:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>
  <meta charset="UTF-8">
  <title>Login</title>



  <link rel="stylesheet" href="/resources/Login/css/style.css">


</head>

<body>
<div class="login-page">
  <div class="form">
    <form class="register-form" method="POST" commandName="register-entity" action="/login-register.html">
      <input name="fullname" type="text" placeholder="Full Name"/>
      <input name="username" type="text" placeholder="Username"/>
      <input name="password" type="password" placeholder="Password"/>
      <button>create</button>
      <p class="message">Already registered? <a href="#">Sign In</a></p>
    </form>
    <form method="POST" commandName="login-entity" action="/login-Varify.html">
      <input name="username" type="text" placeholder="username"/>
      <input name="password" type="password" placeholder="password"/>
      <button>login</button>
      <p class="message">Not registered? <a href="#">Create an account</a></p>
    </form>
  </div>
</div>

<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src="/resources/Login/js/index.js"></script>

</body>
</html>


