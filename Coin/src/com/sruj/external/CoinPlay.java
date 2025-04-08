package com.sruj.external;

import com.sruj.internal.Coin;

public class CoinPlay {
    public void use() {
        Coin coin = new Coin();
        coin.flip();
        System.out.println("Using coin for payment");
    }
}


