package com.xworkz.Interface.Internal.Rules;

public interface TrafficRule {


    void trafficSafetyRules();

    void trafficRoadSigns();

    void trafficSpeedLimits();

    default void trafficInfo() {
        System.out.println("Traffic information");
    }


}
