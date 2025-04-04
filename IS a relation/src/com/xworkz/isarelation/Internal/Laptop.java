package com.xworkz.isarelation.Internal;

public class Laptop extends Device{
    public Laptop(){
        System.out.println("No args const in Laptop");
    }
    @Override
    public void on() {
        System.out.println("Running on in subclass");
    }
    @Override
    public void off() {
        System.out.println("Running off in subclass");
    }
    @Override
    public void watch() {
        System.out.println("Running watch in subclass");
    }
    @Override
    public void display() {
        System.out.println("Running display insubclass");
    }
    @Override
    public void brightness() {
        System.out.println("Running on in subclass");
    }

}
