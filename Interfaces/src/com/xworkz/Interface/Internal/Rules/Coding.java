package com.xworkz.Interface.Internal.Rules;

public interface Coding {
    void writeCode();

    void debugCode();

    void testCode();

    default void codingInfo() {
        System.out.println("Coding information");
    }

}
