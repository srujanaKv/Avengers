package com.java.internal.weather.external31;

import com.java.internal.weather.internal31.Weather;
import com.java.internal.weather.internal31.Rainy;

public class WeatherRunner {

    public void action(Weather weather) {
        if (weather != null) {
            weather.Change();
            if (weather instanceof Rainy) {
                Rainy rainy = (Rainy) weather;
                rainy.Wet();
            }
        } else {
            System.out.println("No weather to act upon.");
        }
    }}

