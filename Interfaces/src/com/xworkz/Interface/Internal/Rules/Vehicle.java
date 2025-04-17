package com.xworkz.Interface.Internal.Rules;

public interface Vehicle {
     void start();

     void stop();

     void accelerate();

        default void vehicleInfo() {
            System.out.println("Vehicle information");
        }


}
