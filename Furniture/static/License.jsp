<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>License Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        html, body {
            height: 100%;
            margin: 0;
            background: linear-gradient(to right, #d0eaff, #f0f8ff); /* Light blue gradient */
        }

        body {
            display: flex;
            flex-direction: column;
        }

        .content {
            flex: 1;
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 40px 0;
        }

        .footer {
            background-color: #001f3f;
            color: white;
            text-align: center;
            padding: 1rem 0;
        }

        .navbar {
            background-color: #001f3f !important; /* Dark blue */
        }

        .navbar-brand, .nav-link {
            color: white !important;
        }

        .navbar-nav {
            flex-direction: row;
        }

        .nav-link {
            margin-left: 1rem;
        }

        .form-container {
            background-color: white;
            border: 2px solid #0056b3;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
            padding: 30px;
        }

        .form-title {
            color: #0056b3;
            font-weight: bold;
        }

        .btn-submit {
            background-color: #007bff;
            border: none;
        }

        .btn-submit:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand fw-bold" href="#">X-WORKZ</a>
        <div class="collapse navbar-collapse show">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Furniture.jsp">Furniture</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="License.jsp">License</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Main Content -->
<div class="content">
    <div class="container w-50 form-container">
        <h2 class="text-center form-title mb-4">License Details</h2>
        <form action="License" method="post">
            <div class="mb-3">
                <label class="form-label">Holder Name</label>
                <input type="text" class="form-control" name="HolderName" required>
            </div>
            <div class="mb-3">
                <label class="form-label">License Number</label>
                <input type="text" class="form-control" name="LicenseNumber" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Vehicle Type</label>
                <input type="text" class="form-control" name="VehicleType" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Expiry Date</label>
                <input type="date" class="form-control" name="ExpiryDate" required>
            </div>
            <button type="submit" class="btn btn-submit w-100 text-white">Submit</button>
        </form>
    </div>
</div>

<!-- Footer -->
<footer class="footer">
    <div class="container">
        <span>© 2025 X-WORKZ. All rights reserved.</span>
    </div>
</footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
