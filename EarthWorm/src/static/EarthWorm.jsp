<!Doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Earth-Worm</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
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
       body{
        background-color: Pink;
        }
    </style>
</head>
<body>
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
<div align="center">
    <h1>EarthWorm History</h1>
     <form action="EarthWorm" method="post">
        Scientific Name:<input type="text" name="ScientificName"><br>
         Body Shape:<input type="text" name="BodyShape"><br>
         Color:<input type="color" name="Color"><br>
         Female:
         <select type="text" name="Female">
             <option value="true">True</option>
             <option value="false">False</option>
         </select><br>
         Lifespan:<input type="number" name="lifespan"><br>
         Food:<input type="text" name="Food"><br>
         <input type="submit" value="submit">
     </form>
</div>

</body>
</html>