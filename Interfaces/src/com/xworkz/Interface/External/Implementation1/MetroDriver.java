package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.DrivingRules;
import com.xworkz.Interface.Internal.Rules.MetroRule;

public class MetroDriver implements MetroRule, DrivingRules {

    @Override
    public void drivingInsurance() {
        System.out.println("MetroDriver drivingInsurance is important");
    }

    @Override
    public void drivingSafetyRules() {
        System.out.println("MetroDriver drivingSafetyRules is important");

    }

    @Override
    public void drivingEmergencyProcedures() {
        System.out.println("MetroDriver drivingEmergencyProcedures is important");

    }

    @Override
    public void ticket() {
        System.out.println("MetroDriver ticket is important");

    }

    @Override
    public void route() {
        System.out.println("MetroDriver route is important");

    }

    @Override
    public void timing() {
        System.out.println("MetroDriver timing is important");

    }
}
