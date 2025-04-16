package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Train;

public class Matsyagandha implements Train {
    @Override
    public void startTrain() {
        System.out.println("Starting Matsyagandha Train");
    }

    @Override
    public void stopTrain() {
        System.out.println("Stopping Matsyagandha Train");
    }

    @Override
    public void trainSpeed() {
        System.out.println("Matsyagandha Train Speed");
    }
}
