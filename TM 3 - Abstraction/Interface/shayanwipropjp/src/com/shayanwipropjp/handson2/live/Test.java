package com.shayanwipropjp.handson2.live;
import com.shayanwipropjp.music.Playable;
import com.shayanwipropjp.music.string.Veena;
import com.shayanwipropjp.music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        Playable veena = new Veena();
        veena.play();

        Playable saxophone = new Saxophone();
        saxophone.play();
    }
}