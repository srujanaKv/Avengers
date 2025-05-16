<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Feedback</title>
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
                <a class="nav-link" href="Feedback.jsp">Feedback</a>

            </div>
        </div>
    </div>
</nav>
<!--<div align=center>
<h1>Give your Honest Feedback</h1>
<form action="Feedback" method="post">
 Name:<input type="text" placeholder="enter name" name="Name"><br>
 Email:<input type="email" placeholder="enter email" name="Email"><br>
 PhoneNumber:<input type="tel" placeholder="enter number" name="PhoneNumber"><br>
 Feedback:<input type="feedback" placeholder="enter Feedback" name="Feedback"><br>
 <input type="submit" value="submit">
 </form>
 </div>-->
<div class="container w-50 mx-auto mt-5">
    <form class="border p-4 rounded shadow bg-white">
        <h1>Give Your Honest feedback</h1>
<form action="Feedback" method="post">
    <div class="mb-3">
        <label for="exampleInputName" class="form-label">Name</label>
        <input type="Name" class="form-control" id="exampleInputName" aria-describedby="emailHelp">
        <!--<div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>-->
    </div>
    <div class="mb-3">
        <label for="exampleInputEmail" class="form-label">Email</label>
        <input type="Email" class="form-control" id="exampleInputEmail">
    </div>
    <div class="mb-3">
        <label for="exampleInputPhonenumber" class="form-label">PhoneNumber</label>
        <input type="PhoneNumber" class="form-control" id="exampleInputPhonenumber">
    </div>
    <div class="mb-3">
        <label for="exampleInputFeedback" class="form-label">Feedback</label>
        <input type="Feedback" class="form-control" id="exampleInputFeedback">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</form>
    <footer class="bg-dark text-white text-center py-3 mt-auto">
        &copy; 2025 JSP Forms Portal. All rights reserved.
    </footer>
 </body>
 </html>
