<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Donation</title>
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
                <a class="nav-link" href="Donation.jsp">Donation</a>
            </div>
        </div>
    </div>
</nav>
<div align="center">
    <h1>Donation details</h1>
    <form action="donation" method="post">
        Name:<br><input type="text" placeholder="enter your name" name="Name"><br>
        amount:<br><input type="number" placeholder="enter amount" name="Amount"><br>
        Cause:<br> <input type="cause" placeholder="enter cause" name="Cause"><br>
        PhoneNumber:<br> <input type="tel" placeholder="enter a valid number"name="phoneNumber"><br>
   <input type="submit" value="submit">

    </form>
</div>

</body>
</html>