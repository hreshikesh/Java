package com.xworkz.useInterface.users;


import com.xworkz.useInterface.interfaces.Algorithm;



public class AICompany {
    private Algorithm obj;

    public AICompany(Algorithm obj) {
        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.predict();

        }else
            System.err.println("Algorithm is null");

    }
}