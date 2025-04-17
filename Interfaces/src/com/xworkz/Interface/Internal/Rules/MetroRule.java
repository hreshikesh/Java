package com.xworkz.Interface.Internal.Rules;

public interface MetroRule {
    void ticket();

    void route();

    void timing();

    default void metroInfo() {
        System.out.println("Metro information");
    }


}
