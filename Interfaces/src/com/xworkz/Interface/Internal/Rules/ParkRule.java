package com.xworkz.Interface.Internal.Rules;

public interface ParkRule {
    void parkSafety();

    void parkHygiene();

    void facility();

    default void parkInfo() {
        System.out.println("Park information");
    }


}
