package com.xworkz.Interface.Internal.Rules;

public interface Pant {
    void wearPant();

    void washPant();

    void foldPant();

    default void pantInfo() {
        System.out.println("Pant information");
    }


}
