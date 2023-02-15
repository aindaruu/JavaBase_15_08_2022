package com.hillel.pinkovskiy.lessons.homework14;

public class Main {
    public static void main(String[] args) {
        Homework14 person1 = new Homework14("Jake",
                14,
                5,
                1993,
                "jakesuper@gmail.com",
                "42352525",
                "Ivanov",
                88,
                100,
                1200);

        person1.printAccountInfo();

        Homework14 person2 = new Homework14("Poul",
                23,
                7,
                1997,
                "poul2307@gmail.com",
                "37892925",
                "Kravcev",
                79,
                98,
                2345);

        person2.printAccountInfo();

        Homework14 person3 = new Homework14("Max",
                26,
                1,
                1991,
                "itsmax@gmail.com",
                "64611345",
                "Taran",
                74,
                96,
                5678);
    }

}
