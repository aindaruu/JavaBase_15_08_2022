package com.hillel.pinkovskiy.lessons.homework15;

public abstract class MusicStyles {
    protected String name;

    public MusicStyles(String name) {
        this.name = name;
    }

    abstract void playMusic();
}
