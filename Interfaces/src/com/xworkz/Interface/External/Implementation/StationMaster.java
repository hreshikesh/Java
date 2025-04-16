package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.StationRule;

public class StationMaster implements StationRule {
    @Override
    public void timing() {
        System.out.println("Station timing is important");
    }

    @Override
    public void safety() {
        System.out.println("Station safety is important");
    }

    @Override
    public void maintenance() {
        System.out.println("Station maintenance is important");
    }
}
