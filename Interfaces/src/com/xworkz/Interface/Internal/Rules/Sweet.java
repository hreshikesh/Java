package com.xworkz.Interface.Internal.Rules;

public interface Sweet {
    void makeSweet();

    void packSweet();

    void sellSweet();

    default void sweetInfo() {
        System.out.println("Sweet information");
    }

}
