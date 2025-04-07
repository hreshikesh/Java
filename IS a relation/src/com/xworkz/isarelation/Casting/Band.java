package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Music;
import com.xworkz.isarelation.Internal.Song;

public class Band {
    public void compose(Music music){
        music.play();
        music.pause();
        music.stop();
        music.adjustVolume();
        music.download();
        if(music instanceof Song){
            System.out.println("In song");
            Song song=(Song) music;
            song.singer();
        }

    }
}
