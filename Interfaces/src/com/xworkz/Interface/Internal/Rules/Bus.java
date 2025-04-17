package com.xworkz.Interface.Internal.Rules;

public interface Bus {
    void startEngine();
    void drive();
    void stopEngine();

    default void busInfo() {
        System.out.println("Bus information");
    }
}
