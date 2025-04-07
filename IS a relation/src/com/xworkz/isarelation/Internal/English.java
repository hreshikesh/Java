package com.xworkz.isarelation.Internal;

public class English extends Language {
    public English() {
        System.out.println("Running English");
    }
    @Override
    public void learn() {
        System.out.println("Running Learn in subclass");
    }
    @Override
    public void talk() {
        System.out.println("Running talk in subclass");
    }
    @Override
    public void write() {
        System.out.println("Running write in subclass");
    }
    @Override
    public void improve() {
        System.out.println("Running improve in subclass");
    }
    @Override
    public void read() {
        System.out.println("Running read in subclass");
    }

    public void communicate(){
        System.out.println("Running communicate in English");
    }

}
