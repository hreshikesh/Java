package com.xworkz.Interface.Internal.Rules;

public interface Train {
    void startTrain();
    void stopTrain();
    void trainSpeed();


    default void trainInfo() {
        System.out.println("Train information");
    }
}
