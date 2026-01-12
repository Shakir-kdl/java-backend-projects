<!DOCTYPE html>
<html>
<head>
<title>Rapido</title>
<meta charset="UTF-8">

<style>
    body {
        margin: 0;
        font-family: Arial, sans-serif;
        background-color: #ffd814;
        text-align: center;
    }

    .header {
        background-color: black;
        color: #ffd814;
        padding: 15px;
        font-size: 26px;
        font-weight: bold;
    }

    .content {
        margin-top: 40px;
    }

    h2 {
        font-size: 28px;
        color: black;
    }

    p {
        color: #333;
        font-size: 16px;
    }

    .btn {
        display: inline-block;
        margin-top: 20px;
        padding: 12px 30px;
        background-color: black;
        color: #ffd814;
        text-decoration: none;
        font-size: 18px;
        border-radius: 5px;
    }

    .btn:hover {
        background-color: #222;
    }

    /* Girl animation */
    .girl {
        margin: 50px auto;
        width: 120px;
        position: relative;
    }

    .head {
        width: 40px;
        height: 40px;
        background: #000;
        border-radius: 50%;
        margin: auto;
    }

    .body {
        width: 6px;
        height: 50px;
        background: #000;
        margin: auto;
    }

    .arm {
        width: 35px;
        height: 4px;
        background: #000;
        position: absolute;
        top: 55px;
        left: 42px;
        transform-origin: left center;
        animation: wave 1s infinite alternate;
    }

    .leg-left, .leg-right {
        width: 4px;
        height: 35px;
        background: #000;
        position: absolute;
        top: 95px;
    }

    .leg-left {
        left: 55px;
    }

    .leg-right {
        left: 65px;
    }

    @keyframes wave {
        from {
            transform: rotate(10deg);
        }
        to {
            transform: rotate(-30deg);
        }
    }

    .welcome {
        margin-top: 10px;
        font-weight: bold;
    }
</style>

</head>
<body>

<div class="header">
    Rapido
</div>

<div class="content">
    <h2>India's Largest Bike Taxi</h2>
    <p>Quick - Affordable - Reliable Rides</p>

    
    <div class="girl">
        <div class="head"></div>
        <div class="body"></div>
        <div class="arm"></div>
        <div class="leg-left"></div>
        <div class="leg-right"></div>
    </div>

    <div class="welcome">
        Welcome to Rapido!
    </div>

    <a href="viewSignup" class="btn">Sign up to Ride</a>
</div>

</body>
</html>
