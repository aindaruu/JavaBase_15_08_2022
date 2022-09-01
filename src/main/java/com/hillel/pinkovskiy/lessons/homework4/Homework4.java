package com.hillel.pinkovskiy.lessons.homework4;

public class Homework {
    public static void main(String[] args) {

        int warriorLi = 13;
        int archerLi = 22;
        int horsemanLi = 46;
        int warriorMin = 9;
        int archerMin = 35;
        int horsemanMin = 12;

        double result = (warriorLi + archerLi + horsemanLi) * 860;
        double result2 = (warriorMin + archerMin + horsemanMin) * (860 * 1.5);

        System.out.println(result);
        System.out.println(result2);

    }
}
