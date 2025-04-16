package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.BarberRule;

public class Barber implements BarberRule {
    @Override
    public void barberSafety() {
        System.out.println("Barber safety is important for both the barber and the client.");
    }

    @Override
    public void barberTools() {
        System.out.println("Barber tools should be properly maintained and sanitized.");
    }

    @Override
    public void barberHygiene() {
        System.out.println("Barber hygiene is crucial to prevent infections and ensure client satisfaction.");
    }
}
