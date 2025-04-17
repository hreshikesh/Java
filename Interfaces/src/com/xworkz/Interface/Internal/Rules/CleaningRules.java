package com.xworkz.Interface.Internal.Rules;

public interface CleaningRules {
    void sweep();
    void mop();
    void dust();

    default void cleaningInfo() {
        System.out.println("Cleaning information");
    }

}
