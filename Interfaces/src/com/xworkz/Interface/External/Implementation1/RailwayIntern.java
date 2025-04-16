package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.Train;
import com.xworkz.Interface.Internal.Rules.TraineeRule;

public class RailwayIntern implements Train, TraineeRule {

    @Override
    public void startTrain() {
        System.out.println("RailwayIntern startTrain is important");
    }

    @Override
    public void stopTrain() {
        System.out.println("RailwayIntern stopTrain is important");

    }

    @Override
    public void trainSpeed() {
        System.out.println("RailwayIntern trainSpeed is important");

    }

    @Override
    public void traineeWorkHours() {
        System.out.println("RailwayIntern traineeWorkHours is important");

    }

    @Override
    public void traineeLeavePolicy() {
        System.out.println("RailwayIntern traineeLeavePolicy is important");

    }

    @Override
    public void traineeInsurance() {
        System.out.println("RailwayIntern traineeInsurance is important");

    }
}
