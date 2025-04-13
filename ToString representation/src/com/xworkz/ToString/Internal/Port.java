package com.xworkz.ToString.Internal;

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
    @Override
    public int hashCode() {
        return 1022580;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Port) {
                Port port1 = this;
                Port port2 = (Port) obj;
                if (port1.type.equals(port2.type) &&
                        port1.number == port2.number &&
                        port1.speed == port2.speed) {
                    System.out.println("Same type, number and speed");
                    return true;
                }
            }
        }
        return false;
    }

}
