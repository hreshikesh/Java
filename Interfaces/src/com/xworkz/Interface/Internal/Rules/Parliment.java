package com.xworkz.Interface.Internal.Rules;

public interface Parliment {
    void fight();
    void debate();
    void discuss();

    default void parlimentInfo() {
        System.out.println("Parliment information");
    }
}
