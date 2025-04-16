package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Rectangle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing Rectangle");
    }
}
