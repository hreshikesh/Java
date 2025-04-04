package com.xworkz.isarelation.Internal;

public class Chess extends Game{
    public Chess() {
        System.out.println("Running no-arg constructor of Chess");
    }
    @Override
    public void play() {
        System.out.println("Playing the game in subclass");
    }
    @Override
    public void pause() {
        System.out.println("Pausing the game in subclass");
    }
    @Override
    public void restart() {
        System.out.println("Restarting the game in subclass ");
    }
    @Override
    public void quit() {
        System.out.println("Quitting the gamein subclass");
    }
    @Override
    public void saveProgress() {
        System.out.println("Saving game progressin subclass");
    }
}
