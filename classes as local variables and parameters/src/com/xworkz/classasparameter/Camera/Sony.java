package com.xworkz.classasparameter.Camera;

public class Sony {

    public void click(Camera camera){
        if(camera!=null){
            System.out.println("Camera Barnd "+camera.getBrand());
        }

    }
    public void flash(Camera[] cameras){
        if(cameras!=null){
            for(Camera camera:cameras){
                System.out.println("Camera type "+camera.getType());
            }
        }
    }
    public void snap(){
        Camera camera=new Camera();
        camera.setPrice(15000);
        System.out.println("Price of Camera is "+camera.getPrice());

    }

    public void record(){
        Camera camera1=new Camera();
        camera1.setConnectivity("Wireless");
        Camera camera2=new Camera();
        camera2.setConnectivity("Wired");

        Camera[] camera={camera1,camera2};
    }
}
