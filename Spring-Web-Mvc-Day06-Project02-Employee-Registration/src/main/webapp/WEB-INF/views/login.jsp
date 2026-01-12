<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Login</title>
</head>
<body>

<%
    String email = request.getParameter("email");
%>

<% if (email == null) { %>

    <h2>Employee Login</h2>

    <form method="post">

        <p>
            <b>Email</b><br>
            <input type="text" name="email">
        </p>

        <p>
            <b>Password</b><br>
            <input type="password" name="password">
        </p>

        <p>
            <input type="submit" value="Login">
        </p>

    </form>

<% } else { %>

    <h2>Login Successful ✅</h2>

    <p>
        Welcome! You have logged in successfully.
    </p>

    <a href="employee-login.jsp">Logout</a>

<% } %>

</body>
</html>
