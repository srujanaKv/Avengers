<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>License Submitted</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h3 class="text-success text-center">License Submitted Successfully</h3>
    <table class="table table-bordered mt-3">
        <thead>
        <tr>
            <th>Holder Name</th>
            <th>License Number</th>
            <th>Vehicle Type</th>
            <th>Expiry Date</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>${licenseDto.holderName}</td>
            <td>${licenseDto.licenseNumber}</td>
            <td>${licenseDto.vehicleType}</td>
            <td>${licenseDto.expiryDate}</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
