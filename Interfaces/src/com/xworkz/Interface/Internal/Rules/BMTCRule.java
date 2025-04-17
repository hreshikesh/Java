package com.xworkz.Interface.Internal.Rules;

public interface BMTCRule {


    void ticket();

    void route();

    void timing();

    default void bmtcInfo() {
        System.out.println("BMTCRule information");
    }

}
