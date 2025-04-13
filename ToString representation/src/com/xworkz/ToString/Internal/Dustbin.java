package com.xworkz.ToString.Internal;

public class Dustbin {
    private String material;
    private int capacity;
    private String color;

    public Dustbin(String material, int capacity, String color) {
        this.material = material;
        this.capacity = capacity;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dustbin material: " + material + ", capacity: " + capacity + "L, color: " + color;
    }
    @Override
    public int hashCode() {
        return 789;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Dustbin) {
                Dustbin dustbin1 = this;
                Dustbin dustbin2 = (Dustbin) obj;
                if (dustbin1.material.equals(dustbin2.material) &&
                        dustbin1.capacity == dustbin2.capacity &&
                        dustbin1.color.equals(dustbin2.color)) {
                    System.out.println("Same material, capacity and color");
                    return true;
                }
            }
        }
        return false;
    }

}
