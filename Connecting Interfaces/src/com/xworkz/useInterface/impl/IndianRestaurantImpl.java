package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.FoodService;

public class IndianRestaurantImpl implements FoodService {
    public void serveFood() {
        System.out.println("IndianRestaurantImpl is executing serveFood.");
    }
}