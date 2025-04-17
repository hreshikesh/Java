package com.xworkz.Interface.Internal.Rules;

public interface Laptop {
    void powerOn();
    void runProgram();
    void shutDown();

    default void laptopInfo() {
        System.out.println("Laptop information");
    }

}
