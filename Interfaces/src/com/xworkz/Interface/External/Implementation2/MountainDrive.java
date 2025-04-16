package com.xworkz.Interface.External.Implementation2;

import com.xworkz.Interface.Internal.Rules.DrivingRules;
import com.xworkz.Interface.Internal.Rules.OffRoad;
import com.xworkz.Interface.Internal.Rules.ShowRoomRule;
import com.xworkz.Interface.Internal.Rules.Vehicle;
import com.xworkz.Interface.Internal.Rules.Car;

public class MountainDrive  implements Car, DrivingRules, OffRoad,ShowRoomRule, Vehicle {


    @Override
    public void drive() {
        System.out.println("MountainDrive drive is important");
    }

    @Override
    public void speedUp() {
        System.out.println("MountainDrive speedUp is important");

    }

    @Override
    public void driveOnRoughTerrain() {
        System.out.println("MountainDrive driveOnRoughTerrain is important");

    }

    @Override
    public void start() {
        System.out.println("MountainDrive start is important");

    }

    @Override
    public void stop() {
        System.out.println("MountainDrive stop is important");

    }

    @Override
    public void accelerate() {
        System.out.println("MountainDrive accelerate is important");

    }

    @Override
    public void speedDrive() {
        System.out.println("MountainDrive speedDrive is important");

    }

    @Override
    public void drivingInsurance() {
        System.out.println("MountainDrive drivingInsurance is important");

    }

    @Override
    public void drivingSafetyRules() {
        System.out.println("MountainDrive drivingSafetyRules is important");

    }

    @Override
    public void drivingEmergencyProcedures() {
        System.out.println("MountainDrive drivingEmergencyProcedures is important");

    }

    @Override
    public void showRoomCustomerCare() {
        System.out.println("MountainDrive showRoomCustomerCare is important");

    }

    @Override
    public void showRoomTools() {
        System.out.println("MountainDrive showRoomTools is important");

    }

    @Override
    public void showRoomProducts() {
        System.out.println("MountainDrive showRoomProducts is important");

    }
}
