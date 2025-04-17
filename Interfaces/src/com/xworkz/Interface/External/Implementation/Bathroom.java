package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Room;

public class Bathroom implements Room {
    @Override
    public void getRoomType() {
        System.out.println("Bathroom");
    }

    @Override
    public void getRoomSize() {
        System.out.println("Medium");
    }

    @Override
    public void getRoomColor() {
        System.out.println("White");
    }
    @Override
    public void roomInfo() {
        System.out.println("This is a bathroom with modern amenities.");
    }


}
