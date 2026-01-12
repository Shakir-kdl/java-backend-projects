<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Uber Booking</title>

<style>
    body {
        margin: 0;
        height: 100vh;
        font-family: Arial, Helvetica, sans-serif;
        background: #f5f5f5;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .booking-card {
        background: #ffffff;
        padding: 35px 45px;
        border-radius: 14px;
        width: 380px;
        box-shadow: 0 12px 25px rgba(0,0,0,0.2);
    }

    .booking-card h2 {
        text-align: center;
        margin-bottom: 25px;
    }

    label {
        font-weight: bold;
        display: block;
        margin-bottom: 6px;
    }

    input[type="text"], select {
        width: 100%;
        padding: 10px;
        border-radius: 6px;
        border: 1px solid #ccc;
        margin-bottom: 18px;
        font-size: 14px;
    }

    .submit-btn {
        width: 100%;
        padding: 12px;
        background: #000;
        color: #fff;
        border: none;
        border-radius: 8px;
        font-size: 16px;
        font-weight: bold;
        cursor: pointer;
    }

    .submit-btn:hover {
        background: #333;
    }
</style>
</head>

<body>

<div class="booking-card">
    <h2>Book Your Ride</h2>

    <form action="bookMyRide" method="post">

        <label>Source</label>
        <input type="text" name="source" placeholder="Enter pickup location" required>

        <label>Destination</label>
        <input type="text" name="destination" placeholder="Enter drop location" required>

        <label>Ride Type</label>
        <select name="type" required>
            <option value="">-- Select Ride Type --</option>
            <option value="bike">Bike</option>
            <option value="car">Car</option>
            <option value="auto">Auto</option>
        </select>

        <input type="submit" value="Book Ride" class="submit-btn">
    </form>
</div>

</body>
</html>
