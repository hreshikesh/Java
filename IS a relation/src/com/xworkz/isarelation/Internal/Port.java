package com.xworkz.isarelation.Internal;

public class Port {
    public Port() {
        System.out.println("Running no-arg constructor of Port");
    }

    public void connect() {
        System.out.println("Port is used for connection");
    }

    public void transferData() {
        System.out.println("Port allows data transfer");
    }

    public void supplyPower() {
        System.out.println("Port can supply power");
    }

    public void type() {
        System.out.println("Port has different types like USB, HDMI, Ethernet");
    }

    public void compatibility() {
        System.out.println("Port needs compatibility with devices");
    }
}
