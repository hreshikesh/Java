package com.xworkz.isarelation.Internal;

public class Square extends Shape{
    public Square(){
        System.out.println("no arg const of Square");
    }
    @Override
    public void draw() {
        System.out.println("Drawing a shape in subclass");
    }
    @Override
    public void erase() {
        System.out.println("Erasing shape in subclass");
    }
    @Override
    public void resize() {
        System.out.println("Resizing shape in subclass");
    }
    @Override
    public void fill() {
        System.out.println("Filling shape in subclass");
    }
    @Override
    public void move() {
        System.out.println("Moving shape in subclass");
    }
}
