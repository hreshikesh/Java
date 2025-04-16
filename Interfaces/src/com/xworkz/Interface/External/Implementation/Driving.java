package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.DrivingRules;

public class Driving implements DrivingRules {
    @Override
    public void drivingInsurance() {
        System.out.println("Driving insurance is mandatory.");
    }

    @Override
    public void drivingSafetyRules() {
        System.out.println("Follow all safety rules while driving.");
    }

    @Override
    public void drivingEmergencyProcedures() {
        System.out.println("Know the emergency procedures in case of an accident.");
    }
}
