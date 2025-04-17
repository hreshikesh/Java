package com.xworkz.Interface.Internal.Rules;

public interface Camera {
    void takePhoto();
    void recordVideo();
    void filter();
    default void cameraInfo() {
        System.out.println("Camera information");
    }

}
