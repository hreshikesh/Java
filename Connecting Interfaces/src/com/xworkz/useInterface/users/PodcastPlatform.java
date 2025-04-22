package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.StreamingService;

public class PodcastPlatform {
    private StreamingService obj;

    public PodcastPlatform(StreamingService obj) {

        this.obj = obj;
    }

    public void use() {

        if (obj != null) {
            obj.streamAudio();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}