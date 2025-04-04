package com.xworkz.isarelation.Internal;

public class Ugadi extends Festival{
    public Ugadi(){
        System.out.println("no arg const of ugadi" );
    }
    @Override
    public  void celebrate() {
        System.out.println("Running Celebrate in subclass");
    }
    @Override
    public void decorate() {
        System.out.println("Running decorate in subclass");
    }
    @Override
    public void feast() {
        System.out.println("Running feast in subclass");
    }
    @Override
    public void enjoyMusic() {
        System.out.println("Running enjoymusic in subclass");
    }
    @Override
    public void gatherPeople() {
        System.out.println("Running gatherPeople in subclass");
    }
}
