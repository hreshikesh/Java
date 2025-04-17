package com.xworkz.Interface.Internal.Rules;

public interface HairDryer {
    void startDrying();
    void stopDrying();
    void adjustHeatLevel();

    default void hairDryerInfo() {
        System.out.println("Hair dryer information");
    }
}
