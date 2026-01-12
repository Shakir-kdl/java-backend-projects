<%@ page language="java" contentType="text/html; charset=UTF-8"
   isELIgnored="false" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ride Confirmed</title>

<style>
    body {
        margin: 0;
        height: 100vh;
        font-family: Arial, Helvetica, sans-serif;
        background: #f7f7f7;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .card {
        background: #ffffff;
        padding: 40px;
        width: 380px;
        border-radius: 14px;
        box-shadow: 0 10px 25px rgba(0,0,0,0.2);
        text-align: center;
    }

    h2 {
        color: #1bbd36;
        margin-bottom: 12px;
    }

    .success {
        font-size: 15px;
        color: #555;
        margin-bottom: 25px;
    }

    .label {
        font-size: 13px;
        color: #666;
        margin-bottom: 6px;
    }

    .code {
        background: #1bbd36;
        color: #fff;
        padding: 14px;
        border-radius: 8px;
        font-size: 22px;
        font-weight: bold;
        letter-spacing: 2px;
        margin-bottom: 30px;
    }

    .btn {
        display: inline-block;
        padding: 12px 24px;
        background: #1bbd36;
        color: #fff;
        text-decoration: none;
        border-radius: 8px;
        font-weight: bold;
        font-size: 15px;
    }

    .btn:hover {
        background: #159b2c;
    }
</style>
</head>

<body>

<div class="card">
    <h2>Ride Confirmed</h2>

    <div class="success">
        Your Ola ride has been booked successfully.
    </div>

    <div class="label">Booking Code</div>

    <div class="code">
        ${bookingConfirmationCode}
    </div>

    <a href="viewBooking" class="btn">
        Book Another Ride
    </a>
</div>

</body>
</html>
