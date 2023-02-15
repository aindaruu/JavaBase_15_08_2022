package com.hillel.pinkovskiy.lessons.homework15;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] musics = {
                new ClassicMusic("Mocart"),
                new RockMusic("ACDC"),
                new PopMusic("Kalush")
        };

        for (MusicStyles music : musics) {
            music.playMusic();
        }
    }
}
