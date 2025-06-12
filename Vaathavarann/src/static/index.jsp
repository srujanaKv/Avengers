<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Vaathavaran - Weather Platform</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: linear-gradient(to right, #dce35b, #45b649);
            color: #333;
            font-family: 'Segoe UI', sans-serif;
        }
        .welcome {
            padding: 100px 0;
            text-align: center;
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
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-custom">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Vaathavaran</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="Weather.jsp">View Report</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Welcome section -->
<div class="welcome">
    <h1>Welcome to Vaathavaran Report platform</h1>
    <p class="lead">Monitor, Record and View weather conditions easily</p>
</div>
</body>
</html>
