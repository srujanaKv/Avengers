<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>FIR Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #fff3e0;
            min-height: 100vh;
            display: flex;
            flex-direction: column;
        }
        footer {
            margin-top: auto;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #ffcc80;">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">X-WORKZ</a>
        <div class="navbar-nav">
            <a class="nav-link" href="index.jsp">Home</a>
            <a class="nav-link" href="Furniture.jsp">Furniture</a>
            <a class="nav-link" href="License.jsp">License</a>
            <a class="nav-link active" href="FIR.jsp">FIR</a>
        </div>
    </div>
</nav>

<div class="container mt-5 w-50">
    <h2 class="text-center">FIR Details</h2>
    <form action="FIR" method="post">
        <div class="mb-3">
            <label class="form-label">Complainant Name</label>
            <input type="text" class="form-control" name="ComplainantName" required>
        </div>
        <div class="mb-3">
            <label class="form-label">FIR Number</label>
            <input type="text" class="form-control" name="FIRNumber" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Crime Type</label>
            <input type="text" class="form-control" name="CrimeType" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Police Station</label>
            <input type="text" class="form-control" name="PoliceStation" required>
        </div>
        <button type="submit" class="btn btn-warning w-100">Submit</button>
    </form>
</div>

<footer class="bg-dark text-white text-center p-3">
    &copy; 2025 X-WORKZ. All rights reserved.
</footer>
</body>
</html>
