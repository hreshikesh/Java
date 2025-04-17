package com.xworkz.Interface.Internal.Rules;

public interface Oil {
    void extractOil();

    void sellOil();

    void useOil();

    default void oilInfo() {
        System.out.println("Oil information");
    }
}
