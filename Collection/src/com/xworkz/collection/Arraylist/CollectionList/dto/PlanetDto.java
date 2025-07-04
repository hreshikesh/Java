package com.xworkz.collection.Arraylist.CollectionList.dto;

import java.io.Serializable;

public class PlanetDto implements Serializable {

    private String planetName;
    private int planetNo;
    private String distance;
    private String visited;

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public int getPlanetNo() {
        return planetNo;
    }

    public void setPlanetNo(int planetNo) {
        this.planetNo = planetNo;
    }

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }

    public PlanetDto(String distance, String planetName, int planetNo, String visited) {
        this.distance = distance;
        this.planetName = planetName;
        this.planetNo = planetNo;
        this.visited = visited;
    }

    @Override
    public String toString() {
        return "PlanetDto{" +
                "distance='" + distance + '\'' +
                ", planetName='" + planetName + '\'' +
                ", planetNo=" + planetNo +
                ", visited='" + visited + '\'' +
                '}';
    }
}
