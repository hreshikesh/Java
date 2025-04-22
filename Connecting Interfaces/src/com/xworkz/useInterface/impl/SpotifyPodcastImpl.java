package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.StreamingService;

public class SpotifyPodcastImpl implements StreamingService {
    public void streamAudio() {
        System.out.println("SpotifyPodcastImpl is executing streamAudio.");
    }
}