package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.HospitalRule;

public class Fortis implements HospitalRule {
    @Override
    public void treat() {
        System.out.println("Treating patients with care and expertise.");
    }

    @Override
    public void provideCare() {
        System.out.println("Providing compassionate care to all patients.");
    }

    @Override
    public void hygiene() {
        System.out.println("Maintaining strict hygiene standards in the hospital.");
    }

}
