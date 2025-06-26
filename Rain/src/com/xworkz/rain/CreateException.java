package com.xworkz.rain;

import javax.sound.sampled.LineUnavailableException;

public class CreateException {

    public void checkedException() throws LineUnavailableException {

        throw new LineUnavailableException("Checking checked Exception.............");

    }

    public void unCheckedException(){

        throw new RuntimeException();
    }

}
