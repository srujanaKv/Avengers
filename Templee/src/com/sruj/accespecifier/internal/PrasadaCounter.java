package com.sruj.accespecifier.internal;

public class PrasadaCounter {
    Templee templee=new Templee();
    public PrasadaCounter(){
        System.out.println("Running Prasadcounter const");
    }
    public void Templeedisplay(){
        System.out.println("accessing public and defualt access specifiers from internal package");
        Templee templee=new Templee();
        templee.darshan_hall();
        templee.ticket_counter();

}
}


