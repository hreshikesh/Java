package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.SongRules;

public class Arjit implements SongRules {
    @Override
    public void amplify() {
        System.out.println("Amplify the sound");
    }

    @Override
    public void noise() {
        System.out.println("Reduce the noise");
    }

    @Override
    public void pay() {
        System.out.println("Pay for the song");
    }
    @Override
    public void songInfo() {
        System.out.println("This is a song by Arjit Singh.");
    }
}
