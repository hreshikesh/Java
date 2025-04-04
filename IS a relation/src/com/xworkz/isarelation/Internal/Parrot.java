package com.xworkz.isarelation.Internal;

public class Parrot extends Bird{
    public  Parrot(){
        System.out.println("no args const of Parrot");
    }
    @Override
    public void fly() {
        System.out.println("Bird is flying in subclass");
    }
    @Override
    public void chirp() {
        System.out.println("Bird chirping in subclass");
    }
    @Override
    public void nest() {
        System.out.println("Bird making a nest in subclass");
    }
    @Override
    public void eat() {
        System.out.println("Bird eating in subclass");
    }
    @Override
    public void sleep() {
        System.out.println("Bird sleeping in subclass");
    }
}
