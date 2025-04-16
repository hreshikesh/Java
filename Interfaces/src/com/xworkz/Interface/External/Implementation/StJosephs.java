package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.SchoolRule;

public class StJosephs implements SchoolRule {
    @Override
    public void attendClasses() {
        System.out.println("Students must attend classes regularly.");
    }

    @Override
    public void doHomework() {
        System.out.println("Students must complete their homework on time.");
    }

    @Override
    public void followDressCode() {
        System.out.println("Students must follow the school's dress code.");
    }


}
