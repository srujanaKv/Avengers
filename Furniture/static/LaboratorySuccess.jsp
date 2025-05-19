<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Laboratory Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="background-color: #e0f7fa;">
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">X-WORKZ</a>
    </div>
</nav>

<div class="container mt-5">
    <h2 class="text-center">Laboratory Submission Successful</h2>
    <table class="table table-bordered mt-4">
        <thead class="table-light">
        <tr>
            <th>Lab Name</th>
            <th>Location</th>
            <th>Specialization</th>
            <th>Head Scientist</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>${labDto.labName}</td>
            <td>${labDto.location}</td>
            <td>${labDto.specialization}</td>
            <td>${labDto.headScientist}</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
