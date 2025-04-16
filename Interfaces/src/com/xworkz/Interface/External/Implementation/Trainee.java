package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.TraineeRule;

public class Trainee implements TraineeRule {

    @Override
    public void traineeWorkHours() {
        System.out.println("Trainee work hours are available");
    }

    @Override
    public void traineeLeavePolicy() {
        System.out.println("Trainee leave policy is available");
    }

    @Override
    public void traineeInsurance() {
        System.out.println("Trainee insurance is available");
    }
}
