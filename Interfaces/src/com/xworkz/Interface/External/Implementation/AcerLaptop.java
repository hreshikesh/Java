package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Laptop;

public class AcerLaptop implements Laptop {
    @Override
    public void powerOn() {
        System.out.println("Powering on the Acer laptop");
    }

    @Override
    public void runProgram() {
        System.out.println("Running a program on the Acer laptop");
    }

    @Override
    public void shutDown() {
        System.out.println("Shutting down the Acer laptop");
    }
}
