package com.java.objects.internal;

import java.util.Objects;

public class Corn {

    private String name;
    private String color;
    private int cost;
    private boolean fresh;

    public Corn(String name,String color,int cost,boolean fresh){

        this.name=name;
        this.color=color;
        this.cost=cost;
        this.fresh=fresh;
    }

    @Override

    public boolean equals(Object obj) {
        if(obj!=null && obj instanceof Corn){
            Corn corn=(Corn) obj;
            if(Objects.equals(this.color,corn.color)&& Objects.equals(this.name,corn.name)){
                System.out.println("corn is matching");
                return true;
            }

        }
        return false;

    }
    @Override

    public String toString(){

        return "Corn[name:"+name+",color:" +color+",cost:"+cost+",fresh"+fresh+"]";
    }

}

