package com.xworkz.Interface.Internal.Rules;

public interface SongRules {
    void amplify();
    void noise();
    void pay();

    default void songInfo() {
        System.out.println("Song information");
    }
}
