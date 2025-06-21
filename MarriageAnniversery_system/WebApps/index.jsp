<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Marriage Anniversery</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          rel="stylesheet" crossorigin="anonymous">
    <style>
        body {
          margin: 0;
          padding: 0;
          min-height: 100vh;
          background: linear-gradient(135deg, #ffe0e6, #fff9f0); /* light double shade */
          background-attachment: fixed;
          background-size: cover;
          font-family: 'Segoe UI', sans-serif;
        }

        .navbar-custom {
          background-color: pink;
          animation: slideDown 1s ease-out;
        }

        .navbar-custom .navbar-brand,
        .navbar-custom .nav-link {
          color: #fff;
        }

        .navbar-custom .nav-link:hover {
          color: #f0e68c;
        }

        .center {
          padding: 100px 0;
          text-align: center;
          animation: fadeInZoom 1s ease-in-out;
        }

        .center h1 {
          color: white;
          font-weight: bold;
          text-shadow: 2px 2px 6px rgba(0, 0, 0, 0.8);
          background-color: rgba(0, 0, 0, 0.3);
          display: inline-block;
          padding: 20px 40px;
          border-radius: 12px;
          animation: popIn 1.5s ease-in-out;
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

        @keyframes fadeInZoom {
          0% {
            opacity: 0;
            transform: scale(0.95) translateY(20px);
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
    </style>
</head>

<body>
<nav class="navbar navbar-expand-lg navbar-custom">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Marriage Anniversery Event</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="Anniversery.jsp">View Details</a>
                    <a class="nav-link" href="AnniverseryViewer.jsp">Viewer</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="center">
    <h1>WELCOME TO MARRIAGE ANNIVERSERY PORTAL</h1>
</div>
</body>
</html>
