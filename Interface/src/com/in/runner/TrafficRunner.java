package com.in.runner;

import com.in.external.Signal;
import com.in.internal.Traffic;

public class TrafficRunner {
    public static void main(String[] args) {

        Traffic traffic=new Signal();
        Signal signal=new Signal();

        traffic.stop();
        signal.stop();
    }
}
