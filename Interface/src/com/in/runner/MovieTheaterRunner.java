package com.in.runner;

import com.in.external.ForumTheater;
import com.in.internal.MovieTheater;

public class MovieTheaterRunner {
    public static void main(String[] args) {
        MovieTheater theater = new ForumTheater();
        ForumTheater forumTheater= new ForumTheater();

        theater.bookTicket();
        theater.startShow();
        theater.endShow();

        forumTheater.bookTicket();
        forumTheater.startShow();
        forumTheater.endShow();
    }
}
