<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rapido - Login Successful</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #ffd814;
        margin: 0;
        padding: 0;
    }

    .box {
        width: 380px;
        margin: 100px auto;
        background: white;
        padding: 25px;
        border-radius: 6px;
        text-align: center;
    }

    h2 {
        color: #000;
        margin-bottom: 10px;
    }

    p {
        color: #333;
        font-size: 15px;
    }

    .btn {
        display: inline-block;
        margin: 15px 10px 0;
        padding: 10px 25px;
        background-color: black;
        color: #ffd814;
        text-decoration: none;
        border-radius: 5px;
        font-size: 14px;
    }

    .btn:hover {
        background-color: #222;
    }
</style>

</head>
<body>

<div class="box">

    <h2>Login Successful ✅</h2>

    <p>
        Welcome to <b>Rapido</b>.
    </p>

    <p>
        You have logged in successfully.
    </p>

    <!-- Buttons -->
    <a href="index.jsp" class="btn">Go to Home</a>
    <a href="viewSignup" class="btn">New Registration</a>

</div>

</body>
</html>
