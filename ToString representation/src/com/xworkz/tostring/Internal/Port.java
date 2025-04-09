package com.xworkz.tostring.Internal;

public class Port {
    private String type;
    private int number;
    private int speed;

    public Port(String type, int number, int speed) {
        this.type = type;
        this.number = number;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Port type: " + this.type + ", port number: " + this.number + ", speed: " + this.speed ;
    }
}
