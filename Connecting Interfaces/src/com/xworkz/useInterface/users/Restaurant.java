package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.FoodService;

public class Restaurant {
    private FoodService obj;

    public Restaurant(FoodService obj) {

        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.serveFood();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}