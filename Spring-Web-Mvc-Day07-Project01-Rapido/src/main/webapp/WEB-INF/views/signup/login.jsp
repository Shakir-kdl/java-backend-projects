<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rapido - Login</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #ffd814;
        margin: 0;
        padding: 0;
    }

    .container {
        width: 360px;
        margin: 90px auto;
        background: white;
        padding: 25px;
        border-radius: 6px;
    }

    h2 {
        text-align: center;
        margin-bottom: 20px;
        color: #000;
    }

    label {
        font-weight: bold;
        display: block;
        margin-top: 15px;
    }

    input[type=text] {
        width: 100%;
        padding: 8px;
        margin-top: 5px;
    }

    input[type=submit] {
        width: 100%;
        margin-top: 20px;
        padding: 10px;
        background-color: black;
        color: #ffd814;
        border: none;
        font-size: 16px;
        cursor: pointer;
    }

    input[type=submit]:hover {
        background-color: #222;
    }

    .links {
        text-align: center;
        margin-top: 15px;
        font-size: 14px;
    }

    .links a {
        color: black;
        text-decoration: none;
        font-weight: bold;
    }
</style>

</head>
<body>

<div class="container">

    <h2>Login to Rapido</h2>

    <form action="login" method="post">

        <label>Mobile Number</label>
        <input type="text" name="mobile" placeholder="Enter mobile number">

        <label>Email</label>
        <input type="text" name="email" placeholder="Enter email address">

        <input type="submit" value="Continue">

    </form>

    <div class="links">
        New user? <a href="viewSignup">Sign up</a><br><br>
        <a href="index.jsp">Go to Home</a>
    </div>

</div>

</body>
</html>
