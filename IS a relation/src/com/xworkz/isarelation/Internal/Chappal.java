package com.xworkz.isarelation.Internal;

public class Chappal extends Footwear {
    public Chappal(){
        System.out.println("no args const in Chappal");
    }
    @Override
    public void wear() {
        System.out.println("Running wear in subclass");
    }
    @Override
    public void run() {
        System.out.println("Running run in subclass");
    }
    @Override
    public void walk() {
        System.out.println("Running walk in subclass");
    }
    @Override
    public void tie() {
        System.out.println("Running tie in subclass");
    }
    @Override
    public void remove() {
        System.out.println("Running remove in subclass");
    }
}
