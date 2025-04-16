package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.SchoolRule;
import com.xworkz.Interface.Internal.Rules.SecurityRules;

public class SecurityOfficer implements SecurityRules, SchoolRule {

    @Override
    public void attendClasses() {
        System.out.println("SecurityOfficer attendClasses is important");
    }

    @Override
    public void doHomework() {
        System.out.println("SecurityOfficer doHomework is important");

    }

    @Override
    public void followDressCode() {
        System.out.println("SecurityOfficer followDressCode is important");

    }

    @Override
    public void lockDoors() {
        System.out.println("SecurityOfficer lockDoors is important");

    }

    @Override
    public void setAlarm() {
        System.out.println("SecurityOfficer setAlarm is important");

    }

    @Override
    public void checkWindows() {
        System.out.println("SecurityOfficer checkWindows is important");

    }
}
