<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Uber Ride</title>

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

    .container {
        background: #ffffff;
        padding: 40px;
        border-radius: 14px;
        width: 440px;
        text-align: center;
        box-shadow: 0 12px 25px rgba(0,0,0,0.2);
    }

    h2 {
        margin-bottom: 6px;
        font-size: 26px;
    }

    .tagline {
        color: #555;
        margin-bottom: 30px;
    }

    .rides {
        display: flex;
        justify-content: space-between;
        margin-bottom: 30px;
    }

    .ride-card {
        width: 120px;
        padding: 20px 10px;
        border-radius: 12px;
        background: #f2f2f2;
        font-weight: bold;
        cursor: pointer;
        transition: 0.3s;
    }

    .ride-card:hover {
        background: #000;
        color: #fff;
        transform: translateY(-5px);
    }

    .ride-icon {
        font-size: 22px;
        margin-bottom: 8px;
        letter-spacing: 1px;
    }

    .book-btn {
        display: inline-block;
        text-decoration: none;
        background: #000;
        color: #fff;
        padding: 14px 26px;
        border-radius: 8px;
        font-size: 16px;
        font-weight: bold;
    }

    .book-btn:hover {
        background: #333;
    }
</style>
</head>

<body>

<div class="container">
    <h2>Welcome to Uber Ride</h2>
    <div class="tagline">
        Go anywhere. Get a ride in minutes.
    </div>

    <div class="rides">
        <div class="ride-card">
            <div class="ride-icon">BIKE</div>
            Bike
        </div>
        <div class="ride-card">
            <div class="ride-icon">CAR</div>
            Car
        </div>
        <div class="ride-card">
            <div class="ride-icon">AUTO</div>
            Auto
        </div>
    </div>

    <a href="viewBooking" class="book-btn">
        Book a Ride
    </a>
</div>

</body>
</html>
