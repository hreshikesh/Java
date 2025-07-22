package com.xworkz.instance.runner;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import com.xworkz.instance.external.Race;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class RaceRunner {
    public static void main(String[] args)  {
        System.out.println("Instance Using New Keyword ");
        Race race=new Race("Horse Race",50,"Bangalore");
        race.getRaceInfo();

        System.out.println("Using clone of object class");

        try {
            Race race1=(Race) race.clone();
            race1.setRaceName("Marathon");
            race1.setNoOfParticipants(40);
            race1.setLocation("Manglr");
            race1.getRaceInfo();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);

        }


        System.out.println("Using Reflection (Class) and newinstance()");

        try {
            Class<Race> raceClass=(Class<Race>) Class.forName("com.xworkz.instance.external.Race");
            Constructor<Race> constructor=raceClass.getDeclaredConstructor(String.class,int.class,String.class);
          Object obj=  constructor.newInstance("HOrde",50,"Mangalpady");
            System.out.println(obj.toString());
            Method method=obj.getClass().getDeclaredMethod("getRaceInfo");
            method.setAccessible(true);
            method.invoke(obj);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException |
                 IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Using deserialization");

        Race race1=new Race("Car Race",80,"Goa");


        System.out.println("1st serialize using ObjectOutputSteam");

        try {
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("race.ser"));
            objectOutputStream.writeObject(race1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("2nd deserializing the serialized object");
        try {
            ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("race.ser"));
             Race race2= (Race) objectInputStream.readObject();
            System.out.println(race2);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
