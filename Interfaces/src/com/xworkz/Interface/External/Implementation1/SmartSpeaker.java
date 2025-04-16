package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.SongRules;
import com.xworkz.Interface.Internal.Rules.Speaker;

public class SmartSpeaker implements Speaker, SongRules {

    @Override
    public void amplify() {
        System.out.println("SmartSpeaker amplify is important");
    }

    @Override
    public void noise() {
        System.out.println("SmartSpeaker noise is important");

    }

    @Override
    public void pay() {
        System.out.println("SmartSpeaker pay is important");

    }

    @Override
    public void playSound() {
        System.out.println("SmartSpeaker playSound is important");

    }

    @Override
    public void increaseVolume() {
        System.out.println("SmartSpeaker increaseVolume is important");

    }

    @Override
    public void decreaseVolume() {
        System.out.println("SmartSpeaker decreaseVolume is important");

    }
}
