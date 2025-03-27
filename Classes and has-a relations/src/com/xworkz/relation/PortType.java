package com.xworkz.relation;

public class PortType {
    private String portType;
    private int portNo;

    PortType(String portType,int portNo){
        this.portType=portType;
        this.portNo=portNo;

    }

    void plugIn(){
        System.out.println("Running PortType");
        System.out.println("Port Type "+this.portType );
        System.out.println("Portno "+this.portNo);
    }
}
