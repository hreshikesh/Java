package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Insect;

public class Bee implements Insect {
    @Override
    public void crawl() {
        System.out.println("Bee is crawling");
    }

    @Override
    public void fly() {
        System.out.println("Bee is flying");
    }

    @Override
    public void sting() {
        System.out.println("Bee is stinging");
    }
    @Override
    public void insectInfo() {
        System.out.println("This is a bee, known for its role in pollination and honey production.");
    }

}
