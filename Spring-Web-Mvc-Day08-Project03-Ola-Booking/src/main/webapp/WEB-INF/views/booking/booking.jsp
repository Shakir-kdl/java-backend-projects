<%@ page language="java" contentType="text/html; charset=UTF-8"
   isELIgnored="false" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ola Booking</title>

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
        width: 420px;
        border-radius: 14px;
        box-shadow: 0 10px 25px rgba(0,0,0,0.2);
    }

    h2 {
        text-align: center;
        color: #1bbd36;
        margin-bottom: 25px;
    }

    label {
        font-weight: bold;
        font-size: 14px;
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

    .ride-types {
        display: flex;
        justify-content: space-between;
        margin-bottom: 20px;
    }

    .ride-types label {
        font-weight: normal;
        cursor: pointer;
    }

    .submit-btn {
        width: 100%;
        padding: 12px;
        background: #1bbd36;
        color: #fff;
        border: none;
        border-radius: 8px;
        font-size: 16px;
        font-weight: bold;
        cursor: pointer;
    }

    .submit-btn:hover {
        background: #159b2c;
    }
</style>
</head>

<body>

<div class="card">
    <h2>Book Your Ola Ride</h2>

    <form action="bookMyRide" method="post">

        <label>Pickup Location</label>
        <input type="text" name="source" placeholder="Enter pickup location" required>

        <label>Drop Location</label>
        <input type="text" name="destination" placeholder="Enter drop location" required>

        <label>Ride Type</label>
        <div class="ride-types">
            <label>
                <input type="radio" name="type" value="bike" required> Bike
            </label>
            <label>
                <input type="radio" name="type" value="auto"> Auto
            </label>
            <label>
                <input type="radio" name="type" value="car"> Car
            </label>
        </div>

        <input type="submit" value="Confirm Ride" class="submit-btn">

    </form>
</div>

</body>
</html>
