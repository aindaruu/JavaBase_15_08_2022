package com.hillel.pinkovskiy.lessons.homework15;

public class PopMusic extends MusicStyles{
    public PopMusic(String name) {
        super(name);
    }

    @Override
    void playMusic() {
        System.out.println("Playing pop music: " + name);
    }
}
