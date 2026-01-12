<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Registration</title>
</head>
<body>

<%
    String empName = request.getParameter("empName");
%>

<% if (empName == null) { %>

    <h2>Employee Registration</h2>

    <form method="post">

        <p>
            <b>Employee Name</b><br>
            <input type="text" name="empName">
        </p>

        <p>
            <b>Email</b><br>
            <input type="text" name="email">
        </p>

        <p>
            <b>Mobile</b><br>
            <input type="text" name="mobile">
        </p>

        <p>
            <b>Department</b><br>
            <input type="text" name="department">
        </p>

        <p>
            <b>Address</b><br>
            <textarea name="address" rows="3" cols="35"></textarea>
        </p>

        <p>
            <input type="submit" value="Register Employee">
        </p>

    </form>

<% } else { %>

    <h2>Employee Registered Successfully ✅</h2>

    <p>
        Employee <b><%= empName %></b> has been registered successfully.
    </p>

    <a href="employee-register.jsp">Register Another Employee</a>

<% } %>

</body>
</html>
