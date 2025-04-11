package com.java.internal.earphone.internal59;

public class BluetoothEarphone extends Earphone {
    @Override
    public void Connect() {
        System.out.println("running connect");
    }

    public void Charge() {
        System.out.println("running charge in bluetooth earphone");
        super.Connect();
    }
}
