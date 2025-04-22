package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.RecordingSystem;

public class MusicStudio {
    private RecordingSystem obj;

    public MusicStudio(RecordingSystem obj) {

        this.obj = obj;
    }

    public void use()
    {
        if (obj != null) {
            obj.recordSong();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}