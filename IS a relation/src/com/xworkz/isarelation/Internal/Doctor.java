package com.xworkz.isarelation.Internal;

public class Doctor extends Hospital {
    public Doctor() {
        System.out.println("Running no-arg constructor of Doctor");
    }
    @Override
    public void admitPatient() {
        System.out.println("Admitting a patient in subclass");
    }
    @Override
    public void dischargePatient() {
        System.out.println("Discharging a patient in subclass");
    }
    @Override
    public void treatPatient() {
        System.out.println("Providing treatment to a patient in subclass");
    }
    @Override
    public void manageStaff() {
        System.out.println("Managing hospital staff in subclass");
    }
    @Override
    public void maintainRecords() {
        System.out.println("Maintaining patient records in subclass");
    }

    public void suspend(){
        System.out.println("Running suspend in doctor");
    }
}
