package com.xworkz.Interface.Internal.Rules;

public interface PgRules {
    void checkIn();

    void checkOut();

    void payRent();

    default void pgInfo() {
        System.out.println("PG information");
    }

}
