package com.xworkz.Interface.Internal.Rules;

public interface RestaurantRule {
    void serveFood();
    void hygiene();
    void cookFood();

    default void restaurantInfo() {
        System.out.println("Restaurant information");
    }
}
