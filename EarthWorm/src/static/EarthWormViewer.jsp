<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>EarthWorm viewer</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <style>
        body{
        background-color: maroon;
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
<img src="https://static.vecteezy.com/system/resources/previews/000/120/279/non_2x/earthworm-character-vector.jpg" class="animated-worm worm1" />
<img src="https://t3.ftcdn.net/jpg/00/71/86/20/360_F_71862060_Jxkd0MT9iuzgntzis1PVBFlxDNMVTXnd.jpg" class="animated-worm worm2" />
<img src="https://t4.ftcdn.net/jpg/11/57/25/85/360_F_1157258524_wLhQ4aBoLv95usO6ypIB9NzdMSuy8lhY.jpg" class="animated-worm worm3" />
<img src="https://img.freepik.com/free-vector/set-worm-character_1308-24803.jpg?semt=ais_hybrid&w=740" class="animated-worm worm4" />
<img src="https://t4.ftcdn.net/jpg/03/07/76/53/360_F_307765394_D9VtYGwoD1ZRJIkcXNMrgdpePV9HOkOR.jpg" class="animated-worm worm5" />
<img src="https://t3.ftcdn.net/jpg/00/71/86/20/360_F_71862060_Jxkd0MT9iuzgntzis1PVBFlxDNMVTXnd.jpg" class="animated-worm worm6" />

<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">EarthWorms World</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp"> Go Home </a>
                </li>
            </ul>
        </div>
    </div>
</nav>


<div class="container py-5">
<form action="EarthWorm" method="get">
    <div class="col-md-6">
        <label class="form-label">EarthWorm</label>
        <input type="text" name="EarthWormId" class="form-control" required placeholder="enter earthwormId">
    </div>
    <div class="col-12 text-center mt-4">
        <input type="submit" value="Search" class="btn btn-success btn-lg px-5">
    </div>

</form>
</div>
</body>
</html>