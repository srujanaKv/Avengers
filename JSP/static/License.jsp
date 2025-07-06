<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>License</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
   body{
   background-color: pink;
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
                <a class="nav-link" href="License.jsp">License</a>

            </div>
        </div>
    </div>
</nav>
<div align=center>
<h1>License details</h1>
<form action="License" method="post">
 Name:<input type="text" placeholder="enter name" name="Name"><br>
 Age:<input type="age" placeholder="enter age" name="Age"><br>
 PhoneNumber:<input type="tel" placeholder= "enter number" name="PhoneNumber"><br>
 License type:<input type="License" placeholder="enter License" name="LicenseType"><br>
 Address:<input type="address" placeholder="enter address" name="Address"><br>
 <input type="submit" value="submit">
 </form>
 </div>
<div class="container w-50 mx-auto mt-5">
    <form class="border p-4 rounded shadow bg-white">
        <h1>GRAB YOUR LICENSE</h1>

<form action="License" method="post">
    <div class="mb-3">
        <label for="exampleInputName" class="form-label">Name</label>
        <input type="Name" class="form-control" id="exampleInputName" aria-describedby="emailHelp">-->
        <!--<div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>-->
   </div>
    <div class="mb-3">
        <label for="exampleInputAge" class="form-label">Age</label>
        <input type="Age" class="form-control" id="exampleInputAge">
    </div>
    <div class="mb-3">
        <label for="exampleInputPhonenumber" class="form-label">PhoneNumber</label>
        <input type="PhoneNumber" class="form-control" id="exampleInputPhonenumber">
    </div>
    <div class="mb-3">
        <label for="exampleInputLicense" class="form-label">LicenseType</label>
        <input type="LicenseType" class="form-control" id="exampleInputLicense">
    </div>
    <div class="mb-3">
        <label for="exampleInputAddress" class="form-label">Address</label>
        <input type="Address" class="form-control" id="exampleInputAddress">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
    </form>
</div>
 </body>
 </html>
