package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.ClimateMonitoring;

public class LocalStationImpl implements ClimateMonitoring {
    public void reportWeather() {
        System.out.println("LocalStationImpl is executing reportWeather.");
    }
}