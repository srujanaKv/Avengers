package com.java.internal.cloud.external20;

import com.java.internal.cloud.internal20.Cloud;
import com.java.internal.cloud.internal20.StormCloud;

public class WeatherStation {

    public void forecastWeather(Cloud cloud) {
        if (cloud != null) {
            cloud.Rain();
            if (cloud instanceof StormCloud) {
                StormCloud storm = (StormCloud) cloud;
                storm.Thunder();
            } else {
                System.err.println("This is not a StormCloud");
            }
        } else {
            System.err.println("Cloud object is null");
        }
    }
}
