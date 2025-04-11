package com.java.internal.animal.internal3;

public class Domestic extends Animal{
    @Override
    public void Lion(){
        System.out.println("Lion is running in Domestic");
    }
    public void Dog(){
        System.out.println("Dog is running in Domestic");
        super.Lion();
    }

}
