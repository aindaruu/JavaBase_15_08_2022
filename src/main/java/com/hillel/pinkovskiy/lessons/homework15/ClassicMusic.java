package com.hillel.pinkovskiy.lessons.homework15;

public class ClassicMusic extends MusicStyles {
    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    void playMusic() {
        System.out.println("Playing classic music: " + name);
    }
}
