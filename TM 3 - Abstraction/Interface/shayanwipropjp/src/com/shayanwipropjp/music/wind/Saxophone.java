package com.shayanwipropjp.music.wind;
import com.shayanwipropjp.music.Playable;

public class Saxophone implements Playable {
    @Override
    public void play() {
        System.out.println("SAXOPHONE STARTED PLAYING");
    }
}
