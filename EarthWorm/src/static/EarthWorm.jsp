<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Earth-Worm</title>
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

        .animated-worm {
          position: absolute;
          width: 100px;
          height: auto;
          z-index: 1;
          opacity: 0.6;
        }

        @keyframes moveWorm {
          0% { left: -150px; transform: rotate(0deg); }
          50% { transform: rotate(15deg); }
          100% { left: 110%; transform: rotate(-15deg); }
        }

        /* Unique animation speeds and positions */
        .worm1 { top: 10%; animation: moveWorm 20s linear infinite; }
        .worm2 { top: 30%; animation: moveWorm 25s linear infinite reverse; }
        .worm3 { top: 70%; animation: moveWorm 30s linear infinite; }
        .worm4 { top: 50%; animation: moveWorm 22s linear infinite reverse; }
        .worm5 { top: 20%; animation: moveWorm 28s linear infinite; }
        .worm6 { top: 80%; animation: moveWorm 26s linear infinite reverse; }
    </style>
</head>
<body>

<!-- 6 Animated Earthworms -->
<img src="https://static.vecteezy.com/system/resources/previews/000/120/279/non_2x/earthworm-character-vector.jpg" class="animated-worm worm1" />
<img src="https://t4.ftcdn.net/jpg/03/07/76/53/360_F_307765394_D9VtYGwoD1ZRJIkcXNMrgdpePV9HOkOR.jpg" class="animated-worm worm2" />
<img src="https://static.vecteezy.com/system/resources/previews/000/120/279/non_2x/earthworm-character-vector.jpg" class="animated-worm worm3" />
<img src="https://img.freepik.com/free-vector/set-worm-character_1308-24803.jpg?semt=ais_hybrid&w=740" class="animated-worm worm4" />
<img src="https://t4.ftcdn.net/jpg/03/07/76/53/360_F_307765394_D9VtYGwoD1ZRJIkcXNMrgdpePV9HOkOR.jpg" class="animated-worm worm5" />
<img src="https://static.vecteezy.com/system/resources/previews/000/120/279/non_2x/earthworm-character-vector.jpg" class="animated-worm worm6" />

<nav class="navbar navbar-expand-lg navbar-custom">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">EarthWorms World</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="EarthWorm.jsp">View Details</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="form-container">
    <h1>EarthWorm History</h1>
    <form action="EarthWorm" method="post">
        <div class="mb-3">
            <label class="form-label">Scientific Name</label>
            <input type="text" class="form-control" name="ScientificName">
        </div>
        <div class="mb-3">
            <label class="form-label">Body Shape</label>
            <input type="text" class="form-control" name="BodyShape">
        </div>
        <div class="mb-3">
            <label class="form-label">Color</label><br>
            <input type="color" class="form-control form-control-color" name="Color" title="Choose color">
        </div>
        <div class="mb-3">
            <label class="form-label">Female</label>
            <select class="form-select" name="Female">
                <option value="true">True</option>
                <option value="false">False</option>
            </select>
        </div>
        <div class="mb-3">
            <label class="form-label">Lifespan</label>
            <input type="number" class="form-control" name="lifespan">
        </div>
        <div class="mb-3">
            <label class="form-label">Food</label>
            <input type="text" class="form-control" name="Food">
        </div>
        <div class="text-center">
            <input type="submit" value="Submit" class="btn btn-success px-4">
        </div>
    </form>
</div>

</body>
</html>
