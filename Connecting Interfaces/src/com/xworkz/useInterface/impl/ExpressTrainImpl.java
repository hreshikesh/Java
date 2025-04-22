package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.RailwaySignalSystem;

public class ExpressTrainImpl implements RailwaySignalSystem {
    public void followSignal() {
        System.out.println("ExpressTrainImpl is executing followSignal.");
    }
}