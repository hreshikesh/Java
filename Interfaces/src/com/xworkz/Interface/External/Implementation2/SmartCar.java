package com.xworkz.Interface.External.Implementation2;

import com.xworkz.Interface.Internal.Rules.*;

public class SmartCar implements Camera, Car, Clock, Computer, Door {

    @Override
    public void takePhoto() {
        System.out.println("SmartCar takePhoto is important");
    }

    @Override
    public void recordVideo() {
        System.out.println("SmartCar recordVideo is important");


    }

    @Override
    public void filter() {
        System.out.println("SmartCar filter is important");

    }

    @Override
    public void drive() {
        System.out.println("SmartCar drive is important");

    }

    @Override
    public void stop() {
        System.out.println("SmartCar stop is important");

    }

    @Override
    public void speedDrive() {
        System.out.println("SmartCar speedDrive is important");

    }

    @Override
    public void showTime() {
        System.out.println("SmartCar showTime is important");

    }

    @Override
    public void setAlarm() {
        System.out.println("SmartCar setAlarm is important");

    }

    @Override
    public void tick() {
        System.out.println("SmartCar tick is important");

    }

    @Override
    public void runProgram() {
        System.out.println("SmartCar runProgram is important");

    }

    @Override
    public void installSoftware() {
        System.out.println("SmartCar installSoftware is important");

    }

    @Override
    public void uninstallSoftware() {
        System.out.println("SmartCar uninstallSoftware is important");

    }

    @Override
    public void open() {
        System.out.println("SmartCar open is important");

    }

    @Override
    public void close() {
        System.out.println("SmartCar close is important");

    }

    @Override
    public void lock() {
        System.out.println("SmartCar lock is important");

    }
}
