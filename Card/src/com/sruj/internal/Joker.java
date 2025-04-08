package com.sruj.internal;

public class Joker {
    public void play() {
        Card card = new Card();
        card.deal();
        card.shuffle();
        System.out.println("Playing joker");
    }
}


