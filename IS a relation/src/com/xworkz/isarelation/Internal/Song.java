package com.xworkz.isarelation.Internal;

public class Song extends Music {
    public Song() {
        System.out.println("Running no-arg constructor of Song");
    }

    @Override
    public void play() {
        System.out.println("Playing music in subclass");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music in subclass");
    }

    @Override
    public void stop() {
        System.out.println("Stopping musicin subclass");
    }

    @Override
    public void adjustVolume() {
        System.out.println("Adjusting music volume in subclass");
    }

    @Override
    public void download() {
        System.out.println("Downloading music in subclass");
    }

    public void singer(){
        System.out.println("Singer singing the song");
    }

}
