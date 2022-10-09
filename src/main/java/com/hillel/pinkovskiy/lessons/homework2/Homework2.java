package com.hillel.pinkovskiy.lessons.homework2;

public class Homework2 {
    public static void main(String[] args) {
        byte coordLatitude = 46;
        byte coordLength = 30;
        char ch = '\u00B0';
        String str = "Coords: " + coordLatitude + ch + coordLength + ch;
        System.out.println(str);

    }
}
