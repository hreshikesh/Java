package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.VideoPlatform;

public class YouTube {
    private VideoPlatform obj;

    public YouTube(VideoPlatform obj) {
        if (obj == null) {
            throw new IllegalArgumentException("VideoPlatform implementation cannot be null");
        }
        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.uploadVideo();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}
