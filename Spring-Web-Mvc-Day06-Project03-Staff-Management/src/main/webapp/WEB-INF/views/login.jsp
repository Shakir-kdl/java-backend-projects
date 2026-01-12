<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Staff Login</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
    }
    .box {
        width: 350px;
        margin: 80px auto;
        background: #ffffff;
        padding: 20px;
        border-radius: 5px;
    }
    h2 {
        text-align: center;
    }
    label {
        font-weight: bold;
    }
    input {
        width: 100%;
        padding: 8px;
        margin-top: 5px;
        margin-bottom: 15px;
    }
    input[type=submit] {
        background-color: #28a745;
        color: white;
        border: none;
        cursor: pointer;
    }
    input[type=submit]:hover {
        background-color: #1e7e34;
    }
</style>

</head>
<body>

<%
    String email = request.getParameter("email");
%>

<div class="box">

<% if (email == null) { %>

    <h2>Staff Login</h2>

    <form method="post">

        <label>Email</label>
        <input type="text" name="email">

        <label>Password</label>
        <input type="password" name="password">

        <input type="submit" value="Login">

    </form>

    <p>
        New staff?
        <a href="staff-signup.jsp">Register here</a>
    </p>

<% } else { %>

    <h2>Login Successful ✅</h2>

    <p>
        Welcome! Staff login successful.
    </p>

    <a href="staff-login.jsp">Logout</a>

<% } %>

</div>

</body>
</html>
