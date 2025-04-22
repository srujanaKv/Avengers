package com.in.external;

import com.in.internal.MovieTheater;

public class ForumTheater implements MovieTheater {
    @Override
    public void bookTicket() {
        System.out.println("Booking ticket in ForumTheater");
    }

    @Override
    public void startShow() {
        System.out.println("Starting movie show in ForumTheater");
    }

    @Override
    public void endShow() {
        System.out.println("Ending movie show in ForumTheater");
    }
}
