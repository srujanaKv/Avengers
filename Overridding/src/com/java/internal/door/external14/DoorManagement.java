package com.java.internal.door.external14;

import com.java.internal.door.internal14.Door;
import com.java.internal.door.internal14.Gate;

public class DoorManagement {

    public void manageDoor(Door entryPoint) {
        if (entryPoint != null) {
            entryPoint.Open();
            if (entryPoint instanceof Gate) {
                Gate gate = (Gate) entryPoint;
                gate.Lock();
            } else {
                System.err.println("This is not a Gate");
            }
        } else {
            System.err.println("Door object is null");
        }
    }
}
