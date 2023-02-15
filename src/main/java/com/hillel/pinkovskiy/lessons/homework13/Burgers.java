package com.hillel.pinkovskiy.lessons.homework13;

public class Burgers {
    String bun;
    String meat;
    String cheese;
    String greenery;
    String mayonnaise;
    boolean isDoubleMeat;

    public Burgers(String bun, String meat, String cheese, String greenery, String mayonnaise, boolean isDoubleMeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;
        this.isDoubleMeat = isDoubleMeat;
        System.out.println(this);
    }
    public Burgers(String bun, String meat, String cheese, String greenery, boolean isDoubleMeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.isDoubleMeat = isDoubleMeat;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Burgers{" +
                "bun='" + bun + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", greenery='" + greenery + '\'' +
                ", mayonnaise='" + mayonnaise + '\'' +
                ", count meat=" + (isDoubleMeat ? 2 : 1)  +
                '}';
    }
}
