package com.java.objects.internal;

import java.util.Objects;

public class Binocular {

    private String brand;
    private String color;
    private double price;
    private float weight;

    public Binocular(String brand,String color,double price,float weight){
        this.brand=brand;
        this.color=color;
        this.price=price;
        this.weight=weight;
    }

    @Override

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Binocular) {
            Binocular binocular = (Binocular) obj;
            if (Objects.equals(this.brand, binocular.brand) && Objects.equals(this.color, binocular.color)) {
                System.out.println("Binocular is matching");
                return true;
            }
        }
            return false;
        }

        @Override

        public String toString () {
            return "Binocular[brand:" + brand + ",color:" + color + ",price:" + price + ",weight:" + weight + "]";


        }
    }



