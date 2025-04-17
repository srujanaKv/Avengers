package com.java.internal.sun.internal12;

public class Sun {

    private String color;
    private int cost;
    protected Sun(String color,int cost){
        System.out.println("running inside the sun constructor");
        this.color=color;
        this.cost=cost;
    }
    public void Shine() {
        System.out.println("shine is running in sun");
    }
}
@Override
public String toString(){
    System.out.println("running inside the to string");
    return"cost:"+cost+"name:"+name;
}
}
