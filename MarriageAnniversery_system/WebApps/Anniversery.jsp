<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Marriage Anniversery Event</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <style>
        .animated-bg {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    z-index: 0;
    background-repeat: repeat;
    background-size: 300px auto;
    background-position: center;
    opacity: 0.15; /* so it doesn’t overpower the form */
    pointer-events: none;
    animation: scrollBackground 60s linear infinite;
}

@keyframes scrollBackground {
    from { background-position: 0 0; }
    to { background-position: 1000px 1000px; }
}


     body {
         background-color: pink;
         overflow-x: hidden;
         position: relative;
         animation: backgroundFade 5s ease-in-out infinite alternate;
     }

     @keyframes backgroundFade {
         from { background-color: #ffc0cb; }
         to { background-color: #ffb6c1; }
     }

     .navbar-custom {
         background-color: #2d572c;
         animation: slideDown 1s ease-out;
     }

     .navbar-custom .navbar-brand,
     .navbar-custom .nav-link {
         color: #fff;
     }

     .navbar-custom .nav-link:hover {
         color: #f0e68c;
     }

     .form-container {
         max-width: 600px;
         margin: 60px auto;
         background: rgba(255, 255, 255, 0.95);
         padding: 30px;
         border-radius: 20px;
         box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
         position: relative;
         z-index: 10;
         animation: fadeInZoom 1.2s ease-in-out;
     }

     h1 {
         text-align: center;
         margin-bottom: 30px;
         color: #2d572c;
         font-weight: bold;
         animation: popIn 1s ease-in-out;
     }

     input[type="submit"] {
         transition: transform 0.3s ease;
     }

     input[type="submit"]:hover {
         transform: scale(1.05);
         animation: bounce 0.5s;
     }

     @keyframes fadeInZoom {
         0% {
             opacity: 0;
             transform: scale(0.9) translateY(20px);
         }
         100% {
             opacity: 1;
             transform: scale(1) translateY(0);
         }
     }

     @keyframes popIn {
         0% {
             opacity: 0;
             transform: scale(0.8);
         }
         100% {
             opacity: 1;
             transform: scale(1);
         }
     }

     @keyframes slideDown {
         0% {
             transform: translateY(-100%);
             opacity: 0;
         }
         100% {
             transform: translateY(0);
             opacity: 1;
         }
     }

     @keyframes bounce {
         0%, 100% {
             transform: translateY(0);
         }
         50% {
             transform: translateY(-8px);
         }
     }

    </style>
</head>
<body>
<div class="animated-bg" style="background-image: url('https://i.pinimg.com/736x/8b/b4/b3/8bb4b348ef48489fa1620e38bf46aa74.jpg');"></div>
<div class="animated-bg" style="background-image: url('https://i.pinimg.com/1200x/e2/a3/ac/e2a3acad263841fce46243e33c5d5d86.jpg');"></div>


<nav class="navbar navbar-expand-lg navbar-custom">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Marriage Anniversery Event</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp"> Go Home</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="form-container">

    <h1>Just Chill Your Anniversery!!</h1>

    <span style="color:green;">${success}</span>
    <span style="color:red;">${failure}</span>

    <form action="Marriage" method="post">
        <div class="mb-3">
            <label class="form-label">Couples Name</label>
            <input type="text" class="form-control" name="CouplesName">
        </div>
        <div class="mb-3">
            <label class="form-label">Year Of Togetherness</label>
            <input type="number" class="form-control" name="YearOfTogetherness">
        </div>
        <div class="mb-3">
            <label class="form-label">Venue</label><br>
            <input type="text" class="form-control" name="Venue">  </div>
        <div class="mb-3">
            <label class="form-label">Number of Guests</label><br>
            <input type="number" class="form-control" name="NumberOfGuests">
        </div>
        <div class="mb-3">
            <label class="form-label">Contact Number</label>
            <input type="tel" class="form-control" name="ContactNumber">
        </div>
        <div class="text-center">
            <input type="submit" value="Book" class="btn btn-success px-4">
        </div>
    </form>
</div>

</body>
</html>
