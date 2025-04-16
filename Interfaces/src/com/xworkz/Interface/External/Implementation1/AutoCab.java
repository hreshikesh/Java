package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.Vehicle;
import com.xworkz.Interface.Internal.Rules.Window;

public class AutoCab implements Window, Vehicle {

    @Override
    public void start() {
        System.out.println("AutoCab start is important");
    }

    @Override
    public void stop() {
        System.out.println("AutoCab stop is important");

    }

    @Override
    public void accelerate() {
        System.out.println("AutoCab accelerate is important");

    }

    @Override
    public void open() {
        System.out.println("AutoCab open is important");

    }

    @Override
    public void close() {
        System.out.println("AutoCab close is important");

    }

    @Override
    public void slide() {
        System.out.println("AutoCab slide is important");

    }
}
