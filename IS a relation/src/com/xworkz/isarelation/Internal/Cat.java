package com.xworkz.isarelation.Internal;

public class Cat extends Animal{
    public Cat(){
        System.out.println("no args const of cat");
    }
    @Override
    public void eat() {
        System.out.println("Animal eating in subclass");
    }
    @Override
    public void sleep() {
        System.out.println("Animal sleeping in subclass");
    }
    @Override
    public void makeSound() {
        System.out.println("Animal making sound in subclass");
    }
    @Override
    public void run() {
        System.out.println("Animal running in subclass");
    }
    @Override
    public void breathe() {
        System.out.println("Animal breathing in subclass");
    }
}
