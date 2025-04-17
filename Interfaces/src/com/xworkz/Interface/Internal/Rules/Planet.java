package com.xworkz.Interface.Internal.Rules;

public interface Planet {
    void planetType();
    void planetColor();
    void planetPrice();

    default void planetInfo() {
        System.out.println("Planet information");
    }
}
