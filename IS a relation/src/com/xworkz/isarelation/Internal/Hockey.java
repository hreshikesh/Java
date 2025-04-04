package com.xworkz.isarelation.Internal;

public class Hockey extends Sport{
    public Hockey(){
        System.out.println("No args const in Hockey");
    }
    @Override
    public void play() {
        System.out.println("Running play in subclass");
    }
    @Override
    public void goal() {
        System.out.println("Running goal in subclass");
    }
    @Override
    public void foul() {
        System.out.println("Running foul in ssubclass");
    }
    @Override
    public void penalty() {
        System.out.println("Running penalty in subclass");
    }
    @Override
    public void kick() {
        System.out.println("Running kick in subclass");
    }
}
