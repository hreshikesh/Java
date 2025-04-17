package com.xworkz.Interface.Internal.Rules;

public interface  DrivingRules {

    void drivingInsurance();

    void drivingSafetyRules();

    void drivingEmergencyProcedures();

    default void drivingInfo() {
        System.out.println("Driving information");
    }
}
