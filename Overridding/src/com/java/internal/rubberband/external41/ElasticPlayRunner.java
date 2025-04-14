package com.java.internal.rubberband.external41;

import com.java.internal.rubberband.internal41.Rubberband;
import com.java.internal.rubberband.internal41.ColorBand;

public class ElasticPlayRunner {

    public void action(Rubberband rubberband) {
        if (rubberband != null) {
            rubberband.Stretch();
            if (rubberband instanceof ColorBand) {
                ColorBand colorBand = (ColorBand) rubberband;
                colorBand.Bind();
            }
        } else {
            System.out.println("No rubberband to act upon.");
        }
    }
}
