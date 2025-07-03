<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.xworkz.vaathavaran.dto.WeatherDto" %>
<html>
<head>
    <title>Weather Submitted</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h3 class="text-success">Weather data submitted successfully!</h3>
    <%
    WeatherDTO dto = (WeatherDTO) request.getAttribute("weatherDTO");
    if (dto != null) {
    %>
    <table class="table table-bordered mt-4">
        <tr><th>Place</th><td><%= dto.getPlace() %></td></tr>
        <tr><th>Weather</th><td><%= dto.getWeather() %></td></tr>
        <tr><th>Min Temp</th><td><%= dto.getMinTemp() %></td></tr>
        <tr><th>Max Temp</th><td><%= dto.getMaxTemp() %></td></tr>
        <tr><th>Cloudy</th><td><%= dto.getCloudy() %></td></tr>
        <tr><th>Raining</th><td><%= dto.getRaining() %></td></tr>
        <tr><th>Rain MM</th><td><%= dto.getRainMM() %></td></tr>
        <tr><th>Humidity</th><td><%= dto.getHumidity() %></td></tr>
        <tr><th>Wind Speed</th><td><%= dto.getWindSpeed() %></td></tr>
        <tr><th>Sunrise</th><td><%= dto.getSunrise() %></td></tr>
        <tr><th>Sunset</th><td><%= dto.getSunset() %></td></tr>
        <tr><th>Moonrise</th><td><%= dto.getMoonrise() %></td></tr>
        <tr><th>Moonset</th><td><%= dto.getMoonset() %></td></tr>
        <tr><th>Rain Start</th><td><%= dto.getRainStart() %></td></tr>
        <tr><th>Rain End</th><td><%= dto.getRainEnd() %></td></tr>
        <tr><th>Precipitation</th><td><%= dto.getPrecipitation() %></td></tr>
    </table>
    <%
    }
    %>
</div>
</body>
</html>
