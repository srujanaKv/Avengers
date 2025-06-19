<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Marriage Anniversery Event</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <style>
        body {
          background-color: pink;
          overflow-x: hidden;
          position: relative;
        }

        .navbar-custom {
          background-color: #2d572c;
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
        }

        h1 {
          text-align: center;
          margin-bottom: 30px;
          color: #2d572c;
          font-weight: bold;
        }
    </style>
</head>
<body>
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
