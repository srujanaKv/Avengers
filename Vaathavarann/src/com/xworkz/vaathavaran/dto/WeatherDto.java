package com.xworkz.vaathavaran.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class WeatherDto implements Serializable {
    private String place;
    private String weather;
    private int minTemp;
    private int maxTemp;
    private String cloudy;
    private String raining;
    private int rainMM;
    private int humidity;
    private int windSpeed;
    private String sunrise;
    private String sunset;
    private String moonrise;
    private String moonset;
    private String rainStart;
    private String rainEnd;
    private int precipitation;
    private LocalDateTime createdAt = LocalDateTime.now();

    public WeatherDto() {}

    public WeatherDto(String place, String weather, int minTemp, int maxTemp, String cloudy, String raining,
                      int rainMM, int humidity, int windSpeed, String sunrise, String sunset, String moonrise,
                      String moonset, String rainStart, String rainEnd, int precipitation) {
        this.place = place;
        this.weather = weather;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.cloudy = cloudy;
        this.raining = raining;
        this.rainMM = rainMM;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.moonrise = moonrise;
        this.moonset = moonset;
        this.rainStart = rainStart;
        this.rainEnd = rainEnd;
        this.precipitation = precipitation;
    }

    public String getPlace() {
        return place;
    }

    public String getWeather() {
        return weather;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public String getCloudy() {
        return cloudy;
    }

    public String getRaining() {
        return raining;
    }

    public int getRainMM() {
        return rainMM;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public String getSunrise() {
        return sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public String getMoonrise() {
        return moonrise;
    }

    public String getMoonset() {
        return moonset;
    }

    public String getRainStart() {
        return rainStart;
    }

    public String getRainEnd() {
        return rainEnd;
    }

    public int getPrecipitation() {
        return precipitation;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

}

