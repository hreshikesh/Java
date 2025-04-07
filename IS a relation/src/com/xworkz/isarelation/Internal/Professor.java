package com.xworkz.isarelation.Internal;

public class Professor extends Person{
    public Professor() {
        System.out.println("Running no-arg constructor of Professor");
    }
    @Override
    public void eat() {
        System.out.println("Person eats food in subclass");
    }
    @Override
    public void sleep() {
        System.out.println("Person sleeps at night in subclass");
    }
    @Override
    public void walk() {
        System.out.println("Person can walk in subclass");
    }
    @Override
    public void talk() {
        System.out.println("Person can talk in subclass");
    }
    @Override
    public void breathe() {
        System.out.println("Person breathes to live in subclass");
    }

    public void letcure(){
        System.out.println("Lecture in professor");
    }
}
