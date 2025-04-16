package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Soap;

public class Medimix implements Soap {

    @Override
    public void soapType() {
        System.out.println("Medimix is an Ayurvedic soap.");
    }

    @Override
    public void soapColor() {
        System.out.println("Medimix is green in color.");
    }

    @Override
    public void soapPrice() {
        System.out.println("Medimix costs around 50 INR.");
    }
}
