<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>FIR</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        body {
      background-color: pink;
      display: flex;
      flex-direction: column;
      min-height: 100vh;
    }
    .content {
      flex: 1;
    }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                <a class="nav-link" href="FIR.jsp">FIR</a>
            </div>
        </div>
    </div>
</nav>
<!--<div align=center>
<h1>FIR details</h1>
<form action="FIR" method="post">
 Name:<input type="text" placeholder="enter name" name="Name"><br>
 Age:<input type="age" placeholder="enter age" name="Age"><br>
 CrimeDetails:<input type="Crime" placeholder="enter crime scene" name="CrimeDetails"><br>
 Location:<input type="location" placeholder="enter location" name="Location"><br>
 <input type="submit" value="submit crime">
 </form>
 </div>-->
<div class="container w-50 mx-auto mt-5">
    <form class="border p-4 rounded shadow bg-white">
        <h1>FIR DETAILS</h1>
<form action="FIR" method="post">
    <div class="mb-3">
        <label for="exampleInputName" class="form-label">Name</label>
        <input type="Name" class="form-control" id="exampleInputName" aria-describedby="emailHelp">
        <!--<div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>-->
    </div>
    <div class="mb-3">
        <label for="exampleInputAge" class="form-label">Age</label>
        <input type="Age" class="form-control" id="exampleInputAge">
    </div>
    <div class="mb-3">
        <label for="exampleInputCrime" class="form-label">Crimedetails</label>
        <input type="CrimeDetails" class="form-control" id="exampleInputCrime">
    </div>
    <div class="mb-3">
        <label for="exampleInputLocation" class="form-label">Location</label>
        <input type="Location" class="form-control" id="exampleInputLocation">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</form>
    <footer class="bg-dark text-white text-center py-3 mt-auto">
        &copy; 2025 JSP Forms Portal. All rights reserved.
    </footer>
</body>
</html>
