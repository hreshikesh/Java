package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.HomeRule;
import com.xworkz.Interface.Internal.Rules.Room;

public class Apartment implements Room, HomeRule {

    @Override
    public void lockDoors() {
        System.out.println("Apartment lockDoors is important");
    }

    @Override
    public void setAlarm() {
        System.out.println("Apartment setAlarm is important");

    }

    @Override
    public void checkWindows() {
        System.out.println("Apartment checkWindows is important");

    }

    @Override
    public void getRoomType() {
        System.out.println("Apartment getRoomType is important");

    }

    @Override
    public void getRoomSize() {
        System.out.println("Apartment getRoomSize is important");

    }

    @Override
    public void getRoomColor() {
        System.out.println("Apartment getRoomColor is important");

    }
}
