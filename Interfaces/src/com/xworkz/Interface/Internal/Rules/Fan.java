package com.xworkz.Interface.Internal.Rules;

public interface Fan {
    void turnOn();
    void turnOff();
    void rotate();

    default void fanInfo() {
        System.out.println("Fan information");
    }
}
