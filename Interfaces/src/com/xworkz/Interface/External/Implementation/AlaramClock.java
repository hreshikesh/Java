package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Clock;

public class AlaramClock implements Clock {
    @Override
    public void showTime() {
        System.out.println("Showing time");
    }

    @Override
    public void setAlarm() {
        System.out.println("Setting alarm");
    }

    @Override
    public void tick() {
        System.out.println("Ticking");
    }

    @Override
    public void clockInfo() {
        System.out.println("This is a digital clock with alarm features.");
    }

}
