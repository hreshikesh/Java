package com.xworkz.Interface.Internal.Rules;

public interface Speaker {
    void playSound();
    void increaseVolume();
    void decreaseVolume();

    default void speakerInfo() {
        System.out.println("Speaker information");
    }
}
