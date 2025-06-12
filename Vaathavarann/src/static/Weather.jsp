<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Vaathavaran - Weather Entry</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="text-center mb-4">Enter Weather Details</h2>
    <form action="weather" method="post">
        <div class="mb-3">
            <label class="form-label">Place Name</label>
            <input type="text" name="place" class="form-control" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Weather</label>
            <input type="text" name="weather" class="form-control" required>
        </div>
        <div class="row mb-3">
            <div class="col">
                <label class="form-label">Min Temp (°C)</label>
                <input type="number" name="minTemp" class="form-control" required>
            </div>
            <div class="col">
                <label class="form-label">Max Temp (°C)</label>
                <input type="number" name="maxTemp" class="form-control" required>
            </div>
        </div>
        <div class="mb-3">
            <label class="form-label">Cloudy</label>
            <input type="text" name="cloudy" class="form-control">
        </div>
        <div class="mb-3">
            <label class="form-label">Raining</label>
            <input type="text" name="raining" class="form-control">
        </div>
        <div class="mb-3">
            <label class="form-label">Rain in mm</label>
            <input type="number" name="rainMM" class="form-control">
        </div>
        <div class="mb-3">
            <label class="form-label">Humidity (%)</label>
            <input type="number" name="humidity" class="form-control">
        </div>
        <div class="mb-3">
            <label class="form-label">Wind Speed (km/h)</label>
            <input type="number" name="windSpeed" class="form-control">
        </div>
        <div class="mb-3">
            <label class="form-label">Sun Rise Time</label>
            <input type="time" name="sunrise" class="form-control">
        </div>
        <div class="mb-3">
            <label class="form-label">Sun Set Time</label>
            <input type="time" name="sunset" class="form-control">
        </div>
        <div class="mb-3">
            <label class="form-label">Moon Rise Time</label>
            <input type="time" name="moonrise" class="form-control">
        </div>
        <div class="mb-3">
            <label class="form-label">Moon Set Time</label>
            <input type="time" name="moonset" class="form-control">
        </div>
        <div class="mb-3">
            <label class="form-label">Rain Start Time</label>
            <input type="time" name="rainStart" class="form-control">
        </div>
        <div class="mb-3">
            <label class="form-label">Rain End Time</label>
            <input type="time" name="rainEnd" class="form-control">
        </div>
        <div class="mb-3">
            <label class="form-label">Precipitation (%)</label>
            <input type="number" name="precipitation" class="form-control">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>

