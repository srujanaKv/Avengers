package com.in.external;

import com.in.internal.GameStudio;

public class PixelForge implements GameStudio {
    @Override
    public void designGame() {
        System.out.println("Designing game concept at PixelForge");
    }

    @Override
    public void writeCode() {
        System.out.println("Writing game code at PixelForge");
    }

    @Override
    public void createArt() {
        System.out.println("Creating game art at PixelForge");
    }

    @Override
    public void composeMusic() {
        System.out.println("Composing background music at PixelForge");
    }

    @Override
    public void testGame() {
        System.out.println("Testing the game at PixelForge");
    }

    @Override
    public void fixBugs() {
        System.out.println("Fixing bugs in the game at PixelForge");
    }

    @Override
    public void launchGame() {
        System.out.println("Launching the game from PixelForge");
    }

    @Override
    public void updateGame() {
        System.out.println("Releasing updates for the game at PixelForge");
    }

    @Override
    public void engageCommunity() {
        System.out.println("Engaging with the player community at PixelForge");
    }
}
