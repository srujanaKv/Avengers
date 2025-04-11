package com.java.internal.book.internal25;

public class Novel extends Book {
    @Override
    public void Read() {
        System.out.println("running read");
    }

    public void Genre() {
        System.out.println("running genre in novel");
        super.Read();
    }
}