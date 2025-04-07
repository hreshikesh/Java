package com.xworkz.isarelation.Internal;

public class Monitor extends Display {
    public Monitor() {
        System.out.println("Running no-arg constructor of Monitor");
    }

    @Override
    public void showImage() {
        System.out.println("Display shows images in subclass");
    }

    @Override
    public void resolution() {
        System.out.println("Display has different resolutions in subclass");
    }

    @Override
    public void refreshRate() {
        System.out.println("Display has a refresh rate in subclass");
    }

    @Override
    public void brightness() {
        System.out.println("Display has adjustable brightness in subclass");
    }

    @Override
    public void displayType() {
        System.out.println("Display types in subclass");
    }
    public void refresh(){
        System.out.println("Refreshing monitor in Monitor");

    }
}
