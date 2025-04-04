package com.xworkz.isarelation.Internal;

    public class Guitar extends Instrument {
        public Guitar(){
            System.out.println("no args const of guitar");
    }
        @Override
        public void play() {
            System.out.println("Instrument playing in subclass");
        }
        @Override
        public void tune() {
            System.out.println("Instrument tuning in subclass");
        }
        @Override
        public void stop() {
            System.out.println("Instrument stopped in subclass");
        }
        @Override
        public void adjustVolume() {
            System.out.println("Instrument volume adjusted in subclass");
        }
        @Override
        public void repair() {
            System.out.println("Instrument being repaired in subclass");
        }
}
