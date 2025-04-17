package com.xworkz.Interface.Internal.Rules;

public interface Room {
    void getRoomType();

    void getRoomSize();

    void getRoomColor();

    default void roomInfo() {
        System.out.println("Room information");
    }



}
