package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.MinerRules;

public class Miner implements MinerRules {
    @Override
    public void dig() {
        System.out.println("Miner is digging");
    }

    @Override
    public void drill() {
        System.out.println("Miner is drilling");
    }

    @Override
    public void blast() {
        System.out.println("Miner is blasting");
    }
}
