package com.xworkz.Interface.Internal.Rules;

public interface TraineeRule {
    void traineeWorkHours();

    void traineeLeavePolicy();

    void traineeInsurance();

    default void traineeInfo() {
        System.out.println("Trainee information");
    }



}
