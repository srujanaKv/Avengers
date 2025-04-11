package com.java.internal.Icecream.internal1;

public class Items extends Icecream {
    @Override
   public void Flavour(){
        System.out.println("Icecream have Flavour");
    }
    public void fruitsalad(){
        System.out.println("fruitsalad is running in items");
        super.Flavour();
    }
}
