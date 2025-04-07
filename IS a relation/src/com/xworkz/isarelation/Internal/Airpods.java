package com.xworkz.isarelation.Internal;

public class Airpods extends  AudioDevice{
    public Airpods(){
        System.out.println("no arg const of airpods");
    }
    @Override
    public void listen() {
        System.out.println("Running listen in subclass");
    }
    @Override
    public void call() {
        System.out.println("Running call in subclass");
    }
    @Override
    public void music() {
        System.out.println("Running music in subclass");
    }
    @Override
    public void beats() {
        System.out.println("Running beats in subclass");
    }
    @Override
    public void play() {
        System.out.println("Running play in subclass");
    }
    public  void cost(){
        System.out.println("Running cost in airpods");
    }

}
