package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.LaunchProtocol;

public class FalconRocketImpl implements LaunchProtocol {
    public void initiateLaunch() {
        System.out.println("FalconRocketImpl is executing initiateLaunch.");
    }
}