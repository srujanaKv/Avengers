package com.java.objects.internal;

import java.util.Objects;

public class CD {
    private String albumName;
    private String artist;
    private int durationMinutes;
    private boolean isRewritable;

    public CD(String albumName, String artist, int durationMinutes, boolean isRewritable) {
        this.albumName = albumName;
        this.artist = artist;
        this.durationMinutes = durationMinutes;
        this.isRewritable = isRewritable;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof CD) {
            CD cd = (CD) obj;
            if (Objects.equals(this.albumName, cd.albumName) && Objects.equals(this.artist, cd.artist)
                    && this.durationMinutes == cd.durationMinutes && this.isRewritable == cd.isRewritable) {
                System.out.println("CD is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "CD[albumName:" + albumName + ", artist:" + artist + ", duration:" + durationMinutes + " minutes, isRewritable:" + isRewritable + "]";
    }
}
