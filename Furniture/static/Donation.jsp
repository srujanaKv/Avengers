<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Donation Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #fff0f5;
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
            <a class="nav-link" href="Laboratory.jsp">Laboratory</a>
            <a class="nav-link active" href="Donation.jsp">Donation</a>
        </div>
    </div>
</nav>

<div class="container mt-5 w-50 form-container">
    <h2 class="text-center mb-4">Donation Details</h2>
    <form action="Donation" method="post">
        <div class="mb-3">
            <label class="form-label">Donor Name</label>
            <input type="text" class="form-control" name="DonorName" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Donation Amount</label>
            <input type="number" class="form-control" name="Amount" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Donation Date</label>
            <input type="date" class="form-control" name="Date" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Purpose</label>
            <input type="text" class="form-control" name="Purpose" required>
        </div>
        <button type="submit" class="btn btn-success w-100">Submit</button>
    </form>
</div>
</body>
</html>
