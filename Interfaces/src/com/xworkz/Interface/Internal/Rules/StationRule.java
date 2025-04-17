package com.xworkz.Interface.Internal.Rules;

public interface StationRule {
    void timing();
    void safety();
    void maintenance();


    default void stationInfo() {
        System.out.println("Station information");
    }
}
