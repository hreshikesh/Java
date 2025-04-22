package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.HiringPolicy;

public class RecruitmentAgency {
    private HiringPolicy obj;

    public RecruitmentAgency(HiringPolicy obj) {

        this.obj = obj;
    }

    public void use() {

        if (obj != null) {
            obj.selectCandidate();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}