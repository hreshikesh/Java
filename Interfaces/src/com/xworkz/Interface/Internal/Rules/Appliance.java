package com.xworkz.Interface.Internal.Rules;

public interface Appliance {
    void switchOn();
    void switchOff();
    void getStatus();

    default void applianceInfo() {
        System.out.println("Appliance information");
    }
}
