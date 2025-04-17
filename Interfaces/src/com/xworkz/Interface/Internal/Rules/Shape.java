package com.xworkz.Interface.Internal.Rules;

public interface Shape {
    void draw();

    void erase();

    void resize();

    default void shapeInfo() {
        System.out.println("Shape information");
    }


}
