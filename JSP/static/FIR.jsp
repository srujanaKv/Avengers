<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>FIR</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar navbar-dark bg-primary">
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
<div align=center>
<h1>FIR details</h1>
<form action="FIR" method="post">
 Name:<input type="text" placeholder="enter name" name="Name"><br>
 Age:<input type="age" placeholder="enter age" name="Age"><br>
 CrimeDetails:<input type="Crime" placeholder="enter crime scene" name="CrimeDetails"><br>
 Location:<input type="location" placeholder="enter location" name="Location"><br>
 <input type="submit" value="submit crime">
 </form>
 </div>
 </body>
 </html>
