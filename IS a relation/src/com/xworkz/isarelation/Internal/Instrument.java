package com.xworkz.isarelation.Internal;

public class Instrument {
    public Instrument(){
        System.out.println("no args const of Instrument");
    }


    public void play() {
        System.out.println("Instrument playing");
    }

   public  void tune() {
        System.out.println("Instrument tuning");
    }

    public void stop() {
        System.out.println("Instrument stopped");
    }

    public void adjustVolume() {
        System.out.println("Instrument volume adjusted");
    }

    public void repair() {
        System.out.println("Instrument being repaired");
    }

}
