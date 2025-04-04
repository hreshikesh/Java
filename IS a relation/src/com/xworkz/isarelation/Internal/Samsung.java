package com.xworkz.isarelation.Internal;

public class Samsung extends Mobile{
    public Samsung(){
        System.out.println("no args const in Samsung");
    }
    @Override
    public void volumeUp() {
        System.out.println("Running volumeup in subclass");
    }
    @Override
    public void volumeDown() {
        System.out.println("Running volumedown in msubclass");
    }
    @Override
    public void play() {
        System.out.println("Running play in subclass");
    }
    @Override
    public void draw() {
        System.out.println("Running draw in subclass");
    }
    @Override
    public void note() {
        System.out.println("Running note in msubclass");
    }

}
