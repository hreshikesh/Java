package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.HealthcareSystem;

public class DoctorImpl implements HealthcareSystem {
    public void treatPatient() {
        System.out.println("DoctorImpl is executing treatPatient.");
    }
}
