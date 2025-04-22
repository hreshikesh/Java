package com.xworkz.useInterface.users;


import com.xworkz.useInterface.interfaces.Entertainment;

public class CinemaHall {
    private Entertainment obj;

    public CinemaHall(Entertainment obj) {

        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.playMovie();
        } else {
            System.err.println("Entertainment is null");
        }

    }
}