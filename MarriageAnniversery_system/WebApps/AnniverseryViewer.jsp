<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Marriage Anniversery viewer</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <style>
        body{
        background-color: pink;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Marriage Anniversery</a>
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
    <form action="search" method="get">
        <div class="col-md-6">
            <label class="form-label">MarriageId</label>
            <input type="text" name="marriageId" class="form-control" required placeholder="enter marriageId">
        </div>
        <div class="col-12 text-center mt-4">
            <input type="submit" value="Search" class="btn btn-success btn-lg px-5">
        </div>
    </form>

    <br>
    <span style="color:red;">${failure}</span>
    <br><br>
    <p>CouplesName: ${dto.couplesName}</p>
    <p>YearOfTogetherness: ${dto.yearOfTogetherness}</p>
    <p>Venue: ${dto.venue}</p>
    <p>NumberOfGuests: ${dto.numberOfGuests }</p>
    <p>ContactNumber: ${dto.contactNumber}</p>
</div>
</body>
</html>