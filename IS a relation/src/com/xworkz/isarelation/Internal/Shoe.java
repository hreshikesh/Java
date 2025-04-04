package com.xworkz.isarelation.Internal;

public class Shoe extends Footwear{
    public Shoe(){
        super();
        System.out.println("no arg const of shoe");
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
