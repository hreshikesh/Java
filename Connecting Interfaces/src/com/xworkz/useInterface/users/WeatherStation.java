package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.ClimateMonitoring;

public class WeatherStation {
    private ClimateMonitoring obj;

    public WeatherStation(ClimateMonitoring obj) {

        this.obj = obj;
    }

    public void use() {

        if (obj != null) {
            obj.reportWeather();
        } else {
            System.err.println("ClimateMonitoring is null");
        }
    }
}