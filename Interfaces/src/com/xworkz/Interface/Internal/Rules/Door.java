package com.xworkz.Interface.Internal.Rules;

public interface Door {
    void open();
    void close();
    void lock();


    default void doorInfo() {
        System.out.println("Door information");
    }
}
