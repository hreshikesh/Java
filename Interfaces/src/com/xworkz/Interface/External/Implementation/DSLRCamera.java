package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Camera;

public class DSLRCamera implements Camera {
    @Override
    public void takePhoto() {
        System.out.println("Taking a photo with the DSLR camera");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording a video with the DSLR camera");
    }

    @Override
    public void filter() {
        System.out.println("Applying a filter to the photo with the DSLR camera");
    }
}
