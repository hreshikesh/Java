package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.TrafficRule;
import com.xworkz.Interface.Internal.Rules.TraineeRule;

public class Traffic implements TrafficRule {
    @Override
    public void trafficSafetyRules() {
        System.out.println("Traffic safety rules are available");
    }

    @Override
    public void trafficRoadSigns() {
        System.out.println("Traffic road signs are available");
    }

    @Override
    public void trafficSpeedLimits() {
        System.out.println("Traffic speed limits are available");
    }
}
