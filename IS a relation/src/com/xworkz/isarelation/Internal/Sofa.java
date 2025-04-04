package com.xworkz.isarelation.Internal;

public class Sofa extends Furniture {
    public Sofa() {
        System.out.println("no arg const of Sofa");
    }
    @Override
    public void cusion() {
        System.out.println("Running Cusion in subclass");
    }
    @Override
    public void comfort() {
        System.out.println("Running Comfort in subclass");
    }
    @Override
    public void pillow() {
        System.out.println("Running pillow in subclass");
    }
    @Override
    public void fold() {
        System.out.println("Running fold in subclass");
    }
    @Override
    public void sleep() {
        System.out.println("Running sleep in subclass");
    }


}
