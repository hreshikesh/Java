package com.xworkz.OOPS.TypesOfInheritence.SingleLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.SingleLevel.Internal.Laptop;

public class Asus extends Laptop {
    @Override
    public void on() {
        System.out.println("Running On in ASUS");
    }
}
