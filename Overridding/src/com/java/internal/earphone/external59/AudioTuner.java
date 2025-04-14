package com.java.internal.earphone.external59;

import com.java.internal.earphone.internal59.Earphone;
import com.java.internal.earphone.internal59.BluetoothEarphone;

public class AudioTuner {

    public void tune(Earphone device) {
        if (device != null) {
            device.Connect();
            if (device instanceof BluetoothEarphone) {
                BluetoothEarphone bt = (BluetoothEarphone) device;
                bt.Charge();
            } else {
                System.err.println("This earphone is not a Bluetooth model");
            }
        } else {
            System.err.println("Earphone is null");
        }
    }
}
