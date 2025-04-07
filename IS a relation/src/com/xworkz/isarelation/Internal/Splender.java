package com.xworkz.isarelation.Internal;

public class Splender extends Bike {
    public Splender() {
        System.out.println("no arg const of Splender");
    }

    @Override
    public void ride() {
        System.out.println("Running ride in subclass");
    }

    @Override
    public void clutch() {
        System.out.println("Running clutch in subclass");
    }

    @Override
    public void race() {
        System.out.println("Running race in subclass");
    }

    @Override
    public void tour() {
        System.out.println("Running tour in subclass");
    }

    @Override
    public void drag() {
        System.out.println("Running drag in subclass");
    }

    public void carry(){
        System.out.println("Running carry in Splender");
    }
}
