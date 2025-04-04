package com.xworkz.isarelation.Internal;

public class Color extends Orange{
    public Color(){
        System.out.println("no arg  const in color");
    }

    @Override
    public void apply() {
        System.out.println("Running apply in subclass");
    }
    @Override
    public void fill() {
        System.out.println("Running fill in subclass");
    }
    @Override
    public void brush() {
        System.out.println("Running brush in subclass");
    }
    @Override
    public void type() {
        System.out.println("Running type in subclass");
    }
    @Override
    public void mix() {
        System.out.println("Running mix in subclass");
    }
}


