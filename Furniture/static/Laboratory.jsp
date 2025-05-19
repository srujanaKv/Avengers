<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Laboratory Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f0f8ff;
        }
        .form-container {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">X-WORKZ</a>
        <div class="navbar-nav ms-auto">
            <a class="nav-link" href="index.jsp">Home</a>
            <a class="nav-link" href="Furniture.jsp">Furniture</a>
            <a class="nav-link" href="License.jsp">License</a>
            <a class="nav-link active" href="Laboratory.jsp">Laboratory</a>
        </div>
    </div>
</nav>

<div class="container mt-5 w-50 form-container">
    <h2 class="text-center mb-4">Laboratory Details</h2>
    <form action="Laboratory" method="post">
        <div class="mb-3">
            <label class="form-label">Lab Name</label>
            <input type="text" class="form-control" name="LabName" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Location</label>
            <input type="text" class="form-control" name="Location" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Specialization</label>
            <input type="text" class="form-control" name="Specialization" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Head Scientist</label>
            <input type="text" class="form-control" name="HeadScientist" required>
        </div>
        <button type="submit" class="btn btn-primary w-100">Submit</button>
    </form>
</div>
</body>
</html>
