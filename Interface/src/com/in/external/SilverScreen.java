package com.in.external;

import com.in.internal.FilmProduction;

public class SilverScreen implements FilmProduction {
    @Override
    public void writeScript() {
        System.out.println("Writing the film script at SilverScreen Studios");
    }

    @Override
    public void castActors() {
        System.out.println("Casting actors at SilverScreen Studios");
    }

    @Override
    public void shootScenes() {
        System.out.println("Shooting scenes at SilverScreen Studios");
    }

    @Override
    public void editFootage() {
        System.out.println("Editing footage at SilverScreen Studios");
    }

    @Override
    public void addVFX() {
        System.out.println("Adding VFX to scenes at SilverScreen Studios");
    }

    @Override
    public void composeMusic() {
        System.out.println("Composing background music at SilverScreen Studios");
    }

    @Override
    public void promoteFilm() {
        System.out.println("Promoting the film at SilverScreen Studios");
    }

    @Override
    public void releaseFilm() {
        System.out.println("Releasing the film from SilverScreen Studios");
    }

    @Override
    public void manageAwards() {
        System.out.println("Managing film awards at SilverScreen Studios");
    }
}

