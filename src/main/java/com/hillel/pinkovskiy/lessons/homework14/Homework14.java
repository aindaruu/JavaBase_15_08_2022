package com.hillel.pinkovskiy.lessons.homework14;

public class Homework14 {
    private final String name;
    private final int birthDay;
    private final int birthMounth;
    private final int birthYear;
    private final String email;
    private final String phoneNumber;

    private String surname;
    private double weight;
    private double pressure;
    private double steps;

    private int age;

    public Homework14(String name, int birthDay, int birthMounth, int birthYear, String email, String phoneNumber, String surname, double weight, double pressure, double steps) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMounth = birthMounth;
        this.birthYear = birthYear;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        age = 2020 - birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMounth() {
        return birthMounth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getSteps() {
        return steps;
    }

    public void setSteps(double steps) {
        this.steps = steps;
    }

    public int getAge() {
        return age;
    }


    void printAccountInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Person :" + "name='").append(name).append('\'')
                .append(", birthDay=").append(birthDay)
                .append(", birthMounth=").append(birthMounth)
                .append(", birthYear=").append(birthYear)
                .append(", age=").append(age)
                .append(", email='").append(email).append('\'')
                .append(", phoneNumber='").append(phoneNumber)
                .append('\'').append(", surname='").append(surname)
                .append('\'').append(", weight=").append(weight)
                .append('\'').append(", pressure='").append(pressure)
                .append('\'').append(", steps='").append(steps);

        System.out.println(stringBuilder);

    }


}
