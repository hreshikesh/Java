package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.ParkRule;

public class HBCSPark implements ParkRule {
    @Override
    public void parkSafety() {
        System.out.println("Park safety is important");
    }

    @Override
    public void parkHygiene() {
        System.out.println("Park hygiene is important");
    }

    @Override
    public void facility() {
        System.out.println("Park facility is important");
    }
}
