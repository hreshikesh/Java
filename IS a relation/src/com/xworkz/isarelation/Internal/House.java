package com.xworkz.isarelation.Internal;

public class House extends Building{
    public House(){
        System.out.println("no args const of House");
    }
    @Override
    public void openDoors() {
        System.out.println("Building doors opened in subclass");
    }
    @Override
    public void closeDoors() {
        System.out.println("Building doors closed in subclass");
    }
    @Override
    public void maintenance() {
        System.out.println("Building maintenance in progress in subclass");
    }
    @Override
    public void turnOnLights() {
        System.out.println("Building lights turned on in subclass");
    }
    @Override
    public void turnOffLights() {
        System.out.println("Building lights turned off in subclass");
    }
}
