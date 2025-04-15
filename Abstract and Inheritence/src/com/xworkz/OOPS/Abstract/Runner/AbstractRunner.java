package com.xworkz.OOPS.Abstract.Runner;

import com.xworkz.OOPS.Abstract.External.*;
import com.xworkz.OOPS.Abstract.Internal.*;

public class AbstractRunner {
    public static void main(String[] args) {
        System.out.println("1.");
        Future future=new CEO();
        future.plan();


        System.out.println("2.");
        Building building=new Mansion();
        building.build();

        System.out.println("3.");
        Project project=new WebApp();
        project.compile();
        project.develop();


        System.out.println("4.");
        SportCar sportCar=new BMW("M5","1cr","Germany");
        System.out.println(sportCar);

        System.out.println("5.");
        Travel travel=new SpaceTravel("Earth","Mars");
        Travel travel1=new SpaceTravel("1Lkm");
        Travel travel2=new SpaceTravel("1lkm",120000000);
        System.out.println(travel);
        System.out.println(travel1);
        System.out.println(travel2);










    }
}
