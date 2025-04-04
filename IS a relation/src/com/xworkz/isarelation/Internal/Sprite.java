package com.xworkz.isarelation.Internal;

public class Sprite extends ColdDrink {
    public Sprite() {
        System.out.println("Running no-arg constructor of Sprite");
    }
    @Override
    public void drink() {
        System.out.println("ColdDrink is refreshing in subclass");
    }
    @Override
    public void chill() {
        System.out.println("ColdDrink is best served chilledin subclass");
    }
    @Override
    public void flavor() {
        System.out.println("ColdDrink comes in different flavors in subclass");
    }
    @Override
    public void fizz() {
        System.out.println("ColdDrink has fizzy bubbles in subclass");
    }
    @Override
    public void sugarContent() {
        System.out.println("ColdDrink may contain sugar or be sugar-free in subclass");
    }
}
