package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Airpods;
import com.xworkz.isarelation.Internal.AudioDevice;

public class ListenMusic {
    public void listenSong(AudioDevice audioDevice){
        audioDevice.call();
        audioDevice.music();
        audioDevice.play();
        audioDevice.listen();
        audioDevice.beats();
        if(audioDevice instanceof Airpods){
            System.out.println("in airpods");
            Airpods airpods=(Airpods) audioDevice;
            airpods.cost();
        }

    }
}
