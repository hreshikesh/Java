package com.xworkz.Interface.Internal.Rules;

public interface Rocket {
    void launchRocket();
    void landRocket();
    void rocketSpeed();

    default void rocketInfo() {
        System.out.println("Rocket information");
    }
}
