package com.xworkz.Interface.Internal.Rules;

public interface TaxiRule {
    void taxiFare();

    void taxiBooking();

    void taxiDriver();

    default void taxiInfo() {
        System.out.println("Taxi information");
    }

}
