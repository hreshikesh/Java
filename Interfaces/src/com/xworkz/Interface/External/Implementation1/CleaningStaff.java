package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.CleaningRules;
import com.xworkz.Interface.Internal.Rules.SchoolRule;

public class CleaningStaff implements CleaningRules, SchoolRule {


    @Override
    public void sweep() {
        System.out.println("CleaningStaff sweep is important");
    }

    @Override
    public void mop() {
        System.out.println("CleaningStaff mop is important");

    }

    @Override
    public void dust() {
        System.out.println("CleaningStaff dust is important");

    }

    @Override
    public void attendClasses() {
        System.out.println("CleaningStaff attendClasses is important");

    }

    @Override
    public void doHomework() {
        System.out.println("CleaningStaff doHomework is important");

    }

    @Override
    public void followDressCode() {
        System.out.println("CleaningStaff followDressCode is important");

    }
}
