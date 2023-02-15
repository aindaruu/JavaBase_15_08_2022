package com.hillel.pinkovskiy.lessons.homework16;

public class Androids implements Smartphones, LinuxOS{
    @Override
    public void call() {
        System.out.println("call from Android");
    }

    @Override
    public void sms() {
        System.out.println("sms from Android");
    }

    @Override
    public void internet() {
        System.out.println("internet from Android");
    }

    @Override
    public void getLinuxOS() {
        System.out.println("Linux OS 9.9");
    }
}
