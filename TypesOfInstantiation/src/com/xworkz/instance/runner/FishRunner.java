package com.xworkz.instance.runner;

import com.xworkz.instance.external.Fish;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class FishRunner {

    public static void main(String[] args) {
        System.out.println("Using new");
        Fish fish=new Fish("Angel",200,'A');
        fish.getFish();

        System.out.println("By clone()");

        try {
            Fish fishObj= (Fish) fish.clone();//casting since w eget object ref from clone();
            fishObj.setFishName("JellyFish");
            fishObj.setFishPrice(1000);
            fishObj.setFishGrade('A');
            fishObj.getFish();

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Using class.forname and newInstance");

        try {
            Class<Fish> fish1= (Class<Fish>) Class.forName("com.xworkz.instance.external.Fish");
            Constructor<Fish> constructor=fish1.getDeclaredConstructor(String.class,int.class,char.class);
            Fish obj=(Fish)constructor.newInstance("GoldFish",50,'D');
            obj.getFish();
            System.out.println(obj);
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }


        System.out.println("By using desrializable");
        Fish fish3=new Fish("Angel",200,'A');

        try {
            FileOutputStream fileOutputStream=new FileOutputStream("fish.ser");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(fish3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileInputStream fileInputStream=new FileInputStream("fish.ser");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            Fish fish4= (Fish) objectInputStream.readObject();
            fish4.setFishName("Mario");
            fish4.setFishPrice(500);
            fish4.setFishGrade('B');
            System.out.println(fish4);
            fish4.getFish();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
