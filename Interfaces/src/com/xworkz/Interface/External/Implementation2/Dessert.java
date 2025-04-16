package com.xworkz.Interface.External.Implementation2;

import com.xworkz.Interface.Internal.Rules.Bakery;
import com.xworkz.Interface.Internal.Rules.HomeRule;
import com.xworkz.Interface.Internal.Rules.Sweet;
import com.xworkz.Interface.Internal.Rules.Fan;
import com.xworkz.Interface.Internal.Rules.TV;

public class Dessert implements Bakery, HomeRule,Fan, Sweet, TV{


    @Override
    public void bakeCake() {
        System.out.println("Dessert bakeCake is important");

    }

    @Override
    public void bakeBread() {
        System.out.println("Dessert bakeBread is important");

    }

    @Override
    public void makePastry() {
        System.out.println("Dessert makePastry is important");

    }

    @Override
    public void turnOn() {
        System.out.println("Dessert turnOn is important");

    }

    @Override
    public void turnOff() {
        System.out.println("Dessert turnOff is important");

    }

    @Override
    public void changeChannel() {
        System.out.println("Dessert changeChannel is important");

    }

    @Override
    public void rotate() {

        System.out.println("Dessert rotate is important");

    }

    @Override
    public void lockDoors() {
        System.out.println("Dessert lockDoors is important");

    }

    @Override
    public void setAlarm() {
        System.out.println("Dessert setAlarm is important");

    }

    @Override
    public void checkWindows() {
        System.out.println("Dessert checkWindows is important");

    }

    @Override
    public void makeSweet() {
        System.out.println("Dessert makeSweet is important");
    }

    @Override
    public void packSweet() {
        System.out.println("Dessert packSweet is important");

    }

    @Override
    public void sellSweet() {
        System.out.println("Dessert sellSweet is important");

    }
}
