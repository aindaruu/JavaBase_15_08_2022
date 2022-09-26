package com.hillel.pinkovskiy.lessons.homework6;

import java.util.Scanner;

public class Homework6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Navi;
        String Astralis;
        final int COUNT_PLAYERS = 5;
        int[] navi = new int[COUNT_PLAYERS];
        int[] astralis = new int[COUNT_PLAYERS];
        double sumFragsNavi = 0;
        double sumFragsAstralis = 0;
        double avgFragsNavi = 0;
        double avgFragsAstalis = 0;

        System.out.println("Enter team1 name: ");
        Navi = scanner.nextLine();

        System.out.println("Enter team2 name: ");
        Astralis = scanner.nextLine();

        for (int i = 0; i < navi.length; i++) {
            System.out.println("Please enter frags for player " + (i + 1) + " from team " + Navi);
            navi[i] = getFrags(scanner);
            sumFragsNavi += navi[i];
        }

        for (int i = 0; i < astralis.length; i++) {
            System.out.println("Please enter frags for player " + (i + 1) + " from team " + Astralis);
            astralis[i] = getFrags(scanner);
            sumFragsAstralis += astralis[i];
        }

        System.out.println("sum frags team " + Navi + ": " + sumFragsNavi);
        System.out.println("sum frags team " + Astralis + ": " + sumFragsAstralis);


        avgFragsNavi = sumFragsNavi / COUNT_PLAYERS;
        avgFragsAstalis = sumFragsAstralis/ COUNT_PLAYERS;

        System.out.println("avg frags team " + Navi+ ": " + avgFragsNavi);
        System.out.println("avg frags team " + Astralis+ ": " + avgFragsAstalis);

        if (avgFragsNavi == avgFragsAstalis) {
            System.out.println("Draw");
        } else if (avgFragsNavi > avgFragsAstalis) {
            System.out.println("Team " + Navi + " won");
        } else {
            System.out.println("Team " + Astralis + " won");
        }

        scanner.close();
    }

    static int getFrags(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                if (temp >= 0) {
                    return temp;
                } else {
                    System.out.println("Please enter positive number");
                }
                scanner.nextLine();
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
            }
        }
    }
}

