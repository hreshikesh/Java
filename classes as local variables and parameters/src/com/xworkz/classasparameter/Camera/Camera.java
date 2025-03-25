package com.xworkz.classasparameter.Camera;

public class Camera {
    private String brand;
    private int price;
    private CameraType type;
    private String  connectivity;

    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public CameraType getType(){
        return this.type;
    }
    public void setType(CameraType type){
        this.type=type;
    }
    public String getConnectivity(){
        return this.connectivity;
    }
    public void setConnectivity(String connectivity){
        this.connectivity=connectivity;
    }
}
