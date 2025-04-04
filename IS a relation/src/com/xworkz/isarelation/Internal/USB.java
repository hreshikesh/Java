package com.xworkz.isarelation.Internal;

public class USB extends Port {
    public USB() {
        System.out.println("Running no-arg constructor of USB");
    }
    @Override
    public void connect() {
        System.out.println("Port is used for connection in subclass");
    }
    @Override
    public void transferData() {
        System.out.println("Port allows data transfer in subclass");
    }
    @Override
    public void supplyPower() {
        System.out.println("Port can supply power in subclass");
    }
    @Override
    public void type() {
        System.out.println("Port has different types like USB, HDMI, Ethernet in subclass");
    }
    @Override
    public void compatibility() {
        System.out.println("Port needs compatibility with devices in subclass");
    }
}
