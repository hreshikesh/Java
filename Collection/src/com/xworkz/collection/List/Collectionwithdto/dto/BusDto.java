package com.xworkz.collection.List.Collectionwithdto.dto;

import java.io.Serializable;

public class BusDto implements Serializable {
    private String busName;
    private String busCompany;
    private String busTime;
    private int cost;
    private String busDriver;
    private String busConductor;
    private String busRoute;

    public BusDto() {
    }

  public BusDto(String busName,String busCompany,String busTime,int cost,String busDriver,String busConductor,String busRoute){
        this.busName=busName;
        this.busCompany=busCompany;
        this.busTime=busTime;
        this.cost=cost;
        this.busDriver=busDriver;
        this.busConductor=busConductor;
        this.busRoute=busRoute;
  }

    public String getBusCompany() {
        return busCompany;
    }

    public void setBusCompany(String busCompany) {
        this.busCompany = busCompany;
    }

    public String getBusConductor() {
        return busConductor;
    }

    public void setBusConductor(String busConductor) {
        this.busConductor = busConductor;
    }

    public String getBusDriver() {
        return busDriver;
    }

    public void setBusDriver(String busDriver) {
        this.busDriver = busDriver;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getBusRoute() {
        return busRoute;
    }

    public void setBusRoute(String busRoute) {
        this.busRoute = busRoute;
    }

    public String getBusTime() {
        return busTime;
    }

    public void setBusTime(String busTime) {
        this.busTime = busTime;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
