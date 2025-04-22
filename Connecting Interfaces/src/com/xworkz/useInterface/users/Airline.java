package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.AirTrafficControl;

public class Airline {
    private AirTrafficControl obj;

    public Airline(AirTrafficControl obj) {

        this.obj = obj;
    }

    public void use()
    {
        if(obj != null)
        {
            obj.followInstructions();
        }
        else
        {
            System.err.println("AirTrafficControl is null");
        }

    }
}