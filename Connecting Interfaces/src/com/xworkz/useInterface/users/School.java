package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.EducationBoard;

public class School {
    private EducationBoard obj;

    public School(EducationBoard obj) {

        this.obj = obj;
    }

    public void use() {

        if (obj != null) {
            obj.conductExams();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}