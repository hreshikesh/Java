package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.HostelRule;

public class SagarHostel implements HostelRule {
    @Override
    public void timings() {
        System.out.println("Timings of Sagar Hostel");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning in Sagar Hostel");
    }

    @Override
    public void penalty() {
        System.out.println("Penalty in Sagar Hostel");
    }
}
