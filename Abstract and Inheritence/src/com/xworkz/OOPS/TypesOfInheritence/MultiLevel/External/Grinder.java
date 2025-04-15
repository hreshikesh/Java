package com.xworkz.OOPS.TypesOfInheritence.MultiLevel.External;

public class Grinder extends KitchenAppliance{
    @Override
    public void grind() {
        System.out.println("Grinding in Grinder");
    }
    @Override
    public void mix(){
        System.out.println("mixing in kitchen Grinder");
    }
}
