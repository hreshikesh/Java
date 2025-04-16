package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.GymRule;

public class GoldGym implements GymRule {
    @Override
    public void timings() {
        System.out.println("Timings of Gold Gym");
    }

    @Override
    public void diet() {
        System.out.println("Diet plan of Gold Gym");
    }

    @Override
    public void weigth() {
        System.out.println("Weight training in Gold Gym");
    }
}
