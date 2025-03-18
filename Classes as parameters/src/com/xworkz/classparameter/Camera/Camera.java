package com.xworkz.classparameter.Camera;

public class Camera {
    public void getPixels(Pixels pixels){
        System.out.println("Sony camera have");
        if(pixels!=null){
            pixels.pixels();
        }
        else{
            System.out.println("pointing to null");
        }
    }
}
