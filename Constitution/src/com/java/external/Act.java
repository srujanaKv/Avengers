package com.java.external;

import com.java.internal.Constitution;

public class Act implements Constitution {

    @Override
    public void law() {
        System.out.println("running law in act");
    }
}
