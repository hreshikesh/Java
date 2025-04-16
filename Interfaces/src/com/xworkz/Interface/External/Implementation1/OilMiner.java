package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.MinerRules;
import com.xworkz.Interface.Internal.Rules.Oil;

public class OilMiner implements MinerRules, Oil {

    @Override
    public void dig() {
        System.out.println("OilMiner dig is important");
    }

    @Override
    public void drill() {
        System.out.println("OilMiner drill is important");

    }

    @Override
    public void blast() {
        System.out.println("OilMiner blast is important");

    }

    @Override
    public void extractOil() {
        System.out.println("OilMiner extractOil is important");

    }

    @Override
    public void sellOil() {
        System.out.println("OilMiner sellOil is important");

    }

    @Override
    public void useOil() {
        System.out.println("OilMiner useOil is important");

    }
}
