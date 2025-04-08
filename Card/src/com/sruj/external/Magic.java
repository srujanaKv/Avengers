package com.sruj.external;

import com.sruj.internal.Card;

public class Magic {
    public void trick() {
        Card card = new Card();
        card.deal();
        System.out.println("Performing card trick");
    }
}


