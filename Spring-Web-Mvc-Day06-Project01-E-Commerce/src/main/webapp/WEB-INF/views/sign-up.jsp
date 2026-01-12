<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Amazon Account</title>
</head>
<body>

<%
    // Check if form is submitted
    String firstName = request.getParameter("firstName");
%>

<% if (firstName == null) { %>

    <!-- SIGNUP FORM -->
    <h2>Create Account</h2>

    <form method="post">

        <p>
            <b>Your name</b><br>
            <input type="text" name="firstName" placeholder="First name" required>
            <input type="text" name="lastName" placeholder="Last name" required>
        </p>

        <p>
            <b>Email</b><br>
            <input type="text" name="email" required>
        </p>

        <p>
            <b>Mobile number</b><br>
            <input type="text" name="mobile" required>
        </p>

        <p>
            <b>Address</b><br>
            <textarea name="address" rows="3" cols="35" required></textarea>
        </p>

        <p>
            <input type="submit" value="Create your Amazon account">
        </p>

    </form>

<% } else { %>

    <!-- SUCCESS MESSAGE -->
    <h2>Account created successfully ✅</h2>

    <p>
        Thank you <b><%= firstName %></b>, your account has been created.
    </p>

    <p>
        You can now sign in and start shopping.
    </p>

<% } %>

</body>
</html>
