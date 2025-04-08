package com.sruj.external;

import com.sruj.internal.Drone;

public class DroneDelivery {
    public void send() {
        Drone drone = new Drone();
        drone.fly();
        System.out.println("Sending drone delivery");
    }

}
