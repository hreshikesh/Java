package com.xworkz.Interface.Internal.Rules;

public interface NetworkRule {
    void networkSecurity();

    void networkPerformance();

    void networkMonitoring();

    default void networkInfo() {
        System.out.println("Network information");
    }



}
