package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.Firewall;

public class NortonFirewallImpl implements Firewall {
    public void detectThreat() {
        System.out.println("NortonFirewallImpl is executing detectThreat.");
    }
}