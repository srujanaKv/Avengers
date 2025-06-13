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
<div>
    <h1>EarthWorm History</h1>
    <h2>${message}</h2>
    <p><strong>ScientificName:</strong>${earthWormDto.ScientificName}</p>
    <p><strong>BodyShape:</strong>${earthWormDto.BodyShape}</p>
    <p><strong>Color:</strong>${earthWormDto.Color}</p>
    <p><strong>n_female:</strong>${earthWormDto.n_female}</p>
    <p><strong>n_lifespan:</strong>${earthWormDto.n_lifespan}</p>
    <p><strong>Food:</strong>${earthWormDto.Food}</p>


</div>
</body>
</html>



