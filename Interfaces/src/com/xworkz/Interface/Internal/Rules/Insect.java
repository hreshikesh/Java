package com.xworkz.Interface.Internal.Rules;

public interface Insect {
    void crawl();

    void fly();

    void sting();

    default void insectInfo() {
        System.out.println("Insect information");
    }



}
