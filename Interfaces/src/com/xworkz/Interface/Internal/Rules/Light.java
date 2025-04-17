package com.xworkz.Interface.Internal.Rules;

public interface Light {
    void turnOn();
    void turnOff();
    void dim();

    default void lightInfo() {
        System.out.println("Light information");
    }
}
