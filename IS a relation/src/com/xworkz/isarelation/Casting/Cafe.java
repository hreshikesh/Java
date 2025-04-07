package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Chef;
import com.xworkz.isarelation.Internal.Restaurant;

public class Cafe {
    public void lunch(Restaurant restaurant){
        restaurant.takeOrder();
        restaurant.serveFood();
        restaurant.prepareBill();
        restaurant.cleanTables();
        restaurant.manageStaff();
        if(restaurant instanceof Chef){
            System.out.println("In Chef");
            Chef chef=(Chef) restaurant;
            chef.cookChicken();
        }
    }
}
