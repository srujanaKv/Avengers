package com.in.external;

import com.in.internal.Traffic;

public class Signal implements Traffic {

    @Override
    public void stop() {
        System.out.println("stop is running in signal");
    }
}
