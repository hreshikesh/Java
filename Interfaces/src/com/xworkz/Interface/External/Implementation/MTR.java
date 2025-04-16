package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.RestaurantRule;

public class MTR implements RestaurantRule {
    @Override
    public void serveFood() {
        System.out.println("Serving food in MTR");
    }

    @Override
    public void hygiene() {
        System.out.println("Maintaining hygiene in MTR");
    }

    @Override
    public void cookFood() {
        System.out.println("Cooking food in MTR");
    }
}
