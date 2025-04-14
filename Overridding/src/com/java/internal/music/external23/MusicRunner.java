package com.java.internal.music.external23;

import com.java.internal.music.internal23.Music;
import com.java.internal.music.internal23.Melody;

public class MusicRunner {

    public void startMusicPlay(Music music) {
        if (music != null) {
            music.Play();
            if (music instanceof Melody) {
                Melody melody = (Melody) music;
                melody.Rhythm();
            }
        } else {
            System.out.println("No music to play.");
        }
    }
}
