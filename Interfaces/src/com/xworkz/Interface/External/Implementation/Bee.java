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
}
