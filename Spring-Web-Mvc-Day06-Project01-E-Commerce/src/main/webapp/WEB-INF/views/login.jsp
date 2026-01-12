<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Amazon Sign In</title>
</head>
<body>

<%
    // Check if form is submitted
    String email = request.getParameter("email");
%>

<% if (email == null) { %>

    <!-- LOGIN FORM -->
    <h2>Sign in</h2>

    <form method="post">

        <p>
            <b>Email</b><br>
            <input type="text" name="email" placeholder="Enter email" required>
        </p>

        <p>
            <b>Password</b><br>
            <input type="password" name="password" placeholder="Enter password" required>
        </p>

        <p>
            <input type="submit" value="Sign in">
        </p>

    </form>

    <p>
        New to Amazon?
        <a href="signup.jsp">Create your Amazon account</a>
    </p>

<% } else { %>

    <!-- SUCCESS MESSAGE -->
    <h2>Login Successful ✅</h2>

    <p>
        Welcome back!
    </p>

    <p>
        You are now signed in.
    </p>

<% } %>

</body>
</html>
