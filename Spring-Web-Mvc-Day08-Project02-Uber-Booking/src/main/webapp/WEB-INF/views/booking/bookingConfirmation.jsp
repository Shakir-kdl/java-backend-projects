<%@ page language="java" contentType="text/html; charset=UTF-8"
   isELIgnored= "false" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Booking Confirmed</title>

<style>
    body {
        font-family: Arial, Helvetica, sans-serif;
        background: #f5f5f5;
        height: 100vh;
        margin: 0;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .card {
        background: #ffffff;
        padding: 35px 45px;
        border-radius: 14px;
        box-shadow: 0 10px 25px rgba(0,0,0,0.2);
        width: 380px;
        text-align: center;
    }

    .card h2 {
        color: #000;
        margin-bottom: 12px;
    }

    .success {
        font-size: 16px;
        color: #2e7d32;
        margin-bottom: 22px;
    }

    .label {
        font-size: 14px;
        color: #555;
        margin-bottom: 6px;
    }

    .code {
        font-size: 22px;
        font-weight: bold;
        background: #000;
        color: #fff;
        padding: 12px;
        border-radius: 8px;
        letter-spacing: 2px;
        margin-bottom: 25px;
    }

    .home-link {
        text-decoration: none;
        color: #fff;
        background: #000;
        padding: 12px 22px;
        border-radius: 8px;
        font-weight: bold;
        display: inline-block;
        font-size: 15px;
    }

    .home-link:hover {
        background: #333;
    }
</style>
</head>

<body>

<div class="card">
    <h2>Uber Ride Confirmed</h2>

    <div class="success">
        Your ride has been booked successfully.
    </div>

    <div class="label">Booking Code</div>
    <div class="code">
        ${bookingConfirmationCode}
    </div>

    <a href="viewBooking" >
        Book Another Ride
    </a>
</div>

</body>
</html>
