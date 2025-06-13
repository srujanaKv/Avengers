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
        .body{
        background-image:url('https://meadowia.com/wp-content/uploads/2022/03/earthworms-eyes.jpg');
        background-size: cover;
        background-repeat: no-repeat;
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
        Scientific Name:<input type="Name" name="ScientificName"><br>
         Body Shape:<input type="Shape" name="BodyShape"><br>
         Color:<input type="Color" name="Color"><br>
         Female:
         <select name="Female">
             <option value="true">True</option>
             <option value="false">False</option>
         </select><br>
         Lifespan:<input type="number" name="lifespan"><br>
         Food:<input type="food" name="Food"><br>
         <input type="submit" value="submit">
     </form>
</div>

</body>
</html>