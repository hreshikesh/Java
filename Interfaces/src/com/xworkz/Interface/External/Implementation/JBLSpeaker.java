package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Speaker;

public class JBLSpeaker implements Speaker {

    @Override
    public void playSound() {
        System.out.println("Playing sound from JBL Speaker");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Increasing volume of JBL Speaker");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Decreasing volume of JBL Speaker");

    }
}
