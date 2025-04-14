package com.java.internal.camera.external34;

import com.java.internal.camera.internal34.Camera;
import com.java.internal.camera.internal34.DSLR;

public class CameraKit {

    public void operate(Camera device) {
        if (device != null) {
            device.Capture();
            if (device instanceof DSLR) {
                DSLR digitalSLR = (DSLR) device;
                digitalSLR.Focus();
            } else {
                System.err.println("This is not a DSLR");
            }
        } else {
            System.err.println("Camera is null");
        }
    }
}
