package com.xworkz.Interface.Internal.Rules;

public interface MinerRules {
    void dig();
    void drill();
    void blast();

    default void minerInfo() {
        System.out.println("Miner information");
    }

}
