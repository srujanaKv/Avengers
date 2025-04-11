package com.java.internal.worm.internal2;

public class Color extends Worm {

    @Override
    public void Shape(){
     System.out.println("running shape");
    }
    public void Type(){
        System.out.println("running type in color");
        super.Shape();
    }

}
