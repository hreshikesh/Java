package com.xworkz.isarelation.Internal;

public class Karate extends Skill {
    public Karate() {
        System.out.println("Running no-arg constructor of Karate");
    }

    @Override
    public void learn() {
        System.out.println("Skill can be learned through practice in subclass");
    }

    @Override
    public void improve() {
        System.out.println("Skill improves with experience and training in subclass");
    }

    @Override
    public void apply() {
        System.out.println("Skill can be applied in real-world situations in subclass");
    }

    @Override
    public void requiresEffort() {
        System.out.println("Developing a skill requires dedication and effort in subclass");
    }

    @Override
    public void hasLevels() {
        System.out.println("Skill has different levels of proficiency in subclass");
    }

    public void belt(){
        System.out.println("Running belt in karate");
    }

}
