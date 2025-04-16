package com.xworkz.Interface.External.Implementation2;

import com.xworkz.Interface.Internal.Rules.*;

public class CityLifeManager implements Bicycle, BMTCRule, Book, Browser, Bus {

    @Override
    public void ticket() {
        System.out.println("CityLifeManager ticket is important");
    }

    @Override
    public void route() {
        System.out.println("CityLifeManager route is important");

    }

    @Override
    public void timing() {
        System.out.println("CityLifeManager timing is important");

    }

    @Override
    public void pedal() {
        System.out.println("CityLifeManager pedal is important");

    }

    @Override
    public void brake() {
        System.out.println("CityLifeManager brake is important");

    }

    @Override
    public void ringBell() {
        System.out.println("CityLifeManager ringBell is important");

    }

    @Override
    public void readBook() {
        System.out.println("CityLifeManager readBook is important");

    }

    @Override
    public void writeBook() {
        System.out.println("CityLifeManager writeBook is important");

    }

    @Override
    public void publishBook() {
        System.out.println("CityLifeManager publishBook is important");

    }

    @Override
    public void openBrowser() {
        System.out.println("CityLifeManager openBrowser is important");

    }

    @Override
    public void closeBrowser() {
        System.out.println("CityLifeManager closeBrowser is important");

    }

    @Override
    public void refreshBrowser() {
        System.out.println("CityLifeManager refreshBrowser is important");

    }

    @Override
    public void startEngine() {
        System.out.println("CityLifeManager startEngine is important");

    }

    @Override
    public void drive() {
        System.out.println("CityLifeManager drive is important");

    }

    @Override
    public void stopEngine() {
        System.out.println("CityLifeManager stopEngine is important");

    }
}
