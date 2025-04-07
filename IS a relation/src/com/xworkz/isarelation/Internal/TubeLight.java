package com.xworkz.isarelation.Internal;

public class TubeLight extends Light {
    public TubeLight() {
        System.out.println("Running no-arg constructor of TubeLight");
    }

    @Override
    public void turnOn() {
        System.out.println("Light is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned off");
    }

    @Override
    public void brightness() {
        System.out.println("Light has adjustable brightness");
    }

    @Override
    public void color() {
        System.out.println("Light can have different colors");
    }

    @Override
    public void powerSource() {
        System.out.println("Light runs on electricity or batteries");
    }

    public void intensity(){
        System.out.println("Intensity of Tubelight");
    }
}
