package com.xworkz.isarelation.Internal;

public class MatchBox extends Box{
    public MatchBox() {
        System.out.println("Running no-arg constructor of MatchBox");
    }
    @Override
    public void storeItems() {
        System.out.println("Box is used to store items in subclass");
    }
    @Override
    public void open() {
        System.out.println("Box can be opened in subclass");
    }
    @Override
    public void close() {
        System.out.println("Box can be closed in subclass");
    }
    @Override
    public void material() {
        System.out.println("Box can be made of wood, plastic, or metal in subclass");
    }
    @Override
    public void size() {
        System.out.println("Box comes in different sizes in subclass");
    }

}
