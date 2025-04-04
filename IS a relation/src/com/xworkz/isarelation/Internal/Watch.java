package com.xworkz.isarelation.Internal;

public class Watch extends Clock{
    public Watch() {
        System.out.println("Running no-arg constructor of Watch");
    }
    @Override
    public void showTime() {
        System.out.println("Clock displays the time in subclass");
    }
    @Override
    public void setAlarm() {
        System.out.println("Clock allows setting an alarm in subclass");
    }
    @Override
    public void tick() {
        System.out.println("Clock makes ticking sound in subclass");
    }
    @Override
    public void displayFormat() {
        System.out.println("Clock supports 12-hour and 24-hour formats in subclass");
    }
    @Override
    public void powerSource() {
        System.out.println("Clock can be powered by battery or electricity in subclass");
    }

}
