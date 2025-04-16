package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Door;

public class FrontDoor implements Door {
    @Override
    public void open() {
        System.out.println("Opening the front door.");
    }

    @Override
    public void close() {
        System.out.println("Closing the front door.");
    }

    @Override
    public void lock() {
        System.out.println("Locking the front door.");
    }

}
