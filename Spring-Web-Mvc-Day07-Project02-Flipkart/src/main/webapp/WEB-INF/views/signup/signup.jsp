<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flipkart Signup</title>

<style>
body {
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
    background: #f1f3f6;
}

/* Main container */
.container {
    display: flex;
    height: 100vh;
    justify-content: center;
    align-items: center;
}

/* Card */
.signup-box {
    width: 750px;
    display: flex;
    background: #fff;
    box-shadow: 0 4px 10px rgba(0,0,0,0.1);
}

/* Left section */
.left {
    width: 40%;
    background: #2874f0;
    color: #fff;
    padding: 40px;
}

.left h2 {
    margin-top: 0;
}

.left p {
    margin-top: 20px;
    font-size: 14px;
}

/* Right section */
.right {
    width: 60%;
    padding: 40px;
}

input {
    width: 100%;
    padding: 10px;
    margin-top: 20px;
    border: none;
    border-bottom: 1px solid #ccc;
    outline: none;
}

button {
    width: 100%;
    margin-top: 30px;
    padding: 12px;
    background: #fb641b;
    border: none;
    color: #fff;
    font-size: 16px;
    cursor: pointer;
}

button:hover {
    background: #e85b17;
}

.note {
    margin-top: 20px;
    font-size: 12px;
    color: #878787;
}
</style>
</head>

<body>

<div class="container">
    <div class="signup-box">

        <!-- LEFT -->
        <div class="left">
            <h2>Looks like you're new here!</h2>
            <p>Sign up with your mobile number to get started</p>
        </div>

        <!-- RIGHT -->
        <div class="right">
            <form action="signup" method="get">

                <input type="text" name="name" placeholder="Enter your name" required>

                <input type="email" name="email" placeholder="Enter Email ID" required>

                <input type="text" name="mobile" placeholder="Enter Mobile Number" required>

                <button type="submit">CONTINUE</button>

                <div class="note">
                    By continuing, you agree to Flipkart's Terms of Use and Privacy Policy.
                </div>

            </form>
        </div>

    </div>
</div>

</body>
</html>
