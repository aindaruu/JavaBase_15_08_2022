package com.hillel.pinkovskiy.lessons.homework12;

public class Homework12 {
    public static void main(String[] args) {
        String str1 = personInfo("Patrick", "Bateman", "Manhattan", "2936758262889");
        System.out.println(str1);
        System.out.println(personInfo("Tyler", "Durden", "San Francisco", "673124235562"));
        System.out.println(personInfo("Ryan", "Gosling", "London", "53353639876"));
    }
    static String personInfo(String name, String surname, String city, String phoneNumber) {
        return "You can call the citizens of " + name + " " + surname + " from the city of " + city + " at the number " + phoneNumber;
    }
}
