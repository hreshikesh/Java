package com.xworkz.Interface.Internal.Rules;

public interface Bicycle {
    void pedal();
    void brake();
    void ringBell();
    default void bicycleInfo() {
        System.out.println("Bicycle information");
    }
}
