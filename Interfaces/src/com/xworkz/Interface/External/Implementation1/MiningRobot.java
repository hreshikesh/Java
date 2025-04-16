package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.MinerRules;
import com.xworkz.Interface.Internal.Rules.Planet;

public class MiningRobot implements MinerRules, Planet {

    @Override
    public void dig() {
        System.out.println("MiningRobot dig is important");
    }

    @Override
    public void drill() {
        System.out.println("MiningRobot drill is important");

    }

    @Override
    public void blast() {
        System.out.println("MiningRobot blast is important");

    }

    @Override
    public void planetType() {
        System.out.println("MiningRobot planetType is important");

    }

    @Override
    public void planetColor() {
        System.out.println("MiningRobot planetColor is important");

    }

    @Override
    public void planetPrice() {
        System.out.println("MiningRobot planetPrice is important");

    }
}
