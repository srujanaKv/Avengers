package com.in.runner;

import com.in.external.SilverScreen;
import com.in.internal.FilmProduction;

public class FilmProductionRunner {
    public static void main(String[] args) {
        FilmProduction film = new SilverScreen();
        SilverScreen studio = new SilverScreen();

        film.writeScript();
        film.castActors();
        film.shootScenes();
        film.editFootage();
        film.addVFX();
        film.composeMusic();
        film.promoteFilm();
        film.releaseFilm();
        film.manageAwards();

        studio.writeScript();
        studio.castActors();
        studio.shootScenes();
        studio.editFootage();
        studio.addVFX();
        studio.composeMusic();
        studio.promoteFilm();
        studio.releaseFilm();
        studio.manageAwards();
    }
}
