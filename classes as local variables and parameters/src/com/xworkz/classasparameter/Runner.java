package com.xworkz.classasparameter;

import com.xworkz.classasparameter.Alien.Alien;
import com.xworkz.classasparameter.Alien.Ufo;
import com.xworkz.classasparameter.Camera.Camera;
import com.xworkz.classasparameter.Camera.CameraType;
import com.xworkz.classasparameter.Camera.Sony;
import com.xworkz.classasparameter.IdCard.College;
import com.xworkz.classasparameter.IdCard.IdCard;
import com.xworkz.classasparameter.Jail.Jail;
import com.xworkz.classasparameter.Jail.Theif;
import com.xworkz.classasparameter.Satellite.Orbit;
import com.xworkz.classasparameter.Satellite.Satellite;

public class Runner {
    public static void main(String[] args) {
       Jail jail=new Jail();
       jail.setName("BSG Jail");
       jail.setTotalCells(100);
       Jail jail1=new Jail();
       jail1.setJailerName("Ramesh");
        Jail jail2=new Jail();
        jail2.setJailerName("Umesh");
        Jail[] jails={jail1,jail2};
        Theif theif = new Theif(jail);
        if(theif!=null) {
            theif.theifJailLocation();
            theif.theifJailName();
            theif.noOfCells(jail);
            theif.jailer(jails);
        }else System.err.println("Pointing to null");


        System.out.println("--------------------------------------------------");

        Satellite satellite=new Satellite();

        Satellite satelliteWeigth1=new Satellite();
        satelliteWeigth1.setWeight(1500);
        Satellite satelliteWeigth2=new Satellite();
        satelliteWeigth2.setWeight(1600);
        Satellite[] satelliteWeights={satelliteWeigth1,satelliteWeigth2};


        Orbit orbit=new Orbit();
        orbit.blast();
        orbit.land(satellite);
        orbit.launch();
        orbit.revolve(satelliteWeights);


        System.out.println("-------------------------------");

        IdCard idCard=new IdCard();
        idCard.setMaterial("Plastic");
        IdCard idCard1=new IdCard();
        idCard1.setWeight(10);
        IdCard idCard2=new IdCard();
        idCard2.setWeight(5);

        IdCard[] idCards={idCard1,idCard2} ;
        College college=new College();

        college.wear(idCard);
        college.remove(idCards);
        college.destroy();
        college.print();

        System.out.println("----------------------------------------------------");
        Alien alien=new Alien();
        alien.setSeenby("Sankalp");

        Alien alien1=new Alien();
        alien1.setDescribe("Round");
        Alien alien2=new Alien();
        alien2.setDescribe("long-head");
        Alien[] aliens={alien1,alien2};
        Ufo ufo=new Ufo();
        ufo.fly(alien);
        ufo.land(aliens);
        ufo.caught();
        ufo.spot();

        System.out.println("------------------------------------------------");
        Camera camera=new Camera();
        camera.setBrand("Sony");

        CameraType type1=CameraType.DSLR;
        CameraType type2=CameraType.SLR;

        Camera camera1=new Camera();
        camera1.setType(type1);
        Camera camera2=new Camera();
        camera2.setType(type2);
        Camera[] cameras={camera1,camera2};

        Sony sony=new Sony();
        sony.click(camera);
        sony.flash(cameras);
        sony.record();
        sony.snap();

        System.out.println("-------------------------------------------------");




    }
}
