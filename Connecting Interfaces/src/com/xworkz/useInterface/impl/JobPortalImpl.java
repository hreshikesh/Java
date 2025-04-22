package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.HiringPolicy;

public class JobPortalImpl implements HiringPolicy {
    public void selectCandidate() {
        System.out.println("JobPortalImpl is executing selectCandidate.");
    }
}