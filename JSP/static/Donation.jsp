<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Donation</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        body{
        Background-color: pink ;
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
                <a class="nav-link" href="Donation.jsp">Donation</a>
            </div>
        </div>
    </div>
</nav>
<!--<div align="center">
    <h1>Donation details</h1>
    <form action="donation" method="post">
        Name:<br><input type="text" placeholder="enter your name" name="Name"><br>
        amount:<br><input type="number" placeholder="enter amount" name="Amount"><br>
        Cause:<br> <input type="cause" placeholder="enter cause" name="Cause"><br>
        PhoneNumber:<br> <input type="tel" placeholder="enter a valid number"name="phoneNumber"><br>
   <input type="submit" value="submit">

    </form>
</div>-->
<div class="container w-50 mx-auto mt-5">
    <form class="border p-4 rounded shadow bg-white">
        <h1>DONATE HERE</h1>
<form action="Donation"method="post">
    <div class="mb-3">
        <label for="exampleInputName" class="form-label">Name</label>
        <input type="Name" class="form-control" id="exampleInputName" aria-describedby="emailHelp">
        <!--<div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>-->
    </div>
    <div class="mb-3">
        <label for="exampleInputamount" class="form-label">Amount</label>
        <input type="Amount" class="form-control" id="exampleInputamount">
    </div>
    <div class="mb-3">
        <label for="exampleInputcause" class="form-label">Cause</label>
        <input type="Cause" class="form-control" id="exampleInputcause">
    </div>
    <div class="mb-3">
        <label for="exampleInputphonenumber" class="form-label">PhoneNumber</label>
        <input type="PhoneNumber" class="form-control" id="exampleInputphonenumber">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
    </form>
    <div align="center">
        <h1>Thank You!</h1>
        <h2>${message}</h2>
        <p><strong>Name:</strong>${name}</p>
        <p><strong>Amount:</strong>${Amount}</p>
        <p><strong>Cause:</strong>${Cause}</p>
        <p><strong>Phone Number:</strong>${PhoneNumber}</p>
    </div>

</body>
</html>