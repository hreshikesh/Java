package com.xworkz.Interface.Internal.Rules;

public interface OffRoad {
    void drive();
    void speedUp();
    void driveOnRoughTerrain();

    default void offRoadInfo() {
        System.out.println("Off-road vehicle information");
    }
}
