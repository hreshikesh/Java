package com.xworkz.isarelation.Internal;

public class Fire extends Element {
    public Fire() {
        System.out.println("Running no-arg constructor of Fire");
    }

    @Override
    public void existInNature() {
        System.out.println("Element exists naturally or is synthesized in subclass");
    }

    @Override
    public void combineWithOtherElements() {
        System.out.println("Elements can combine to form compounds in subclass");
    }

    @Override
    public void hasAtomicStructure() {
        System.out.println("Each element has a unique atomic structure in subclass");
    }

    @Override
    public void classifiedByType() {
        System.out.println("Elements are classified as metals, non-metals, or metalloids in subclass");
    }

    @Override
    public void periodicTablePresence() {
        System.out.println("Elements are listed in the periodic table in subclass");
    }

}
