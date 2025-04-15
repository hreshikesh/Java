package com.xworkz.OOPS.Abstract.Internal;

public abstract class Travel {

    private String source;
    private String destination;
    private String distance;
    private int cost;

    public Travel(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    public Travel(String distance) {
        this.distance = distance;
    }

    public Travel(String distance, int cost) {
        this.distance = distance;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Travel{" +
                "source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", distance='" + distance + '\'' +
                ", cost=" + cost +
                '}';
    }
}
