<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Furniture Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        html, body {
            height: 100%;
            margin: 0;
            background: linear-gradient(to right, #ffe3e3, #ffd6f6); /* Soft pink gradient */
        }

        body {
            display: flex;
            flex-direction: column;
        }

        .navbar {
            background-color: #c2185b !important; /* Deep pink */
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

        .content {
            flex: 1;
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 40px 0;
        }

        .form-container {
            background-color: white;
            border: 2px solid #ad1457;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
            padding: 30px;
        }

        .form-title {
            color: #ad1457;
            font-weight: bold;
            text-align: center;
        }

        .btn-submit {
            background-color: #d81b60;
            border: none;
        }

        .btn-submit:hover {
            background-color: #ad1457;
        }

        .footer {
            background-color: #880e4f;
            color: white;
            text-align: center;
            padding: 1rem 0;
        }
    </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand fw-bold" href="#">X-WORKZ</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse show" id="navbarNavAltMarkup">
            <div class="navbar-nav ms-auto">
                <a class="nav-link" href="index.jsp">Home</a>
                <a class="nav-link active" href="Furniture.jsp">Furniture</a>
                <a class="nav-link" href="License.jsp">License</a>
            </div>
        </div>
    </div>
</nav>

<!-- Main Content -->
<div class="content">
    <div class="container w-50 form-container">
        <h2 class="form-title mb-4">Furniture Details</h2>
        <form action="Furniture" method="post">
            <div class="mb-3">
                <label class="form-label">Brand</label>
                <input type="text" class="form-control" placeholder="Enter brand" name="Brand" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Size</label>
                <input type="text" class="form-control" placeholder="Enter size" name="Size" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Model Name</label>
                <input type="text" class="form-control" placeholder="Enter model name" name="ModelName" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Product Benefits</label>
                <input type="text" class="form-control" placeholder="Enter benefits" name="ProductBenefits" required>
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

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
