<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ola Cabs</title>

<style>
    body {
        margin: 0;
        font-family: Arial, Helvetica, sans-serif;
        background: #ffffff;
        color: #000;
    }

    /* HEADER */
    .header {
        display: flex;
        justify-content: space-between;
        align-items: center;
        padding: 16px 40px;
        border-bottom: 1px solid #e5e5e5;
    }

    .logo {
        font-size: 26px;
        font-weight: bold;
        color: #1bbd36;
    }

    .nav a {
        margin-left: 25px;
        text-decoration: none;
        color: #000;
        font-weight: 500;
    }

    /* HERO */
    .hero {
        padding: 60px 40px;
        background: #f7f7f7;
    }

    .hero h1 {
        font-size: 40px;
        margin-bottom: 10px;
    }

    .hero p {
        font-size: 16px;
        color: #555;
        margin-bottom: 30px;
    }

    /* RIDES */
    .rides {
        display: flex;
        gap: 20px;
        margin-top: 20px;
    }

    .ride-card {
        border: 1px solid #e0e0e0;
        border-radius: 12px;
        padding: 20px;
        width: 180px;
        cursor: pointer;
        transition: 0.3s;
    }

    .ride-card:hover {
        border-color: #1bbd36;
        box-shadow: 0 6px 15px rgba(0,0,0,0.1);
    }

    .ride-title {
        font-size: 18px;
        font-weight: bold;
        margin-bottom: 6px;
    }

    .ride-desc {
        font-size: 13px;
        color: #666;
    }

    /* CTA */
    .cta {
        margin-top: 40px;
    }

    .book-btn {
        display: inline-block;
        padding: 14px 30px;
        background: #1bbd36;
        color: #fff;
        text-decoration: none;
        border-radius: 6px;
        font-size: 16px;
        font-weight: bold;
    }

    .book-btn:hover {
        background: #159b2c;
    }
</style>
</head>

<body>

<!-- HEADER -->
<div class="header">
    <div class="logo">OLA</div>
    <div class="nav">
        <a href="#">Ola Electric</a>
        <a href="#">Ola Maps</a>
        <a href="#">Support</a>
    </div>
</div>

<!-- HERO SECTION -->
<div class="hero">
    <h1>Moving people, and the world</h1>
    <p>Book a cab, auto, or bike ride in minutes.</p>

    <!-- RIDE OPTIONS -->
    <div class="rides">
        <div class="ride-card">
            <div class="ride-title">Bike</div>
            <div class="ride-desc">Quick and affordable rides</div>
        </div>

        <div class="ride-card">
            <div class="ride-title">Auto</div>
            <div class="ride-desc">Everyday city travel</div>
        </div>

        <div class="ride-card">
            <div class="ride-title">Car</div>
            <div class="ride-desc">Comfortable city rides</div>
        </div>
    </div>

    <!-- BOOK BUTTON -->
    <div class="cta">
        <a href="viewBooking" class="book-btn">
            Book a Ride
        </a>
    </div>
</div>

</body>
</html>
