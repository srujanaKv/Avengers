package com.java.internal.amoeba.internal96;

public class Amoeba {
    private int cost;
    private String name;
    protected Amoeba(int cost,String name) {
        System.out.println("running inside the Amoeba const");
        this.cost = cost;
        this.name = name;
    }
    public void Reproduce() {

        System.out.println("reproduce is running in amoeba");
    }

    @Override

    public String toString(){
        System.out.println("running inside the to string");
        return"cost:"+cost+"name:"+name;
    }
}
