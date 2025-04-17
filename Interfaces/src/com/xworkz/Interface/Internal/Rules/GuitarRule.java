package com.xworkz.Interface.Internal.Rules;

public interface GuitarRule {
    void play();
    void tune();
    void perform();

    default void guitarInfo() {
        System.out.println("Guitar information");
    }

}
