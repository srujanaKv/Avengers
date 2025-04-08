package com.sruj.external;

import com.sruj.internal.Perfume;

public class Gift {
    public void give() {
        Perfume perfume = new Perfume();
        perfume.spray();
        System.out.println("Gifting perfume");
    }
}


