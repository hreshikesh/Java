package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.NetworkRule;

public class Network implements NetworkRule {
    @Override
    public void networkSecurity() {
        System.out.println("Network security is implemented.");
    }

    @Override
    public void networkPerformance() {
        System.out.println("Network performance is monitored.");
    }

    @Override
    public void networkMonitoring() {
        System.out.println("Network monitoring is in place.");
    }
}
