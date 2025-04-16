package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.MedicalRule;

public class Medical implements MedicalRule {
    @Override
    public void medicalHygiene() {
        System.out.println("Medical hygiene is maintained.");
    }

    @Override
    public void medicalServices() {
        System.out.println("Medical services are available.");
    }

    @Override
    public void medicalCustomerCare() {
        System.out.println("Medical customer care is provided.");
    }

}
