package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.HospitalityService;

public class Hotel {
    private HospitalityService obj;

    public Hotel(HospitalityService obj) {

        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.checkInGuest();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}