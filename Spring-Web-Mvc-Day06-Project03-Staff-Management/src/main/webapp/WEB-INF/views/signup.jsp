<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Staff Registration</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
    }
    .box {
        width: 400px;
        margin: 60px auto;
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
        background-color: #007bff;
        color: white;
        border: none;
        cursor: pointer;
    }
    input[type=submit]:hover {
        background-color: #0056b3;
    }
    a {
        text-decoration: none;
    }
</style>

</head>
<body>

<%
    String staffName = request.getParameter("staffName");
%>

<div class="box">

<% if (staffName == null) { %>

    <h2>Staff Registration</h2>

    <form method="post">

        <label>Staff Name</label>
        <input type="text" name="staffName">

        <label>Email</label>
        <input type="text" name="email">

        <label>Mobile</label>
        <input type="text" name="mobile">

        <label>Department</label>
        <input type="text" name="department">

        <input type="submit" value="Register Staff">

    </form>

    <p>
        Already registered?
        <a href="staff-login.jsp">Staff Login</a>
    </p>

<% } else { %>

    <h2>Registration Successful ✅</h2>

    <p>
        Staff <b><%= staffName %></b> registered successfully.
    </p>

    <a href="staff-signup.jsp">Register Another Staff</a>

<% } %>

</div>

</body>
</html>
