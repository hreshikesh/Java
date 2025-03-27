package com.xworkz.relation;

public class Port {
    private PortType portType;
    private String portDevice;
    private String portName;

    Port(PortType portType,String portDevice,String portName){
        this.portType=portType;
        this.portDevice=portDevice;
        this.portName=portName;
    }

    void portIn(){
        System.out.println("---------------------------");
        System.out.println("Running Port");
        portType.plugIn();
        System.out.println("Port Device "+this.portDevice);
        System.out.println("Port Name "+this.portName);
    }
}
