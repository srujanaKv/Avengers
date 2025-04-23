package com.in.runner;

import com.in.external.PixelForge;
import com.in.internal.GameStudio;

public class GameStudioRunner {
    public static void main(String[] args) {
        GameStudio studio = new PixelForge();
        PixelForge forge = new PixelForge();

        studio.designGame();
        studio.writeCode();
        studio.createArt();
        studio.composeMusic();
        studio.testGame();
        studio.fixBugs();
        studio.launchGame();
        studio.updateGame();
        studio.engageCommunity();

        forge.designGame();
        forge.writeCode();
        forge.createArt();
        forge.composeMusic();
        forge.testGame();
        forge.fixBugs();
        forge.launchGame();
        forge.updateGame();
        forge.engageCommunity();
    }
}
