package com.xworkz.OOPS.TypesOfInheritence.MultiLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.MultiLevel.Internal.Device;

public class Speaker extends Device {
    @Override
    public void start() {
        System.out.println("Starting a Speaker");
    }
}
