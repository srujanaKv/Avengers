package com.xworkz.marriage.temp;

public class LiftResource implements AutoCloseable {


    public void open()
    {
        System.out.println("Lift is open");
    }


    public void close()
    {
        System.out.println("Lift is closed");
    }
}
