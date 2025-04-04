package com.xworkz.isarelation.Internal;

public class Tea extends Beverage{
    public Tea() {
        System.out.println("Running no-arg constructor of Tea");
    }
    @Override
    public void prepare() {
        System.out.println("Preparing the beverage in subclass");
    }
    @Override
    public void serve() {
        System.out.println("Serving the beverage in subclass");
    }
    @Override
    public void addSugar() {
        System.out.println("Adding sugar to the beverage in subclass");
    }
    @Override
    public void stir() {
        System.out.println("Stirring the beverage in subclass");
    }
    @Override
    public void drink() {
        System.out.println("Drinking the beverage in subclass");
    }
}
