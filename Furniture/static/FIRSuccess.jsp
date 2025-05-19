<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>FIR Submitted</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="text-center text-success">FIR Submitted Successfully</h2>
    <table class="table table-bordered mt-4">
        <thead class="table-dark">
        <tr>
            <th>Complainant Name</th>
            <th>FIR Number</th>
            <th>Crime Type</th>
            <th>Police Station</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>${firDto.complainantName}</td>
            <td>${firDto.firNumber}</td>
            <td>${firDto.crimeType}</td>
            <td>${firDto.policeStation}</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
