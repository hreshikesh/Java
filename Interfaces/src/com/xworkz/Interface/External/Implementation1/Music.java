package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.GuitarRule;
import com.xworkz.Interface.Internal.Rules.SongRules;

public class Music implements SongRules, GuitarRule {

    @Override
    public void play() {
        System.out.println("Music play is important");
    }

    @Override
    public void tune() {
        System.out.println("Music tune is important");

    }

    @Override
    public void perform() {
        System.out.println("Music perform is important");

    }

    @Override
    public void amplify() {
        System.out.println("Music amplify is important");

    }

    @Override
    public void noise() {
        System.out.println("Music noise is important");

    }

    @Override
    public void pay() {
        System.out.println("Music pay is important");

    }
}
