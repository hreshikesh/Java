package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Doctor;
import com.xworkz.isarelation.Internal.Hospital;

import javax.print.Doc;

public class Patient {
    public void cure(Hospital hospital){
        hospital.admitPatient();
        hospital.dischargePatient();
        hospital.treatPatient();
        hospital.manageStaff();
        hospital.maintainRecords();
        if(hospital instanceof Doctor){
            System.out.println("In Doctor");
            Doctor doctor=(Doctor) hospital;
            doctor.suspend();
        }
    }
}
