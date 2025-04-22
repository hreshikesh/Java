package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.EventRegulations;

public class FestivalOrganizer {
    private EventRegulations obj;

    public FestivalOrganizer(EventRegulations obj) {

        this.obj = obj;
    }

    public void use() {

        if (obj != null) {
            obj.arrangeFestival();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}