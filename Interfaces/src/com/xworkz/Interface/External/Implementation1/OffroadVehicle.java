package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.DrivingRules;
import com.xworkz.Interface.Internal.Rules.OffRoad;

public class OffroadVehicle implements OffRoad, DrivingRules {
    @Override
    public void drivingInsurance() {
        System.out.println("OffroadVehicle drivingInsurance is important");
    }

    @Override
    public void drivingSafetyRules() {
        System.out.println("OffroadVehicle drivingSafetyRules is important");

    }

    @Override
    public void drivingEmergencyProcedures() {
        System.out.println("OffroadVehicle drivingEmergencyProcedures is important");

    }

    @Override
    public void drive() {
        System.out.println("OffroadVehicle drive is important");

    }

    @Override
    public void speedUp() {
        System.out.println("OffroadVehicle speedUp is important");

    }

    @Override
    public void driveOnRoughTerrain() {
        System.out.println("OffroadVehicle driveOnRoughTerrain is important");
    }
}
