<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>EarthWorm viewer</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-custom">
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
<form action="Search" method="get">
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